package Scenarios_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario8_BangleSize {

	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div//ul//li/a[@title='Jewellery'][contains(text(),'All Jewellery ')]"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div//ul//li/a[contains(text(),'Kadas')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='search-result']//ul/li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div//input[@id='buy-now']")).click();
		Thread.sleep(2000);

		try {
			WebElement errorMsg = driver.findElement(By.xpath("//div[contains(text(),'* This field is required')]"));
			System.out.println("Error message is: "+errorMsg.getText());
			if(errorMsg.isDisplayed()) {
				Assert.assertTrue(true);
			}
		} catch(Exception e) {
			Assert.fail("Error Msg not found-TestCase FAILED");
		}
		driver.close();
	}
}



