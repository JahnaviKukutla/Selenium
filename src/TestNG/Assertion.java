/**Assertion:
===============
To compare actual value and expected value we make use of Assertion in TestNG Class
In TestNG to make use of these values we use Assert class.
Assert class has static methods.
If we want to continue with execution even after failing will use SoftAssert class.[Has non static methods]

Differences:
============
Assert-Assert class has static methods
	   If comparison fails it will not execute remaining statements of current test method.
       Here we do not call assertAll() method.
	   In assert we can make test fail purposefully using > Assert.fail()
SoftAssert- SoftAssert class has Non static methods
			It executes remaining statements even if comparison fails.
		    Here should call assertAll() method. and it should be the last statement.
**/

package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Assertion {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String actual = driver.getTitle();
		String expected = "InvalidTitle";
		Assert.assertEquals(actual , expected);
		driver.close();
	}
	 

	/*@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String actual = driver.getTitle();
		String expected = "InvalidTitle";
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual , expected);
		driver.close();
		s.assertAll();//This should be the last statement when SoftAssert is used.
	}*/
}
