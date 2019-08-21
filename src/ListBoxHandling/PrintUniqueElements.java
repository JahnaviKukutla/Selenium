package ListBoxHandling;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintUniqueElements {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Personal/DevEnv/html%20programs/ListBox.html");
		WebElement listbox = driver.findElement(By.id("slv"));
		Select s = new Select(listbox);
		List<WebElement> list = s.getOptions();
		Set<String> items = new LinkedHashSet<String>();
		///LinkdHashSet to maintain Insertion order.
		for(WebElement element : list) {
			/**Fetches all options in the list**/
			//System.out.println(element.getText());
			items.add(element.getText());
		}
		System.out.println("Unique Food Items Present in the List: ");
		for(String food : items) {
			System.out.println(food);
		}
	}
}
