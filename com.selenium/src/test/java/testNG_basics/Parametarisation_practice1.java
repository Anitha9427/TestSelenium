package testNG_basics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametarisation_practice1 {
  @Test
  @Parameters({"height","weight"})
  public void personalDetails(int height,float weight) {
	  System.out.println("Height =" + height);
	  System.out.println("Weight ="+weight);
  }
}
