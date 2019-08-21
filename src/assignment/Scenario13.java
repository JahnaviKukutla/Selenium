package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario13 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Offers ']"))).perform();
		driver.findElement(By.xpath("//span[text()='Flat 50% Off']")).click();
		Thread.sleep(3000);
		List<WebElement> list =driver.findElements(By.xpath("//div[@id='content-column']/descendant::span[@class='WebRupee']/parent::span[@class='new-price']"));
		System.out.println("Prices of Products displayed with 50 % : ");
		for(WebElement l:list) {
			System.out.println(l.getText());
		}
	}
}
