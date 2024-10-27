package com.selenium.practice.WebElement;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://google.com");
//		driver.navigate().to("https://www.w3schools.com");
//		
//		//driver.findElement(By.xpath("/html/body/div[5]/a[5]")).click(); //Absolute xpath
//	//	Thread.sleep(2000);                       syntax: /html/body/div[]/
//		 
//	    driver.findElement(By.xpath("//a[@id=\"navbtn_services\"]")).click(); //Relative xpath
//	    Thread.sleep(1000);
//	                                                       // syntax://tagName[@attribute='value'];
//	    
//	    driver.findElement(By.xpath("//a[@id=\"navbtn_exercises\"]")).click();
//	    Thread.sleep(2000);
//	    
	    //driver.close();
	   // driver.quit();
	   
	    driver.navigate().to("https://www.selenium.dev");	    
	    driver.findElement(By.xpath("//div[@id=\"main_navbar\"]")).click();
	    Thread.sleep(4000);
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//div[@class =\"card-body\"]")).click();
	    Thread.sleep(8000);
	    
	    WebElement element = driver.findElement(By.xpath("//div[@class =\"card-footer bg-white p-0 border-0 bg-transparent\"]"));
	    
	    
	    Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
        Thread.sleep(4000);
        
        driver.quit();
	    
//	    driver.findElement(By.xpath("//div[@class=\"card-body text-white\"]")).click();
//	    Thread.sleep(2000);
//	  //driver.quit();
//	    		
//	    driver.findElement(By.xpath("/div[@class=\"card-body py-5\"]")).click();
//	    driver.close();
//	    driver.quit();
	    
	   // driver.findElement(By.xpath("//p[@class=\"d-1 fs-1 fw-normal mb-0\"]")).click();
	   // Thread.sleep(4000);
	  //  driver.close();
	   // driver.quit();
	    
	    
	    
		// TODO Auto-generated method stub

	}

}
