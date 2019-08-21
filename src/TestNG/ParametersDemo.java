/*Steps:
 * First convert TO  TestNG Without using @Parameters
 * Later in xml file>Add parameters
 * Then add @Parameters in class
 * After using @Parameters in class file do not change xml file, else u'll get TestNG Exception
 * 
 * parameter should be written under test in xml file.
 * 
 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
	<test thread-count="5" name="Test">
		<parameter name="un" value="admin" />
		<classes>
			<class name="TestNG.ParametersDemo" />
		</classes>
	</test> <!-- Test -->
</suite> <!-- Suite -->

*Parameters works as key value pairs.
*PASSING keys in class file and values are given in xml file
*/

package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	@Parameters({"un" , "pwd"})
	@Test
	public void test( String s1 , @Optional("Hola!")String s2) {
		//public void test(@Optional("Hello!")String s1 , String s2) {//Only when one parameter is given in xml file. we can make one as optional and pass a message.
		Reporter.log(s1 , true);
		Reporter.log(s2 , true);
	}
}
