package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderJquery {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		Actions action = new Actions(driver);
		WebElement slide = driver.findElement(By.xpath("//div[@id='slider']/span"));
		for(int i = 0 ; i < 20 ; i++) {
			action.moveToElement(slide).clickAndHold(slide).moveByOffset( i , 0).perform();
		}
		for(int i = 20 ; i > 0 ; i--) {
			action.moveToElement(slide).clickAndHold(slide).moveByOffset( -i , 0).perform();
		}
	}

}
