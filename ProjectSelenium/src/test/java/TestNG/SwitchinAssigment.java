package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class SwitchinAssigment extends SeleniumUtility{
  @Test
  public void SwitchAssigment() {
	  WebDriver driver= setUp("chrome", "https://www.rakuten.com/");
	  
	  driver.findElement(By.id("header_sign_in")).click();
	  
	  // to get inside the frame
	  WebElement Frame=driver.findElement(By.id("auth-microsite-iframe"));
	  driver.switchTo().frame(Frame);
	  
	  driver.findElement(By.id("emailAddress")).sendKeys("abc@gmail.com");
	  driver.findElement(By.xpath("//input[@class='chakra-input rr-auth-web-user-password-input css-1bj0tt3']")).sendKeys("abcd@1234");
	  //exit the previous frame for entering in the new freame 
	  driver.switchTo().defaultContent();
	  // here again a new freame for the check box
	WebElement frame2=  driver.findElement(By.xpath("//iframe[@src='https://www.google.com/recaptcha/enterprise/anchor?ar=1&k=6LcX6fQZAAAAAC-PhgK4ep1bFNO2n1BKWG-Tt2-u&co=aHR0cHM6Ly93d3cucmFrdXRlbi5jb206NDQz&hl=en&v=vjbW55W42X033PfTdVf6Ft4q&size=normal&cb=yhctmbm7m6d2']"));
	   driver.switchTo().frame(frame2);
	  driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
	  
	//  driver.switchTo().defaultContent();
	//  driver.findElement(By.id("#email-auth-btn")).click();
  }
}
