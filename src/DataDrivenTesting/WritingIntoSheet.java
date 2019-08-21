package DataDrivenTesting;

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


public class WritingIntoSheet {
	static Row row =null;
	static Cell cell = null;
	static int rowIndex = 0;
	static int CellNumber = 1;


	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("Excel\\WriteIntoSheet.xlsx");
		Workbook wbook = WorkbookFactory.create(fis);
		wbook.createSheet("WriteData");
		Sheet sh = wbook.getSheet("WriteData");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goodreads.com/");
		List<WebElement> bookTypes = driver.findElements(By.xpath("//div/a"));
		for(WebElement books : bookTypes) {
			System.out.println(books.getText().trim());
			writeData(sh,books.getText().trim());
		}
		FileOutputStream fos = new FileOutputStream("Excel\\WriteIntoSheet.xlsx");
		wbook.write(fos);
		fos.flush();
		fos.close();
		fis.close();
		wbook.close();
	}

	private static void writeData(Sheet sh,String Content) {
		row = sh.getRow(rowIndex);
		if(row==null) {
			row = sh.createRow(rowIndex);
			cell = row.getCell(CellNumber);
			if(cell == null) {
				cell = row.createCell(CellNumber);
				cell.setCellType(CellType.STRING);
				cell.setCellValue(Content);
				rowIndex++;
			}
		}
	}
}
