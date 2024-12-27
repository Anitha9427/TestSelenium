package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		
		WebElement messageTextBox = driver.findElement(By.id("single-input-field"));
		messageTextBox.sendKeys("Hai");
		WebElement showMessage = driver.findElement(By.id("button-one"));
		showMessage.click();
		WebElement enterValue = driver.findElement(By.id("value-a"));
		enterValue.sendKeys("25");
		WebElement enterValue1 = driver.findElement(By.id("value-b"));
		enterValue1.sendKeys("35");
		WebElement getTotal = driver.findElement(By.id("button-two"));
		getTotal.click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
