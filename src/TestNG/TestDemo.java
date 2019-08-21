package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo {
	
	@Test
	public void test() {
		Reporter.log("From test",false);//To print in console as well as report
		Reporter.log("Hola");//To print only in html report.
		//System.out.println("from test");
	}
}
