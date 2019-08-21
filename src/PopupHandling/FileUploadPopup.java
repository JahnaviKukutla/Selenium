package PopupHandling;
import java.awt.AWTException;
import java.awt.Event;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopup {	static {
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
}

public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver = new FirefoxDriver();

	driver.manage().window().maximize();
	driver.get("file:///C:/Personal/DevEnv/html%20programs/Browserbutton.html");
	String path = "C:\\Users\\Madhu\\Desktop\\Popup.txt";
	driver.findElement(By.id("f1")).sendKeys(path);
}
}
