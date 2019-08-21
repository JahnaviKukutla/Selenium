package assignment;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime{
	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String title = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		System.out.println(title);
		driver.manage().window().maximize();

		/*WebElement txtElement = driver.findElement(By.id("username"));
		txtElement.sendKeys("admin123");
		WebElement paswd = driver.findElement(By.name("pwd"));
		paswd.sendKeys("manager124");*/

		System.out.println("Enter the Username: ");
		Scanner scan = new Scanner(System.in);
		String uname = scan.next();
		WebElement txtElement = driver.findElement(By.id("username"));
		txtElement.sendKeys(uname);

		System.out.println("Enter the Password: ");
		String password = scan.next();
		WebElement paswd = driver.findElement(By.name("pwd"));
		paswd.sendKeys(password);

		WebElement button = driver.findElement(By.linkText("Login"));
		button.click();
		Thread.sleep(5000);
		
		String Homepage = driver.getTitle();
	}
}

