package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlueStoneDiamondRingPrice {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li/a[@title='Rings']"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li/a[@title='Rings']/parent::li/descendant::ul[@class='odd-even-bg']/li[3]/div/ul/li/a[contains(text(),'Diamond')]")).click();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']"))).perform();
		driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']/parent::section/div//div[@class='form-item '][2]")).click();
		driver.close();
	}
}
