package testNG_basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	
WebDriver driver;
 
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(String browser) {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		 driver=new ChromeDriver(); 
	  }
	  else
	  {
		  driver=new EdgeDriver();
	  }
	driver=new ChromeDriver();  
	driver.get("https://groceryapp.uniqassosiates.com/admin/login");
	driver.manage().window().maximize();
	driver.navigate().refresh();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
