package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("file:///C:/Personal/DevEnv/html%20programs/webpage.html");
		driver.get("C:\\Personal\\DevEnv\\html programs\\webpage.html");
		driver.findElement(By.id("n1"));
		driver.findElement(By.name("c1"));
	}
}
