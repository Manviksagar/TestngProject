package com.sag.data;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelFunc {
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public ExcelFunc() throws IOException {

	 workbook = new XSSFWorkbook("C:\\Users\\Va185060\\eclipse-workspace\\CompleteTest\\src\\test\\resources\\ExcelData\\Testdata.xlsx");
	sheet=workbook.getSheet("Sheet1");
	}
	public int rowCount() {
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		
		return rowcount;
	}
	
public  int columnCount() {
		
		int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		return colcount;
	}

public Object[][] getData(int row, int col) {
	

	Object ss[][] = new Object[row][col];
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			
			String celldata= sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(celldata);
			System.out.print(" ||" );
			ss[i][j]=celldata;
		}
		System.out.println(" ");
	}
	return ss;
}
	
	@DataProvider(name="excelData")
	public  Object[][] excelDataPulling() throws IOException {
		
		ExcelFunc ni= new ExcelFunc();
		int rows =ni.rowCount();
		int cols=ni.columnCount();
		return ni.getData(rows, cols);
	}

}
