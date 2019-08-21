package assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getScreenshotForWebElement {
	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		File src = driver.findElement(By.name("username")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./photo/username.png");
		FileUtils.copyFile(src,dest);
		driver.close();
	}
}
