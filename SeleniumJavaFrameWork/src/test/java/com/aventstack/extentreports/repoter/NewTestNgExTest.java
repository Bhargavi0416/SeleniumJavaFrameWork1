package com.aventstack.extentreports.repoter;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class NewTestNgExTest {
	ExtentSparkReporter spark = new ExtentSparkReporter("extentReport.html");
	ExtentReports extent = new ExtentReports();
	
  @Test
  public void f() {
	  ExtentTest test1 = extent.createTest("open browser and websites").assignAuthor("Bhargavi")
			  .assignCategory("unit test").assignDevice("chrome");
			  test1.log(Status.INFO, "user lanuched a website");
			  test1.pass("user lanuches website");
  }
}
