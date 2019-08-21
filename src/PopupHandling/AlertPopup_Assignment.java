package PopupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup_Assignment {

	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Personal/DevEnv/html%20programs/login.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='button1'][@value='login']")).click();
		/**Explicit Wait**/
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		Thread.sleep(2000);
		alert.accept();//Used to select OK button
		//alert.dismiss();//Used to choose Cancel button
	}
}
