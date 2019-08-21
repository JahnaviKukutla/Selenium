package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_LoginPage {
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement uname;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement paswd;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement login;
	

    public OrangeHRM_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   
	public void setUsername(String un) {
		uname.sendKeys(un);
	}

	public void setPassword(String pwd) {
		paswd.sendKeys(pwd);
	}
	
    public void clickLogin() {
    	login.click();
    }

   
}
