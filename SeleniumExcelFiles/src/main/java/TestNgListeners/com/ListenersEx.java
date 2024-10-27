package TestNgListeners.com;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// implementing the ITestListeners interface
public class ListenersEx implements ITestListener{

	// adding all ITestLintener interface methods to override
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test is statrted successfully : "+result.getName());


	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test is passed successfully : "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test is failed : "+result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test is skipped : "+result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test is completed successfully : "+context.getName());
	}



}
