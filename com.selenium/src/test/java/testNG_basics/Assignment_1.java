package testNG_basics;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Assignment_1 {
	
	WebDriver driver;
  @Test(priority = 1)//can start with 0.
  public void verifySuccessfulLogin() {
	  
	  WebElement userName=driver.findElement(By.cssSelector("input[name='username']"));
	  userName.click();
	  userName.sendKeys("Admin");
	  
	  WebDriverWait waitObj=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement passWord=driver.findElement(By.xpath("//input[@name='password']"));
	  waitObj.until(ExpectedConditions.elementToBeClickable(passWord));//visibility of,presenceOf can be used.
	  passWord.sendKeys("admin123");
	  
	  WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(2));
	  WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
	  obj.until(ExpectedConditions.elementToBeClickable(login));
	  login.click();
	  
	  WebElement dashBoard=driver.findElement(By.xpath("//h6[contains(@class,'oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module')]"));
	 // System.out.println(dashBoard.getText());
	  String actualRes= dashBoard.getText();
	  String expectedRes="DashBoard";
	  Assert.assertNotSame(actualRes, expectedRes,"Not Successfull");//Hard assert
	  //SoftAssert soft=new SoftAssert();//Soft Assert
	 // soft.assertEquals(actualRes, expectedRes);
	//  soft.assertAll();
  }
	 
  
@Test(priority = 2)
public void verifySuccessfullLogOut() throws InterruptedException {
	
	 WebElement userName=driver.findElement(By.cssSelector("input[name='username']"));
	  userName.click();
	  userName.sendKeys("Admin");
	  
	  WebDriverWait waitObj=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement passWord=driver.findElement(By.xpath("//input[@name='password']"));
	  waitObj.until(ExpectedConditions.elementToBeClickable(passWord));
	  passWord.sendKeys("admin123");
	  
	  WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(2));
	  WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
	  obj.until(ExpectedConditions.elementToBeClickable(login));
	  login.click();
	  
	  WebElement button=driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
	  button.click();
	  WebElement logOut=driver.findElement(By.xpath("//a[contains(@href,'/web/index.php/auth/logout')]"));
	  logOut.click();
	  
	  WebElement loginText=driver.findElement(By.xpath("//h5[text()='Login']"));
	  System.out.println(loginText.getText());
	  String actualRes= loginText.getText();
	  String expectedRes="Login";
	  Assert.assertTrue(actualRes.contains(expectedRes));//AssertTrue is used since contains is used(boolean).
	  
	  
	
}

@Test(priority = 3,dataProviderClass=DataProviderClass.class,dataProvider="UnsuccessfullLogin")
public void verifyUnsuccessfullLogin(String uname,String pass) {
	
	WebElement userName=driver.findElement(By.cssSelector("input[name='username']"));
	  userName.click();
	  userName.sendKeys("uname");
	  
	  WebDriverWait waitObj=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement passWord=driver.findElement(By.xpath("//input[@name='password']"));
	  waitObj.until(ExpectedConditions.elementToBeClickable(passWord));
	  passWord.sendKeys("pass");
	  
	  WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(2));
	  WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
	  obj.until(ExpectedConditions.elementToBeClickable(login));
	  login.click();

	WebElement invalid=driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
	System.out.println(invalid.getText());
	boolean actualRes=invalid.isDisplayed();
	Assert.assertTrue(actualRes);//here is displayed is true.so i use asserTrue to pass the testcase
	
}


  @BeforeMethod
  public void beforeMethod() {
	  
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.navigate().refresh();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
  }

  @AfterMethod
  public void afterMethod() {
	 driver.close();
  }

}
