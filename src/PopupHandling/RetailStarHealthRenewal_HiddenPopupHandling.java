package PopupHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RetailStarHealthRenewal_HiddenPopupHandling {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	private static final String ERROR = "Invalid Policy Number";
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://retail.starhealth.in/renewal");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement policyNum = driver.findElement(By.id("nqame2"));//cssSelector("input[id='nqam2']"));//(By.xpath("//div[@class='section section-label'][@id='cust-pol'][1]"));
		policyNum.sendKeys("986427362");
		driver.findElement(By.xpath("//div[@class='spritimg dob-sprit-img']")).click();

		WebElement listBox1 = driver.findElement(By.id("selMonth"));
		Select month = new Select(listBox1);
		month.selectByVisibleText("February");

		WebElement listBox2 = driver.findElement(By.id("selYear"));
		Select year = new Select(listBox2);
		year.selectByValue("1995");

		driver.findElement(By.xpath("//li[30][1]")).click();
		driver.findElement(By.id("proceed")).click();
		Thread.sleep(3000);
		WebElement errorMsg = driver.findElement(By.id("errorExplanation"));
		if(errorMsg.getText().equals(ERROR)){
			System.out.println("Textcase is PASS");
		} else {
			System.out.println("TestCase FAIL");
		}
	}
}
