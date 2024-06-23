package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading {
//	@Test(priority = 1)
	public void ReadSheetDetails() throws IOException {

		// Create instance of FileInputStream class and pass the required excel file
		// location to its constructor
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Rishi1 workbook.xlsx");

		// Create instance of workbook and pass fis in the constructor
		Workbook workbook = new XSSFWorkbook(fis);
		// total no of sheets
		System.out.println("Total no of sheets :" + workbook.getNumberOfSheets());
		// Print all the sheets present
		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			System.out.println("Sheet's :" + workbook.getSheetName(i));
		}

		// Create instance of sheet present in the workbook
		Sheet sheet = workbook.getSheet("Sheet1");

	}

//	@Test(priority = 2)
	public void GetRowDetails() throws IOException {
		// Standerd code for accessing inside the workbook and sheet and row
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Rishi1 workbook.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Sheet1");

		// Create a instance for row and find total no of rows presnet in the sheet
		// row count in the form of indexing always actual- 1 ex. (10-1)
		int rowcount = sheet.getLastRowNum();
		System.out.println("Total no of row :" + rowcount);

		// get Specific row from the sheet
		Row row = sheet.getRow(4);
	}

//	@Test(priority = 3)
	public void GetCellDetails() throws IOException {
		//// Standerd code for accessing inside the workbook and sheet and row
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Rishi1 workbook.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(0);

		// Get the cell count from the row
		int cellcount = row.getLastCellNum();
		System.out.println("Total no of cells in row 0 : " + cellcount);

		// To get cell data
		Cell cell = row.getCell(3);
		System.out.println("Data in cell 3 of row 0 :" + cell);
		// OR
		System.out.println("Data in cell 3 of row 0 :" + cell.getStringCellValue());

		// Get all cell data from row
		for (int i = 0; i < cellcount; i++) {
			System.out.println("all cell data :" + row.getCell(i).getStringCellValue());
		}
	}

//	@Test(priority = 4)
	public void GetAllSheetData() throws IOException {
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Rishi1 workbook.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		// Total no of cells in the row
		int cellcount = row.getLastCellNum();
		System.out.println("Total cells in row 2 :" + cellcount);

		for (int i = 0; i < cellcount; i++) {
			Cell cell = row.getCell(i);
			switch (cell.getCellType()) {
			case (Cell.CELL_TYPE_STRING):
				System.out.println("Cell type String : " + cell.getStringCellValue());
				break;
			case (Cell.CELL_TYPE_BOOLEAN):
				System.out.println("Cell type Blllean :" + cell.getBooleanCellValue());
				break;
			case (Cell.CELL_TYPE_NUMERIC):
				System.out.println("Cell type Numeric :" + cell.getNumericCellValue());
				break;
			case (Cell.CELL_TYPE_BLANK):
				break;
			default:
				System.out.println("Invalid cell details");
				break;
			}
		}
	}

	@Test(priority = 5)
	public void ReadAllSheetData() throws IOException {

		FileInputStream fis = new FileInputStream("src\\\\test\\\\resources\\\\Rishi1 workbook.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		// To get specific row form the sheet

		for (int x = 0; x < sheet.getLastRowNum(); x++) {
			Row row = sheet.getRow(x);

			// to get the cell count from the row
			int cellcount = row.getLastCellNum();
			// to get all the data from the cells in the row
			for (int i = 0; i < cellcount; i++) {
				Cell cell = row.getCell(i);
				switch (cell.getCellType()) {
				case (Cell.CELL_TYPE_STRING):
					System.out.println("Cell type string : " + cell.getStringCellValue());
					break;
				case (Cell.CELL_TYPE_BOOLEAN):
					System.out.println("Cell type boolean " + cell.getBooleanCellValue());
					break;
				case (Cell.CELL_TYPE_NUMERIC):
					System.out.println("Cell type numarik " + cell.getNumericCellValue());
					break;
				case (Cell.CELL_TYPE_BLANK):
					break;
				default:
					System.out.println("Invalid cell details");
					break;
				}
		//		System.out.print(" | ");
			}
	//		System.out.println();
		}
	}
}