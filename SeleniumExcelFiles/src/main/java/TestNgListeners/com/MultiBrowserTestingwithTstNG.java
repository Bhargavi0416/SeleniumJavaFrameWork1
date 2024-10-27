package TestNgListeners.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MultiBrowserTestingwithTstNG {

	WebDriver driver = null;

	@Parameters({"browserName"})
	//@Parameters({"param1"})
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("browser name is :" +browserName);

		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
   @Test
	public void test1() {
	   driver.get("https://google.com");

   }
   @AfterTest
   public void teardown() {
	   driver.quit();
	   System.out.println("test completed");

   }


}
