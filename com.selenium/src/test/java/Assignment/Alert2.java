package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.BiDiException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement customerId=driver.findElement(By.name("cusid"));
		customerId.sendKeys("012345");
		WebElement submit=driver.findElement(By.name("submit"));
		submit.submit();
		
		 WebDriverWait waitObj = new WebDriverWait(driver, Duration.ofSeconds(10));
		 waitObj.until(ExpectedConditions.alertIsPresent());
		 
			String a=driver.switchTo().alert().getText();
			System.out.println(a);
			driver.switchTo().alert().accept();
		
			waitObj.until(ExpectedConditions.alertIsPresent());
			
			String b=driver.switchTo().alert().getText();
			System.out.println(b);
			driver.switchTo().alert().accept();
			driver.switchTo().alert().dismiss();
		
				
		
		
		
		
			
		
	}

}
