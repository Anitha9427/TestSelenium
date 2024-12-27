package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement showAlertBox=driver.findElement(By.id("alertexamples"));
		showAlertBox.click();
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		WebElement showConfirmBox=driver.findElement(By.id("alertexamples"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		//showConfirmBox.click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		WebElement showPromptBox=driver.findElement(By.id("promptexample"));
		showPromptBox.click();                                                                                                                   
		driver.switchTo().alert().sendKeys("Anitha");
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		

	}
	
}
