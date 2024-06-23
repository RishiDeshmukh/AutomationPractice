package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUpdate {
	@Test
	public void UpdateCellDetails() throws IOException {
		// Create instance of FileInputStream class and pass the required excel file
		// location to its constructor
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Rishi1 workbook.xlsx");

		// create an instance of required workbook class and pass FileInputStream
		// instance to its constructor
		Workbook workbook = new XSSFWorkbook(fis);
		System.out.println("Total no of sheets :"+ workbook.getNumberOfSheets());
		
		// print all the sheets name 
		for (int i= 0; i<workbook.getNumberOfSheets(); i++ ) {
			System.out.println("Sheets :"+ workbook.getSheetName(i));
		}
		
		// get the required sheet from excel
		Sheet sheet = workbook.getSheet("Sheet1");
		
		// get specific row from the sheet
		Row row = sheet.getRow(1);

		// create cell to update the data
		Cell cell = row.createCell(3);
		cell.setCellValue("Fail ok");

		// To store the updated data find the location to save the file
		FileOutputStream fos = new FileOutputStream("src\\test\\resources\\Rishi1 workbook.xlsx");
		
		// to write the content in the required file
		workbook.write(fos);
		// to close the connection 
		fos.close();
		System.out.println("File updated");
		
	}
}
