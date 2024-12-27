package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selectorcommands {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		
		WebElement inputForm=driver.findElement(By.cssSelector("a[href='simple-form-demo.php']"));
		inputForm.click();
		WebElement radioButton=driver.findElement(By.xpath("//a[contains(text(),'Radio Buttons Demo')]"));
		radioButton.click();
		
		
		
		
	}

}
