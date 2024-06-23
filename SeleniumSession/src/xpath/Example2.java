package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");

		WebElement SearchBar = driver.findElement(By.className("Pke_EE"));
		SearchBar.sendKeys("Samsung Tv", Keys.ENTER);

		WebElement SamsungTVPrice = driver.findElement(By.xpath(
				"//div[div[div[text()='SAMSUNG 108 cm (43 inch) Full HD LED Smart Tizen TV 2023 Edition']]]//div[@class='col col-5-12 BfVC2z']/div/div/div[@class='Nx9bqj _4b5DiR']"));
		System.out.println("Samsung Tv price : " + SamsungTVPrice.getText());

	}

}
