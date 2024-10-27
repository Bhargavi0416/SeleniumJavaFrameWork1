package TestNgListeners.com;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"})
public class GroupingWithTestNG {

	@Test(groups = {"sanity group"}) // single group
	public void testone() {
		System.out.println("this test is belongs to sanity group");

	}
	@Test(groups = {"regression group","sanity","smoke"}) //multi group testng
	public void test2() {
		System.out.println("this is belongs to regression group ,sanity and smoke");

	}
	@Test(groups = {"sanity group"})
	public void test3() {
		System.out.println("this test is sanity group");
	}
	@Test(groups = {"regression group","smoke"})
	public void test4() {
		System.out.println("this test is not sanity group");
	}
	@Test(groups = {"windows.smoke group"}) // in these line by using windows. groups is used to ecutes the
	public void test5() {
		System.out.println("this test is belongs to smoke group");
	}

	@Test
	@Parameters({"MyName"})
	//public void test6(String name) {
	public void test6(@Optional("automation testing")String name) {
		System.out.println( "Name is :"+name);
	}


}
