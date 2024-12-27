package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_sendKeys {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
	WebElement chooseFile=driver.findElement(By.id("uploadfile_0"));
		chooseFile.sendKeys("C:\\Users\\Anitha L\\Documents\\week5\\SampleKeyNp.java");
		
		//or String file=C:\\Users\\Anitha L\\Documents\\week5//SampleKeyNp.java;
			//	chooseFile.sendKeys(file);
		
		WebElement button=driver.findElement(By.xpath("//input[@id='terms']"));
		button.click();
		System.out.println(button.isSelected());
	}

}
