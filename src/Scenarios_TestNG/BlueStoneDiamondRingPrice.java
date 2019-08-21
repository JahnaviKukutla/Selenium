package Scenarios_TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlueStoneDiamondRingPrice {
	@Test 
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bluestone.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li/a[@title='Rings']"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li/a[@title='Rings']/parent::li/descendant::ul[@class='odd-even-bg']/li[3]/div/ul/li/a[contains(text(),'Diamond')]")).click();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']"))).perform();
		driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']/parent::section/div//div[@class='form-item '][2]")).click();
		List<WebElement> price = driver.findElements(By.xpath("//div[@id='search-result']//ul/li//descendant::span[@class='new-price']"));
		String previous = price.get(0).getText().replace(",", "").replace("RS.", "").trim();
		
		int prev = Integer.parseInt(previous); // converting string to int to compare
		for(WebElement p : price) {
			String active = p.getText().replace(",", "").replace("RS.", "").trim();
			System.out.println(active);
			int act = Integer.parseInt(active);
			if(act < prev) {
				Assert.fail("Not in increasing Order! Test case failed!");
			}
			prev = act;
		}
		driver.close();
	}
}
