package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import WebPages.Gfgloginpage;



public class BaseTest {
	//here we declaring the webdriver golbally
	public WebDriver driver;
	
	public Gfgloginpage obj;// = new Gfgloginpage(driver);
	
	@BeforeTest()
	public void Setup() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://auth.geeksforgeeks.org/");
		obj= new Gfgloginpage(driver);
		//Thread.sleep(3000);
		//driver.quit();
	}
	@AfterTest()
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	
	}
	


