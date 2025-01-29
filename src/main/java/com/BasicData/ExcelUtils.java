package com.BasicData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.google.common.collect.Table.Cell;

public class ExcelUtils extends BRMSCommonMethods {
	
	private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;
    private static XSSFRow row;
    private static XSSFCell cell;

   public void setExcelFile(String excelFilePath,String sheetName) throws IOException {
       //Create an object of File class to open xls file
       File file =    new File(excelFilePath);
       
       //Create an object of FileInputStream class to read excel file
       FileInputStream inputStream = new FileInputStream(file);
       
       //creating workbook instance that refers to .xls file
       workbook=new XSSFWorkbook(inputStream);
       
       //creating a Sheet object
        sheet=workbook.getSheet(sheetName);

   }

    public String getCellData(int rowNumber,int cellNumber){
       //getting the cell value from rowNumber and cell Number
        cell =sheet.getRow(rowNumber).getCell(cellNumber);
        
        //returning the cell value as string
        return cell.getStringCellValue();
    }

    public int getRowCountInSheet(){
       int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
       return rowcount;
    }

    public void setCellValue(int rowNum,int cellNum,String cellValue,String excelFilePath) throws IOException {
    	//creating a new cell in row and setting value to it      
    	sheet.getRow(rowNum).createCell(cellNum).setCellValue(cellValue);
        
    	FileOutputStream outputStream = new FileOutputStream(excelFilePath);
    	workbook.write(outputStream);
    }
    
    public void writecellvalue(String excelFilepath, String sheet, String value) throws IOException {
    	FileInputStream fs = new FileInputStream(excelFilepath);
    	XSSFWorkbook wb = new XSSFWorkbook(fs);
    	XSSFSheet sheet1 = wb.getSheet(sheet);
    	int lastRow = sheet1.getLastRowNum();
    	for(int i=1; i<2; i++){
    	XSSFRow row = sheet1.getRow(i);
    	XSSFCell cell = row.createCell(14);

    	cell.setCellValue(value);
    	}
    	FileOutputStream fos = new FileOutputStream(excelFilepath);
    	wb.write(fos);
    	fos.close();

    	}
    	public void writecellvalue2(String excelFilepath, String sheet, String value) throws IOException {
        	FileInputStream fs = new FileInputStream(excelFilepath);
        	XSSFWorkbook wb = new XSSFWorkbook(fs);
        	XSSFSheet sheet1 = wb.getSheet(sheet);
        	int lastRow = sheet1.getLastRowNum();
        	for(int i=2; i<3; i++){
        	XSSFRow row = sheet1.getRow(i);
        	XSSFCell cell = row.createCell(13);

        	cell.setCellValue(value);

        	}

    	FileOutputStream fos = new FileOutputStream(excelFilepath);
    	wb.write(fos);
    	fos.close();
    	}

}
