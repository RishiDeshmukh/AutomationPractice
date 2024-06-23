package KeyBoardOperatons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample2 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/draggable/");
		
		Actions action= new Actions(driver);
		
		//To get inside the frame
		driver.switchTo().frame(0);
		
		WebElement source=driver.findElement(By.id("draggable"));
		
		
		//Perform drag and drop on given x and y cords 
		action.dragAndDropBy(source, 300, 100).build().perform();
		
	}

}
