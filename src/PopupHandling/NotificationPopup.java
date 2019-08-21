package PopupHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopup {
	/**Using Chrome**/
	/*static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		Thread.sleep(5000);
		options.addArguments("--disable-notifications");//Command to disable notifications
		WebDriver driver  = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
	}
}*/
	/**Using Firefox**/
	static {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		FirefoxOptions options = new FirefoxOptions();
		//options.addPreference("geo.disble",true);//Command to disable notifications
		options.addPreference("dom.webnotifications.enabled", false);
		WebDriver driver  = new FirefoxDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
	}
}