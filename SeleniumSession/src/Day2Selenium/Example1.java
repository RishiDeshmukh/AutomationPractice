package Day2Selenium;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// maximize browser window size
		driver.manage().window().maximize();
		
		// minimize browser window 
		driver.manage().window().minimize();
		
		// Adjust the browser window size as needed 
		driver.manage().window().setSize(new Dimension(300,500));
		

		//want to come back to previous page
		driver.navigate().back();
		
		//want to go to next page again
		driver.navigate().forward();
		
		//refresh page
		driver.navigate().refresh();
		
		//want to move to next application
		driver.navigate().to("https://www.google.com");
		
		
	}

}
