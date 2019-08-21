package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void test() {
		Reporter.log("From test2",false);//To print in console as well as report
		Reporter.log("Bbueno dias");//To print only in html report.
		//System.out.println("from test");
	}
}
