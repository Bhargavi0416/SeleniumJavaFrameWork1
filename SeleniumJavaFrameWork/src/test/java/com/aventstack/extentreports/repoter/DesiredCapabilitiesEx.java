package com.aventstack.extentreports.repoter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesEx {
	
	WebDriver driver ;
	@BeforeTest
	public void setUpTest() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("killProcessesByName", false);
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start maximized");
		option.merge(caps);
		driver = new ChromeDriver(option);
}
	@Test
	public void testMethod1() throws InterruptedException {
		driver.navigate().to("http://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium.dev");
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		}
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
	

}
