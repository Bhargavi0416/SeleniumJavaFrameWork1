package IgnoreTest.com;


import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitEx {

	public static void main(String[] args) throws InterruptedException {
		test();

	}
	public static void test() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.navigate().to("https://www.google.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		
		driver.findElement(By.name("q")).sendKeys("seleniumhq.org",Keys.RETURN);
		
        
		System.out.println(driver.getPageSource());
		
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.linkText("SeleniumHQ/selenium: A browser automation framework ..."));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(5L))
			       .ignoring(NoSuchElementException.class);

			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			    	 
			    WebElement linkelement = driver.findElement(By.linkText("SeleniumHQ/selenium: A browser automation framework ..."));
			    
			    
			    if(linkelement.isEnabled()) {
			    	System.out.println("element is found");
			    }
			       return linkelement;
			     }
			  
			  });
			 
		element.click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
   
		
		
	
	


