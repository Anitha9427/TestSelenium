package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScript_waits {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//WebDriverWait waitObj=new WebDriverWait(driver,Duration.ofSeconds(3) );//Explicit wait.
		
		WebElement DatePicker = driver.findElement(By.cssSelector("a[href='date-picker.php']"));
		//waitObj.until(ExpectedConditions.elementToBeClickable(DatePicker));
		DatePicker.click();
		
		//Wait<WebDriver>Wait=new FluentWait<WebDriver>(driver).
		//WebElement DatePicker1=driver.findElement(By.cssSelector("a[href='date-picker.php']"));
	//	String text=DatePicker1.getText();
	//	System.out.println(text);
		
	}

}
