package com.selenium.practice.basicprograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://google.com");
		String presentwindow = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("http://seleniumhq.org");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.switchTo().window(presentwindow);
		
		driver.close();
		driver.quit();
		
		// TODO Auto-generated method stub

	}

}
