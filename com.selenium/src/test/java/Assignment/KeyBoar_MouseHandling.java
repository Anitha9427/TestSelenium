package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoar_MouseHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement inputForm=driver.findElement(By.cssSelector("a.nav-link[href='simple-form-demo.php']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(inputForm).build().perform();
		actions.keyDown(inputForm, Keys.ENTER).build().perform();
		
		WebElement messageBox=driver.findElement(By.id("single-input-field"));
		actions.moveToElement(messageBox).click().perform();
		actions.keyDown(Keys.SHIFT).sendKeys("H").keyUp(Keys.SHIFT).sendKeys("ai").build().perform();
		actions.keyDown(Keys.SHIFT).sendKeys(" N").keyUp(Keys.SHIFT).sendKeys("eelima").build().perform();
		
		WebElement showMessage=driver.findElement(By.id("button-one"));
		actions.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		actions.keyDown(Keys.ENTER).perform();
		actions.keyUp(Keys.ENTER).perform();
		
		WebElement yourMessage=driver.findElement(By.id("message-one"));
		String a=yourMessage.getText();
		System.out.println(a);
		
		
		
		
		
		
	}

}
