package TestNgListeners.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTestUsingTestNg {

    @Test
    public void retrytst1() {
        System.out.println("retry test 1");
        // int i = 0.1;
        // Your test code here
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void test2() {
        System.out.println("test2");
        Assert.assertTrue(0 > 1);  // Force failure to trigger retry
    }
}
