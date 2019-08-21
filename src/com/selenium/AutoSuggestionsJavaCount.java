/**Count of auto suggestion Java in Google and click on the first auto suggestion**/
package com.selenium;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsJavaCount {
	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		//Thread.sleep(2000);(Size is give as zero when sleep is given else size=10
		WebElement searchBox = driver.findElement(By.cssSelector("input[class = 'gLFyf gsfi']"));
		searchBox.sendKeys("Java");
		Thread.sleep(1000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//div[@class='aajZCb']/ul/li"));
		System.out.println(autoSuggestions.size());
		System.out.println("List of suggestions: ");
		for(WebElement e : autoSuggestions) 
		{        
			System.out.println(e.getText());
		}
		//WebElement s = driver.findElement(By.xpath("//div//@class='aajZCb']ul/li[1]"));
		autoSuggestions.get(1).getText();
		autoSuggestions.get(1).click();;
		//driver.close();
	}
}

