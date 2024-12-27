package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements_Commands {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		WebElement BootstrapBox=driver.findElement(By.linkText("Bootstrap Date Picker"));
		BootstrapBox.click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
