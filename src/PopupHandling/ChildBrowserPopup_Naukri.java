package PopupHandling;

import java.util.Scanner;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildBrowserPopup_Naukri {
	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();

		/**To close all windows**/
		/*Set<String> allwhs = driver.getWindowHandles();
		int count = allwhs.size();
		for(String wh : allwhs) {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			driver.close();
			}*/


		/**To close only child windows/browsers-Scenario-1**/
		/**Using remove()method**/
		Set<String> allwhs = driver.getWindowHandles();
		String parent  = driver.getWindowHandle();/*Here we are assigning id/address of parent window to parent variable and using remove()
		we re removing address from allwhs*/
		allwhs.remove(parent);

		for(String wh : allwhs) {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			driver.close();
		}


		/**Closing Child browsers-Scenario 2**/
		/*Set<String> allwhs = driver.getWindowHandles();
		for(String wh : allwhs) {
			driver.switchTo().window(wh);
			String titlefetched = driver.getTitle();
			if(titlefetched.equals(title)) {
				System.out.println(title+" is main window");
			} else {
				System.out.println(titlefetched+" is child window");
				driver.close();
			}
		}*/

		/**To close only main window**//*
		String main = driver.getWindowHandle();
		driver.switchTo().window(main);
		driver.close();*/

		/**Close the Particluar Browser**/
		/*System.out.println("Enter the browser title: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		Set<String> allwhs = driver.getWindowHandles();
		for(String wh : allwhs) {
			driver.switchTo().window(wh);
			String titlefetched = driver.getTitle();
			System.out.println(titlefetched);
			if(titlefetched.equals(input)) {
				driver.switchTo().window(wh);
				System.out.println(titlefetched+" Window Is Closed");
				driver.close();
			}
		}*/
	}
}