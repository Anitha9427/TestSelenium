package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement colA=driver.findElement(By.id("column-a"));
		WebElement colB=driver.findElement(By.id("column-b"));
		Actions action=new Actions(driver);
		action.dragAndDrop(colA, colB).build().perform();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement dragMe=driver.findElement(By.id("draggable"));
		WebElement dropHere=driver.findElement(By.id("droppable"));
		action.dragAndDrop(dragMe, dropHere).build().perform();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
