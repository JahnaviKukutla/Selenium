package POM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Testclass 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args)  throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMIwYS0p5Xr4wIV04BwCh2bsQsvEAAYASAAEgKG-PD_BwE&ef_id=EAIaIQobChMIwYS0p5Xr4wIV04BwCh2bsQsvEAAYASAAEgKG-PD_BwE:G:s&s_kwcid=AL!739!3!326505318642!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
		FlipkartPage f=new FlipkartPage(driver);
		Thread.sleep(10000);
		f.noOfImages();
	}
}