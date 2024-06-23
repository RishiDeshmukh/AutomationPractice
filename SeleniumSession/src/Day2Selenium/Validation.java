package Day2Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	driver.manage().window().maximize();
		
		driver.get("https://online.actitime.com/tcs/login.do");
		
		/*
		 * validation- Username input
		 * 	- visible or not   ----> isDisplay()
		 *  - functional or not----> isEnabled()
		 *  - default value ------> getAttribute()
		 */
		WebElement UserNameInputField= driver.findElement(By.id("username"));
		System.out.println("is username input field visible ? "+UserNameInputField.isDisplayed());
		System.out.println("is username field functionl / editable ? "+UserNameInputField.isEnabled());
		System.out.println("is username field difult field visible ? "+UserNameInputField.getAttribute("Username"));
		
		
		/*
		 * validation- checkbox 
		 * 	- visible or not   ----> isDisplay()
		 *  - functional or not----> isEnabled()
		 *  - default selection ------> isSelected()
		 */		
		WebElement Checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("Checkbox is visible or not ? "+Checkbox.isDisplayed());
		System.out.println("Checkbox is functional or not ? "+Checkbox.isEnabled());
		System.out.println("Checkbox default selected or not ? "+ Checkbox.isSelected());
		Checkbox.click();
		System.out.println("After click is checkbox selected ? "+ Checkbox.isSelected());
		
		WebElement LoginButton= driver.findElement(By.id("loginButtonContainer"));
		System.out.println("login button : "+LoginButton.getText());
		
		
	}

}
