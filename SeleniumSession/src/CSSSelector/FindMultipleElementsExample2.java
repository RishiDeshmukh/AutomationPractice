package CSSSelector;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindMultipleElementsExample2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		//identify all images present in the page
		List<WebElement> imageList=driver.findElements(By.tagName("img"));
		System.out.println("Image list : "+imageList.size());
		
		for (int i=0;i<imageList.size();i++) {
			WebElement img= imageList.get(i);
			String src= img.getAttribute("src");
			System.out.println("Image src : "+src);
		}
		
		
	}

}
