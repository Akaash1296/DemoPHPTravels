package Libraries;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadAndWrite implements IAutoConstants {
	public int getRows() throws Exception {
		int rowCount = 0;
		FileInputStream fin = new FileInputStream(XLPATH);
		Workbook wb = WorkbookFactory.create(fin);
		rowCount = wb.getSheet(SHEETNAME).getLastRowNum();		
		return rowCount;
	}
	
	public int getColumns(int rows) throws Exception {
		int columnCount = 0;
		FileInputStream fin = new FileInputStream(XLPATH);
		Workbook wb = WorkbookFactory.create(fin);
		columnCount = wb.getSheet(SHEETNAME).getRow(rows).getLastCellNum();		
		return columnCount;
		
	}
	
	public String readData(int rows, int columns) throws Exception {
		String data = null;
		FileInputStream fin = new FileInputStream(XLPATH);
		Workbook wb = WorkbookFactory.create(fin);
		data = wb.getSheet(SHEETNAME).getRow(rows).getCell(columns).getStringCellValue();		
		return data;
	}
	
	public void writeData(int rows, int columns, String val) throws Exception {
		FileInputStream fin = new FileInputStream(XLPATH);
		Workbook wb = WorkbookFactory.create(fin);
		wb.getSheet(SHEETNAME).getRow(rows).createCell(columns).setCellValue(val);
		FileOutputStream fout = new FileOutputStream(XLPATH);
		wb.write(fout);
	}
}
