package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GfGWebpage {
                                                        //object class
	private static WebElement element = null;



	public static WebElement  TextBoxSearch(WebDriver driver) {

		WebElement element  = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		return element;

	}
	public static WebElement SearchBtn(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath("//input"));

		return element;
	}
	// TODO Auto-generated method stub

}


