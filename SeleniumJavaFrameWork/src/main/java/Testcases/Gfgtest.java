package Testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import WebPages.GfGWebpage;

public class Gfgtest {

	public static void main(String[] args) {//throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		
		//driver.navigate().to("https://www.geeksforgeeks.org");
		
		driver.navigate().to("https://www.geeksforgeeks.org");
		
		
		GfGWebpage.TextBoxSearch(driver).sendKeys("selenium with java");
		
		GfGWebpage.SearchBtn(driver).sendKeys(Keys.RETURN);
		
		//driver.quit();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Thread.sleep(2000);
		driver.quit();
		
		
		// TODO Auto-generated method stub

	}

}
