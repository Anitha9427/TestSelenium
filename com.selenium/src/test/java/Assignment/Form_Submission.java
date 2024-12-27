package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Submission {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in");
		
		WebElement inputForm=driver.findElement(By.cssSelector("a.nav-link[href='simple-form-demo.php']"));
		inputForm.click();
		WebElement formSubmit=driver.findElement(By.cssSelector("a[href='form-submit.php']"));
		formSubmit.click();
		WebElement firstName=driver.findElement(By.id("validationCustom01"));
		firstName.sendKeys("Anitha");
		WebElement lastName=driver.findElement(By.id("validationCustom02"));
		lastName.sendKeys("L");
		WebElement userName=driver.findElement(By.id("validationCustomUsername"));
		userName.sendKeys("star");
		WebElement city=driver.findElement(By.id("validationCustom03"));
		city.sendKeys("Trivandrum");
		WebElement state=driver.findElement(By.id("validationCustom04"));
		state.sendKeys("Kerala");
		WebElement zip=driver.findElement(By.id("validationCustom05"));
		zip.sendKeys("695001");
		WebElement checkBox=driver.findElement(By.id("invalidCheck"));
		checkBox.click();
		WebElement checkBox1=driver.findElement(By.id("invalidCheck"));
		boolean a=checkBox1.isDisplayed();
		System.out.println(a);
		WebElement submitForm=driver.findElement(By.cssSelector("button[type='submit']"));
		submitForm.submit();
		WebElement submitForm1=driver.findElement(By.cssSelector("button[type='submit']"));
		String text=submitForm1.getText();
		System.out.println(text);
		
			
	}

}
