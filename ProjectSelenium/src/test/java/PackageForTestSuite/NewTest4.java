package PackageForTestSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class NewTest4 extends SeleniumUtility{
  @Test(groups= "Sanity Test")
  public void a() {
	  WebDriver driver= setUp("Chrome", "https://www.amazon.in/gift-card-store/b/?ie=UTF8&node=3704982031&ref_=nav_cs_gc");
	  System.out.println("This is Amazoon");
  }
}
