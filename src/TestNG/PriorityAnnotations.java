package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityAnnotations {
	@Test(priority = 1)
	public void test1() {
		Reporter.log("TestB1", true);
	}
	
	@Test(priority = -1)
	public void test2() {
		Reporter.log("TestB2", true);
	}
	
	@Test(priority = 0)
	public void test3() {
		Reporter.log("TestB3", true);
	}
	
	@Test(priority = 2 , invocationCount = 2)
	public void test4() {
		Reporter.log("TestB4", true);
	}
	
	@Test(priority = 1 , invocationCount = 1 )
	public void test5() {
		Reporter.log("TestB5", true);
	}
	
	@Test(priority = 1 , invocationCount = 0)
	public void test6() {
		Reporter.log("TestB6", true);
	}
}
