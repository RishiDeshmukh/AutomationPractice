package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElement {

	public static void main(String[] args) {
		
		// Create an instance of ChromeDriver class and upcast it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// enter application URL
		driver.get("https://www.saucedemo.com/");
		
		//identify user name input field
		WebElement UserNameInputField=driver.findElement(By.id("user-name"));
		
		//type username as standard_user
		UserNameInputField.sendKeys("standard_user");
		
		//indetify password input field
		WebElement UserPasswordInputField= driver.findElement(By.id("password"));
		
		//type password as secret_sauce
		UserPasswordInputField.sendKeys("secret_sauce");
		
		// Identify login Button
		WebElement UserLoginButton= driver.findElement(By.id("login-button"));
		
		//Click Login Button
		UserLoginButton.click();
		
	}

}
