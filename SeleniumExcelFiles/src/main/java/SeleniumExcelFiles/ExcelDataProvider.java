package SeleniumExcelFiles;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

	@Test(dataProvider = "testData")
	public void test1(String UserName,String Password) {
		System.out.println(UserName+"  | "+Password);


	}

		 @DataProvider(name= "testData")
		 public Object getData() {
			 String projectpath = "C:\\Users\\Bharg\\eclipse-workspace\\Selenium.ExcelFiles\\Excel.xlsx\\Excelsht2.xlsx";
			Object data = xlDataprovider(projectpath,"Sheet1");
					return data;
		 }


	public Object xlDataprovider(String excelpath,String sheetName) {

		ExcelEx ex = new ExcelEx(excelpath,sheetName);

		int rowCount = ExcelEx.RowCount();
		int colCount = ExcelEx.ColCount();

	// object data[][] = new object[rowCount-1][colCount];

		for(int i = rowCount; i<rowCount; i++)
		{
			for (int j= colCount; j<colCount; j++)
			{

			//String cellData = ex.getcellData(i,j);
				//System.out.print(cellData+"  |  ");
			}
			String cellData = ex.getcellData(0,0);
			System.out.print(cellData+"  |  ");

			//System.out.println();

		}
		return colCount;

	}}





