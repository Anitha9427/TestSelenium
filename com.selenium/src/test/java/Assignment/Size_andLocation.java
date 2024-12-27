package Assignment;

import java.awt.Point;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size_andLocation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/home");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		WebElement icon = driver.findElement(
				By.xpath("//img[@src='https://groceryapp.uniqassosiates.com/public/assets/front/images/logo.png']"));
		boolean a = icon.isDisplayed();
		System.out.println(a);
		org.openqa.selenium.Point p = icon.getLocation();
		System.out.println(p);
		Dimension d = icon.getSize();
		System.out.println(d);

		WebElement openSignInWindow = driver.findElement(By.xpath("//a[text()='Sign In']"));
		openSignInWindow.click();

		WebElement eMail = driver.findElement(By.id("ap_email"));
		System.out.println(eMail.getAttribute("placeholder"));
		WebElement pWord = driver.findElement(By.name("password"));
		System.out.println(pWord.getAttribute("placeholder"));

	}

}
