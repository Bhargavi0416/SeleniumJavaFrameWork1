package IgnoreTest.com;


import org.testng.annotations.Test;

import TestNgListeners.com.IgnoreTest.Ignore;

//import org.testng.annotations.Ignore;

public class IgnoreTestsInTestNG {

	@Test
	@Ignore
	public void test1() {
	    System.out.println("test1 ");
	}
	@Test
	public void test2() {
	    System.out.println("test2");
	}
	@Test
	public void test3() {
	    System.out.println("test3");
	}
	@Test
	public void test4() {
	    System.out.println("test4");
	}

}
