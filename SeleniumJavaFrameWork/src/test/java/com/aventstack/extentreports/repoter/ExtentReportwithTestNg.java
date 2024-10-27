package com.aventstack.extentreports.repoter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.*;
import java.nio.file.Files;

public class ExtentReportwithTestNg {

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
	
		WebDriver driver;
	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("my first report");
		extent.attachReporter(spark);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.dev");
	}
	@AfterTest
	public void teardown() {
		extent.flush();
		driver.quit();
	}
	@Test
	public void testcase1() {
		ExtentTest test = extent.createTest("verify the page").assignAuthor("bhargavi").assignCategory("functional test")
				.assignDevice("windows");
		test.info("iam opening the selenium page");
		String pagetitle = driver.getTitle();
		test.info("captured page title as :"+pagetitle);
		if(pagetitle.equals("selenium.dev")) {
			test.pass("page title is verfied :"+pagetitle);
		}else {
			test.pass("page title is not verified : "+pagetitle);
		}
		}
	@Test
	public void testcase2()throws Exception {
		ExtentTest test = extent.createTest("verify the above page").assignAuthor("bhargavi").assignCategory("functional test")
				.assignDevice("windows");
		test.info("navigating to page");
		try {
			driver.findElement(By.linkText("about")).click();
			test.pass("user is on above page");
		}catch(Exception e) {
		test.fail("unexpected error in the above page:"+e.getMessage());
		test.addScreenCaptureFromPath(Capturingthescreenshot(driver));
		}
	}
	public static 	String Capturingthescreenshot(WebDriver driver)throws Exception{
			File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destinationfilepath = new File("src/.../images/Screenshot"+System.currentTimeMillis()+".png");
			String absolutepathlocation = destinationfilepath.getAbsolutePath();
			FileUtils.copyFile(srcfile,destinationfilepath);
			return absolutepathlocation;
		}
		
	
	
	}

