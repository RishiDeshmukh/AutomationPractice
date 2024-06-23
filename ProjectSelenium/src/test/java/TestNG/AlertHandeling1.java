package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandeling1 {
  @Test
  public void AlertHandling() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  
	  driver.switchTo().frame("iframeResult");
	  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  
	  System.out.println("Alert msg : "+ driver.switchTo().alert().getText());
	  
	  driver.switchTo().alert().accept();
	  
  }
}
