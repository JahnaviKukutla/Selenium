package com.selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {
	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Title: "+driver.getTitle());
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div/img[@alt='Kurukshetra (Kannada)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/a[contains(text(),'Book Tickets')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/a[contains(text(),'3D')]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[1]/a[text()='Cinepolis: Royal Meenakshi Mall']/parent::div[@class='__name ']/parent::div[@class='details']/parent::div/following-sibling::div/descendant::div[3]")).click();
		driver.findElement(By.xpath("//div/a[text()='Accept'][1]")).click();
		driver.findElement(By.xpath("//tr/td/div[text()='K']/parent::td/parent::tr/child::td[2]/child::div/a[contains(text(),'10')]")).click();
		Thread.sleep(4000);
	}
}
