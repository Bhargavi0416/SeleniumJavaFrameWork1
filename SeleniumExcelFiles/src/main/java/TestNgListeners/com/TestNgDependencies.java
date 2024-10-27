package TestNgListeners.com;

import org.testng.annotations.Test;
//import org.testng.annotations.Parameters;

public class TestNgDependencies {


	@Test(dependsOnGroups = {"smoke.*"})
	//@Test(dependsOnMethods = {"test2","test3"})                               //priority=1)
	public void test1() {
		System.out.println("this is testOne");
	}
	@Test (groups = {"smoke group1"})                                                                    //(priority=2)
	public void test2() {
		System.out.println("this is testTwo");

	}
	@Test(groups = {"smoke group2"})                                                           //(priority=3)
	public void test3() {
		System.out.println("this is testThree");

	}

}
