package KeyBoardOperatons;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/tcs/login.do");
		
		WebElement UsernameField=driver.findElement(By.id("username"));
		UsernameField.sendKeys("admin01", Keys.chord(Keys.CONTROL,"a"));
		UsernameField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		WebElement PasswordField=driver.findElement(By.name("pwd"));
		PasswordField.sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.ENTER);
		
		
	}

}


