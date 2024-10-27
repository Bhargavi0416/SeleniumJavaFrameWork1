package SeleniumExcelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTableReader {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Bharg\\eclipse-workspace\\Selenium.ExcelFiles\\Excel.xlsx\\ExcelSheet1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook .getSheetAt(0);
		String cellValue =   sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellValue);


		int rowcount = sheet.getPhysicalNumberOfRows();
		for(int i =0; i<rowcount; i++)
		{
			XSSFRow  row  = sheet.getRow(i);

			int cellcount = row.getPhysicalNumberOfCells();
			for( int j =0; j<cellcount; j++)
			{
				XSSFCell cell = row.getCell(j);

				String cellvalue = getcellvalue(cell);


				// Loop through each row and print the cell values
				System.out.println("||"  +cellvalue);
			}
			//System.out.println("--------------------------------------------------------------------------------");
			// System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Web Locator", "KeyBoard Keys", "TestNg Annotations", "Get Methods", "Set Operations", "Boolean Values");
			//  System.out.println("------------------------------------------------------------------------------");

			//System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Web Locator", "KeyBoard Keys", "TestNg Annotations", "Get Methods", "Set Operations", "Boolean Values");
			System.out.println("-----------------------------------------------------------------------------------------");
		}
		workbook.close();
		fis.close();
	}
	public static  String getcellvalue(XSSFCell cell) {
		switch(cell.getCellType()){
		case STRING:
			return cell.getStringCellValue();

		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		default:
			return cell.getStringCellValue();

		}
	}
}


