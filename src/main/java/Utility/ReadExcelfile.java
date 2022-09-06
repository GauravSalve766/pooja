package Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelfile {
	
	public static String readexcelsheetfile(int row, int col) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\PracticeFramework\\TestData\\KiteExcelFile.xlsx");
		Sheet excelsheet = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excelsheet.getRow(row).getCell(col).getStringCellValue();
		return value;
	}
}
