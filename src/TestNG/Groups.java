package TestNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Groups {

	@BeforeClass(alwaysRun = true)//run this
	public void login() {
		Reporter.log("login" , true);
	}

	@Test(priority = 1 ,groups = {"user" , "smoke"})
	public void createUser() {
		Reporter.log("create" , true);
	}

	@Test(priority = 2 , groups = {"user"}, enabled = false)
	/*If we doesn't want any test method to be executed then enabled to be given as false 
	Here editUser() will never be executed*/
	public void editUser() {
		Reporter.log("edit" , true);
	}

	@Test(priority = 3 , groups = {"user"})
	public void deleteuUser() {
		Reporter.log("Delete User" , true);
	}

	@Test(priority=3 , groups = {"product" , "smoke"})
	public void createProduct() {
		Reporter.log("create product" , true);
	}

	@Test(priority = 5 , groups = {"product"})
	public void deleteProduct() {
		Reporter.log("deleteProduct" , true);
	}
}
