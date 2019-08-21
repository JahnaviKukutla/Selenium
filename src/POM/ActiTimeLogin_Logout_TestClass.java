package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeLogin_Logout_TestClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		ActiTIME_LoginPage login = new ActiTIME_LoginPage(driver);

		login.setUsername("akdl");
		login.setPassword("adf");
		login.clickLogin();
		Thread.sleep(3000);
		
		login.setUsername("admin");
		login.setPassword("manager");
		login.clickLogin();
		
		ActiTIME_LogoutPage lout = new ActiTIME_LogoutPage(driver);
		lout.clickLogout();
		
		Thread.sleep(1000);
	}
}
