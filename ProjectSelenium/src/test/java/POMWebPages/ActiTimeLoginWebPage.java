package POMWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumUtility.SeleniumUtility;

public class ActiTimeLoginWebPage extends SeleniumUtility{

	public ActiTimeLoginWebPage(WebDriver driver ) {
		PageFactory.initElements( driver, this);
	}

	@FindBy(id= "username")
	private WebElement UsenameInputField;
	
	
}
