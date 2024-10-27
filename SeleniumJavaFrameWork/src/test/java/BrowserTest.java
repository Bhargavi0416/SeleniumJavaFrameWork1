import org.openqa.selenium.WebDriver;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[]args) {
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bharg\\eclipse-workspace\\SeleniumJavaFrameWork\\Drivers\\GeckoDriver\\geckodriver.exe");
		String projectpath = System.getProperty("user.dir");
		System.out.println("projectpath :"+projectpath);
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		
	     driver.get("http://seleniumhq.org");
	     driver.get("https://google.com");
	    System.out.println(driver.getClass());
	    // driver.quit();
	     System.out.println(driver.getCurrentUrl());
	     driver.close();
	     driver.quit();
		
	}
}
