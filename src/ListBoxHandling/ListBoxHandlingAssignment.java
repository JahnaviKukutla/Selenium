/**31-July-2019
1. Print the content present in the listbox in sorted order.
2. Check if the listbox is empty or not
3. Check if listbox content is in sorted order or not**/

package ListBoxHandling;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxHandlingAssignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		driver.get("file:///C:/Personal/DevEnv/html%20programs/ListBox.html");

		WebElement listBox = driver.findElement(By.id("slv"));
		Select s = new Select(listBox);
		/**To fetch if listbox is Empty**/
		/*WebElement list = s.getWrappedElement();
		System.out.println(list.getSize());
		if((list.getSize()) == null) {
			System.out.println("ListBox is Empty");
		}else
			System.out.println("ListBox is not empty");
		System.out.println("Options in ListBox are: "+list.getText());*/

		/*ArrayList<String> q = new ArrayList(); 
		foreach (object o : s){ 
			q.Add(o);
		} 
		q.Sort(); 
		listBox5.Items.Clear();
		foreach(object o in q){
			listBox5.Items.Add(o); */
	}
}
