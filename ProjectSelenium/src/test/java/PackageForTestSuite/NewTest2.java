package PackageForTestSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class NewTest2 extends SeleniumUtility{
  @Test(groups= "Smoke Test")
  public void a() {
	  WebDriver driver= setUp("Chrome", "https://jqueryui.com/sortable/");
	  System.out.println("This is jqueryui");
	  
  }
}
