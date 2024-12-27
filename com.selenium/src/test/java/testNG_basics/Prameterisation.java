package testNG_basics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prameterisation {
  @Test
  @Parameters({"number1","number2"})
  public void addTwoNumbers(int number1,int number2) {
	  int sum=number1+ number2;
	  System.out.println("sum ="+sum);
  }
}
