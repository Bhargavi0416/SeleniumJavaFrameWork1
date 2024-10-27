package com.selenium.practice.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTest1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://google.com");    
		//driver.findElement(By.xpath("//input")).sendKeys("selenium");
	    driver.findElement(By.xpath("//div")).click();
		
		Thread.sleep(5000);
		driver.quit();
		// TODO Auto-generated method stub

	}

}
