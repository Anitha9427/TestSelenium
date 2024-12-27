package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_eg {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		
		//driver.switchTo().frame(4);
		//driver.switchTo().frame("frame1");
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		WebElement heading=driver.findElement(By.xpath("(//h1[contains(@id,'sampleHeading')])[1]"));
		
		
		String a=heading.getText();
		System.out.println(a);
		
		driver.switchTo().defaultContent();  //to return back from frame 

		
		WebElement sample=driver.findElement(By.xpath("//h1[text()='Frames']"));
		System.out.println(sample.getText());
	}

}
