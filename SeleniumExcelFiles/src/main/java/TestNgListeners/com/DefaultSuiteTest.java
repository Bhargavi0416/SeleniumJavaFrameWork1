package TestNgListeners.com;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DefaultSuiteTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<>();
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void untitled() {
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.id("navbarDropdown")).click();
		driver.findElement(By.linkText("Events")).click();
		driver.findElement(By.linkText("Documentation")).click();
		driver.findElement(By.linkText("Selenium Overview")).click();
		driver.findElement(By.cssSelector("#m-documentationoverviewcomponents > span")).click();
		driver.findElement(By.cssSelector(".nav-item:nth-child(3) span")).click();
		{
			WebElement element = driver.findElement(By.cssSelector(".breadcrumb-item > a"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		driver.findElement(By.cssSelector("#docsearch-1 .DocSearch-Button-Placeholder")).click();
		driver.findElement(By.cssSelector("#docsearch-item-0 .DocSearch-Hit-Container")).click();
		driver.findElement(By.cssSelector(".entry:nth-child(3) > p")).click();
		driver.findElement(By.cssSelector(".entry:nth-child(3) > p")).click();
		driver.findElement(By.cssSelector(".entry:nth-child(3) > p")).click();
		{
			WebElement element = driver.findElement(By.cssSelector(".entry:nth-child(3) > p"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		driver.findElement(By.linkText("Locator strategies")).click();
		driver.close();
	}
}
