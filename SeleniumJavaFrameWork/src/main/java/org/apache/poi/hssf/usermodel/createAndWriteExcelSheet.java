package org.apache.poi.hssf.usermodel;



import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;


public class createAndWriteExcelSheet{
	
	public static void main(String args[]) throws IOException {
		
	
	HSSFWorkbook workbook = new HSSFWorkbook();
	
	HSSFSheet  sheet =  workbook.createSheet("Sheet1");
	sheet.createRow(0);
	sheet.getRow(0).createCell(0).setCellValue("selenium webdriver");
	sheet.getRow(0).createCell(0).setCellValue("selenium automation");
	
	sheet.createRow(1);
	sheet.getRow(1).createCell(1).setCellValue("ExcelSheet");
	sheet.getRow(1).createCell(1).setCellValue("selenium.dev");
	
	//File file = new File("C:\\Users\\Bharg\\eclipse-workspace\\SeleniumJavaFrameWork\\ExcelFiles\\Test.xlsx");
	FileOutputStream fileOut = new FileOutputStream(new File("C:/Users/Bharg/eclipse-workspace/SeleniumJavaFrameWork/ExcelFiles/Test.xlsx"));
	workbook.write(fileOut);
	workbook.close();
	
	
}
}