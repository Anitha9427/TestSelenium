package testNG_basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FirstProgramme {
	WebDriver driver;

	@Test
	public void f() {// one method
		WebElement frame1 = driver.findElement(By.id("frame1"));//wrong
		driver.switchTo().frame(frame1);
		WebElement heading = driver.findElement(By.xpath("(//h1[contains(@id,'sampleHeading')])[1]"));

		String a = heading.getText();
		System.out.println(a);

		driver.switchTo().defaultContent(); // to return back from frame

		WebElement sample = driver.findElement(By.xpath("//h1[text()='Frames']"));
		System.out.println(sample.getText());
	}

	@BeforeMethod
	public void beforeMethod() {// method b4 method

		driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void afterMethod() {// method after method
		driver.quit();
	}

}
