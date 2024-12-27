package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected_commands {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		
		WebElement inputForm=driver.findElement(By.cssSelector("a[href='simple-form-demo.php']"));
		inputForm.click();
		WebElement radioButtonDemo=driver.findElement(By.cssSelector("a[href='radio-button-demo.php']"));
		radioButtonDemo.click();
		WebElement radioButton=driver.findElement(By.name("inlineRadioOptions"));//radio button to click male.
		radioButton.click();
		boolean b=radioButton.isSelected();//code to get the selection of male radio button.
		System.out.println(b);
		Thread.sleep(2000);
		WebElement showSelectedValue=driver.findElement(By.id("button-one"));
		showSelectedValue.click();   //to verify the selection .
		
		driver.close();
		

	}

}
