package WebPages;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public  class FaceBookLogin {

	WebDriver driver;

	// By TextBox = By.xpath("/div[@id='email_container']");

	By TextBox = By.xpath("//input[@id='email']");
	

	//  By Tbtn = By.className("//div[@class='_55r1 _1kbt']");

	By Tbtn = By.xpath("//input[@id='pass']");

	By Loginbtn = By.xpath("//button[@id='loginbutton']");

	public FaceBookLogin (WebDriver driver) {

		this.driver = driver;
	}
	public  void SetTextBoxInput (String email) {

		driver.findElement(TextBox).sendKeys(email);
	}
	public void setTbtn (String password) {
		driver.findElement(Tbtn).sendKeys(password);
		driver.findElement(Tbtn).sendKeys(Keys.ENTER);
	}

	public void Loginbtn() {

		driver.findElement(Loginbtn).click();
	}
}


