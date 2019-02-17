package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static XSSFSheet ExcelWSheet;
	
	private static XSSFWorkbook ExcelWBook;
	
	private static XSSFCell Cell;
	
	private static XSSFRow Row;
	
	public static void setExcelFile(String Path, String SheetName) throws IOException {
	
	try
	{
		//Open the excel file
		
		FileInputStream ExcelFile = new FileInputStream(Path);
		
		//Access the required test data sheet
		
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		
		System.out.println(SheetName);		
		
	}
	
	catch (Exception e)
	
	{
		throw (e);
	}
	
	}
	
	//This method to read the test data from excel cell
	
	public static String getCellData(int RowNum, int ColNum) throws Exception{
		
		try {
			
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			
			String CellData = Cell.getStringCellValue();
			
			return CellData;
		}
		
		catch (Exception e)
		{
			return"data not found";
		}
	}
	
	//This method to write in the excel cell
	
	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {
		
		try {
			Row = ExcelWSheet.getRow(RowNum);
			
			Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
			
			if(Cell == null)
			{
				Cell = Row.createCell(ColNum);
				
				Cell.setCellValue(Result);
				
			}
			
			else {
				
				Cell.setCellValue(Result);
			}
			
			//constant variable test data path and test data file name
			
			FileOutputStream fileOut = new FileOutputStream(constant.TestDataLocation);
			
			ExcelWBook.write(fileOut);
			
			fileOut.flush();
			
			fileOut.close();
			
		}
		
		catch(Exception e)
		{
			throw (e);
		}
		
	}
		
		public static int getRowCount()
		{
			int rowCount = ExcelWSheet.getLastRowNum()+1;
			return rowCount;
		}
		
		public static int getColumnCount(int rowNo)
		{
			Row = ExcelWSheet.getRow(rowNo);
			int colCount = Row.getLastCellNum();
			return colCount;
		}
	}
	

