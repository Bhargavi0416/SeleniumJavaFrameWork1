package com.selenium.practice.WebElement;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v128.filesystem.model.File;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager; 

public class XpathOperators {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		
		ChromeOptions opt = new ChromeOptions();
		
		//opt.addExtensions((List<java.io.File>) new File("./Extension/Adblock.crx"));
		File adBlock = new File("./Extension/Adblock.crx", null, null, null);
		
		//opt.addExtensions(adBlock);
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.hyrtutorials.com/");
		
		//driver.manage().window().fullscreen();
		
		//WebElement  ele = driver.findElement(null);
				
	    driver.findElement(By.xpath("//a[normalize-space()='Selenium Practice']")).click();
		Thread.sleep(2000);
		
		 
				
		WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='XPath Practice']"));//a[normalize-space()='XPath Practice']
		//Thread.sleep(8000);
		
		Actions action = new Actions(driver);
	     action.moveToElement(ele).click().perform();
	     //Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//td[text()=5000]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//td[text()<5000]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//td[text()>5000]")).click();
		Thread.sleep(1000);
		
        WebElement element = driver.findElement(By.xpath("//input[@name()='refreshbtn' or @value='Refresh']"));
		Thread.sleep(1000);
		
		
		 Actions actions = new Actions(driver);
	     actions.moveToElement(element).click().perform();
	     Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class=\"body-row\" and  @id =\"header-wrappers\"]")).click();
		Thread.sleep(1000);
		driver.quit();
		
		
		// TODO Auto-generated method stub

	}

	

}
