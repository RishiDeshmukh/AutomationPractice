package Assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//Login to the WebPage
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		//click on left side 3bars
		driver.findElement(By.xpath("//nav/div/div/div/div/div/div/span")).click();
		
		//click on marking option
		driver.findElement(By.xpath("//span[contains(text(),' MARKETING')]")).click();
		
		//click on leads option
		driver.findElement(By.xpath("//span[contains(text(),' Leads')]")).click();
		
		//click on add lead 
		driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();
		
		//click on none option of First name
		driver.findElement(By.xpath("//span[text()='None']")).click();
		
		//click on Mr option inside the none option infront of First name 
		driver.findElement(By.xpath("//div[text()='Mr.']")).click();
		
		//click on the empty space infront of First Name 
		driver.findElement(By.id("Leads_editView_fieldName_firstname")).sendKeys("Rishi");
		
		//click on the empty space infront of Last Name 
		driver.findElement(By.id("Leads_editView_fieldName_lastname")).sendKeys("Deshmukh");
		
		//click on the empty space infront of Primary No. 
		driver.findElement(By.id("Leads_editView_fieldName_phone")).sendKeys("1234567890");
		
		//click on the empty space infront of company name
		driver.findElement(By.id("Leads_editView_fieldName_company")).sendKeys("Datanova");
		
		//click on the empty space infront of Mobile no.
		driver.findElement(By.id("Leads_editView_fieldName_mobile")).sendKeys("0987652413");
		
		//click on the empty space infront of Manager
		driver.findElement(By.id("Leads_editView_fieldName_designation")).sendKeys("Manager");
		
		//click on the empty space infront of fax
		driver.findElement(By.id("Leads_editView_fieldName_fax")).sendKeys("12457@8");
		
		//click on the empty space infront of Website
		driver.findElement(By.id("Leads_editView_fieldName_website")).sendKeys("www.habhab.com");
		
		//click on the lead source option
	//	driver.findElement(By.xpath("//span[@id='select2-chosen-4']")).click();
		
		//click on any option ((((((But it is not working ))))
	//	driver.findElement(By.xpath("//div[@id='select2-result-label-168']")).click();
		
		//click on save button
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		//click on all optons on the left top
		driver.findElement(By.xpath("//p/a[@href=\"index.php?module=Leads&view=List&viewname=1&app=MARKETING\"]")).click();
	
		//click on 3dots which is present on leads section lead
	//	driver.findElement(By.xpath("//tbody/tr[1]/td/div/span[4]/span/i")).click();
		
		//click on the checkbox to select the whole lead
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='4']")).click();
		
		//click on the above edit button
	//	driver.findElement(By.xpath("//button/i[@class='fa fa-pencil']")).click();
		
		//click on the above delete button
		driver.findElement(By.xpath("//button/i[@class='fa fa-trash']")).click();
		
		//click on the yes when popup occurs
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		
		
	}

}
