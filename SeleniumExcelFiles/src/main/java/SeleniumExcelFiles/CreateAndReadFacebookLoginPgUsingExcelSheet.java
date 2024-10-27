package SeleniumExcelFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAndReadFacebookLoginPgUsingExcelSheet {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook .createSheet("FaceBookExcelSheet");
		XSSFRow headerrow = sheet.createRow(0);

		headerrow.createCell(0).setCellValue("Username");
		headerrow.createCell(1).setCellValue("PassWord");

		XSSFRow datarow1 = sheet.createRow(1);

		datarow1.createCell(0).setCellValue("bhargavi12@gmail.com");
		datarow1.createCell(1).setCellValue("0987634");

		XSSFRow datarow2 = sheet.createRow(2);

		datarow2.createCell(0).setCellValue("slbhargavi08.com");
		datarow2.createCell(1).setCellValue("12345");

		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Bharg\\eclipse-workspace\\Selenium.ExcelFiles\\Excel.xlsx\\FacebookExcelsht.xlsx");
			workbook.write(fos);
			workbook.close();
			fos.close();
			System.out.println(" FaceBook excel sheet is created succeccfully !" );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

//		try {
//			FaceBookExcelShtReader();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		FaceBookExcelShtReader();
		}

	public static void FaceBookExcelShtReader() throws InterruptedException  {

		try {
			FileInputStream fis = new FileInputStream("C:/Users/Bharg/eclipse-workspace/Selenium.ExcelFiles/Excel.xlsx/FacebookExcelsht.xlsx/");
			XSSFWorkbook workbook;
			try {
				workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook .getSheetAt(0);
				sheet = workbook.getSheet("FaceBookExcelSheet");

				int rowcount = sheet.getPhysicalNumberOfRows();
				for(int rownum = 1; rownum<rowcount; rownum++)
				{
					String Username = sheet.getRow(rownum).getCell(0).getStringCellValue();
					String Password = sheet.getRow(rownum).getCell(1).getStringCellValue();
					System.out.println(Username +" "+ Password);

					driver = new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					driver.navigate().to("https://facebook.com");

					driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Username);
					driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Password);

					//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				/////	WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='loginbutton']")));
				//	loginButton.click();
					WebElement ele = driver.findElement(By.xpath("//button [@name=\"login\"]"));
					ele.click();

					Thread.sleep(3000);
					driver.close();
					driver.quit();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

}
