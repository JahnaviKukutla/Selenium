package assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Assignment2 {	
	/**To Read Data From the Sheet**/
	public static void readData() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("Excel\\Data.xlsx");
		Workbook wbook = WorkbookFactory.create(fis);
		//Workbook-Interface; WorkbookFactory-Class: It returns Interface. It accepts ref as an argument

		Sheet sh  = wbook.getSheet("Sheet1");

		for(int i = 0 ; i <sh.getPhysicalNumberOfRows();i++) {
			for(int j = 0 ; j <sh.getRow(i).getPhysicalNumberOfCells();j++) {
				System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
		}
		wbook.close();
	}

	/**To Read Data From the Sheet,Row,Cell based on USser Input**/
	public static void readDataAsPerUserInput() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("Excel\\Data.xlsx");
		Workbook wbook = WorkbookFactory.create(fis);
		//Workbook-Interface; WorkbookFactory-Class: It returns Interface. It accepts ref as an argument
		Scanner scan = new Scanner(System.in);
		String sheetName = scan.next();
		Sheet sh  = wbook.getSheet(sheetName);
		if(sh == null ) {
			System.out.println("Sheet Not Present");
		} else {
			System.out.println("Enter the Row: ");
			int rowNum = scan.nextInt();
			if(rowNum >= sh.getPhysicalNumberOfRows()) {
				System.out.println("Row input is INVALID");
			} else {
				System.out.println("Enter the Cell  Number");
				int cellNo = scan.nextInt();
				if(cellNo >= sh.getRow(rowNum).getPhysicalNumberOfCells()) {
					System.out.println("CellNum is NOT VALID");
				} else {
					System.out.println(sh.getRow(rowNum).getCell(cellNo).getStringCellValue());
				}
			}
		} 
		wbook.close();
	}
	/**To write data into Single Row*/
	public static void writeData() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("Excel\\Data.xlsx");
		Workbook wbook = WorkbookFactory.create(fis);
		Sheet sh = wbook.getSheet("Sheet1");
		Row row = sh.getRow(1);
		row.createCell(0).setCellValue("Jahnavi");//createcell-creates column value
		row.createCell(1).setCellValue("TY");
		row.createCell(2).setCellValue("QA");
		row.createCell(3).setCellValue("9999999999");
		row.createCell(4).setCellValue("Selenium");
		FileOutputStream fos = new FileOutputStream("Excel\\Data.xlsx");
		wbook.write(fos);
		fos.flush();
		fos.close();
		fis.close();
		wbook.close();
	}
	/**WAP to write the values in a column of an Excel sheet**/
	public static void writeValuesInColumn() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("Excel\\Data.xlsx");
		Workbook wbook = WorkbookFactory.create(fis);
		Sheet sh  = wbook.getSheet("Sheet2");
		int columnNum = 3;
		for(int i = 0 ; i < 100 ; i++) {
			Row row = sh.createRow(i);	
			row.createCell(3).setCellValue("Madhu");
		}
		FileOutputStream fos = new FileOutputStream("Excel\\Data.xlsx");
		wbook.write(fos);
		fis.close();
		fos.close();
		wbook.close();
	}
	/**To print Sheet Names In Reversed Order**/
	public static void PrintSheetNamesInReversedOrder() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("Excel\\Data.xlsx");
		Workbook wbook = WorkbookFactory.create(fis);
		int noOfSheets = wbook.getNumberOfSheets();
		System.out.println("No of sheets: "+noOfSheets);
		System.out.println("Sheet Names: ");
		for(int i = noOfSheets - 1; i >= 0 ; i--) {
			System.out.println(wbook.getSheetName(i));
		}
		fis.close();
		wbook.close();
	}

	/**To print Sheet Names **/
	public static void getSheetNames() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("Excel\\Data.xlsx");
		Workbook wbook = WorkbookFactory.create(fis);
		int noOfSheets = wbook.getNumberOfSheets();
		System.out.println("No of sheets: "+noOfSheets);
		System.out.println("Sheet Names: ");
		for(int i = 0  ; i < noOfSheets ; i++) {
			System.out.println(wbook.getSheetName(i));
		}
		fis.close();
		wbook.close();
	}

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		/*readData();
		System.out.println("***********");
		writeData();
		System.out.println("***********");
		getSheetNames();
		System.out.println("***********");
		//readDataAsPerUserInput();
		System.out.println("************");
		PrintSheetNamesInReversedOrder();*/
		writeValuesInColumn();
	}
}


