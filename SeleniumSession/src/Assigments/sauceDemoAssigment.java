package Assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauceDemoAssigment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.saucedemo.com/inventory.html ");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce", Keys.ENTER, Keys.ENTER);

		driver.findElement(By.xpath(
				"//button[@class='btn btn_primary btn_small btn_inventory ' and @id='add-to-cart-sauce-labs-bike-light']"))
				.click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

		driver.findElement(By.xpath("//button[@id='checkout']")).click();

		driver.findElement(By.id("first-name")).sendKeys("Rishi");
		driver.findElement(By.id("last-name")).sendKeys("Deshmukh");
		driver.findElement(By.id("postal-code")).sendKeys("444603");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
	
		String ExpectedEndNote = "Thank you for your order!";
		WebElement  actualnote= driver.findElement(By.xpath("//h2"));
		String ActualEndNote= actualnote.getText();
		System.out.println("Expected and actual is same :"+ ExpectedEndNote.equals(ActualEndNote));
	}
	
}