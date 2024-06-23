package POMWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumUtility.SeleniumUtility;

public class GoogleSearchResultPage extends SeleniumUtility {

	public GoogleSearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "q")
	private WebElement SearchInputField;

	public WebElement getUsernameInputField() {
		return SearchInputField;
	}

}
