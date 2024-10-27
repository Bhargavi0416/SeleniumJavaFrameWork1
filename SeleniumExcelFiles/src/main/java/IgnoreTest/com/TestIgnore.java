package IgnoreTest.com;

import org.testng.annotations.Test;

import TestNgListeners.com.IgnoreTest.Ignore;

@Ignore
public class TestIgnore{


	@Test

	public void ignoreMtd() {
		System.out.println("test1");
	}


}
