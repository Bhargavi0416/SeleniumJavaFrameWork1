package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Gfgloginpage {                         //page factory is aclass where we can directly intreact with webelement 

	// in page factor class we need to fello Encapsulation principle = private data + public methods
	//here Webdriver is an inferface and driver is a local variable

	private WebDriver driver;

	// here we creating the constructor to initialize the driver 
	public Gfgloginpage(WebDriver driver) {

		this.driver = driver;
		//here for intialization we need to cal the intielement method in this we need to pass driver and current class variable
		//calling intiElement()without these we will get a nullpointer exception and these method return inside the constructor itself

		PageFactory.initElements(driver, this);
	}

	//by using web Locators the above code is created 
	//here in this step finfBy annotation is used to find or identify the webelement and FindBy is a class or annotation and Webelement is an interface

	@FindBy(id="luser")
	private WebElement userid ;

	//it is to find the second webelement

	@FindBy(id="password")
	private WebElement pwd;

	//it is to find the second webelement

	@FindBy(id ="Sign in")
	private WebElement sbtn;

	@FindBy(xpath="//input[@type='text']")
	public WebElement SBox;
	//Methods //in these step we are creating the method 

	public void setupgfgLogin(String uid,String pswd)
	{
		userid.sendKeys(uid); //in these steps we are directlt interacting with webelement without using any driver.findelement because of page factory
		pwd.sendKeys(pswd);
		//sbtn.click();
		//Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"Login Failed");
		//System.out.println("Login completed");
	}

	//here we creating a general method without passing any parameter so in this case we are using driver.findelement and we can use m 
	//methods which are coming from webdriver
	public 	void verifyTitle() {

		String title = driver.getTitle();
		Assert.assertTrue(title.contains("GeeksforGeeks"),"Title is matched!");
		System.out.println("Title is matched!:" +title);

	}
	public void gfgMainPage() {
		driver.get("https://www.geeksforgeeks.org/");
		System.out.println(driver.getCurrentUrl());
	}
	public void searchbox1(String text)
	{
		SBox.sendKeys(text);
		SBox.click();
	}


}


