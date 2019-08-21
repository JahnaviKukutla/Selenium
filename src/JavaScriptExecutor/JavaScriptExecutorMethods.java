package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class JavaScriptExecutorMethods {

	static{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		/*
		for(int i = 0  ; i < 10  ; i++) {
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}
		for(int i = 0 ; i < 10 ; i++) {
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(300);
		}
		js.executeScript("window.open()");*/
		
		/**Scroll to particular element-When we can't inspect element we go for Java script executor**/
		js.executeScript("window.scrollBy(0,500)");
		WebElement ele = driver.findElement(By.xpath("//img[@class='retina-image' and @alt='Illustration of"));
		js.executeScript("arguments[0].scrollIntoiew",ele);
		Thread.sleep(1000);
	}

}
