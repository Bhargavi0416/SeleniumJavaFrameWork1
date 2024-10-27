package IgnoreTest.com;

import java.io.IOException;


import org.openqa.selenium.*;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AutoITExClass {
	
	
	public static void main(String args[]) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		
		driver.manage().window().maximize();
		
		driver.get("https://easyupload.io/");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
	   // System.out.println(driver.getPageSource());
		
		driver.findElement(By.className("upload-section")).click(); // CreateProcess error=2, The system cannot find the file specified
		
		Thread.sleep(3000);
		
		//Runtime.getRuntime().exec("C://AutoITFiles//AutoIT12.exe" + "" +"C://Users//Bharg//OneDrive//Documents//ABSTRACT.docx");
		
		Runtime.getRuntime().exec("C://AutoITFiles//AutoIT12.exe" + "" +"C://Users//Bharg//OneDrive//Desktop//New folder//Bhargavi Resume.doc.docx");
		
		driver.close();
		
		driver.quit();
		
		
		
		
		
	}
	
	
	

}
