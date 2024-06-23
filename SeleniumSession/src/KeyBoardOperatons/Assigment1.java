package KeyBoardOperatons;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assigment1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		List <WebElement> MainMenu= driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']//div[@class='YBLJE4']/span/span"));
		System.out.println("Main Menue : "+ MainMenu.size());
		
		for (int i=0; i<MainMenu.size();i++) {
			System.out.println("Main Menue Options : "+ MainMenu.get(i).getText());
			
			//creating actions class instance for mouse operations
			Actions action = new Actions(driver);
			
			for (int y=0;y<MainMenu.size();y++) {
				Thread.sleep(1000);
				action.moveToElement(MainMenu.get(i)).perform();
			}
			
		}
		
	}

}
