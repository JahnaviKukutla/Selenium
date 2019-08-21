package com.selenium;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_Screenshot {
	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		TakesScreenshot image = (TakesScreenshot)driver;
		File src = image.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Personal\\DevEnv\\Code\\TYWorkspace\\Selenium\\CapturedImages\\image.png");
		FileUtils.copyFile(src,dest);
		driver.close();
	}
}