package Scenarios_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BluestoneChat{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");

		while(true){
			try{
				driver.findElement(By.xpath("//*[@id='widget-global-phyfv5j2gck']/div/div/div")).click();	

				break;
			} catch(Exception e){
				System.out.println("Waiting!!");
				Thread.sleep(1000);
			}
		}
		driver.findElement(By.xpath("//label[@class='lc-146xmnm e2zxkge0']/following-sibling::input[@id='name']")).sendKeys("Jahnavi");//for name"));
		driver.findElement(By.xpath("//label[@class='lc-146xmnm e2zxkge0']/following-sibling::input[@id='email']")).sendKeys("jahnavikukutla@gmail.com");
		driver.findElement(By.xpath("//div[@class='lc-loea4m e108e6fy0']//input[@id='name_146917605549304831']")).sendKeys("9999999978");
		driver.findElement(By.xpath("//div[@class='lc-bufy08 e1n7ru1l0']/button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='lc-13x0nsv emwkn670']/div[@class='lc-1glynz2 eovu8nx0']/span//")).getText();
	}
}


//
//
//phone number
//div[@class="lc-bufy08 e1n7ru1l0"]/button[@type='submit']/click on start chat
//div[@class="lc-13x0nsv emwkn670"]/div[@class="lc-1glynz2 eovu8nx0"]/span//To print all messages or reply


