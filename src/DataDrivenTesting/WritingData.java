package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingData {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Personal\\DevEnv\\Code\\TYWorkspace\\Selenium\\Excel\\UrbanLadder.xlsx");

		Workbook wbook = WorkbookFactory.create(fis);
		Sheet sh = wbook.getSheet("Sheet1");
		int val =50;
		Row r = null;
		Cell c = null;
		for(int i = 0 ;i < 10 ; i++) {
			r=sh.getRow(i);
			if(r == null)
				r = sh.createRow(i);
			c = r.getCell(2);
			if(c==null)
				c = r.createCell(2);
			c.setCellType(CellType.NUMERIC);
			c.setCellValue(val);
			val+=10;
		}

		FileOutputStream fos = new FileOutputStream("C:\\Personal\\DevEnv\\Code\\TYWorkspace\\Selenium\\Excel\\UrbanLadder.xlsx");
		wbook.write(fos);
		fos.flush();
		fos.close();
		fis.close();
		wbook.close();
	}
}
