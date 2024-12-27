package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement frame1=driver.findElement(By.xpath("(//iframe[starts-with(@src,'https://www.hyrtutorials.com/p/html-dropdown')])[1]"));
		driver.switchTo().frame(frame1);
		
		//JavascriptExecutor j=(JavascriptExecutor)driver;
		//j.executeAsyncScript("window.scrollBy(0,1000)");
		WebElement course=driver.findElement(By.xpath("(//select[@id='course'])[1]"));
		course.click();
		Select select=new Select(course);
		select.selectByValue("java");
		
		driver.switchTo().defaultContent();
		
		
		WebElement frame2=driver.findElement(By.id("frm2"));
		driver.switchTo().frame(frame2);
		WebElement firstN=driver.findElement(By.cssSelector("input.bcTextBox[id='firstName']"));
		String x=firstN.getAttribute("placeholder");
		System.out.println(x);
		
		List<WebElement>radioButtons=driver.findElements(By.xpath("//input[@type='radio']"));
		int count=radioButtons.size();
		System.out.println("Total no of Radio Buttons= "+count);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		//driver.close();
		driver.quit();
		
		

	}

}
