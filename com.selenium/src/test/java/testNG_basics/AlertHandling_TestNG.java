package testNG_basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class AlertHandling_TestNG {
	
	WebDriver driver;
  @Test
  public void verifyTheAlert_1() {
	  
	    
		WebElement clickMe=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		clickMe.click();
		String a=driver.switchTo().alert().getText();
		System.out.println(a);
		driver.switchTo().alert().accept();
		
		WebElement prompt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		prompt.click();
		driver.switchTo().alert().sendKeys("Anitha");
		driver.switchTo().alert().accept();
  }
  
  @Test
  public void verifyTheAlert_2() {
	  
	  WebElement prompt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		prompt.click();
		driver.switchTo().alert().sendKeys("Anitha");
		driver.switchTo().alert().accept();
	  
  }
  
  @BeforeTest
  public void beforeMethod() {
	  
	    driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
  }

  @AfterTest
  public void afterMethod() {
	  driver.quit();
  }

}
