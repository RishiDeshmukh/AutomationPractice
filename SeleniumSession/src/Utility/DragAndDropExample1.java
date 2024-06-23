package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragAndDropExample1 {

	public static void main(String[] args) {
		
		SeleniumUtil util=new SeleniumUtil();
		WebDriver driver = util.setUp("chrome","https://jqueryui.com/droppable/");
		
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		util.performDragAndDrop(src, target);
	}

}
