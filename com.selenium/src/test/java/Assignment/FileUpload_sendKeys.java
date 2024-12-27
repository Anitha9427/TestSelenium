package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_sendKeys {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement choose=driver.findElement(By.id("file-upload"));
		choose.sendKeys("C:\\\\Users\\\\Anitha L\\\\Documents\\\\Token Refresh PW.txt");
		
		WebElement upload=driver.findElement(By.id("file-submit"));
		upload.click();
		
	}

}
