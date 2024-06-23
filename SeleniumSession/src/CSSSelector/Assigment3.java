package CSSSelector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.SeleniumUtil;

public class Assigment3 extends SeleniumUtil{

	public static void main(String[] args) {
		
		SeleniumUtil util= new SeleniumUtil();
		WebDriver driver = util.setUp("chrome", "https://www.google.com/");
		// Finding the search bar and giving input as selenium
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
		//finding the locator the commean herarki for all the 10 suggestions 
		
		List<WebElement> SuggestionList= driver.findElements(By.cssSelector("ul>li>div>.pcTkSc>div>div>span"));
		
		System.out.println("Suddgestion count :"+SuggestionList.size());
		
		for (int i = 0; i<SuggestionList.size();i++) {
			WebElement SuggestionListTotal = SuggestionList.get(i);
			String SuggestionlistFinal = SuggestionListTotal.getText();
			
			System.out.println("Suggestion list : "+SuggestionlistFinal);
		}
	}

}
