package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Calendar {
	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Title: "+driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='datetime-local']")).sendKeys("19082019",Keys.TAB,"0525PM");
	}
}
