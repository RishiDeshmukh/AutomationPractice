package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class SwitchElementAssigment2 extends SeleniumUtility{
  @Test
  public void Assigment2() {
	  WebDriver driver= setUp("chrome", "https://jqueryui.com");
	  	driver.findElement(By.xpath("//a[text()='Sortable']")).click();
	  	
	  	// To enter in the frame 
	  	WebElement Frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	  	
	  	driver.switchTo().frame(Frame);
	  	
	  	List <WebElement> Listitems= driver.findElements(By.id("#sortable>li"));
	  	
	  	Actions action= new Actions(driver);
	  	for (int i=0; i<Listitems.size()-1; i++) {
	  		Listitems= driver.findElements(By.id("#sortable>li"));
	  		action.dragAndDrop(Listitems.get(Listitems.size()-1), Listitems.get(i)).build().perform();
	  		setSleep(2000);
	  		
	  	}
  }
}
