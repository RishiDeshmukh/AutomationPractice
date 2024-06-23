package xpath;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/gift-card-store/b/?ie=UTF8&node=3704982031&ref_=nav_cs_gc");
		
		WebElement birthdayCheckBox=driver.findElement(By.xpath("//li[span[a[span[text()='Birthday']]]]//i[@class='a-icon a-icon-checkbox']"));
		birthdayCheckBox.click();
	}

}
