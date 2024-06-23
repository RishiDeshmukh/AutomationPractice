package KeyBoardOperatons;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseExample1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//creating a instance of Action class for using mouse operations 
		Actions action= new Actions(driver);
		
		List <WebElement> Menuelist=driver.findElements(By.cssSelector(".nav.navbar-nav>li"));
		
		action.moveToElement(Menuelist.get(2)).perform();
		
		for (int i = 0; i<Menuelist.size();i++) {
			Thread.sleep(1000);
			action.moveToElement(Menuelist.get(i)).perform();
		}
	}

}
