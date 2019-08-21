package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 extends BaseTest{

	@Test
	public void createUser() {
		Reporter.log("User Created", true);
	}
}
