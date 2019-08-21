package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.remote.server.handler.interactions.touch.Down;

public class SeleniumHqOrg_Download {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		System.out.println(driver.getTitle());
		/*Implicitwait*/
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Thread.sleep(8000);
		WebElement Download = driver.findElement(By.xpath("//*[@id='menu_download']/a"));
		Download.click();
		Thread.sleep(5000);
		
		WebElement JavaLink = driver.findElement(By.xpath("//*[@id='mainContent']/table[1]/tbody/tr[1]/td[4]/a"));
		JavaLink.click();
	}
}
