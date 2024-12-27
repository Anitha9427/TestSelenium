package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_andMouse {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement messageBox=driver.findElement(By.id("single-input-field"));
		messageBox.sendKeys("Hai");
		
		Actions actions=new Actions(driver);
		//actions.keyDown(Keys.TAB).build().perform();
		
		WebElement button=driver.findElement(By.id("button-one"));
		actions.keyDown(button,Keys.ENTER).perform();
		//actions.keyDown(Keys.ENTER).build().perform();
		
		actions.keyUp(Keys.ENTER).perform();
		
	}

}
