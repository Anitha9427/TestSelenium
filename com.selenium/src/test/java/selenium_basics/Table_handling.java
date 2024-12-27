package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_handling {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		
		WebElement heading= driver.findElement(By.xpath("//table/thead/tr[1]"));
		String a=heading.getText();
		System.out.println(a);
		
		WebElement heading1= driver.findElement(By.xpath("//table/tbody/tr[5]"));
		String b = heading1.getText();
		System.out.println(b);
		
	}

}
