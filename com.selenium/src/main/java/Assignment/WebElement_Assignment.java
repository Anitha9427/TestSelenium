package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElement_Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		
		WebElement Username = driver.findElement(By.name("username"));
		Username.sendKeys("admin");
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("admin");
		WebElement SignIn = driver.findElement(By.tagName("button"));
		SignIn.click();
		String a=driver.getCurrentUrl();
		System.out.println(a);
		String b = driver.getTitle();
		System.out.println(b);
		Thread.sleep(2000);
		driver.close();
	}

}
