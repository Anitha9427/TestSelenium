package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Commands {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement colorDropDown=driver.findElement(By.id("single-input-field"));
		Select select=new Select(colorDropDown);
		//select.selectByIndex(1);
		//select.selectByValue("Yellow");
		//Thread.sleep(1000);
		//select.selectByVisibleText("Green");
		//boolean a=select.isMultiple();
		//System.out.println(a);
		WebElement firstSelectColor1=select.getFirstSelectedOption();
		System.out.println(firstSelectColor1.getText());
		
		System.out.println("All options");
		List<WebElement>allOptions=select.getOptions();
		for(WebElement element1:allOptions) {
			System.out.println(element1.getText());
		}
		
		
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
	
}

