package Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Alerts_1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		
		WebDriverWait obj=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement clickMe=driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
		clickMe.click();
		obj.until(ExpectedConditions.alertIsPresent());
		String a=driver.switchTo().alert().getText();
		System.out.println(a);
		driver.switchTo().alert().accept();
	
		WebDriverWait obj1=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement clickMe1=driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
		clickMe1.click();
		obj1.until(ExpectedConditions.alertIsPresent());
		String b=driver.switchTo().alert().getText();
		System.out.println(b);
		driver.switchTo().alert().dismiss();
		
		
		
		
		
		
		
	}

}
