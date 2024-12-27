package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_commands2 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html?m=1");
		
		WebElement dropDown=driver.findElement(By.xpath("//select[@multiple='true']"));
		Select select = new Select(dropDown);
		boolean a=select.isMultiple();
		System.out.println(a);
		
		select.selectByIndex(0);
		select.selectByValue("ij");
		select.selectByVisibleText("NetBeans");
		List<WebElement>allOptions=select.getAllSelectedOptions();
		for(WebElement element:allOptions)
		{
			System.out.println(element.getText());
			
		}
		
		select.deselectAll();
		List<WebElement>verifyList=select.getAllSelectedOptions();
		
		boolean b =verifyList.isEmpty();
		System.out.println(b);
		
	}

}
