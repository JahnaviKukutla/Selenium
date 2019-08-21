package com.selenium;


import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleLinks {
	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		int count = 0;
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("No of links: "+links.size());
		for(WebElement e : links) 
        {        
            System.out.println(e.getText());
        }
		/*WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		System.out.println(gmail.getText());
		count++;
		WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));
		System.out.println(images.getText());*/
		
	}
}
