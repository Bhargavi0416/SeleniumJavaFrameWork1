package com.selenium.practice.basicprograms;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.hc.client5.http.entity.mime.FileBody;

//import java.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://google.com");
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html");
		driver.manage().window().getSize().getWidth();
		driver.manage().window().getSize().getHeight();
		Dimension size = driver.manage().window().getSize();
		
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		driver.manage().window().setSize(new Dimension(800,600));
		
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getX();
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		driver.manage().window().setPosition(new Point(100,100));
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("./image.png"));
		
		
		Thread.sleep(3000);
		driver.close();
		// TODO Auto-generated method stub

	}

}
