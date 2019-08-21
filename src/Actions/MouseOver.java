/**Fetch HR contact details from www.vtiger.com from Resource tb>Contact by using mouseover of Actions class**/

package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	static{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement resource = driver.findElement(By.xpath("//a[text()='Resources']"));
		Actions actions =new Actions(driver);
		Thread.sleep(1000);
		actions.moveToElement(resource).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
		/*WebElement contact = driver.findElement(By.xpath("//div[text()='Human Resources']"));
		String text = contact.getText();
		System.out.print(text+": ");
		WebElement number = driver.findElement(By.xpath("//div[text()='+91 80 23501152']"));
		String num = number.getText();
		System.out.print(num);*/
		
		//Independent xpath is used,since HR is independent started from HR->Parent->Ccontact Number:Check HTML code
		WebElement contact = driver.findElement(By.xpath("//div[text()='Human Resources/parent::div/div[@class='col-md-8 col-sm-8']"));
		String text = contact.getText();
		System.out.print(text+": ");
	}
}
