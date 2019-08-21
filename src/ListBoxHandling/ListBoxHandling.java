package ListBoxHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxHandling {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Personal/DevEnv/html%20programs/ListBox.html");
		
		WebElement listBox = driver.findElement(By.id("slv"));
		Select s = new Select(listBox);
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("idly");
		
		List<WebElement> all = s.getAllSelectedOptions();
		System.out.println("Selected options: "+all.size());
		
		WebElement first = s.getFirstSelectedOption();
		System.out.println("First Selected Option in the list: "+first.getText());

		if(s.isMultiple()) {
			System.out.println("Listbox is multiple select");
			s.deselectByIndex(0);
			s.deselectByValue("v");
			s.deselectByVisibleText("idly");
			s.deselectAll();
		} else {
			System.out.println("We cannot use deselect methods");
		}
		System.out.println("***********");
		WebElement list = s.getWrappedElement();
		System.out.println("List UsinG WrapedElement: "+list.getText());
		/*List<WebElement> allOptions = s.getOptions();
		for(WebElement e : allOptions) {
			String text =  e.getText();
			System.out.println(text);
		}*/
		driver.close();
	}
}
