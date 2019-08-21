package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BlueStoneMaps {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Visit Our Stores")).click();
		Thread.sleep(10000);
		
		File srcND = driver.findElement(By.xpath("//div[text()='New Delhi']/ancestor::div[@class='row']/descendant::div[8]")).getScreenshotAs(OutputType.FILE);
		File destND = new File("./photo/BluestoneMaps/New Delhi.png");
		FileUtils.copyFile(srcND,destND);
		Thread.sleep(2000);
		
		File srcChennai = driver.findElement(By.xpath("//div[text()='Chennai']/ancestor::div[@class='row']/descendant::div[8]")).getScreenshotAs(OutputType.FILE);
		File destChennai = new File("./photo/BluestoneMaps/Chennai.png");
		FileUtils.copyFile(srcChennai,destChennai);
		Thread.sleep(2000);
		
		File src3 = driver.findElement(By.xpath("//div[text()='Chandigarh']/ancestor::div[@class='row']/descendant::div[8]")).getScreenshotAs(OutputType.FILE);
		File dest3 = new File("./photo/BluestoneMaps/Chandigarh.png");
		FileUtils.copyFile(src3,dest3);
		Thread.sleep(2000);
		
		File src4 = driver.findElement(By.xpath("//div[text()='Mumbai']/ancestor::div[@class='row']/descendant::div[8]")).getScreenshotAs(OutputType.FILE);
		File dest4 = new File("./photo/BluestoneMaps/Mumbai.png");
		FileUtils.copyFile(src4,dest4);
		Thread.sleep(2000);
		
		File src5 = driver.findElement(By.xpath("//div[text()='Mohali']/ancestor::div[@class='row']/descendant::div[8]")).getScreenshotAs(OutputType.FILE);
		File dest5 = new File("./photo/BluestoneMaps/Mohali.png");
		FileUtils.copyFile(src5,dest5);
		Thread.sleep(2000);
		
		File src6 = driver.findElement(By.xpath("//div[text()='Hyderabad']/ancestor::div[@class='row']/descendant::div[8]")).getScreenshotAs(OutputType.FILE);
		File dest6 = new File("./photo/BluestoneMaps/Hyderabad.png");
		FileUtils.copyFile(src6,dest6);
		Thread.sleep(2000);
		
		File src7 = driver.findElement(By.xpath("//div[text()='Guwahati']/ancestor::div[@class='row']/descendant::div[8]")).getScreenshotAs(OutputType.FILE);
		File dest7 = new File("./photo/BluestoneMaps/Guwahati.png");
		FileUtils.copyFile(src7,dest7);
		Thread.sleep(2000);
		
		File src8 = driver.findElement(By.xpath("//div[text()='Noida']/ancestor::div[@class='row']/descendant::div[8]")).getScreenshotAs(OutputType.FILE);
		File dest8 = new File("./photo/BluestoneMaps/Noida.png");
		FileUtils.copyFile(src8,dest8);
	}
}