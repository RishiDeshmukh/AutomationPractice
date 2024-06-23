package Day1WorkingWithBrowsers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// Opening chrome browser
		WebDriver driver=new ChromeDriver();
		
		// Implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// open the url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Indentifying the username filed
		WebElement UserNameInputField=driver.findElement(By.name("username"));
		
		// Fill Admin in username field
		UserNameInputField.sendKeys("Admin");
		
		// Indentifying the Password field
		WebElement UserPasswordField= driver.findElement(By.name("password"));
		
		// Fill password as admin123
		UserPasswordField.sendKeys("admin123");
		
		// Identify user log in button
		WebElement LoginButton=driver.findElement(By.partialLinkText("Login"));
		
		// Click the login page
		LoginButton.click();
		
	}

}
