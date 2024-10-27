package TestNgListeners.com;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGListenersEx {

	//@Listeners(TestNgListeners.com.ListnenersClass.class)
	@Test
	public void testpass() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("http://google.com");

		WebElement searchBox1 = driver.findElement(By.name("q"));
		searchBox1.sendKeys("selenium tuorial");
		searchBox1.sendKeys(Keys.ENTER);
		//searchBox1.click();
		Thread.sleep(2000);

		driver.get("http://Selenium.dev");

		//actual title , Expectedtitle
		// Assert.assertEquals(false, false) to verify the webpage title we are using Assert class
		Assert.assertEquals(driver.getTitle(), "Selenium");

		driver.quit();

	}@Test
	public void failedtest() {

		System.out.println("This is Failed testcase");
		Assert.assertTrue(false);
	}
	@Test
	public void testSkip()  {

		System.err.println("This is skipped testcase");
		throw new SkipException("Skipped Exception thrown..........");

	}



}



