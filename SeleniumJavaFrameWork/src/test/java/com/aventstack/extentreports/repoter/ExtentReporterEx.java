package com.aventstack.extentreports.repoter;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReporterEx {
	
	static WebDriver driver ;
	
	public static void main (String args[]) throws InterruptedException {
	
	  // Create the ExtentSparkReporter object
    ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReports.html");

    // Create an ExtentReports object
    ExtentReports extent = new ExtentReports();
    extent.attachReporter(sparkReporter);

    // Create a test case in the report
    ExtentTest test = extent.createTest("MyFirstTest", "Sample test description");
    
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    
    test.log(Status.INFO, "Starting my first testcase");
    driver.navigate().to("https://google.com");
    test.pass("navigated to google.com");
    
    
    driver.findElement(By.name("q")).sendKeys("selenium automation");
    //test.pass("entered the text into searchbox");
    
   // driver.findElement(By.id("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);//textarea[@id='APjFqb'];
    //driver.quit();
    test.pass("now press the keyboard enter key");
    
    //Thread.sleep(2000);
    driver.close();
    driver.quit();
    test.pass("close the browser");
    
    test.info("test completed");
    
    //here calling flush to write everything to the log file
    extent.flush();

}
}