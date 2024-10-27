package Testcases;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import WebPages.GoogleWebpage;

public class GoogleWebpagetest {
	
	 WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		GoogleWebpage obj = new GoogleWebpage(driver);
		
		driver.navigate().to("https://google.com");
		
		obj.SetTextInSearchBox("selenium tutorial");
		
		obj.clickSearchButton(Keys.RETURN);
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		// TODO Auto-generated method stub

	}

	
	

}
