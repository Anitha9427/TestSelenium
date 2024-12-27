package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTable {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement dragMe=driver.findElement(By.xpath("(//a[contains(@style,'color:#FFFFFF;')])[2]"));
		WebElement dropHere=driver.findElement(By.id("amt7"));
		Actions action=new Actions(driver);
		action.dragAndDrop(dragMe, dropHere).build().perform();//
		
		WebElement dragMe1=driver.findElement(By.xpath("(//a[contains(@style,'color:#FFFFFF;')])[5]"));
		WebElement dropHere1=driver.findElement(By.xpath("//ol[contains(@id,'bank')]"));
		action.dragAndDrop(dragMe1, dropHere1).build().perform();//
		
		WebElement sales=driver.findElement(By.xpath("(//a[contains(@style,'color:#FFFFFF;')])[6]"));
		WebElement dropHere2=driver.findElement(By.id("loan"));
		action.dragAndDrop(sales, dropHere2).build().perform();
		
		WebElement dragMe2=driver.findElement(By.xpath("(//a[contains(@style,'color:#FFFFFF;')])[4]"));
		WebElement dropHere3=driver.findElement(By.id("amt8"));
		action.dragAndDrop(dragMe2, dropHere3).build().perform();
		
		WebElement table=driver.findElement(By.id("bal3"));
		String text=table.getText();
		System.out.print(text);
		
		
				
	}

}
