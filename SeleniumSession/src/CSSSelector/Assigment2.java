package CSSSelector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.SeleniumUtil;

public class Assigment2 extends SeleniumUtil {

	public static void main(String[] args) {

		SeleniumUtil Util = new SeleniumUtil();

		WebDriver driver = Util.setUp("Chrome", "https://www.espncricinfo.com/");

		List<WebElement> MainMenuOption = driver
				.findElements(By.cssSelector(".ds-flex.ds-items-center.ds-justify-between.ds-flex-1>div>div>a"));

		System.out.println("Main Menu Option count : " + MainMenuOption.size());

		for (int i = 0; i < MainMenuOption.size(); i++) {
			WebElement MainMenu = MainMenuOption.get(i);
			String MenuOptions = MainMenu.getText();
			System.out.println("Main menu Option List :" + MenuOptions);
		}

	}

}
