package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FflipkartIphonePrice_OnMOdel {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone+6s&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_2_6&otracker1=AS_Query_OrganicAutoSuggest_2_6&as-pos=2&as-type=RECENT&as-backfill=on");
		WebElement price = driver.findElement(By.xpath("//div[text()='Apple iPhone 6s (Gold, 32 GB)'] //ancestor::div[@class='_1-2Iqu row']//child::div[@class='col col-5-12 _2o7WAb']//div[@class='_1vC4OE _2rQ-NK']"));
		System.out.println(price.getText());
		WebElement secndModel = driver.findElement(By.xpath("//div[text()='Apple iPhone 6s (Gold, 64 GB)'] //ancestor::div[@class='_1-2Iqu row']//child::div[@class='col col-5-12 _2o7WAb']//div[@class='_1vC4OE _2rQ-NK']"));
		System.out.println(secndModel.getText()); 
		
	}
}
