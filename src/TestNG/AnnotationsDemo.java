package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	@BeforeMethod
	public void login(){
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	
	@Test
	public void createUser() {
		Reporter.log("user created",true);
	}
	//Test methods work in alphabetial order.
	@Test
	public void deleteUser() {
		Reporter.log("User Deleted", true);
	}
}
