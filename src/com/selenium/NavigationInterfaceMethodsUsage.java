package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationInterfaceMethodsUsage {
	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		System.out.println("**********");
		driver.manage().window().maximize();
		/**Using to() method**/
		driver.navigate().to("https://www.google.com");
		Thread.sleep(1000);
		String title2 = driver.getTitle();
		System.out.println(title2);
		/**Using back() method**/
		driver.navigate().back();
		/**Using forward() method**/
		driver.navigate().forward();
		/**Using refresh() method**/
		driver.navigate().refresh();
		driver.close();
	}
}


