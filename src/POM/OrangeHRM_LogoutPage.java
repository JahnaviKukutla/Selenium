package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_LogoutPage {
	
	@FindBy(xpath="//a[@id='welcome']")
    private WebElement welcome;
	
    @FindBy(xpath="//a[text()='Logout']")
    private WebElement logout;
    
    public OrangeHRM_LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    
    public void clickDropDown() {
    	welcome.click();
    }
    
    public void clickLogout() {
    	logout.click();
    }

}
