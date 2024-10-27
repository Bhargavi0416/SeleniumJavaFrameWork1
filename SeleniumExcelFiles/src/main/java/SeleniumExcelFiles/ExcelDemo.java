package SeleniumExcelFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook .createSheet("sheet 1");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("selenium webdriver");
		sheet.getRow(0).createCell(0).setCellValue("selenium automation");

		sheet.createRow(1);
		sheet.getRow(1).createCell(1).setCellValue("ExcelSheet");
		sheet.getRow(1).createCell(1).setCellValue("selenium.dev");


		OutputStream file = new FileOutputStream("C:\\Users\\Bharg\\eclipse-workspace\\Selenium.ExcelFiles\\Excel.xlsx\\Test.xlsx");
		workbook.write(file);
		workbook.close();

	}

	}


