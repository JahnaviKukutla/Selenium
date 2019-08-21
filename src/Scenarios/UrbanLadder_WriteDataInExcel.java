package Scenarios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder_WriteDataInExcel {
	static int indexOfRow = 0;
	static int cellNumToWrite = 1;
	static Row row = null;
	static Cell cell = null;
	
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("Excel\\UrbanLadder.xlsx");
		Workbook wbook = WorkbookFactory.create(fis);
		Sheet sh = wbook.getSheet("UrbanLadder");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		System.out.println("Ttitle of Homepage Of Urban Ladder: "+driver.getTitle());
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='authentication_popup']/div[1]/div/div[2]/a[1]")).click();
		Thread.sleep(2000);
		List<WebElement> menu = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li/span"));
		for(WebElement m:menu) {
			System.out.println(m.getText().trim());//To print all Main Menu[trim() used to remove spaces]
			
			// write to file
			writeToRow(sh, m.getText().trim());//To put text into row (In sheet)using sh(ref) of sheet
			
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//div//ul//li/span[contains(text(),'"+m.getText()+"')]"))).perform();
			Thread.sleep(4000);
			List<WebElement> subMenu = driver.findElements(By.xpath("//div//ul//li/span[contains(text(),'"+m.getText()+"')]/parent::li/div[@class='subnavlist lt' or @class='subnavlist rt']//div/a[@class='inverted']"));
			for(WebElement sub:subMenu) {
				System.out.println("  "+sub.getText().trim());
				writeToRow(sh, sub.getText().trim());//To write submenu List
				List<WebElement> subSubMenu = driver.findElements(By.xpath("//div//ul//li/span[contains(text(),'"+m.getText()+"')]/parent::li/div[@class='subnavlist lt' or @class='subnavlist rt']//div/a[@class='inverted' and contains(text(),'"+sub.getText().trim()+"')]/parent::div/parent::li/descendant::ul/li"));
				for(WebElement ssub:subSubMenu) {
					System.out.println("        "+ssub.getText());//SubSubmenu List
					writeToRow(sh, ssub.getText().trim());
				}
			}
		}
		
		// write to excel after all updates
		FileOutputStream fos = new FileOutputStream("Excel\\\\UrbanLadder.xlsx");
		wbook.write(fos);
		fos.flush();
		fos.close();
		fis.close();
		wbook.close();
	}
	private static void writeToRow(Sheet sh, String content) {
		row =sh.getRow(indexOfRow);
		if(row == null)
			row = sh.createRow(indexOfRow);
		cell = row.getCell(cellNumToWrite);
		if(cell==null)
			cell = row.createCell(cellNumToWrite);
		cell.setCellType(CellType.STRING);
		cell.setCellValue(content);
		indexOfRow++;
	}
}
