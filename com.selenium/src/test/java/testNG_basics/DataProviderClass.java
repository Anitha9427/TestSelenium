package testNG_basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
  @Test(dataProvider = "dp1",dataProviderClass=DataProviderClass.class)
  public void f(Integer n, String s, String s2) {
	  
	  System.out.println("Student Roll No"+ "="+" "+ n );
	  System.out.println("Student Name"+ "="+" "+ s );
	  System.out.println("Student Class"+ "="+" "+ s2 );
	  
  }
//  @BeforeMethod
//  public void beforeMethod() {
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//  }


  @DataProvider(name="dp1")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "Anitha","Class 1" },
      new Object[] { 2, "Nivu" ,"Class-2"},
      new Object[] { 3, "Arun","Class 3" }
      
      
    };
  }
@DataProvider(name="UnsuccessfullLogin")
public Object[][]dp1()
{
	return new Object[][] {
		new Object[] {"Admin","Admin"},
		new Object[] {"admin","admin123"},
		new Object[] {"Arun","Class-2"}
		};
				
	}
}
