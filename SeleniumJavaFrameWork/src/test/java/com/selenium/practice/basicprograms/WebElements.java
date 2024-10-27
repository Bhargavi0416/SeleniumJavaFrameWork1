package com.selenium.practice.basicprograms;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class WebElements {
	
  public static void main(String[] args) throws InterruptedException {
		
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getCurrentUrl());
		
//		WebElement searchBox = driver.findElement(By.name("q"));
//		searchBox.sendKeys("geeksforgeeks");
		
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
		
		//WebDriver dri = new ChromeDriver();
		//dri.get("https://www.geeksforgeeks.org/");
		//dri.get("https://firefox.com");
		
		//System.out.println(dri.getCurrentUrl());
		WebElement searchBox1 = driver.findElement(By.name("q"));
		searchBox1.sendKeys("selenium tutorial");
//			
//		Thread.sleep(2000);
//		dri.close();
//		dri.quit();
		
		
		driver.navigate().to("https://trytestingthis.netlify.app");
		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
		
		for(WebElement element :options){
	       System.out.println(element.getText());
		}
		WebElement checkBox = driver.findElement(By.cssSelector("#fname"));
		checkBox.sendKeys("Bingi");
		//System.out.println(checkBox.getText());
		
		driver.findElement(By.cssSelector("#lname")).sendKeys("Bhargavi");
		//driver.findElement(By.className(".main"));
		
		WebElement LoginButton = driver.findElement(By.className(".login form"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(LoginButton)).sendKeys("1234");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
		//List<WebElement> ele = driver.findElements(By.className("fakeimg"));
		//System.out.println(((WebElement) ele).getText());

	}

}
