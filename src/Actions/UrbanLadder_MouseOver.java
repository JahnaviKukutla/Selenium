package Actions;

import java.util.List;

import javax.swing.event.MenuListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder_MouseOver {

	static{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='authentication_popup']/div[1]/div/div[2]/a[1]")).click();
		//Living
		WebElement li = driver.findElement(By.xpath("//*[@id='topnav_wrapper']/ul/li[1]/span"));
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.moveToElement(li).perform();
		Thread.sleep(10000);
		System.out.println("MOUSE OVER SUCCESS");

		List<WebElement> lists = driver.findElements(By.xpath("//ul[@class='taxonslist']"));
		System.out.println("List of Sofa:");
		for(WebElement allOptionsInMenu : lists) {
			String s = allOptionsInMenu.getText();
			System.out.print(s);
		}	

		List<WebElement> list2 = driver.findElements(By.xpath("//ul[@class='sublist_item']"));
		System.out.println("List of Options in Bedroom Menu: ");
		for(WebElement allOptionsInMenu : list2) {
			String s = allOptionsInMenu.getText();
			System.out.print(s);
		}
	}
}
