package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkarAllMenuAccess {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//div/button[@class='_2AkmmA _29YdH8']")).click();;
		System.out.println("Title: "+driver.getTitle());
		/**Main menu List**/
		Thread.sleep(3000);
		List<WebElement>  mainMenuList= driver.findElements(By.xpath("//div[@class='_3zdbog _3Ed3Ub']//ul[@class='_114Zhd']/li"));
		System.out.println("No of Main menu: "+mainMenuList.size());

		for(WebElement menu : mainMenuList) {
			System.out.println(menu.getText().trim());
			Actions action = new Actions(driver);

			/*Mouse over on main menu list*/
			action.moveToElement(driver.findElement(By.xpath("//div[@class='_3zdbog _3Ed3Ub']//ul[@class='_114Zhd']/descendant::li[@class='Wbt_B2 _1YVU3_' or @class='Wbt_B2']"))).perform();//"//div[@class='_3zdbog _3Ed3Ub']//ul[@class='_114Zhd']//span[contains(text(),'"+menu.getText()+"')]"))).perform();
			//List of Sub Menu
			//List<WebElement> submenu = driver.findElements(By.xpath("//div[@class='_3zdbog _3Ed3Ub']/ul[@class='_114Zhd']//span[contains(text(),'"+menu.getText()+"')]/parent::li/parent::ul/li//ul[@class='QPOmNK']/li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy']//a"));
			/*List<WebElement> submenu = driver.findElements(By.xpath("//div[@class='_3zdbog _3Ed3Ub']/ul[@class='_114Zhd']//span[contains(text(),'"+menu.getText()+"')]/parent::li/parent::ul/li//ul[@class='QPOmNK']/li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy']/ancestor::li[@class='Wbt_B2 _1YVU3_']/descendant::a"));
			for(WebElement sMenu : submenu) {
				System.out.println("  "+sMenu.getText());
				List<WebElement> subSubMenu =     driver.findElements(By.xpath("//div[@class='_3zdbog _3Ed3Ub']//ul[@class='_114Zhd']/li/parent::ul/li/descendant::li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy']/a/parent::li/parent::ul//li[@class='_1KCOnI _3ZgIXy']"));
				for(WebElement ssMenu : subSubMenu) {
					System.out.println("    "+ssMenu.getText());
				}
			}*/
		}
	}
}
