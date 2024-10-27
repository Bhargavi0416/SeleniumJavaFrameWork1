package com.selenium.practice.WebElement;

import org.openqa.selenium.By; 

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_TutorialPoint {

	
	public static void main(String[] args) throws InterruptedException {

		GoogleSearch();
	}
	public static void GoogleSearch() throws InterruptedException {

		//it automatically handles the downloaded library and setup the firefoxdriver
		
		WebDriverManager.firefoxdriver().setup();
		
		// its goto firefox browser 
		
		WebDriver driver = new FirefoxDriver();

		//  its open these first  url web page
		
		driver.navigate().to("https://www.tutorialspoint.com");
		
		//these window will goto expand to fullscreen by fullscreen method
		
		driver.manage().window().fullscreen();
		
		// these sleep method is one of the thread method to wait for 1sec	
		
		Thread.sleep(1000);
		
		//next step is to open the second url web page
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		// webelement is a locator in selenium these step is to find the given xpath 
		
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Practice Form']"));

		// these is one more xpath of find the above button 
		
		WebElement ele = driver.findElement(By.xpath("//button[normalize-space()='Forms']"));

		// here it perform an action to move from practice form box to form button 

		Actions Action1 = new Actions(driver);
		Action1.moveToElement(ele).click().perform();
		Thread.sleep(2000);
		
		//these xpath will move to one step above button and it click that button
		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Elements']"));
		button.click();
		

		WebElement dropdown = driver.findElement(By.xpath("//a[normalize-space()='Text Box']"));
		
		//Select select = new Select(dropdown);
	   //select.selectByValue("Text Box");
		//select.selectByIndex(1);
		
		
		dropdown.click();
		Thread.sleep(3000);
		driver.quit();
		System.out.println("test has completed successfully");

       









	}
}