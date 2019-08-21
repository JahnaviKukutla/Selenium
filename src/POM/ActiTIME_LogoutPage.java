package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTIME_LogoutPage {
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;

	public ActiTIME_LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickLogout() {
		logout.click();
	}
}
