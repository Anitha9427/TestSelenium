package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy,(0,1000)");
		
		int rows=driver.findElements(By.xpath("//table[@id='contactList']/tbody/tr")).size();
		System.out.println("Total no of rows = "+rows);
		int col=driver.findElements(By.xpath("//table[@id='contactList']/tbody/tr/th")).size();// since no table heading,we use tbody instead of thead.
		System.out.println("Total no of columns = "+col);
		
		WebElement locate=driver.findElement(By.xpath("//table/tbody/tr[4]/td[3]"));
		String s=locate.getText();
		System.out.println(s);
		
		WebElement locate1=driver.findElement(By.xpath("//table/tbody/tr[5]"));
		String t=locate1.getText();
		System.out.println("The 5th row is: "+t);
		
		WebElement locate2=driver.findElement(By.xpath("//table/tbody/tr[4]/td[5]/a"));
		locate2.click();
		
		
	}

}
