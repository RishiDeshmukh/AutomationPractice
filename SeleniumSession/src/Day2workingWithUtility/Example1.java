package Day2workingWithUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.SeleniumUtil;

public class Example1 {

	public static void main(String[] args) {
		
		SeleniumUtil util= new SeleniumUtil();
		
		WebDriver driver=util.setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		util.typeRequiredText(driver.findElement(By.name("username")),"Admin");
		util.typeRequiredText(driver.findElement(By.name("password")),"admin123");
		util.clickOnElement(driver.findElement(By.className("orangehrm-login-button")));
	}

}
