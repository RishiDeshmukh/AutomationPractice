package Practice;

import org.openqa.selenium.By;

import SeleniumUtility.SeleniumUtility;

public class Example1 extends SeleniumUtility{

	public static void main(String[] args) {
		
		SeleniumUtility util= new SeleniumUtility();
		
		util.setUp("Chrome", "https://www.google.com");
		
		util.typeRequiredText(driver.findElement(By.name("q")), "Selenium");
		

	}

}
