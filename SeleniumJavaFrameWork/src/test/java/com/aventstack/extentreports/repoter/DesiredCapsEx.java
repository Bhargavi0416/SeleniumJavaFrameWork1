package com.aventstack.extentreports.repoter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DesiredCapsEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("killProcessesByName", caps);
		driver.navigate().to("https://google.com");
		driver.findElement(By.name("q")).sendKeys("desired capabilities");
		//driver.findElement(By.name("btnk")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		
}
}