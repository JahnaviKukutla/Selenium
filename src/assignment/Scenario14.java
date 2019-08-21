package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario14 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='bottom-header']//ul[@class='wh-main-menu']/li/a[@title='Gold Coins']"))).perform();
		driver.findElement(By.xpath("//span[text()='Plain Gold Coins']/parent::div/following-sibling::ul/li/span")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//h1[text()='1 gram 24 KT Gold Coin']")).isDisplayed()) {
			System.out.println("1 Gram Plain Gold coin is displayed");
		} else
		{
			System.out.println("1 Gram Plain Gold coin is not displayed ");
		}
	}
}
