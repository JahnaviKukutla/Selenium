package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_Implicit_ExplicitWait {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		///Open the browser
		WebDriver  driver = new ChromeDriver();
		
		/**Implicit Wait**/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Enter the URL
		driver.get("https://demo.actitime.com/login.do");
		//Enter the valid Username
		WebElement txtElement = driver.findElement(By.id("username"));
		txtElement.sendKeys("admin");
		//Enter the valid Password
		WebElement paswd = driver.findElement(By.name("pwd"));
		paswd.sendKeys("manager");
		WebElement button = driver.findElement(By.linkText("Login"));
		button.click();
		//Logout
		WebElement logout = driver.findElement(By.id("logoutLink"));
		
		
		/**Explicit wait**/
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(logout));
		driver.findElement(By.id("logoutLink")).click();
	}
}
