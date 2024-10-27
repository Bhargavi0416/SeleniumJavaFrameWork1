package SeleniumExcelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	public static void main(String[] args) throws IOException {

		//getreadData();

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook .createSheet("sheet1");
		XSSFRow headerrow = sheet.createRow(0);

		headerrow.createCell(0).setCellValue("webLocater");
		headerrow.createCell(1).setCellValue("keyBoard keys");
		headerrow.createCell(2).setCellValue("TestNg Annotations");
		headerrow.createCell(3).setCellValue("get Methods");
		headerrow.createCell(4).setCellValue("set operation");

		XSSFRow datarow1 = sheet.createRow(1);

		datarow1.createCell(0).setCellValue("By.id");
		datarow1.createCell(1).setCellValue("ENTER");
		datarow1.createCell(2).setCellValue("@BeforeTest");
		datarow1.createCell(3).setCellValue("get.pageload");
		datarow1.createCell(4).setCellValue("setsize()");

		XSSFRow datarow2 = sheet.createRow(2);

		datarow2.createCell(0).setCellValue("By.xpath");
		datarow2.createCell(1).setCellValue("RETURN");
		datarow2.createCell(2).setCellValue("@BeforeSuite");
		datarow2.createCell(3).setCellValue("get.url");
		datarow2.createCell(4).setCellValue("submit()");

		XSSFRow datarow3 = sheet.createRow(3);

		datarow3.createCell(0).setCellValue("By.text");
		datarow3.createCell(1).setCellValue("ARROW_DOWN");
		datarow3.createCell(2).setCellValue("@AfterTest");
		datarow3.createCell(3).setCellValue("get.currenturl");
		datarow3.createCell(4).setCellValue("click()");

		XSSFRow datarow4 = sheet.createRow(4);

		datarow4.createCell(0).setCellValue("By.className");
		datarow4.createCell(1).setCellValue("ARROW_UP");
		datarow4.createCell(2).setCellValue("@Test");
		datarow4.createCell(3).setCellValue("get.Title");
		datarow4.createCell(4).setCellValue("close()");


		FileOutputStream fis = new FileOutputStream("C:\\Users\\Bharg\\eclipse-workspace\\Selenium.ExcelFiles\\Excel.xlsx\\ExcelSheet1.xlsx");

		try {
			workbook.write(fis);
			System.out.println("excel sheet is created successfully!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getreadData();
	}
	public  static void  getreadData() throws IOException {

		File file = new File("C:\\Users\\Bharg\\eclipse-workspace\\Selenium.ExcelFiles\\Excel.xlsx\\ExcelSheet1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook .getSheetAt(0);
		String cellValue =   sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellValue);

		String cellValue2 =   sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(cellValue2);

		String cellValue3 =   sheet.getRow(0).getCell(2).getStringCellValue();
		System.out.println(cellValue3);

		String cellValue4 =   sheet.getRow(0).getCell(3).getStringCellValue();
		System.out.println(cellValue4);

	//	XSSFSheet sheet4 = workbook .getSheetAt(0);
		String cellValue5 =   sheet.getRow(0).getCell(4).getStringCellValue();
		System.out.println(cellValue5);

		 String secondRowFirstCellValue = sheet.getRow(1).getCell(0).getStringCellValue();
	     System.out.println("Second row, first cell value: " + secondRowFirstCellValue);

		workbook.close();
		fis.close();


	}
}


