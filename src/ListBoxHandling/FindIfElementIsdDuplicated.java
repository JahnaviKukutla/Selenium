/*Check if given object is duplicate in listbox*/

package ListBoxHandling;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindIfElementIsdDuplicated {
/*Select and deselect all the options in reverse order.*/
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.out.println("Enter the value for duplicate check: ");
		String value = new Scanner(System.in).next();
		driver.get("file:///C:/Personal/DevEnv/html%20programs/ListBox.html");
		WebElement listbox = driver.findElement(By.id("slv"));
		Select s = new Select(listbox);
		List<WebElement> list = s.getOptions();
		int count = 0;
		for(WebElement element : list) {
			/**Fetches all options in the list**/
			//System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase(value)) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println(value+" Is Invalid Input");
		} else if(count > 1) {
			System.out.println(value+" Is Duplicated");
		} else {
			System.out.println(value+" Is Not Duplicated");
		}
	}
}
