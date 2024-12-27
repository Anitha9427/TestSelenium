package selenium_basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow_Handle {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;//Scroll the window,javascript is a interface.
		js.executeScript("window.scrollBy(0,500)");
		
		
		
		WebElement openNewWindow=driver.findElement(By.id("newWindowBtn"));
		String parentWindowHandle=driver.getWindowHandle();//parent window handle.
		System.out.println("it is the parent window "+parentWindowHandle);
		openNewWindow.click();
		
		Set<String>handlesOfAllOpenedWindows=driver.getWindowHandles();
		System.out.println(handlesOfAllOpenedWindows);
		
		for (String handle : handlesOfAllOpenedWindows) {  //given for each loop with return type string and object name handle.
			
			if (!handle.equalsIgnoreCase(parentWindowHandle))//equals ignore case 
			{
				driver.switchTo().window(handle);
				
				//child window operations.
				
				driver.manage().window().maximize();
				WebElement hint=driver.findElement(By.id("firstName"));
				String placeHolder=hint.getAttribute("placeholder");
				System.out.println(placeHolder);
				
				
			}
			
		}
		
	driver.switchTo().window(parentWindowHandle)	;
	Thread.sleep(2000);
	WebElement button2P=driver.findElement(By.id("newTabBtn"));
	button2P.click();
	
	//to go to third window
	Set<String>handlesOfAllOpenedWindows1=driver.getWindowHandles();//set is a return type.
	System.out.println(handlesOfAllOpenedWindows);
	for (String handle1 : handlesOfAllOpenedWindows1) {
		
	
	if (!handle1.equalsIgnoreCase(parentWindowHandle)) {
		
		driver.switchTo().window(handle1);
		System.out.println(driver.getTitle());
		
	}
	}
	driver.switchTo().window(parentWindowHandle)	;
	}

}
