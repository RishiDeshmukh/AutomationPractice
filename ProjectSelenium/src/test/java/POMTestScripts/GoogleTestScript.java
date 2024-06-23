package POMTestScripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMWebPages.GoogleHomePage;
import POMWebPages.GoogleSearchResultPage;
import SeleniumUtility.SeleniumUtility;

public class GoogleTestScript extends SeleniumUtility{
  WebDriver driver;
  GoogleHomePage getGoogleHomePage;
  GoogleSearchResultPage getGoogleSearchResultPage;
  
  @BeforeTest
  public void Precondition() {
	  driver = setUp("chrome" , "https://www.google.co.in/");
	  getGoogleHomePage = new GoogleHomePage(driver);
	  getGoogleSearchResultPage = new GoogleSearchResultPage(driver);
  }
  
  @Test(priority = 2)
  public void TestSuggestionsvalue() {
	typeRequiredText(getGoogleHomePage.getSearchInputField() , "Selenium");  
	List <WebElement> SuggList= getGoogleHomePage.getSuggestionList();
	Assert.assertTrue(SuggList.size()==10);
	
  }
  @Test(priority = 3)
  public void TestSuggestionsSelection() {
	  
	List <WebElement> SuggList= getGoogleHomePage.getSuggestionList();
	SuggList.get(0).click();
	String SearchedText=getTextFromElement(getGoogleSearchResultPage.getUsernameInputField());
	Assert.assertEquals(SearchedText, "selenium");
  }
  }

