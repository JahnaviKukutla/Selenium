package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSetProperty {
	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		/*WebElement txtElement = driver.findElement(By.id("username"));
		txtElement.sendKeys("admin");*/
		/**We can also set admin as userid in below way without using findElement()**/
		WebElement send = driver.switchTo().activeElement();
		send.sendKeys("admin");
		WebElement paswd = driver.findElement(By.name("pwd"));
		paswd.sendKeys("manager");
		WebElement button = driver.findElement(By.linkText("Login"));
		button.click();
		Thread.sleep(1000);//If Thread.sleep() is not given the agian itle of login page is fetched since homepage is not loaded completely.
		String title2 = driver.getTitle();
		System.out.println(title2);//Fetches title of Homepage
		
		/*driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.close();*/
		
		/*driver.get("https://www.w3schools.com/");
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.close();*/
	}
}
