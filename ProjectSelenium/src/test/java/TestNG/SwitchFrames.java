package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class SwitchFrames extends SeleniumUtility{
	@Test
  public void HandlingFrame() {
		WebDriver driver= setUp("Chrome", "https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Selectable']")).click();
		
		// To move inside the frame 
		
		WebElement Frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(Frame);
		
		driver.findElement(By.xpath("//li[text()='Item 2']")).click();

		//to get the control back to main page use
		
		driver.switchTo().defaultContent();
		
		WebElement MainLogo=driver.findElement(By.xpath("//a[text()='jQuery UI' and @href='https://jqueryui.com/']"));
		System.out.println(MainLogo.getText());
  }
}

