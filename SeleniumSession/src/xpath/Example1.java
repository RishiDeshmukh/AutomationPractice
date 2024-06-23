package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoblaze.com/");
	
		WebElement sony =driver.findElement(By.xpath("//div[h4[a[text()='Sony xperia z5']]]//h5"));
		System.out.println("sony phone price : "+sony.getText());
	}

}
