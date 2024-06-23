package Day1WorkingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/");
		
		String PageTitle= driver.getTitle();
		System.out.println("Page title : "+ PageTitle);
		System.out.println("Page title length : "+ PageTitle.length());
		
		String CurrentPageURL= driver.getCurrentUrl();
		System.out.println("CurrentPageURL : "+CurrentPageURL);
		
		String CurrentPageSourceCode= driver.getPageSource();
		System.out.println("CurrentPageSourceCode length : "+CurrentPageSourceCode.length());
	//	System.out.println("CurrentPageSourceCode : "+CurrentPageSourceCode);
		
	}

}
