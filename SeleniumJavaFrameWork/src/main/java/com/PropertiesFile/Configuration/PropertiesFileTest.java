package com.PropertiesFile.Configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesFileTest {
	
	public static void main(String args[]) {
		
		//launching chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//open the url
		driver.navigate().to("https://www.instagram.com");
		//find the username and enter user name
		WebElement ele = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		ele.sendKeys("bhargavisl_16");
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bhargavisl_16");
		//find password and enter the password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("chittamma");
		//find login button and click action
		driver.findElement(By.xpath("//button [@type=\"button\"]")).click();
		
		driver.quit();
		 
		
	}
}
