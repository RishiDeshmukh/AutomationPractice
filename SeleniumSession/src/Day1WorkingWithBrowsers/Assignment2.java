package Day1WorkingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String HomePageTitle= driver.getTitle();
		System.out.println("Current page title : "+HomePageTitle);
		
		String CurrentURL=driver.getCurrentUrl();
		System.out.println("Current URL "+CurrentURL );
		
	//	System.out.println("s1 & s2 using equals(): "+s1.equals(s2));
		
		System.out.println("Actual title is same as expected title or not :"+CurrentURL.equals(HomePageTitle) );
		
		
		
		
		//driver.close();
	}

}




//  Verify actual tile of the home page with the expected title.