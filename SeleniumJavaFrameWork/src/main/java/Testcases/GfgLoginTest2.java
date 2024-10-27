package Testcases;

import org.testng.annotations.Test;

public class GfgLoginTest2 extends BaseTest  //here it follow inheritance princples that acquiring all property and mthd from basetest to derived test
{
	
	@Test(priority=1)
	public void Setupgfglogin() throws InterruptedException{
		
		obj.setupgfgLogin("slbhargavi9@gmail.com","Bhargavi12");
		//Thread.sleep(2000);
	}
	@Test(priority=2)
	public void verifypageTitle() throws InterruptedException 
	{
		obj.verifyTitle();
		
		//Thread.sleep(3000);
		//driver.quit();
		//driver.
	}
	@Test(priority=3)
	public void verifymainPage()
	{
		obj.gfgMainPage();
	}
	@Test(priority=4)
	public void sbox() throws InterruptedException
	{
		obj.searchbox1("maven repository");
		Thread.sleep(3000);
	}
	
}
