package excelHandlingExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	
	public static void main (String args[]) throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Selenium\\ExcelHandling\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(1);
		
		//We need to find out the type of the value we want to enter.
		//If it is a string, we need to set the cell type as string.
		//If it is numeric, we need to set the cell type as number.
		
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue("TechBodhi");
		FileOutputStream fos = new FileOutputStream("D:\\Selenium\\ExcelHandling\\TestData.xlsx");
		workbook.write(fos);
		fos.close();
		System.out.println("END OF WRITING DATA IN EXCEL");
	}

}
