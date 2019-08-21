package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[id='src']")).sendKeys("Bangalore");
		driver.findElement(By.cssSelector("input[id='dest']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//div[@id='search_div']//div[3]")).click();
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//tr/td[text()='30']")).click();
		driver.findElement(By.xpath("//div[@id='search_div']//div[4]")).click();
		//driver.findElement(By.cssSelector("button[class='fl button']")).click();
		
	}
}
