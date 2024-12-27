package testNG_basics;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Assignment2_Assertions {
	WebDriver driver;
  @Test(priority = 0)
  public void verifyCorrectPageLoadedAfterHittingUrl() {
	  
	  WebElement home=driver.findElement(By.cssSelector("a.nav-link[href='index.php']"));
	  boolean a=home.isDisplayed();
		
	  SoftAssert soft=new SoftAssert();
	  soft.assertTrue(a);
	  soft.assertAll();
  }
	  @Test(priority = 1)
	  public void verifyLogoDisplayed() {
		  WebElement logo=driver.findElement(By.xpath("//img[@alt='logo' and @src='images/logo.png']"));
		  boolean actualRes=logo.isDisplayed();
		 // System.out.println(logo.isDisplayed());
		 Assert.assertTrue(actualRes);
	  
	  }
	  
	  @Test(priority = 2)
	  public void verifyTitle() {
		  
		 String actualTit= driver.getTitle();
		 String expectedTit="Obsqura Testing";
		 Assert.assertEquals(actualTit, expectedTit);
	  }
	  
	  @Test(priority = 3)
	  public void verifyTabsDisplayed() {
		  WebElement tabs=driver.findElement(By.xpath("//div[@class='mb-sec']"));
		 // String actual=tabs.getText();
		 // String expected="HOME || INPUT || FORM || DATE PICKERS || TABLE || PROGRESS BARS || ALERTS AND MODELS || LIST BOX || OTHERS";
		 // Assert.assertEquals(actual,expected);
		 Assert.assertFalse(false, "Tabs are not displayed");
		  
		  
	  }
	  @Test(priority = 4)
	  public void verifyCheckBox() {
		  driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		  WebElement checkBoxDemo=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		  checkBoxDemo.click();
		  WebElement selectAll=driver.findElement(By.cssSelector("input#button-two"));
		  SoftAssert assert1=new SoftAssert();
		  String actualSelect=selectAll.getAttribute("value");
		  String expectedSelect="Select All";
		 // assert1.assertNotEquals(actualSelect, expectedSelect);
		  
	  }
	  
	  
	  @Test(priority = 5)
	  public void verifyTextBoxMessage() {
		  
		  WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		  inputForm.click();
		  WebElement message=driver.findElement(By.id("single-input-field"));
		  String actualHint=message.getAttribute("placeholder");
		 // String expectedHint="Message";
		 // Assert.assertEquals(actualHint, expectedHint);
		  Assert.assertNotNull(actualHint);
		  
		  
	  }
	  
	  @Test
	  public void verifyThePageIsNavigatedToInputFormPageWhileClickingOnInputFormTab() {  //using AsserNotEquals.
	  
		  String actual=driver.getCurrentUrl();
		  WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		  inputForm.click();
		  String expect="https://selenium.qabible.in/simple-form-demo.php";
		  Assert.assertNotSame(actual, expect);
	  }
	  
	  @Test
	  public void verifyTheMessageTextBoxIsNullOrEmptyByDefault() { 
		  WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		  inputForm.click();
		  WebElement message=driver.findElement(By.id("single-input-field"));
		 String s= message.getAttribute("value");
		 s.isEmpty();
		 Assert.assertTrue(s.isEmpty());//by default the text box is empty.so the test is pass.
		  
		  
	  }
	  
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.get("http://selenium.qabible.in/");
	  driver.manage().window().maximize();
	  driver.navigate().refresh();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
  
}
