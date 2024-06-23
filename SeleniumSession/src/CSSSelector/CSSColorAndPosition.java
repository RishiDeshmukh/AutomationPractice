package CSSSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CSSColorAndPosition {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	driver.manage().window().maximize();
		
		driver.get("https://online.actitime.com/tcs/login.do");
		
		//login button
		driver.findElement(By.id("loginButtonContainer")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		// wait till the error appears 
		wait.until(ExpectedConditions.textToBe(By.className("errormsg"),"Username or Password is invalid. Please try again."));
		
		// error massage
		WebElement ErrorMassage=driver.findElement(By.className("errormsg"));
		Point ErrorMsgLocation= ErrorMassage.getLocation();
		int Error_x=ErrorMsgLocation.getX();
		int Error_Y=ErrorMsgLocation.getY();
		System.out.println("Error msg X cordinate : "+Error_x);
		System.out.println("Error msg Y cordinate : "+Error_Y);
		
		// username input field 
		WebElement UserNameInputFeield=driver.findElement(By.id("username"));
		Point UsernameLocation= UserNameInputFeield.getLocation();
		int Username_x=UsernameLocation.getX();
		int Username_Y=UsernameLocation.getY();
		System.out.println("Username x cordinate : "+Username_x);
		System.out.println("Username Y cordinate : "+Username_Y);
		
		System.out.println("Is error masg is being displayed above the usename input field : "+ (Error_Y< Username_Y));
		
		// Validate color font and family
		System.out.println("Error msg color : "+ErrorMassage.getCssValue("color"));
		System.out.println("Error msg font size : "+ErrorMassage.getCssValue("font-size"));
		System.out.println("Error msg font family : "+ErrorMassage.getCssValue("font-family"));
		
		
		
		 
		
	}

}
