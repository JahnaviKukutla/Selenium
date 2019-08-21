package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EspnCricketScorecardPrintOnConsole {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		Thread.sleep(3000);
		WebElement summary = null;
		int i = 0;
		try {
			while(true) {
				List<WebElement> list = driver.findElements(By.xpath("//ul[@id='leagues']//li"));
				for (WebElement webElement : list) {
					// list will contain all the li of ul(will have empty text for not displayed li's)
					if (webElement.getText().trim().length() > 0) {
						// we increase i value only for displaying matches
						i++;
					}
					if (webElement.getText().contains("Result")) {
						summary = webElement;
						break;
					}
				}
				if (summary != null) {
					// Found the match so break from top while loop
					break;
				} else {
					// Not found in the displayed matches so click next
					WebElement temp = driver.findElement(By.xpath("//div[@class='scores-next controls']"));
					temp.click();
				}
			}
			driver.get(driver.findElement(By.xpath("//ul[@id='leagues']//li["+i+"]//descendant::a[@class='cscore_header-link']")).getAttribute("href"));
			
			/*List<WebElement> list = driver.findElements(By.xpath("//ul[@class='first-group']//li"));
			for (WebElement webElement : list) {
				if (webElement.getText().contains("Scorecard")) {
					webElement.click();
					break;
				}
			}*/
			
			List<WebElement> list = driver.findElements(By.xpath("//div//article[@class = 'sub-module scorecard']"));
			for (WebElement webElement : list) {
				System.out.println(webElement.getText());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
