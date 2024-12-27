package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_commands {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		//WebElement messageTextBox = driver.findElement(By.id("single-input-field"));
		//WebElement messageTextBox = driver.findElement(By.cssSelector("#single-input-field"));
	    //WebElement messageTextBox1 = driver.findElement(By.cssSelector(".form-control"));
	    //WebElement messageTextBox2 =driver.findElement(By.cssSelector("input[placeholder='Message']"));
	    //WebElement messageTextBox3 =driver.findElement(By.cssSelector("input.form-control[placeholder='Message']"));
	    //messageTextBox3.sendKeys("Hai");
		//WebElement messageTextBox4 =driver.findElement(By.cssSelector("input#single-input-field[placeholder='Message']"));
		//messageTextBox4.sendKeys("Hello");
		//WebElement InputForm =driver.findElement(By.cssSelector("a.nav-link[href='simple-form-demo.php']"));
		//String text=InputForm.getText();
		//System.out.println(text);
		//WebElement InputForm =driver.findElement(By.cssSelector("a[href='simple-form-demo.php']"));
		//String text=InputForm.getText();
		//System.out.println(text);
		//href="simple-form-demo.php"
		driver.navigate().to("https://selenium.qabible.in/form-submit.php");
		WebElement firstName=driver.findElement(By.cssSelector("#validationCustom01"));
		firstName.sendKeys("Anitha");
		String a = firstName.getAttribute("value");
		System.out.println(a);
		


	}

}
