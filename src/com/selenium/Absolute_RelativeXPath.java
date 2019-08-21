package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_RelativeXPath {
	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C://Personal//DevEnv//html%20programs//xpathsample.html");
		String value = driver.findElement(By.xpath("//td[text()='Sql']/../td[2]")).getText();
		System.out.println("Value of Sql: "+value);
	}
}
