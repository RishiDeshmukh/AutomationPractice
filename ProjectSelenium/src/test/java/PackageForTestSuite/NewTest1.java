package PackageForTestSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class NewTest1 extends SeleniumUtility{
  @Test(groups= "Smoke Test")
  public void a() {
	  WebDriver driver= setUp("Chrome", "https://www.rakuten.com/");
	  System.out.println("This is rakuten");
  }
}
