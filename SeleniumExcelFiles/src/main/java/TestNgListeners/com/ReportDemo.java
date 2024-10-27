package TestNgListeners.com;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ReportDemo {

	@Test
	public void Testsuccess() {
		System.out.println("this is success test");

	}
	@Test
	public void TestFailure() {
		System.out.println("this is failed test");
		Assert.assertTrue(false);
		Assert.assertTrue(true);
	}

	@Test
	public void TestSkipped() {
		throw new SkipException("test is skipped");
	}
}
