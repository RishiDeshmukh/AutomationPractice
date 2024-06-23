package Day1WorkingWithBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locateElement {

	public static void main(String[] args) {
		
		// Create an instance of ChromeDriver class and upcast it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		// enter application URL
		driver.get("https://www.saucedemo.com/");
		
		//identify user name input field
		WebElement element=driver.findElement(By.id("user-name") );
		
		//type username as standard_user
		element.sendKeys("standard_user");
				
				//indetify password input field
				WebElement passwordInputfield=driver.findElement(By.name("password"));
				//type password as secret_sauce
				passwordInputfield.sendKeys("secret_sauce");
				
				//identify login button
				WebElement loginBtn=driver.findElement(By.className("submit-button"));
				//click on login button
				loginBtn.click();
		}

}
