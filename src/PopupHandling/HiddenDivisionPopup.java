package PopupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {
	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();

		WebElement txtElement = driver.findElement(By.id("username"));
		txtElement.sendKeys("admin");
		WebElement paswd = driver.findElement(By.name("pwd"));
		paswd.sendKeys("manager");
		WebElement button = driver.findElement(By.linkText("Login"));
		button.click();
		Thread.sleep(3000);//If Thread.sleep() is not given the again title of login page is fetched since homepage is not loaded completely.
		System.out.println("***********");
		String title2 = driver.getTitle();
		System.out.println("Title of homepage: "+title2);//Fetches title of Home page
		driver.findElement(By.xpath("//div[@class='topMenuButton preventPanelsHiding'][2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='popup_menu_ul']/descendant::a[contains(.,'About')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='aboutPopup']/descendant::td[@class='close-button']")).click();
		
	}
}	


