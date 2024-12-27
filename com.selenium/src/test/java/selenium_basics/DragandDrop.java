package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement dragMe=driver.findElement(By.xpath("//div[text()='Drag me']"));
		
		
		WebElement dropMe=driver.findElement(By.xpath("//div[contains(@class,'drop-box ui-droppable')][1]"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(dragMe, dropMe).build().perform();

	}

}
