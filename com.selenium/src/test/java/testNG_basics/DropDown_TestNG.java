package testNG_basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class DropDown_TestNG {
	WebDriver driver;
  @Test
  public void verifyDragDrop_1() {
	  
	  WebElement colorDropDown=driver.findElement(By.id("single-input-field"));
		Select select=new Select(colorDropDown);
		
		WebElement firstSelectColor1=select.getFirstSelectedOption();
		System.out.println(firstSelectColor1.getText());
		
		System.out.println("All options");
		List<WebElement>allOptions=select.getOptions();
		for(WebElement element1:allOptions) {
			System.out.println(element1.getText());
		}
  }
		@Test
		 public void verifyDragDrop_2() {
		
		WebElement colorDropDown1=driver.findElement(By.id("multi-select-field"));
		Select select1=new Select(colorDropDown1);
		boolean b=select1.isMultiple();
		System.out.println(b);
		select1.selectByIndex(1);
		select1.selectByIndex(2);
		select1.deselectByIndex(1);
		
		System.out.println("All Selected options");
		List<WebElement>allSelectedOptions=select1.getAllSelectedOptions();
		for(WebElement element:allSelectedOptions) {
			
			System.out.println(element.getText());
		}
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	    driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
