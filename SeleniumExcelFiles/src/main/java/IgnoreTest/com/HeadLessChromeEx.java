package IgnoreTest.com;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessChromeEx {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions  options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		WebDriverManager.chromedriver().setup();
		
		driver.navigate().to("https://www.google.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("automation step by step",Keys.ENTER);
		
		Thread.sleep(3000);
		
		System.out.println("test completed");
		driver.close();
		
		driver.quit();
		

	}

}
