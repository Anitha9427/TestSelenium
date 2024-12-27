package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement colorDropDown=driver.findElement(By.id("single-input-field"));
		Select select=new Select(colorDropDown);
		select.selectByIndex(1);
		select.selectByValue("Red");
		select.selectByVisibleText("Green");
		WebElement firstSelected=select.getFirstSelectedOption();
		System.out.println(firstSelected.getText());
		
		List<WebElement>allOptions=select.getAllSelectedOptions();
		for(WebElement element:allOptions)
		{
			System.out.println(element.getText());
		}
		
		
		
	}

}
