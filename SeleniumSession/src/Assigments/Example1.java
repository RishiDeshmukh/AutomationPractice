package Assigments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://tia.officialbuyersguide.net/SearchResult.asp?cid=24");
		
		List <WebElement> CompanyName=driver.findElements(By.xpath("//div[@id='companyname']"));
		
		System.out.println("Company name : "+CompanyName.size());
		
		for (int i=0;i<CompanyName.size();i++) {
			System.out.println("Company name: "+CompanyName.get(i).getText());
		}
		
	}

}
