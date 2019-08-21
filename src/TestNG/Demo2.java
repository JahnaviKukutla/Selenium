package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 extends BaseTest{
	
	@Test
	public void deleteUser(){
		Reporter.log("User deleted", true);
	}
}
