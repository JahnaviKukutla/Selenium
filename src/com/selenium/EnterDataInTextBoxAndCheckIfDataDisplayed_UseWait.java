/**Use link:file:///C:/Personal/DevEnv/html%20programs/TextBoxWait.html
 * Enter Data In the first TextBox And Check If Data Displayed(UseWait) And Enter data in second checkbox**/
package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterDataInTextBoxAndCheckIfDataDisplayed_UseWait {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Personal/DevEnv/html%20programs/TextBoxWait.html");
		driver.getTitle();
		/**Custom Wait**/
		/*while(true) {
			try {
				driver.findElement(By.id("t1")).sendKeys("TestYantra");
				if(driver.findElement(By.id("t1")).isDisplayed()) {
					System.out.println("TestYantra is Validated");
					driver.findElement(By.id("s1")).sendKeys("Selenium");
					break;
				}
			}catch(Exception e) {
				System.out.println("Exception caught");
			}*/
		/**Using Anonymous Class**/
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {

				return driver.findElement(By.id("t1"));
			}
		});
		driver.findElement(By.id("t1")).sendKeys("TestYantra");
		if(driver.findElement(By.id("t1")).isDisplayed()){
			{
				System.out.println("TestYantra is validated");
				driver.findElement(By.id("s1")).sendKeys("TY");
			}
		}
		//driver.close();
		/**Anonymous class in Custom wait**/
		/*while(true) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(new ExpectedCondition<WebElement>() {
					@Override
					public WebElement apply(WebDriver arg0) {

						return driver.findElement(By.id("t1"));
					}
				});
				driver.findElement(By.id("t1")).sendKeys("TestYantra");
				if(driver.findElement(By.id("t1")).isDisplayed()){
					{
						System.out.println("TestYantra is validated");
						driver.findElement(By.id("s1")).sendKeys("TY");
						break;
					}
				}
			} catch(Exception e) {
				System.out.println("Exception caught");
			}*/
	}
}

