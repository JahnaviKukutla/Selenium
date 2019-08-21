package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario10 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com");
		Thread.sleep(20000);		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='chat-widget']")));
		System.out.println("Switched to ChatWindow");
		driver.findElement(By.xpath("//iframe[@id='chat-widget']")).click();
		driver.findElement(By.id("name")).sendKeys("Jahnavi");
		driver.findElement(By.name("email")).sendKeys("jahnavikukutla@gmail.com");
		driver.findElement(By.xpath("//span[text()='Phone:']/parent::label/parent::div/child::input")).sendKeys("45634636");
	}
}
