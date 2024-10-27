package SeleniumExcelFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.bouncycastle.asn1.ASN1Object;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderUsingExcelandTestNg {

	//private static final String String = null;
	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.navigate().to("http://google.com");

		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(dataProvider = "searchdataprovider")
	public void searchMthd(String Urls) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement searchbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		//searchbox.sendKeys(websites);
		//WebElement searchbox = driver.findElement(By.name("//input[@value=\"Google Search\"]"));
		//  searchbox.sendKeys("selenium tutorial");
		searchbox.sendKeys(Urls);

		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	@DataProvider(name = "searchdataprovider")

	public Object[][] searchdataproviderMethod() throws InterruptedException, IOException{



		String filename = "C:\\Users\\Bharg\\eclipse-workspace\\Selenium.ExcelFiles\\Excel.xlsx\\xlsht.xlsx";
		Object[][] obj = getExcelData(filename,"Sheet1");
		//Object[][] obj = new Object[3][1]; //3 rows 1 col
		//obj[0][0] = "http://selenium.dev"; //row =1 col=1
		//Thread.sleep(3000);
		//obj[1][0] =  "http://gfgloginpage.com";  //row =2 col =1
		//Thread.sleep(2000);
		//obj[2][0] = "http://javatpointwebpage.com";  // row =3 col = 1
		//Thread.sleep(2000);

		return obj;
	}
	public Object[][] getExcelData(String filename,String sheetName) throws IOException
	{
		//declaring array
		Object[][] data = null;

		// opening the file to read the input from the excel sheet
		try {
			FileInputStream fis = new FileInputStream(filename);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetName);

			//get  total no of rows
			int ttlrows = sheet.getLastRowNum()+1;

			//get ttl no of cells
			int ttlcells = sheet.getRow(0).getLastCellNum();

			//initialising array
			data = new String[ttlrows-1][ttlcells];

			for(int curtrow = 1; curtrow < ttlrows; curtrow ++)// outer for loop
			{
				for(int curtcell = 0; curtcell < ttlcells ; curtcell ++)    //inner for loop
				{
					data[curtrow-1][curtcell] = sheet.getRow(curtrow).getCell(curtcell).getStringCellValue();
				}

			}
			workbook.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;

	}
	@AfterMethod
	public void teardown() {
		//if (driver != null)
		driver.quit();


	}


}
