package launchingBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowsers {
	public static void main(String[] args) {
		/**Chrome Browser**/
		/*	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.com");*/
		/**Firefox Browser**/
		WebDriverManager.firefoxdriver().setup();
		WebDriver firefoxdriver = new FirefoxDriver();
		firefoxdriver.get("https://www.gmail.com");
	}
}
