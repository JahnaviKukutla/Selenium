package POM;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPage 
{
	@FindBy(xpath = "//div/img")
	private List<WebElement> list;
	
	public FlipkartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void noOfImages()
	{
		System.out.println(list.size());	
	}
}