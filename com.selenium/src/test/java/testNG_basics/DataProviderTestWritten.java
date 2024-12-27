package testNG_basics;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderTestWritten{
  @Test(dataProvider = "dp1",dataProviderClass=TestcaseWrittenClass.class)
  public void unSuccess(String userName, String passWord) {
  }

  @DataProvider(name="UnsuccessfullLogin")
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { "Admin", "Admin1" },
      new Object[] { "Admin1", "Admin" },
      new Object[] { "Admin1","Admin1" }
    };
  }
}
