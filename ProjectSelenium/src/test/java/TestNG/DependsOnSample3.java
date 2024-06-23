package TestNG;

import org.testng.annotations.Test;

public class DependsOnSample3 {
  @Test(priority = 3)
  public void createPIM() {
	  System.out.println("PIM created successfuly");
	  int i= 10/2;
	  
  }
  @Test(priority = 2, dependsOnMethods = "createPIM" )
  public void UpdatePIM() {
	  System.out.println("PIM Updated successfuly");
  }
  @Test(priority = 1, dependsOnMethods = "UpdatePIM")
  public void DeletePIM() {
	  System.out.println("Delete PIM successfuly");
  }
}
