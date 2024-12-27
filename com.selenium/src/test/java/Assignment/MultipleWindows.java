package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement newTab=driver.findElement(By.xpath("//button[text()='New Tab']"));
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("The parentwindow:"+parentWindowHandle);
		newTab.click();
		
		Set<String>handlesOfAllOpenWindows=driver.getWindowHandles();
		System.out.println(handlesOfAllOpenWindows);
		
		for (String handle : handlesOfAllOpenWindows) { 
			
			if (!handle.equalsIgnoreCase(parentWindowHandle))
			{
			driver.switchTo().window(handle);
			WebElement samplePage=driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
			System.out.println(samplePage.getText());
			
			}
		}
		
	driver.switchTo().window(parentWindowHandle);
	Thread.sleep(2000);
	WebElement newWindow=driver.findElement(By.xpath("//button[text()='New Window']"));
	String parentWindowHandle1=driver.getWindowHandle();
	System.out.println("The parentwindow:"+parentWindowHandle1);
	newWindow.click();
	Set<String>handlesOfAllOpenWindows1=driver.getWindowHandles();
    System.out.println(handlesOfAllOpenWindows1);
    
	for (String handle1 : handlesOfAllOpenWindows1) {
		
	         if (!handle1.equalsIgnoreCase(parentWindowHandle)) 
	         {
	        	 driver.switchTo().window(handle1);
	        	 WebElement sampleWindow=driver.findElement(By.cssSelector("h1[id='sampleHeading']"));
	        	 System.out.println(sampleWindow.getText());
	         }
	}
             
	driver.switchTo().window(parentWindowHandle1);
	driver.quit();


	
	}
}
