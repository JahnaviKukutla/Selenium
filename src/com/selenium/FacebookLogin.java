package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookLogin {
	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.cssSelector("[id ='u_0_l'][class='inputtext _58mg _5dba _2ph-']"));
		userName.sendKeys("Jahnavi");
		WebElement surName  = driver.findElement(By.cssSelector("[type = 'text'][name= 'lastname']"));
		surName.sendKeys("Madhu");
		WebElement nextButton = driver.findElement(By.cssSelector("[name='reg_email__'][id='u_0_q']"));
		nextButton.sendKeys("9292929229");
		WebElement newPassword = driver.findElement(By.cssSelector("[autocomplete='new-password']"));
		newPassword.sendKeys("dummy1234");
		while(true) {
			try {
				WebElement date = driver.findElement(By.id("day"));
				Select s = new Select(date);
				s.selectByValue("27");
				break;
			} catch(Exception e) {
				System.out.println("Exception caught");
			}
		}
		while(true) {
			try {
				WebElement month = driver.findElement(By.id("month"));
				Select s1 = new Select(month);
				s1.selectByVisibleText("Feb");
				break;
			} catch(Exception e) {
				System.err.println(e);
				System.err.println("for Month");
			}
		}
		while(true) {
			try {
				WebElement year = driver.findElement(By.id("year"));
				Select s2 = new Select(year);
				s2.selectByValue("1995");
				break;
			} catch(Exception e) {
				System.err.println(e);
				System.out.println("Exception caught");
			}
		}
		WebElement gender = driver.findElement(By.xpath("//input[@type='radio'][@value='1']"));
		gender.click();
		Thread.sleep(3000);
		WebElement signup = driver.findElement(By.name("websubmit"));
		signup.click();
	}
}
