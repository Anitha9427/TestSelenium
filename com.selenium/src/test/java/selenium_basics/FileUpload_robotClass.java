package selenium_basics;

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
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //code for implicit wait inorder to wait 10sec to load all elements after refresh.
		WebElement chooseFile=driver.findElement(By.id("uploadfile_0"));
		
		String filePath = System.getProperty("C:\\\\Users\\\\Anitha L\\\\Documents\\\\week5\\SampleKeyNp.java");
		StringSelection file = new StringSelection(filePath);  ///string selection is a class,this class is used here to store the path of the file we need to upload.
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);  ///TOOLKIT IS A CLASS.WE GET THE DEFAULT TOOLKIT(method) FROM TOOLKIT CLASS AND FROM THAT WE GET OUR SYSTEM CLIPBOARD.Then set our file path as content in it.
		                                                                              ///inorder to copy the file path from string selection class we use toolkit.and now the path is there in the clipboard as a copy.
		Robot obj=new Robot();
		obj.keyPress(KeyEvent.VK_CONTROL);  
		obj.delay(1);
		//  r.keyPress(KeyEvent.VK_CONTROL);
	   // r.keyPress(KeyEvent.VK_V);
	  //  r.keyRelease(KeyEvent.VK_CONTROL);
	  //  r.keyRelease(KeyEvent.VK_V);
		obj.keyPress(KeyEvent.VK_V);
		obj.keyRelease(KeyEvent.VK_CONTROL);
		obj.delay(2);
		obj.keyRelease(KeyEvent.VK_V);
		
		WebElement button=driver.findElement(By.xpath("//input[@id='terms']"));
		button.click();
		System.out.println(button.isSelected());
		
		///https://the-internet.herokuapp.com/upload
		
		
	}

}
