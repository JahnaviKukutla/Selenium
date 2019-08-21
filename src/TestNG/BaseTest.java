package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout", true);
	}
}
