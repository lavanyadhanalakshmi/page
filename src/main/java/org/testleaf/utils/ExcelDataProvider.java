package org.testleaf.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataProvider {

	public String[][] readExcelData(String excelFileName ,String Sheetname ) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/"+ excelFileName +".xlsx"); 		// Step 1: Open the workbook by its file name
		XSSFSheet sheet = book.getSheet(Sheetname);
		/*XSSFSheet sheet = book.getSheetAt(0); */		// Step 2: Go to the sheet
		int rowCount = sheet.getLastRowNum(); 		// Step 3: Go to the first row
		System.out.println("Row Count " + rowCount);
		XSSFRow firstRow = sheet.getRow(0);
		int colCount = firstRow.getLastCellNum();
		System.out.println("Col Count " + colCount);
		// Create data array to send all data (except header) - row count, col count
		String[][] data = new String[rowCount][colCount];
		for (int j = 1; j <= rowCount; j++) {
			XSSFRow row = sheet.getRow(j);
			for (int i = 0; i < colCount; i++) {
				XSSFCell cell = row.getCell(i); // Step 4: Go to the first cell of the row
				String value = cell.getStringCellValue();  // Step 5: Read the contents by its type
				data[j-1][i]= value;
				System.out.println(value);
			}	}
		book.close(); 		// Step 6: Close the workbook
		return data;		// send it back to the caller
	
	
	
	
	
	}

}


