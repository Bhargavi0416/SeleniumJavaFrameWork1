package com.selenium.practice.basicprograms;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://google.com");
		driver.getPageSource();
		
		//WebElement TextBox = driver.findElement(By.id("input"));
		//WebElement TextBox1 = driver.findElement(By.className("truncate"));
		
		List<WebElement> elements = driver.findElements(By.xpath("//div"));
		int count = elements.size();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println("elements in the list : "+count);
		
		driver.close();
		driver.quit();
		
		
		WebDriver driver1 = new ChromeDriver();
		driver1.navigate().to("https://selenium.dev");
		
		List<WebElement> element = driver1.findElements(By.xpath("//h4"));
		int count1 = element.size();
		
		System.out.println(driver1.getCurrentUrl());
		System.out.println("elements in the list : "+count1);
		
		// WebElement searchBox = driver1.findElement(By.className("td-search--algolia"));
		// searchBox.sendKeys("webdriver");
		WebElement className = driver1.findElement(By.className("td-home"));
		// WebElement  name  = driver1.findElement(By.name("Documentation"));
		// WebElement searchBox = driver1.findElement(By.className("td-search--algolia"));
		WebElement id = driver1.findElement(By.id("announcement-banner"));
		// searchBox.sendKeys("webdriver");
		//driver1.getPageSource();
		Thread.sleep(1000);
		driver1.close();
		driver1.quit();
		
		//WebElement ele = driver2.
		List<WebElement> element1 = driver1.findElements(By.xpath("//li"));
		
		int count2 = element1.size();
		System.out.println("list of driver :" +count2);
		Thread.sleep(1000);
		driver1.close();
		driver1.quit();

	}

}

