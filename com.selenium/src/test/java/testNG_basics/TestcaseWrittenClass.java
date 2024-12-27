package testNG_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestcaseWrittenClass extends BaseClass{
//this.driver=driver;
  @Test(priority=1)
  public void verifyTheExactWebsiteIsOpenWhileHittingTheUrl() {
	  
	String actual=driver.getCurrentUrl();
	System.out.println(actual);
	String expected="https://groceryapp.uniqassosiates.com/admin/login";
	Assert.assertEquals(actual, expected);
	  
  }
  @Test(priority=2)
  public void verifyTheHeadingIsVisible() {
	  WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	  username.sendKeys("admin");
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("admin");
	  WebElement signIn=driver.findElement(By.xpath("//button[@type='submit']"));
	  signIn.submit();
  
	WebElement head=driver.findElement(By.xpath("//span[starts-with(@class,'brand-text font')]"));
	System.out.println(head.getText());
	boolean a=head.isDisplayed();
	Assert.assertTrue(a);
	 
	 //System.out.println( driver.getTitle());
	//String expectedHead="7rmart supermarket";
	
	  
  }
  @Test(priority=3)
  public void verifyRememberCheckBoxIsSelectedOrNot() {
	  
	  WebElement checkBox=driver.findElement(By.cssSelector("input#remember"));
	  boolean s=checkBox.isSelected();
	  SoftAssert soft=new SoftAssert();
	  soft.assertNull(checkBox);
	  soft.assertAll();
	  
	  
  }
  @Test(priority=4)
  public void verifySuccessfullLogin() {
	 // this.driver=driver;
	  WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	  username.sendKeys("admin");
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("admin");
	  WebElement signIn=driver.findElement(By.xpath("//button[@type='submit']"));
	  signIn.submit();
	 // System.out.println(driver.getTitle());
	  String actTit=driver.getTitle();
	  String expTit="Dashboard | 7rmart supermarket";
	  Assert.assertEquals(actTit, expTit);
	  
	  
  
  }
  @Test(priority=5,dataProviderClass=DataProviderTestWritten.class,dataProvider="UnsuccessfullLogin")
  public void verifyUnsuccessfulLogin(String userName,String passWord) {
	  
	  WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	  username.sendKeys(userName);  
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys(passWord);
	  WebElement signIn=driver.findElement(By.xpath("//button[@type='submit']"));
	  signIn.submit();
	  WebElement invalid=driver.findElement(By.className("alert alert-danger alert-dismissible"));
	  boolean alert= invalid.isDisplayed();
	  Assert.assertTrue(alert);
	  
  }
  @Test(priority=6)
  public void verifyToSearchACategory() {
	  WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	  username.sendKeys("admin");
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("admin");
	  WebElement signIn=driver.findElement(By.xpath("//button[@type='submit']"));
	  signIn.submit();
	  WebElement category=driver.findElement(By.xpath("(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category'])[1]"));
	  category.click();
	  WebElement search=driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
	  search.click();
	  WebElement categoryTextBox=driver.findElement(By.cssSelector("input.form-control"));
	  categoryTextBox.sendKeys("toys");
	  WebElement categorySearch=driver.findElement(By.xpath("//button[@class='btn btn-danger btn-fix']"));
	  categorySearch.click();
	  WebElement table=driver.findElement(By.xpath("//table/tbody/tr/td[1]"));
	  String actualtext=table.getText();
	  String expectedText="Toys";
	  Assert.assertEquals(actualtext, expectedText);
	  
  }
}
