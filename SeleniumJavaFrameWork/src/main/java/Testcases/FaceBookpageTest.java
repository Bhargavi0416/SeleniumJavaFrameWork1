package Testcases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import WebPages.FaceBookLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookpageTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		FaceBookLogin fbobj = new FaceBookLogin(driver);
		
		driver.navigate().to("https://facebook.com");
		
		fbobj.SetTextBoxInput("bhargavi12@gmail.com");
		
		fbobj.setTbtn("0987654");
		
		fbobj.Loginbtn();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		
		
		
		// TODO Auto-generated method stub

	}

}
