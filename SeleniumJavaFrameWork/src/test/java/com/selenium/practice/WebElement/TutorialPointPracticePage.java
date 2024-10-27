package com.selenium.practice.WebElement;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TutorialPointPracticePage {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();// these webdrivermanager is very best api and it will be very easier to manage the all exe files
		WebDriver driver = new FirefoxDriver();// where it will get the all leatest versions exe files from the  api

		//driver.navigate().to("https://www.tutorialspoint.com/");

		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		driver.manage().window().maximize();

		//     //form/div/div/input

		WebElement name = driver.findElement(By.xpath("//input[@name=\"name\"]"));
		name.sendKeys("Bhargavi",Keys.ENTER);
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("bhargavibingi@6171",Keys.ENTER);
		Thread.sleep(2000);

		email.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		WebElement gender = driver.switchTo().activeElement();  
		gender.sendKeys(Keys.TAB);	
		Thread.sleep(2000);

		WebElement activeElement = driver.switchTo().activeElement();  
		activeElement.sendKeys(Keys.SPACE);
		Thread.sleep(2000);


		WebElement mobilenum = driver.findElement(By.xpath("//label[normalize-space()='Mobile(10 Digits):']"));//.sendKeys("99011235672",Keys.ENTER);
		//mobilenumber.sendKeys("9701404464",Keys.ENTER);


		Actions action = new Actions(driver);
		action.moveToElement(mobilenum).click().perform();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath("//input[@id='mobile']"));

		ele.sendKeys("7788834512",Keys.ENTER);
		Thread.sleep(2000);

		ele.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		WebElement DoB = driver.findElement(By.xpath("//input[@id='dob']")) ; // Now the focus is on the next element (gender)

		Actions action1 = new Actions(driver);

		action1.moveToElement(DoB).click().sendKeys("03/04/2020").perform();
		Thread.sleep(2000);

		WebElement Subjects = driver.findElement(By.xpath("//label[normalize-space()='Subjects:']"));

		// Subjects.sendKeys("java","selenium",Keys.ENTER);

		Actions action2 = new Actions(driver);

		action2.moveToElement(Subjects).click().sendKeys("java"," ","selenium").perform();
		Thread.sleep(2000);

		// Subjects.sendKeys(Keys.TAB);
		//WebElement Hobbies = driver.findElement(By.xpath("//label[normalize-space()='Hobbies:']"));

		// Hobbies.sendKeys(Keys.TAB);

		WebElement Hobbies = driver.switchTo().activeElement();// 
		Hobbies.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		WebElement activeElement1 = driver.switchTo().activeElement();  // 
		activeElement1.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		WebElement activeElement2 = driver.switchTo().activeElement();  // 
		activeElement2.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		WebElement activeElement3= driver.switchTo().activeElement();  // 
		activeElement3.sendKeys(Keys.SPACE);
		Thread.sleep(2000);

		WebElement picture = driver.findElement(By.xpath("//label[normalize-space()='Picture:']"));

		Actions action3 = new Actions(driver);
		action3.moveToElement(picture).click().perform();
		Thread.sleep(10000);

		action3.sendKeys(Keys.TAB).perform();

		//Thread.sleep(4000);

		WebElement CurrentAdd = driver.switchTo().activeElement();  // 
		CurrentAdd.sendKeys(Keys.TAB);

		//Thread.sleep(8000);

		// WebElement CurrentAdd = driver.findElement(By.xpath("//label[normalize-space()='Current Address:']"));

		Actions action4 = new Actions(driver);
		action4.moveToElement(CurrentAdd).click().sendKeys("Near new Lakshmi School,RahmatNagar,\n Yusufguda,HYd",Keys.ENTER).perform();
		Thread.sleep(2000);

		action4.sendKeys(Keys.TAB).perform();

		Thread.sleep(5000);

		driver.switchTo().activeElement().click();

		Thread.sleep(3000);

		//  action4.sendKeys(Keys.SPACE).perform();


		//		WebElement choosenstate = driver.findElement(By.xpath("//select[@id='state']"));
		//		Select select = new Select(choosenstate);
		//		
		//		select.selectByIndex(1);

		//	choosenstate.click();

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='state']"));
		Select select = new Select(dropdown);
		select.selectByValue("Uttar Pradesh");
		dropdown.click();
		//	select.selectByVisibleText("Haryana");
		//	select.selectByIndex(1);

		dropdown.sendKeys(Keys.TAB);

		driver.switchTo().activeElement().click();

		WebElement choosenCity = driver.findElement(By.xpath("//select[@id='city']"));
		Select select1 = new Select(choosenCity);
		select1.selectByValue("Lucknow");

		choosenCity.click();


		//Actions action6 = new Actions(driver);
		//action6.moveToElement(dropdown).click().sendKeys("Uttar Pradesh ",Keys.ENTER).perform();

		//WebElement dropdown = driver.findElement(By.id("dropdownId"));


		//select.selectByVisibleText("Uttar pradesh");

		//select.selectByVisibleText("Option value");
		Thread.sleep(3000);


		WebElement Login = driver.findElement(By.xpath("//input[@value='Login']"));

		Actions action5 = new Actions(driver);
		action5.moveToElement(Login).click().perform();

		Thread.sleep(8000);
		driver.quit();


		//Actions action5 = new Actions(driver);
		// action5.moveToElement(StateAndCity).click().perform();

		// WebElement DOB = driver.findElement(By.xpath())


		//activeElement.sendKeys(Keys.ARROW_DOWN);
		// WebElement mobilenumber = driver.switchTo().activeElement();  
		// mobilenumber.sendKeys(Keys.SPACE);


		//TextBox.sendKeys("bhargavibingi@7161",Keys.ENTER);
		// TODO Auto-generated method stub

	}

}


