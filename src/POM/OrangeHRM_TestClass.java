package POM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_TestClass 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args)  throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(6000);
		OrangeHRM_LoginPage o=new OrangeHRM_LoginPage(driver);
		o.setUsername("Admin");
		o.setPassword("admin123");
		o.clickLogin();
		Thread.sleep(2000);

		OrangeHRM_LogoutPage ol=new OrangeHRM_LogoutPage(driver);
		ol.clickDropDown();
		Thread.sleep(2000);
		ol.clickLogout();
		Thread.sleep(1000);	
	}
}