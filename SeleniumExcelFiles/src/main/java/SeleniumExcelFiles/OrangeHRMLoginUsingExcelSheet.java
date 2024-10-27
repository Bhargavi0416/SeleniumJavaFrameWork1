package SeleniumExcelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLoginUsingExcelSheet {


	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static WebDriver driver;
	static String ProjectPath;

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {


		//ProjectPath = System.getProperty("User dir");
	//	System.out.println(ProjectPath);
	//	File file = new File("C:\\Users\\Bharg\\eclipse-workspace\\Selenium.ExcelFiles\\Excel.xlsx\\Test1.xlsx");
	//	FileInputStream fis = new FileInputStream(file);

		try {
			//ProjectPath = System.getProperty("User dir");
			//System.out.println(ProjectPath);
			//workbook = new XSSFWorkbook(ProjectPath+File.separator+"Excel.xlsx"+File.separator+"Test1.xlsx");
			File file = new File("C:\\Users\\Bharg\\eclipse-workspace\\Selenium.ExcelFiles\\Excel.xlsx\\Test1.xlsx");
			FileInputStream fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet("sheet1");
			int rowcount = sheet.getPhysicalNumberOfRows();
			for(int rownum = 1; rownum<rowcount; rownum++)
			{
				String Username = sheet.getRow(rownum).getCell(0).getStringCellValue();
				String Password = sheet.getRow(rownum).getCell(1).getStringCellValue();
				System.out.println(Username +" "+ Password);
				//WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.navigate().to("https://opensource-demo.orangehrmlive.com/auth/login");

				driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);
				driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(Password);
				driver.findElement(By.xpath("//button[@type='submit']")).click();

				Thread.sleep(3000);
				driver.close();
				driver.quit();

			}


		} catch (IOException e) {

			e.printStackTrace();
		}



	}

}
