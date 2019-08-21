package TestNG;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UrbanLadderCompare {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");

	}
	WebDriver driver = new ChromeDriver();
	@Test
	public void enterData() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		driver.get("https://www.urbanladder.com/");

		List<WebElement> value=driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li"));/*List Of Main menu*/
		Actions action=new Actions(driver);
		System.out.println(value.size());//Size of main menu[Total Number]
		for(int i=0;i<value.size();i++)//i<10
		{
			WebElement we=value.get(i);
			Thread.sleep(3000);
			action.moveToElement(we).perform();
			Thread.sleep(3000);
			//List of Main menu
			List<WebElement> subvalue=driver.findElements(By.xpath("//div[@class='subnavlist_wrapper clearfix']"));
			for(int j=0;j<subvalue.size();j++)
			{
				WebElement ws=subvalue.get(j);
				System.out.println(ws.getText());
				FileInputStream fis= new FileInputStream("C:\\Personal\\DevEnv\\Code\\TYWorkspace\\Selenium\\Excel\\urbanCompare");
				Workbook wbook=WorkbookFactory.create(fis);
				Sheet sh= wbook.getSheet("Sheet1");
				Row row= sh.createRow(j);
				row.createCell(j).setCellValue(ws.getText());
				FileOutputStream fos=new FileOutputStream("C:\\Personal\\DevEnv\\\\Code\\TYWorkspace\\Selenium\\Excel\\urbanCompare");
				wbook.write(fos);
				fos.flush();
				fos.close();
				fis.close();
				wbook.close();
				wbook.close();
			}
			System.out.println("/n");
		}
		driver.close();
	}	
}
