package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Personal/DevEnv/html%20programs/FramesDemo.html");

		WebElement t1 = driver.findElement(By.id("t1"));
		Thread.sleep(1000);
		t1.sendKeys("TestYantra");

		driver.switchTo().frame(driver.findElement(By.id("f1")));///Switch to child

		WebElement t2 = driver.findElement(By.id("t2"));
		Thread.sleep(1000);
		t2.sendKeys("TY");

		driver.switchTo().parentFrame();//Switch to Immmediate Parent Frame
		//driver.switchTo().defaultContent();//Switch from descendant to default parent

		Thread.sleep(1000);
		t1.clear();
		Thread.sleep(1000);
		t1.sendKeys("Software");
	}
}
