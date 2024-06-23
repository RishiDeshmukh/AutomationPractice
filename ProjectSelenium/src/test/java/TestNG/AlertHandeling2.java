package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class AlertHandeling2 extends SeleniumUtility{
  @Test
  public void Alerthandeling2() {
	  
	  WebDriver driver= setUp("Chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	  
	  driver.switchTo().frame("iframeResult");
	  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  
	  System.out.println("alert msg : "+ driver.switchTo().alert().getText());
	  driver.switchTo().alert().accept();
	  
	  System.out.println("msg after accepting : "+driver.findElement(By.id("demo")).getText());
	  
	  
  }
}
