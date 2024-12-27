package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		
		WebElement button=driver.findElement(By.id("newWindowBtn"));
		Actions action=new Actions(driver);
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		action.moveToElement(button).click().perform();
		
		Set<String>handlesofallopened=driver.getWindowHandles();
		
		for (String handle : handlesofallopened) {
			
			if (!handle.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				driver.navigate().refresh();
				
			}
			
		}
		driver.switchTo().window(parentWindow);
	}

}
