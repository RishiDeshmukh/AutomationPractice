package PracticeEndToEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class Sample1 extends SeleniumUtility{
	WebDriver Driver;
  @BeforeTest
  public void A() {
	  WebDriver driver= setUp("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  
  @BeforeMethod
  public void B() {
	  // Input username password and click on submit button
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  @Test
  public void C() {
	  //click on pIM
	  driver.findElement(By.xpath("//span[text()='PIM']")).click();
	  //click on Add button
	  driver.findElement(By.xpath("//button[text()=' Add ']")).click();
	  //Entering First name
	  driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']")).sendKeys("Rishi");
	  //Entering middle Name
	  driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-middlename']")).sendKeys("Sharad");
	  // Entering last name
	  driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']")).sendKeys("Deshmukh");
	  //Entering Employee Id
	  driver.findElement(By.xpath("//div/div/div/div/input[@class='oxd-input oxd-input--active']")).clear();
	  driver.findElement(By.xpath("//div/div/div/div/input[@class='oxd-input oxd-input--active']")).sendKeys("159456");
	  
	  // Clicking on save button
	  driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	  //click on employee List Options above
	  driver.findElement(By.xpath("//a[text()='Employee List']")).click();
	  //click on next page button page no 2
	  driver.findElement(By.xpath("//button[text()='2']")).click();
	  // click on Rishi PIM edit button
	  driver.findElement(By.xpath("//div[div[div[div[div[text()='11445566']]]]]//i[@class='oxd-icon bi-pencil-fill']")).click();
	  // click on SIN Number
	  driver.findElement(By.xpath("//div[div[label[text()='SIN Number']]]//input")).sendKeys("457812");
	  // Click on the save button near to the SIN Number
	  driver.findElement(By.xpath("//div[p[text()=' * Required']]/button")).click();
	  
	 
  }
}
