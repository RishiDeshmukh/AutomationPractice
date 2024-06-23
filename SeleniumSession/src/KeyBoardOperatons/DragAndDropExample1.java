package KeyBoardOperatons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample1 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable/");
		
		Actions action= new Actions(driver);
		
		//To get inside the frame
		driver.switchTo().frame(0);
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement Target=driver.findElement(By.id("droppable"));
		
		//Perform drag and drop operation
		action.dragAndDrop(source, Target).build().perform();
	}

}
