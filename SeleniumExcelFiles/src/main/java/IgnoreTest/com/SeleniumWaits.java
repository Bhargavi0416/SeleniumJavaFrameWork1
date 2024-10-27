package IgnoreTest.com;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaits {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); // default time or polling of implictwait 250ms
		
		//Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("seleniumwaits",Keys.ENTER);
		//WebElement ele = driver.sendkeys(Keys.ENTER);
		
		//WebDriverWait wait = new WebDriverWait(driver,20);The constructor WebDriverWait(WebDriver, int) is undefined   it is deprecated for older version 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("xyz")));
		
		
		driver.findElement(By.name("xyz")).click();
		
		driver.close();
		driver.quit();
		
		

	}

	
	}


