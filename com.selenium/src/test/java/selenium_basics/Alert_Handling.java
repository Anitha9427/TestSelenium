package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
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

}
