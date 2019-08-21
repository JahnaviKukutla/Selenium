package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidation {
	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		/*Validation for Username*/
		if(driver.findElement(By.id("username")).isDisplayed()) {
			System.out.println("Username is displayed");
		}
		/*Validation for Password*/
		if(driver.findElement(By.name("pwd")).isDisplayed()) {
			System.out.println("Password is displayed");
		}
		/*Validation for Logins*/
		if(driver.findElement(By.linkText("Login")).isDisplayed()) {
			System.out.println("Login is displayed");
		}
		
		WebElement txtElement = driver.findElement(By.id("username"));
		txtElement.sendKeys("admin");
		WebElement paswd = driver.findElement(By.name("pwd"));
		paswd.sendKeys("manager");
		WebElement button = driver.findElement(By.linkText("Login"));
		button.click();
		Thread.sleep(3000);//If Thread.sleep() is not given the agian itle of login page is fetched since homepage is not loaded completely.
		System.out.println("***********");
		String title2 = driver.getTitle();
		System.out.println("Title of homepage: "+title2);//Fetches title of Homepage
	}
}	
