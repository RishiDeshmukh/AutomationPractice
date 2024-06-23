package CSSSelector;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssFindingMultipleElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");

		// identify all images present in the page

		List<WebElement> deviceList = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		List<WebElement> devicePriceList = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));

		System.out.println("Total list of divice in the list : " + deviceList.size());
		System.out.println("Total Price of divice in the list : " + devicePriceList.size());

		for (int i = 0; i < deviceList.size(); i++) {
			WebElement device = deviceList.get(i);
			String name = device.getText();
			System.out.println("Device name: " + name);
			
		for (int y=0;i<devicePriceList.size();i++) {
				WebElement Price= devicePriceList.get(i);
				String price = Price.getText();
				System.out.println(" Divice Price : "+price);
			}

		}

	}
}
