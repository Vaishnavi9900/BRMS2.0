package com.BasicData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviders {
	
	 public String file = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";
	 
	 @DataProvider(name="usercreation")
	public String[][] usercreation() throws IOException{
		 
		 File filepath = new File(file);
		 FileInputStream fis = new FileInputStream(filepath);
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheet("usercreation");
		 int rows = sheet.getPhysicalNumberOfRows();
		 int cols = sheet.getRow(0).getLastCellNum();
		 String[][] data = new String[rows-1][cols];
		 for (int i = 0; i < rows-1; i++) {
			 for (int j = 0; j < cols; j++) {
				 
				 DataFormatter df = new DataFormatter();
				 data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			}
			
		}
		 workbook.close();
		 fis.close();
		 
		return data;
		
	}

}
