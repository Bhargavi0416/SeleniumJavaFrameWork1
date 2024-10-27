package SeleniumExcelFiles;

import java.io.IOException;

public class ExcelExClass {

	public static void main(String[] args) throws IOException {

		String excelpath = System.getProperty("user.dir");

		ExcelEx excel = new ExcelEx( excelpath + "/Excel.xlsx/Excelsht2.xlsx","Sheet1");

		ExcelEx.RowCount();

		ExcelEx.ColCount();
		excel.getcellData(0, 1);

		//excel.getcellDataNumeric();
	}


}
