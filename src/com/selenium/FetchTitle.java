package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitle {
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
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		System.out.println("*************");
		String url = driver.getCurrentUrl();
		System.out.println("Current url: "+url);
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		driver.get("https://www.naukri.com");
		Set<String> whs = driver.getWindowHandles();
		System.out.println(whs);
		System.out.println("No of windos opened:"+whs.size());
		
		
		
		//driver.close();To close current window
		driver.quit();//To close all windows
	}
}


