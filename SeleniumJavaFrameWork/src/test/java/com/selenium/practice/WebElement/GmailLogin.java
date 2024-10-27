package com.selenium.practice.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://google.com");
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement searchBox1 = driver.findElement(By.name("q"));
		searchBox1.sendKeys("Gmail.com",Keys.ENTER);
			
		
		driver.manage().window().maximize();
		
		//driver.navigate().to("Gmail.com",keys.ENTER);
		
		driver.navigate().to("https://www.google.com/intl/en-US/gmail/about/");
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@type=\"email\"]"));
		checkBox.sendKeys("slbhargavi9@gmail.com",Keys.ENTER);
	    Thread.sleep(2000);
	     
	  //  driver.findElement(By.xpath("//span[contains(text(),'Try again')]")).click();
	    
	    
	   // Actions actions = new Actions(driver);
       // actions.moveToElement(ele).click().perform();
	    Thread.sleep(1000);
	    driver.quit();
		
		
		
		
		//Thread.sleep(4000);
		
		//driver.close();
		
		
		// TODO Auto-generated method stub

	}

}
