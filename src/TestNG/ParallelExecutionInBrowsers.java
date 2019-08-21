//Create 2 Test blocks we can execute test blocks paralelly.
package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecutionInBrowsers {
	WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void openBrowser(String browser) {
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
		} else if (browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
		}
	}

	@Test
	public void test() {
		Reporter.log("From Test");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
