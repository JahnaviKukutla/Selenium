package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTIME_LoginPage {
	@FindBy(id = "username")
	private WebElement unTB;
	@FindBy(name = "pwd")
	private WebElement pwTB;
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginBTN;

	public ActiTIME_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUsername(String un) {
		unTB.sendKeys(un);
	}

	public void setPassword(String pwd) {
		pwTB.sendKeys(pwd);
	}

	public void clickLogin() {
		loginBTN.click();
	}
}

