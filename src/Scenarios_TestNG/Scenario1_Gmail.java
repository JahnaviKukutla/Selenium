package Scenarios_TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario1_Gmail {
	@Test
	public void mail() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement txtElement = driver.findElement(By.name("identifier"));
		txtElement.sendKeys("testmail.minion@gmail.com");
		WebElement nextButton = driver.findElement(By.cssSelector("[class = 'RveJvd snByac']"));
		nextButton.click();
		Thread.sleep(3000);
		WebElement paswword = driver.findElement(By.cssSelector("[autocomplete='current-password'][class='whsOnd zHQkBf']"));
		paswword.sendKeys("testmulti123");
		WebElement button = driver.findElement(By.cssSelector("[class='RveJvd snByac']"));
		button.click();
		Thread.sleep(5000);

		try {
			WebElement primary = driver.findElement(By.xpath("//div[@aria-label='Primary']"));
			if(primary.isSelected()) {
				Assert.assertTrue(true);
				System.out.println("Primary tab is selected");
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		List<WebElement> noOfMails = driver.findElements(By.xpath("//div[@class='UI']/descendant::table//tr"));
		System.out.println("No of mails: "+noOfMails.size());
		int totalMails = noOfMails.size();
		String NoOfUnreadMails = driver.findElement(By.xpath("//div[@class='bsU']")).getText();
		System.out.println("No of Unread Mails: "+NoOfUnreadMails);
		driver.findElement(By.xpath("//div[@class='UI']/descendant::table//tr["+totalMails+"]//td[@class='yX xY ']/div[2]")).click();
		Thread.sleep(2000);
		System.out.println("Inbox No "+totalMails+" Mail details:[Last Mail] ");
		WebElement mailId = driver.findElement(By.xpath("//descendant::span[@class='go']"));
		System.out.println("MailId: "+mailId.getText());
		WebElement subject = driver.findElement(By.xpath("//div[@class='ha']/h2"));
		System.out.println("Subject of Mail: "+subject.getText());
	}
}