package TestNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runners.Suite;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotationOrder {
	@BeforeSuite
	public void m1() { Reporter.log("@Before suite",true); }

	@BeforeTest
	public void m2() { Reporter.log("@Before Test", true); }

	@BeforeClass
	public void m3() { Reporter.log("@Before Class", true); }

	@BeforeMethod
	public void m4() { Reporter.log("@Before Method", true); }

	@AfterSuite
	public void m5() { Reporter.log("@After Suite", true); }

	@AfterTest
	public void m6() { Reporter.log("@After Test", true); }

	@AfterClass
	public void m7() { Reporter.log("@AfterClass", true); }

	@AfterMethod
	public void m8(){ Reporter.log("@AfterMethod", true);}
}
