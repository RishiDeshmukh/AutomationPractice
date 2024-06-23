package Day1WorkingWithBrowsers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyncExample2 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://online.actitime.com/tcs/login.do");
		driver.findElement(By.name("username")).sendKeys("admin01");
		driver.findElement(By.name("pwd")).sendKeys("admin01");
		driver.findElement(By.id("loginButton")).click();
		
		String exptecteHomePageTitle = "actiTIME -  Licenses";
		String Actualtitle= driver.getTitle();
		
		System.out.println("Home page validation Status : "+ exptecteHomePageTitle.equals(Actualtitle));
	}

}
