package testNG_basics;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CrosBrowserExample {
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
		  Assert.assertEquals(actualRes, expectedRes,"Not Successfull");//Hard assert
		  //SoftAssert soft=new SoftAssert();//Soft Assert
		 // soft.assertEquals(actualRes, expectedRes);
		 // soft.assertAll();
	  }
		 
  
  @BeforeMethod
  @Parameters("browser")//parameter name
  public void beforeMethod(String browserName) {
	  
	  if(browserName.equalsIgnoreCase("chrome"))//if the parameter name(browserName)is equal to chrome,thn run in chrome.
	  {
		  driver=new ChromeDriver();
	  }
	  else if(browserName.equalsIgnoreCase("edge"))
	  {
		  driver=new EdgeDriver();
	  }
	  
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.navigate().refresh();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  
  }

}
