package Day1WorkingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowserWithOps {

	public static void main(String[] args) {
		// create an instance of ChromeDriver class and upcast it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		//enter application URL
		driver.get("https://www.google.com");
		
		//get application current title
		//System.out.println("Driver title :"+driver.getTitle());  // Without creating String !
		String title= driver.getTitle();   // with creating String !
		System.out.println(" Driver title : "+title);
		
		//get current URL from opened application
		System.out.println("Print current Url : "+driver.getCurrentUrl());
		
		//get current application source code
		String currentPageSourceCode= driver.getPageSource();
		System.out.println("Current page source code length: "+currentPageSourceCode.length());
		
		////close current browser opened by Selenium
		driver.close();
	}

}
