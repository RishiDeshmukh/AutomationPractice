package Day2Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utility.SeleniumUtil;

public class Example1 extends SeleniumUtil{

	public static void main(String[] args) {
		
		SeleniumUtil util= new SeleniumUtil();
		
		WebDriver driver= util.setUp("Chrome", "https://demo.automationtesting.in/Register.html");
		
		//identify dropdown list
		WebElement skillDropdown =driver.findElement(By.id("Skills"));
		
		//create an instance of Select class and pass above skillDropdown object to its constructor
		Select skillSelect = new Select(skillDropdown);
		
		System.out.println("is given dropdown multiselect : "+skillSelect.isMultiple());
		System.out.println("Defult value from dropdown : "+skillSelect.getFirstSelectedOption().getText());
		
		skillSelect.selectByIndex(2);
		System.out.println("Defult value from dropdown : "+skillSelect.getFirstSelectedOption().getText());
		
		skillSelect.selectByValue("Analytics");
		System.out.println("Defult value from dropdown : "+skillSelect.getFirstSelectedOption().getText());
		
		skillSelect.selectByVisibleText("Backup Management");
		System.out.println("Defult value from dropdown : "+skillSelect.getFirstSelectedOption().getText());
		
		int count = skillSelect.getOptions().size();
		System.out.println("size of the skillSelect : "+count);
		
		for (int i=0; i<count; i++) {
			System.out.println("Total select options : "+skillSelect.getOptions().get(i).getText());
		}
	}

}
