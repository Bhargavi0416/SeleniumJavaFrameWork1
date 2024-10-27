package TestNgListeners.com;

import org.testng.SkipException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//creating a demo listners class and using the annotation listners

@Listeners(TestNgListeners.com.ListenersEx.class)
public class ListenersDemo2 {

	@Test
	public void test4() {
		System.out.println("this is test 4");
	}
	@Test
	public void test5() {
		System.out.println("this is inside the test5");
		//Assert.assertTrue(false);
	}


	@Test
	public void test6() {
		System.out.println("test6");
		throw new SkipException("test 6 is skipped");
	}


}
