package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSample3 {
  @Test
  public void ActiTime() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://online.actitime.com/cts1/login.do");
	  String ActualTitle= driver.getTitle();
	  System.out.println("Actual Title : "+ActualTitle);
	  String ExpectedTitle= "actiTIME - Login";
	  System.out.println("Comparing : "+ActualTitle.equals(ExpectedTitle));
  }
  @Test
  public void ActiTimeWithAssert1() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://online.actitime.com/cts1/login.do");
	  String ActualTitle= driver.getTitle();
	  String ExpectedTitle= "actiTIME - Login";
	  Assert.assertTrue(ActualTitle.equals(ExpectedTitle));  
  }
  @Test
  public void ActiTimeWithAssert2() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://online.actitime.com/cts1/login.do");
	  String ActualTitle= driver.getTitle();
	  String ExpectedTitle= "actiTIME - Login";
	  Assert.assertFalse(ActualTitle.equals(ExpectedTitle));
  }
  @Test
  public void ActiTimeWithAssert3() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://online.actitime.com/cts1/login.do");
	  String ActualTitle= driver.getTitle();
	  String ExpectedTitle= "actiTIME - Login";
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
  }
}




/*
Assert: Its as predefine class of TestNG, used for validation purpose in testng
	if any validation failed, test status will be failed
	if validation pass, test status will be pass

Assert.
	   assertTrue(boolean cond);//if condition is pass, test status will be pass else failed
	   assertTrue(boolean cond, String msg);//if condition is pass, test status will be pass else failed with given msg
		
	   assertFalse(boolean cond);//if condition is failed, test status will be pass else failed
	   assertFalse(boolean cond, String msg);//if condition is failed, test status will be pass else failed with given msg
	
	   assertEquals(arg1, arg2);//if both are same, test will pass else fail
	    assertEquals(arg1, arg2, String msg);//if both are same, test will pass else fail with given msg
 */
