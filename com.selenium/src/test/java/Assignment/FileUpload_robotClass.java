package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_robotClass {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement choose=driver.findElement(By.id("file-upload"));
		String filePath="C:\\Users\\Anitha L\\Documents\\Token Refresh PW.txt";
		StringSelection file=new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		
		
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.delay(1);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.delay(2);
		rob.keyRelease(KeyEvent.VK_V);
		
		WebElement upload=driver.findElement(By.id("file-submit"));
		upload.click();
		
	}

}
