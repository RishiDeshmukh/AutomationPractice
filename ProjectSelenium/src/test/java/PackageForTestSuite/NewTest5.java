package PackageForTestSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class NewTest5 extends SeleniumUtility{
  @Test(groups= "Regression Test")
  public void a() {
	  WebDriver driver= setUp("Chrome", "https://www.myntra.com/?utm_source=dms_google&utm_medium=pmax_cpc&utm_campaign=dms_google_pmax_cpc_Myntra_PMax_AllProducts_NCA_SOK&keyword=&matchtype=&target=&placement=&utm_source=dms_google&utm_medium=pmax_cpc&utm_campaign=dms_google_pmax_cpc_Myntra_PMax_AllProducts_NCA_SOK&keyword=&matchtype=&target=&placement=&gad_source=1&gclid=CjwKCAjwupGyBhBBEiwA0UcqaKnV1IPhCe7j3n9vdQ0naufjTwXW-yzy1R3fDHrajxfVij99H-AP9RoCkkEQAvD_BwE");
	  System.out.println("This is myntra");
  }
}
