package Day2Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		
		WebElement carDropdown=driver.findElement(By.id("multiselect1"));
		
		Select carSelect= new Select(carDropdown);
		
		System.out.println("is carSelect a multiselect dropdown : "+ carSelect.isMultiple());
		
		int count = carSelect.getOptions().size();
		System.out.println("count of carSelect options : "+count );
		
		for (int i= 0;i<count;i++) {
			System.out.println("Total carselect options : "+carSelect.getOptions().get(i).getText());
		}
		System.out.println("total selected car options : "+carSelect.getAllSelectedOptions());
	}

}
