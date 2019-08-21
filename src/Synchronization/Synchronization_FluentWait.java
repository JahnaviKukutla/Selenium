package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Synchronization_FluentWait {
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

		/**Fluent Wait**/
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);//Till TimeOut duration exceeds it checks for the element.
		wait.pollingEvery(Duration.ofMillis(600)).withTimeout(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("Logout"))));
		driver.findElement(By.linkText("Logout"));
		//driver.close()

	}
}
