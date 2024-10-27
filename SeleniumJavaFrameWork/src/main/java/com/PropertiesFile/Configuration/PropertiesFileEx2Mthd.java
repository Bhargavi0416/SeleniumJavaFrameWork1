package com.PropertiesFile.Configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.reactivex.rxjava3.functions.Action;

public class PropertiesFileEx2Mthd{
	
	
	public static void main(String args[]) throws InterruptedException{
		
		testMethod();
		
	}
		
		public static void testMethod() throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			ReadConfigurationProperties obj = new ReadConfigurationProperties();
			
			//driver.get(obj.getBrowserType());
			
			driver.get(obj.getProperties());
			
			driver.get(obj.getURl());
			
			//driver.navigate().to("https://javatpoint.com/");
			
			Actions action = new Actions(driver);
			
			WebElement searchbox = driver.findElement(By.name("search"));
			action.moveToElement(searchbox);
			
			Thread.sleep(2000);
			
			Actions action1 = new Actions(driver);
			action1.sendKeys(Keys.ARROW_DOWN).perform();  // Scrolls down
			action1.sendKeys(Keys.ARROW_LEFT).perform();  //scroll left
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//searchbox.sendKeys("properties file in selenuim");
			searchbox.sendKeys(obj.getText());
			
			searchbox.sendKeys(Keys.ENTER);
			
			//searchbox.sendKeys(obj.getKeys());
			
			Thread.sleep(3000);
	
			driver.quit();
		}
			
		
		
	}
	


