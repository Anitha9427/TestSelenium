package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Commands {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		//WebElement input=driver.findElement(By.linkText("simple-form-demo.php"));
		//input.click();
		Thread.sleep(2000);
		String s=driver.getTitle();
		System.out.println(s);
		
		
		String r=driver.getPageSource();
		System.out.println(r);
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		String v= driver.getCurrentUrl();
		System.out.println(v);
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		driver.close();
		
		
		
		
		
	}

}
