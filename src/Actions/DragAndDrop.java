package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	static{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Thread.sleep(3000);
		/*WebElement block3 = driver.findElement(By.xpath("//h1[.='Block 3']"));
		WebElement block2 = driver.findElement(By.xpath("//h1[.='Block 2']"));
		Actions actions = new Actions(driver);
		// drag block 1 element and drop it on block 2 element 
		actions.dragAndDrop(block3, block2).perform();*/

		/**My code**/
		WebElement source = driver.findElement(By.xpath("//*[@id='block-3']"));
		WebElement destination =  driver.findElement(By.xpath("//*[@id='block-2']"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source,destination).perform();
		Thread.sleep(3000);
	}
}
