package TestNgListeners.com;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

//creating a demo listners class and using the annotation listners

//@Listeners(TestNgListeners.com.ListenersEx.class)
public class ListenersDemo {

	@Test
	public void test1() {
		System.out.println("this is test 1");
	}
	@Test
	public void test2() {
		System.out.println("this is inside the test2");
		Assert.assertTrue(false);
	}


	@Test
	public void test3() {
		System.out.println("test3");
		throw new SkipException("test 3 is skipped");
	}


}
