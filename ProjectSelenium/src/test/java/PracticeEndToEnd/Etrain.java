package PracticeEndToEnd;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class Etrain extends SeleniumUtility{

  
  @Test
  public void testcase() {
	  WebDriver driver=setUp("Chrome", "https://erail.in/");
	  // click on ecatring 
	  driver.findElement(By.xpath("//a[text()='eCatering']")).click();
	  // getting home window id
	  String HomeWinId= driver.getWindowHandle();
	  System.out.println("Home Window Id :"+HomeWinId);
	  //get all window id after clickin on Ecatring
	 Set <String> AllWinId= driver.getWindowHandles();
	 System.out.println("All Window Id :"+AllWinId);
	  //sort home winId and Child WinId
	  AllWinId.remove(HomeWinId);
	  Iterator<String> itr= AllWinId.iterator();
	  String ChildWindow = itr.next();
	  System.out.println("Child Window : "+ChildWindow);
	  
	  //switchin in new page to perform actions on that page 
	  driver.switchTo().window(ChildWindow);
	  System.out.println("title :"+driver.getTitle());
	  // typing 12627 on searchbar for train
	 WebElement Search= driver.findElement(By.xpath("//input[@class='form-input pl-12  h-16 pl-12 pr-4 text-lg shadow-6dp']"));
	 Search.click();
	 Search.sendKeys("12627");
	 
	 WebElement insideSearchBox = driver.findElement(By.xpath("//input[@class='form-input pl-12  text-sm']"));
	  insideSearchBox.click();
	  insideSearchBox.sendKeys("12627");
	  
	  // From the suggestions selecting the required train no
	  driver.findElement(By.xpath("//p[text()='12627']")).click();
	  
	  // click on date options
	  driver.findElement(By.xpath("//input[@class='form-input custom-date-picker h-11.5 pl-12 text-sm']")).click();
	  
	  // press down arrow key one time 
	  WebElement element = driver.switchTo().activeElement();
	  element.sendKeys("1",Keys.ARROW_DOWN,Keys.ENTER);
	  
	  // click on boarding station space to select the option
	 WebElement Station= driver.findElement(By.xpath("//select[@placeholder='Boarding Station']"));
	  Station.click();
	  Station.sendKeys("Itarsi",Keys.ENTER);
	  
	  // click on find food 
	  driver.findElement(By.xpath("//button[text()='FIND FOOD']")).click();
	  
	  //Print all the restront which are available
	  List <WebElement> Hotels= driver.findElements(By.xpath("//h5[@class='tracking-normal ']"));
	  System.out.println("Total Hotels : "+Hotels.size());
	  
	  for (int i=0; i<Hotels.size();i++) {
		  System.out.println("Avaible Hotels :"+Hotels.get(i).getText());
	  }
	  // Switching back centrols to home page
	  driver.switchTo().window(HomeWinId);
	  
	  // entering pune in from section in home page 
	  WebElement From=driver.findElement(By.id("txtStationFrom"));
	  From.clear();
	  From.sendKeys("Pune",Keys.ENTER);
	  
	  // Entering Bengalore in To section
	  WebElement To=driver.findElement(By.id("txtStationTo"));
	  To.clear();
	  To.sendKeys("Bangalore",Keys.ENTER);
	  	  
	  // Selecting date for the train
	  driver.findElement(By.xpath("//input[@title='Select Departure date for availability']")).click();
	  
	  driver.findElement(By.xpath("//td[text()='1' and @onclick='DoDateSelect(1717180200000)']")).click();
	  
	  driver.findElement(By.id("buttonFromTo")).click();
	  
	  // print all the result trains 
	  
	  List <WebElement> AllAvailabeTrains=driver.findElements(By.xpath("//td[@style=';']"));
	  System.out.println("***************************");
	  System.out.println("Total No of trains :"+AllAvailabeTrains.size());
	  
	  for (int i=0;i<AllAvailabeTrains.size();i++) {
		  System.out.println("All Available Trains :"+AllAvailabeTrains.get(i).getText());
	  }
	  
	  
  }
  
}
