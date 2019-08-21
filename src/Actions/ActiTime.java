/**Open Actitime URL: "https://demo.actitime.com/login.do"
 * Right click on © actiTIME Inc. link and choose "Open link in new tab"**/

package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiTime {
	static{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		Actions action = new Actions(driver);
		action.contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	}
}