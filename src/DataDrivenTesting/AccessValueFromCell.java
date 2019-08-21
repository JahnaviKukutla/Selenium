package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AccessValueFromCell {
	
	/**To Read Data From the Sheet**/
	public static void readData() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Personal\\DevEnv\\Code\\TYWorkspace\\Selenium\\Excel\\Data.xlsx");
		Workbook wbook = WorkbookFactory.create(fis);
		//Workbook-Interface; WorkbookFactory-Class: It returns Interface. It accepts ref as an argument
		Sheet sh  = wbook.getSheet("Sheet1");
		/**To access only once cell value**/
		Row row = sh.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		wbook.close();
	}

	/**ReadData: To access All values**/
	/*	for(int i = 0 ; i <sh.getPhysicalNumberOfRows();i++) {
			for(int j = 0 ; j <sh.getRow(i).getPhysicalNumberOfCells();j++) {
				System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
		}
		wbook.close();
}*/

	/**To write data**/
	public static void writeData() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Personal\\DevEnv\\Code\\TYWorkspace\\Selenium\\Excel\\Data.xlsx");

		Workbook wbook = WorkbookFactory.create(fis);
		Sheet sh = wbook.getSheet("Sheet1");
		Row row = sh.getRow(2);
		row.createCell(0).setCellValue("TY02");//createcell-creates column value
		row.createCell(1).setCellValue("FAIL");
		FileOutputStream fos = new FileOutputStream("C:\\Personal\\DevEnv\\Code\\TYWorkspace\\Selenium\\Excel\\Data.xlsx");
		wbook.write(fos);
		fos.flush();
		fos.close();
		fis.close();
		wbook.close();
	}
	
	/**To Create Sheet**/
	public static void createSheet() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Personal\\DevEnv\\Code\\TYWorkspace\\Selenium\\Excel\\Data.xlsx");
		Workbook wbook = WorkbookFactory.create(fis);
		wbook.createSheet("Sheet5");
		FileOutputStream fos = new FileOutputStream("C:\\Personal\\DevEnv\\Code\\TYWorkspace\\Selenium\\Excel\\Data.xlsx");
		wbook.write(fos);
		fos.close();
		fis.close();
		wbook.close();
	}

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		readData();
		writeData();
		createSheet();
	}
}
