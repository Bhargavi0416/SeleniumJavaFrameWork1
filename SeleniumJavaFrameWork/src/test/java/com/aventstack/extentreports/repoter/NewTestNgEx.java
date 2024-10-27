package com.aventstack.extentreports.repoter;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestNgEx {
	
	//directory where output is to be printed
	ExtentSparkReporter spark = new ExtentSparkReporter("extentReport.html");
	ExtentReports extent = new ExtentReports();
	
  @Test
  public void f1() {
	  ExtentTest test1 = extent.createTest("open browser and websites").assignAuthor("Bhargavi")
	  .assignCategory("unit test").assignDevice("chrome");
	  test1.log(Status.INFO, "user lanuched a website");
	  test1.pass("user lanuches website");
  }
  @Test
  public void f2() {
	  ExtentTest test2 = extent.createTest("verify login").assignAuthor("Bhargavi")
			  .assignCategory("unit test").assignDevice("google");
	  test2.info("alerts displaying");
	  test2.pass("user logged to website");
	  test2.log(Status.WARNING,"reset password alerts displaying");
  }
  @Test
  public void f3() {
	  ExtentTest test3 = extent.createTest("verify dashboard").assignAuthor("Bhargavi")
			  .assignCategory("unit test").assignDevice("safari");
	  test3.skip("verify dashboard skipped");
  }
  @Test
  public void f4() {
	  ExtentTest test4 = extent.createTest("verify user emails from test application").assignAuthor("Bhargavi")
			  .assignCategory("unit test").assignDevice("firefox");
	  test4.fail("unable to report the load due to sever issues");
  }
  @Test
  public void f5() {
	  ExtentTest test5 = extent.createTest("verify reports and analytics").assignAuthor("Bhargavi")
			  .assignCategory("unit test").assignDevice("opera");
	  test5.pass("user is logged out from website");
	  test5.info("user is redirectly login to page");
  }
  @Test
  public void f6() {
	  ExtentTest test6 = extent.createTest("verify logout feature");
	  test6.fail("user logout failed");
  }
  @Test
  public void f7() {
	  ExtentTest test7 = extent.createTest("again verify login");
	  test7.pass("check once when you  are login again");
  }@Test
  public void f8() {
	  ExtentTest test8 = extent.createTest("exit feature");
	  test8.pass("report getting crashed");
  }
  @BeforeTest
  public void beforeTest() {
	  extent.attachReporter(spark);
  }

  @AfterTest
  public void afterTest() {
	  extent.flush();
	  
  }

}
