package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait
		
		 WebDriverWait waitObj = new WebDriverWait(driver, Duration.ofSeconds(5));
		
	WebElement chooseFile=driver.findElement(By.id("uploadfile_0"));
	
	waitObj.until(ExpectedConditions.presenceOfElementLocated(By.id("uploadfile_0")));//explicit wait
	
	//waitObj.until(ExpectedConditions.visibilityOf(chooseFile));
	
	//waitObj.until(ExpectedConditions.visibilityOfElementLocated(By.id("uploadfile_0")));
	
		chooseFile.sendKeys("C:\\Users\\Anitha L\\Documents\\week5\\SampleKeyNp.java");
		
		
		WebElement button=driver.findElement(By.xpath("//input[@id='terms']"));
		
	//	waitObj.until(ExpectedConditions.elementToBeClickable(button));
		
		
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(5)) .pollingEvery(Duration.ofSeconds(1))
				  .ignoring(NoSuchElementException.class);
		 waitObj.until(ExpectedConditions.elementToBeClickable(button));
		
		
		
		button.click();
		System.out.println(button.isSelected());
	}

}
