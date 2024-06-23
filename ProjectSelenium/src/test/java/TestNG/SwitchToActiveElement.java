package TestNG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class SwitchToActiveElement extends SeleniumUtility{
  @Test
  public void test1() {
	  WebDriver driver= setUp("chrome", "https://online.actitime.com/cts1/login.do");
	  
	  //finding the active element is it at the right place or not 
	  
	  WebElement Element=driver.switchTo().activeElement();
	  System.out.println("is focus on username input field ? "+Element.getAttribute("Placeholder").equals("Username"));
	  
	  Element.sendKeys("admin01",Keys.TAB);
	  driver.switchTo().activeElement().sendKeys("admin01",Keys.ENTER);
	  
	  
  }
}
