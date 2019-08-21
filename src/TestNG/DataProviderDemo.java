package TestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	//@DataProvider(name="users")
	@DataProvider
	public String[][] getData(){
		String[][] data = new String[3][2];
		data[0][0] = "user A";
		data[0][1] = "A1"; 

		data[1][0] = "user B";
		data[1][1] = "B1";

		data[2][0] = "userC";
		data[2][1] = "C1";

		return data;
	}
	//@Test(dataProvider = "users")//We can either pass name if specified in dataProvider 
	@Test(dataProvider = "getData")// we can use method name-Here getData()
	public void createUser(String un , String pwd) {
		Reporter.log("create: "+un+" pwd: "+pwd,true);
	}
}
