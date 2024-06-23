package Day1WorkingWithBrowsers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncAssignment3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	driver.manage().window().maximize();
		
		driver.get("https://online.actitime.com/tcs/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin01");
		driver.findElement(By.name("pwd")).sendKeys("admin01");
		driver.findElement(By.id("loginButtonContainer")).click();
		
		String ExpectedHomePageTitle= "actiTIME - Login";
		
		////Sync - explicit wait (conditional wait) WebDriverWait & FluentWait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//now implement required condition for wait
		wait.until(ExpectedConditions.titleIs(ExpectedHomePageTitle));
		
		String CurrentHomePageTitle=driver.getTitle();
		System.out.println("Expected home page title : "+ExpectedHomePageTitle);
		System.out.println("Current home page title : "+CurrentHomePageTitle);
		System.out.println("Home Page Validation Status : "+ExpectedHomePageTitle.equals(CurrentHomePageTitle));
		
	}

}
