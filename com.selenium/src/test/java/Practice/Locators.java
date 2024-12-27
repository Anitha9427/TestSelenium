package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement inputForm=driver.findElement(By.id("single-input-field"));
		inputForm.sendKeys("Hai");
		
		Thread.sleep(2000);
		
		WebElement showMessage=driver.findElement(By.id("button-one"));
		showMessage.click();
		
		WebElement checkBox=driver.findElement(By.cssSelector("a[href='check-box-demo.php']"));
		checkBox.click();
		
		WebElement clickOnThisBox=driver.findElement(By.cssSelector("input.form-check-input"));
		clickOnThisBox.click();
		
			
		WebElement formSubmit=driver.findElement(By.cssSelector("a[href='form-submit.php']"));
		formSubmit.click();
		
		WebElement firstName=driver.findElement(By.ByCssSelector.id("validationCustom01"));
		firstName.sendKeys("aa");
		
		WebElement lastName=driver.findElement(By.ByCssSelector.id("validationCustom02"));
		lastName.sendKeys("bb");
		
		WebElement userName=driver.findElement(By.ByCssSelector.id("validationCustomUsername"));
		userName.sendKeys("cc");
		
		WebElement city=driver.findElement(By.ByCssSelector.id("validationCustom03"));
		city.sendKeys("dd");
		
		WebElement state=driver.findElement(By.ByCssSelector.id("validationCustom04"));
		city.sendKeys("ee");
		WebElement zip=driver.findElement(By.ByCssSelector.id("validationCustom05"));
		zip.sendKeys("23456");
		
		WebElement zip1=driver.findElement(By.cssSelector("input[placeholder='Zip']"));
		String b= zip1.getText();//
		System.out.println(b);
		WebElement checkBox1=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		checkBox1.click();
		WebElement submit=driver.findElement(By.xpath("//button[text()='Submit form']"));
		submit.submit();
		
		
		
		
		
		
		
	}

}
