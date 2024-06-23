package POMWebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumUtility.SeleniumUtility;

public class GoogleHomePage extends SeleniumUtility {

	public GoogleHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "q")
	private WebElement SearchInputField;


	@FindBy(xpath = "//li/div/div/div/div/span[text()='selenium']")
	private List<WebElement> suggestionList ;

	public WebElement getSearchInputField() {
		return SearchInputField;
	}

	public List<WebElement> getSuggestionList() {
		return suggestionList;
	}

	

}
