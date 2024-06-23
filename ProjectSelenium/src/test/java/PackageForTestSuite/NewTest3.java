package PackageForTestSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class NewTest3 extends SeleniumUtility{
  @Test(groups= "Sanity Test")
  public void a() {
	  WebDriver driver= setUp("Chrome", "https://www.flipkart.com/");
	  System.out.println("This is Flipcart");
  }
}
