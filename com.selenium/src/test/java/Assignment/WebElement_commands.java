package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElement_commands {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("Apple in fruits");
		Thread.sleep(3000);
		WebElement search1=driver.findElement(By.cssSelector(".gLFyf"));
		String a=search1.getAttribute("value");
		System.out.println(a);
		WebElement googleSearch=driver.findElement(By.name("btnK"));
		googleSearch.click();
		String b=driver.getTitle();
		System.out.println(b);
		driver.navigate().refresh();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
		
	}

}
