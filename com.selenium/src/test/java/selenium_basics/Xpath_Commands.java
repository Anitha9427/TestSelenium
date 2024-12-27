package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Commands {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
	}

}
