package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1 {
  @Test (enabled = true, invocationCount = 3)
  public void OrangeHRM() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  System.out.println("Get Page Title : "+ driver.getTitle());
  }
  @Test (priority = 2, enabled = true)
  public void OpenGoogle() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println("Page Title : "+ driver.getTitle());
  }
  
  @Test (priority = 1 , description = "This is a demo application", timeOut = 20000 , enabled=true )
  public void openSwagLabs() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  System.out.println("Page Title : "+ driver.getTitle());
  }
  @Test (expectedExceptions = ArithmeticException.class)
  public void ArathmaticOperation() {
	  System.out.println("Tast case started");
	  int i=10/0;
	  System.out.println("Tast case ended");
	  
  }
  
}
