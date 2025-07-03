package utilities;
 
import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;
 
import org.apache.poi.ss.usermodel.CellStyle;

import org.apache.poi.ss.usermodel.FillPatternType;

import org.apache.poi.ss.usermodel.IndexedColors;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import org.apache.poi.ss.usermodel.*;
 
public class ExcelUtils {

	int indRow = 1;

	final int cellResults = 1;

	final int cellRemarks = 2;

	String path = (System.getProperty("user.dir") + "\\testData\\Book1.xlsx");

	//fetching or reading the url from the excel file

	public String getURL() throws IOException {

		//opening the file

		File url = new File(path);

		FileInputStream fis = new FileInputStream(url);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);

		//reading the specific value of the website url

		String urlValue =  sheet.getRow(0).getCell(1).toString();

		wb.close();

		return urlValue;

	}

	//reading the element to search on the website

	public String getSearchElement() throws IOException {

		//opening the file

		File url = new File(path);

		FileInputStream fis = new FileInputStream(url);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);

		//reading the specific value of search element

		String searchElementValue = sheet.getRow(1).getCell(1).toString();

		wb.close();

		return searchElementValue;

	}

	//writing the specific message for the successfully passed test methods

	public void passMethodWithColor(String remark) throws IOException {

		//opening the file

		File url = new File(path);

		FileInputStream fis = new FileInputStream(url);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);

		CellStyle cellStyle = wb.createCellStyle();
 
		// Apply green background to indicate a passed test case

		cellStyle.setFillForegroundColor(IndexedColors.GREEN.getIndex());

		cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		//Setting the pass and remarks value to the excel

		sheet.getRow(indRow).createCell(cellResults).setCellValue("Pass");

		sheet.getRow(indRow).getCell(cellResults).setCellStyle(cellStyle);

		sheet.getRow(indRow).createCell(cellRemarks).setCellValue(remark);

		indRow++;
 
		//Writing to the file

		FileOutputStream fos = new FileOutputStream(path);

		wb.write(fos);

		wb.close();

		fos.close();

	}

	//writing the specific message for the failed test methods

	public void failMethodWithColor(String remark) throws IOException {

		File url = new File(path);

		FileInputStream fis = new FileInputStream(url);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);

		CellStyle cellStyle = wb.createCellStyle();

		// Apply red background to indicate a failed test case

		cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());

		cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		//Setting the fail and remarks value to the excel

		sheet.getRow(indRow).createCell(cellResults).setCellValue("Fail");

		sheet.getRow(indRow).getCell(cellResults).setCellStyle(cellStyle);

		sheet.getRow(indRow).createCell(cellRemarks).setCellValue(remark);

		indRow++;
 
		//Writing to the file

		FileOutputStream fos = new FileOutputStream(path);

		wb.write(fos);

		wb.close();

		fos.close();

	}

	public int getLastCellNum() throws IOException{

		File url = new File(path);

		FileInputStream fis = new FileInputStream(url);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);

		int lastCell = sheet.getRow(indRow).getLastCellNum();

		wb.close();

		return lastCell;

	}

	public String getCellData(int rowNum, int cellNum) throws IOException {

		File url = new File(path);
		FileInputStream fis = new FileInputStream(url);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row = sheet.getRow(rowNum);
		Cell c=row.getCell(cellNum);
		String cellData ="";
		if(c.getCellType()== CellType.NUMERIC)

		{
			long l=(long) c.getNumericCellValue();
			cellData = String.valueOf(l);
		}

		else {
			cellData = c.toString();
		}	

		wb.close();
		return cellData;

	}

}

 