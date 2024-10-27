package com.aventstack.extentreports.repoter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ExtentReportex1 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// Create the ExtentSparkReporter object
		ExtentSparkReporter ExSpRe = new ExtentSparkReporter("extentReports.html");

		// Create an ExtentReports object
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(ExSpRe);

		// Create a test case in the report
		ExtentTest test = extent.createTest("MyFirstTest", "Sample test description");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		test.log(Status.INFO ,"starting my first test case");
		driver.navigate().to("https://google.com");
		test.pass("navigated to open the google page");

		Thread.sleep(2000);
		ExtentTest test1 = extent.createTest("MySecondTest", "Sample test to open selenium web page");

		test.log(Status.INFO ,"open the second web page");
		driver.get("http://seleniumhq.org");
		test.pass("navigated to open the selenium page");

		Thread.sleep(2000);

		driver.manage().window().maximize();
		test.pass("maximizing the window");

		ExtentTest test2 = extent.createTest("MythrirdTest","the page will open the selenium webdriver");

		//Create an instance of Actions class
		Actions action1 = new Actions(driver);
		// Scroll down using the keyboard (PAGE_DOWN)                                             //action1.moveToElement(ele).click();
		action1.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);

		action1.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);

		action1.sendKeys(Keys.ARROW_RIGHT).perform();
		//Locate the left side menu item ("Selenium WebDriver")

		//WebElement ele = driver.findElement(By.linkText("Selenium WebDriver"));
		driver.findElement(By.xpath("//div[@class='row']//div[1]//div[1]//div[2]//div[1]")).click();
		test.pass("opened the webDriver page");
		Thread.sleep(2000);

		action1.sendKeys(Keys.ARROW_RIGHT).perform();
		Thread.sleep(2000);

		ExtentTest test3 = extent.createTest("MyForthTest","moving to searchbox to search something");
		action1.sendKeys(Keys.ARROW_RIGHT).perform();


		WebElement searchbox1 =  driver.findElement(By.xpath("//div[@class=\"td-search\"]"));
		// searchbox1.sendKeys("WebElement",Keys.RETURN);
		Thread.sleep(3000);
		
		Actions action2 = new Actions(driver);
		action2.moveToElement(searchbox1).click().sendKeys("Web elements").perform();
		test.pass("opened the webElement page");
		Thread.sleep(3000);
		
		action2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		test.pass("now press the keyboard enter key");
		Thread.sleep(10000);
		
		ExtentTest test4 = extent.createTest("MyFifthTest","moving to searchbox to search something");
		
		driver.close();
		driver.quit();
		
		test.pass("close the browser");
	    
	    test.info("test completed");
	    
	    //here calling flush to write everything to the log file
	    extent.flush();


		//Searchbox.sendKeys("WebElements",Keys.ENTER);
		// Scroll down by a smaller amount using the ARROW_down key
		//action1.sendKeys(Keys.ARROW_DOWN).perform();

		// Scroll up by a smaller amount using the ARROW_UP key
		// action1.sendKeys(Keys.ARROW_UP).perform();


		// WebElement rightSideElement = driver.findElement(By.xpath("//footer")); // Example footer element
		///  action1.moveToElement().perform();LLLLI

		// Thread.sleep(2000); 

		//driver.findElement(By.xpath("//div[@class='row']//div[1]//div[1]//div[2]//div[1]")).click();
		// Thread.sleep(2000);

		// driver.close();
		// driver.quit();



	}



}
