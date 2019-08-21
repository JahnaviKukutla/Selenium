/*We can make use of dependsOnMethod for dependency on @Test
If method gets failed dependency method gets skipped*/

package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyDemo {

	@Test
	public void createUser() {
		Reporter.log("User Created" , true);
	}

	@Test(dependsOnMethods = {"createUser"})
	public void editUser() {
		Assert.fail();
		Reporter.log("Edit User" , true);
	}

	@Test (dependsOnMethods = {"createUser" , "editUser"})
	public void deleteUser() {
		Reporter.log("Delete User" , true);
	}

}
