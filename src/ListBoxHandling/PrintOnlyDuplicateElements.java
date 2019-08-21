package ListBoxHandling;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicateElements {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Personal/DevEnv/html%20programs/ListBox.html");
		WebElement  list = driver.findElement(By.id("slv"));
		Select items = new Select(list);
		List<WebElement> options = items.getOptions();
		Map<String , Integer> food = new LinkedHashMap<>(); 
		for(WebElement option : options) {
			if(food.containsKey(option.getText())) {
				int value = food.get(option.getText());
				food.put(option.getText() , value + 1);
			} else {
				food.put(option.getText(), 1);
			}
		}
		for(Map.Entry<String, Integer> opt : food.entrySet()) {
			if(opt.getValue() > 1) {
				System.out.println(opt.getKey());
			}
		}
	}
}
