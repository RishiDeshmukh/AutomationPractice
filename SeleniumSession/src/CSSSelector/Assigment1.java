package CSSSelector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.SeleniumUtil;

public class Assigment1 extends SeleniumUtil{

	public static void main(String[] args) {
		
		SeleniumUtil Util= new SeleniumUtil();
		
		WebDriver driver= Util.setUp("Chrome", "https://www.flipkart.com/");
		List<WebElement> MainMenueOptions=driver.findElements(By.cssSelector("._3sdu8W>a>div>div>span"));
		System.out.println("total options for main menue :"+MainMenueOptions.size());
		 
		for (int i=0;i<MainMenueOptions.size();i++) {
			WebElement Menu= MainMenueOptions.get(i);
			String MenuName= Menu.getText();
			System.out.println("Main menu Options : "+MenuName);
		}
		
	}

}
