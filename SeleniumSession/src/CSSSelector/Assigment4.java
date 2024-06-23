package CSSSelector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.SeleniumUtil;

public class Assigment4 extends SeleniumUtil {

	public static void main(String[] args) {

		SeleniumUtil util = new SeleniumUtil();

		WebDriver driver = util.setUp("chrome", "https://www.gsmarena.com/");

		driver.findElement(By.cssSelector("#body>.sidebar.col.left>div>ul>li:nth-of-type(1)")).click();

		List<WebElement> ListOfMobiles = driver.findElements(By.cssSelector("#review-body>div>ul>li"));

		System.out.println("Mobile Phone list : " + ListOfMobiles.size());

		for (int i = 0; i < ListOfMobiles.size(); i++) {
			WebElement MobilePhoneList = ListOfMobiles.get(i);
			String MobilePhoneList1 = MobilePhoneList.getText();
			System.out.println("All samsung Mobile phone list : " + MobilePhoneList1);
		}

	}

}
