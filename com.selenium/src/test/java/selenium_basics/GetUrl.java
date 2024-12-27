package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		String a = driver.getCurrentUrl();
		System.out.println(a);
		String b= driver.getTitle();
		System.out.println(b);
		String c = driver.getPageSource();
		System.out.println(c);
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.close();
		
		
	}
	

}
