package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_commands1 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html?m=1");
		
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='course']"));
		Select select=new Select(dropDown);
		boolean a=select.isMultiple();
		System.out.println(a);
		
		select.selectByIndex(3);
		
		WebElement selectCourse=select.getFirstSelectedOption();
		System.out.println(selectCourse.getText());
		
	}
}
