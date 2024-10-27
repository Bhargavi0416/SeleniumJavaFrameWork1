package TestNgListeners.com;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnenersClass  implements ITestListener {


	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("on Start method is invoked..................");

	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on finish method is invoked...........");

	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure method is invoked..........."+result.getName());

	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped  method is invoked..........."+result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success  method is successfully invoked..........."+result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}





}
