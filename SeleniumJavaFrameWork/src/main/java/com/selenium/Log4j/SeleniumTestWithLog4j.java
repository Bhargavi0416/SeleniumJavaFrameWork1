package com.selenium.Log4j;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestWithLog4j {

	//initializing the logger class
	private static Logger logger = LogManager.getLogger(SeleniumTestWithLog4j.class);

	public static void main(String[] args) throws InterruptedException {

		// set up the path of chrome driver manager
		WebDriverManager.chromedriver().setup();

		//log to browser initialization 
		logger.info("launching the chrome browser");

		WebDriver driver = new ChromeDriver();

		//log to browser initialization 
		logger.info("navigating the selenium browser");

		driver.navigate().to("https://selenium.com");

		//log a successful event
		logger.info("webpage opened successfully");

		// Perform some actions and log them
		// Example: Log browser actions
		logger.debug("Maximizing the browser window");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		//log fatal throws and exception
		logger.fatal("the title of the page test is not passed");
		driver.getTitle().contains("google.com");

		//log the browser closed
		logger.info("closed the browser");
		driver.close();
		driver.quit();
		

	}
}

