package com.selenium.practice.basicprograms;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest1 {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bharg/eclipse-workspace/SeleniumJavaFrameWork/Drivers/ChromeDriver/chromedriver_win32/chromedriver.exe");
		driver.get("http://seleniumhq.org");
		String projectpath = System.getProperty("user.dir");
		System.out.println("projectpath : "+projectpath);
		driver.getCurrentUrl();
		System.out.println(driver.getClass());
		System.out.println(driver.getCurrentUrl());
		try {
		      Thread.sleep(4000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();
		//driver.getPageSource();
		// TODO Auto-generated method stub

	}

}
