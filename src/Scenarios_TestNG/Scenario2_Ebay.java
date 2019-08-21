package Scenarios_TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario2_Ebay {
	@Test
	public void mail() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://in.ebay.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Apple watch");
		driver.findElement(By.xpath("//select")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select//option[text()='Jewelry & Watches']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);
		WebElement countOfResults = driver.findElement(By.xpath("//div/h1[@class='srp-controls__count-heading']"));
		String count = countOfResults.getText().replace(" results", "");	
		System.out.println("Count of all results: "+count);
		List<WebElement> Count = driver.findElements(By.xpath("//li[@class='s-item   ']"));
		System.out.println("Count Of Products in First Webpage: "+Count.size());
		List<WebElement> namesOfProducts = driver.findElements(By.xpath("//h3[@class='s-item__title s-item__title--has-tags']"));
		for(WebElement products : namesOfProducts) {
			System.out.println("Names of Products in First page: "+products.getText());	
		}
	}
}
