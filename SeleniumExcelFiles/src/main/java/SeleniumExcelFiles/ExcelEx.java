package SeleniumExcelFiles;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelEx {

	//private static final int ColCount = null;
	static  String excelpath;
	static XSSFWorkbook workbook ;
	static XSSFSheet sheet;

	public ExcelEx(String excelpath,String sheetName) {
		try {
			excelpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelpath+ "/Excel.xlsx/Excelsht2.xlsx");
			sheet = workbook .getSheet(sheetName);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		//RowCount();
		//getcellData(0,0);
		getcellDataNumeric();

	}
	public static int RowCount() {
		//public static void RowCount() throws IOException {
		int rowCount = 0;
		//String excelpath = System.getProperty("user.dir");
		//XSSFWorkbook workbook = new XSSFWorkbook(excelpath + "/Excel.xlsx/Excelsht2.xlsx");
		//XSSFSheet sheet = workbook .getSheet("Sheet1");
		//int rowcount = sheet.getPhysicalNumberOfRows();
		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows : " +rowCount);
		return rowCount;
	}
	public static int ColCount() {
		int ColCount = 0;
		//int colcount = ((Object) sheet).getPhsicalNumberOfCells();

		//XSSFRow  row  = sheet.getRow(0);
		//int cellcount = row.getPhysicalNumberOfCells();
		ColCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("no of cols :" +ColCount);

		return ColCount;

	}
	public  String  getcellData(int rowNum,int colNum) {
		//public static void getcellData(int rowNum,int colNum) {
		String cellData = null;
		//String cellData2 = null;
		try {

			//String excelpath = System.getProperty("user.dir");
				//workbook = new XSSFWorkbook(excelpath + "/Excel.xlsx/Excelsht2.xlsx");
				//sheet = workbook .getSheet("Sheet1");

			//String celldata1 =  sheet.getRow(0).getCell(0).getStringCellValue();
			//String celldata1 =  sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			cellData =  sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println("cell data : "+cellData);
			//return cellData;
			//String celldata2 =  sheet.getRow(0).getCell(1).getStringCellValue();
			//cellData2 =  sheet.getRow(0).getCell(1).getStringCellValue();
			//System.out.println("cell data : "+cellData2);
		} catch (Exception e) {
//			 TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cellData; //cellData2;
		//return cellData2;


	}


	public static void getcellDataNumeric() {
		try {

			String excelpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelpath + "/Excel.xlsx/Excelsht2.xlsx");
			sheet = workbook .getSheet("Sheet1");

			double celldata1 =  sheet.getRow(6).getCell(0).getNumericCellValue();
			System.out.println("cell data : "+celldata1);

			//double celldata2 =  sheet.getRow(6).getCell(6).getNumericCellValue();
			//	System.out.println("cell data : "+celldata2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}


}
