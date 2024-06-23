package KeyBoardOperatons;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2Flipcart {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.espncricinfo.com/");
		
		
		Actions action = new Actions(driver);
		
		List <WebElement> MainMenue=driver.findElements(By.xpath("//div[@class='ds-flex ds-flex-row']/div"));
		
		System.out.println("main meue size : "+ MainMenue.size());
		
		for (int i=0; i<MainMenue.size(); i++) {
			System.out.println("main menu options :"+MainMenue.get(i).getText());
			
			for (int y=0; y<MainMenue.size(); y++) {
				action.moveToElement(MainMenue.get(i)).perform();
			}
		}
		
	}

}
