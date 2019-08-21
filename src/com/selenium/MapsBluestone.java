package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MapsBluestone {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./Softwares/drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disbale-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/store.html");
		Thread.sleep(1000); 
		driver.findElement(By.linkText("Visit Our Stores")).click();

		List<WebElement> maps= driver.findElements(By.xpath("//div[@class='map-image']"));
		int i = 1;
		Thread.sleep(4000);
		for(WebElement img:maps)
		{
			File src=img.getScreenshotAs(OutputType.FILE);
			File dest=new File("./photo/"+i+".png");
			Thread.sleep(2000);
			FileUtils.copyFile(src, dest);
			i++;
		}

	}	

}


