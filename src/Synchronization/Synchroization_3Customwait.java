package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchroization_3Customwait {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		///Open the browser
		WebDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Enter the URL
		driver.get("https://demo.actitime.com/login.do");
		//Enter the valid Username
		driver.findElement(By.id("username")).sendKeys("admin");
		//Enter the valid Password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//Login
		driver.findElement(By.linkText("Login")).click();
		/**Custom Wait**/
		/*while(true) {
			try {
				driver.findElement(By.linkText("Logout")).click();
				System.out.println("Logout successfull");
				break;
			} catch(Exception e) {
				System.out.println("Exception caught");
			}
		}*/
		/**Using Anonymous Class**/
		WebDriverWait wait = new WebDriverWait(driver,10);
		//By creating object of Interfcae we'll get Anonymous class(why anonymus: bcoz no name)
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {

				return driver.findElement(By.linkText("Logout"));
			}
		});
		driver.findElement(By.linkText("Logout")).click();
		//driver.close();
	}
}
