package TestNgListeners.com;

import org.testng.annotations.Test;

public class IgnoreTest {

	public @interface Ignore {

	}

	@Test
	@Ignore
	public void test1() {
		System.out.println("test1");
	}

}
