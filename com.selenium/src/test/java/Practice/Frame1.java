package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.navigate().refresh();

		WebElement frame=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame);
		WebElement head=driver.findElement(By.xpath("//h1[contains(@id,'sampleHeading')])[1]"));
		System.out.println(head.getText());
	}

}
