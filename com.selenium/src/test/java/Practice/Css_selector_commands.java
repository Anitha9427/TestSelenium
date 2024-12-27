package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector_commands {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		//WebElement messageTextBox = driver.findElement(By.id("single-input-field"));
		//messageTextBox.sendKeys("Hello");
		WebElement DatePicker = driver.findElement(By.cssSelector("a[href='date-picker.php']"));
		DatePicker.click();
		//WebElement EnterData=driver.findElement(By.cssSelector(".form-control datepicker"));
		//EnterData.click();
		WebElement DatePicker1=driver.findElement(By.cssSelector("a[href='date-picker.php']"));
		String text=DatePicker1.getText();
		System.out.println(text);
		

	}

}
