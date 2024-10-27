package WebPages;

import org.openqa.selenium.By;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class GoogleWebpage {

	 WebDriver driver = null;
	 
//@FindBy(id="q")
	By TextBox = By.name("q");
//@FindBy(name="btnk")
	By SearchBox = By.xpath("btnk");

	public GoogleWebpage(WebDriver driver) {
		this.driver = driver;
		
	}
	public void SetTextInSearchBox(String textarea) {

		driver.findElement(TextBox).sendKeys(textarea);
	}
	public void clickSearchButton(Keys entry) {

		driver.findElement(SearchBox).sendKeys(Keys.RETURN);

	}
	


}
