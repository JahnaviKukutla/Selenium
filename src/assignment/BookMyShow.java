package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {
	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/bengaluru");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Title: "+driver.getTitle());
		driver.manage().window().maximize();

		/*driver.findElement(By.xpath("//div//a[@onclick='BMS.Region.fnSTopReg('BANG','Bengaluru');']")).click();
		Thread.sleep(3000);*/
		Thread.sleep(6000);
		driver.findElement(By.id("wzrk-confirm")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/h4[@class='title' and text()='Kurukshetra (Kannada)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/a[contains(text(),'Book Tickets')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/a[contains(text(),'3D')]")).click();
		System.out.println("3D is selected");
		Thread.sleep(10000);
		while(true) {
			try {
				driver.findElement(By.xpath("//div/a[text()='Cinepolis: Royal Meenakshi Mall']/ancestor::div[@class='details']/parent::div/following-sibling::div/child::div[2]")).click();	
				break;
			} catch(Exception e) {
				System.out.println(e);
			}
			Thread.sleep(3000);
		}
		driver.findElement(By.xpath("//div/a[text()='Accept'][1]")).click();
		System.out.println("Accept is choosen");
		driver.findElement(By.id("pop_1")).click();
		System.out.println("2 Tickets are choosen");
		driver.findElement(By.id("proceed-Qty")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr/td/div[text()='K']/parent::td/parent::tr/child::td[2]/child::div/a[contains(text(),'10')]")).click();

	}
}
