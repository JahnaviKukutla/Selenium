package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GmailAutomate {
	static {
		System.setProperty("webdriver.chrome.driver" , "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession&TL=APDPHBDVtJcdg_sYnE5F9DbQMtotaKIYpXtpw-YsxLJzwpSLgsURMlHjaQp0ofHm");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		WebElement txtElement = driver.findElement(By.name("identifier"));
		txtElement.sendKeys("testmail.minion@gmail.com");
		WebElement nextButton = driver.findElement(By.cssSelector("[class = 'RveJvd snByac']"));
		nextButton.click();
		Thread.sleep(3000);
		WebElement paswword = driver.findElement(By.cssSelector("[autocomplete='current-password'][class='whsOnd zHQkBf']"));
		paswword.sendKeys("testmulti123");
		WebElement button = driver.findElement(By.cssSelector("[class='RveJvd snByac']"));
		button.click();
		Thread.sleep(3000);
		WebElement composeButton = driver.findElement(By.cssSelector("[class='T-I J-J5-Ji T-I-KE L3'][role='button']"));
		composeButton.click();
		Thread.sleep(8000);
		WebElement toField = driver.findElement(By.id(":6m"));
		toField.sendKeys("jahnavikukutla@gmail.com");
	}
}
