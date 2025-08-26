package com.MasterPageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;
import com.aventstack.extentreports.Status;

public class ModeofPacking extends BRMSCommonMethods {
	
	SoftAssert softassert = new SoftAssert();
	   static ExcelUtils excelUtils = new ExcelUtils();
	    
	    //using the Constants class values for excel file path 
	    static String excelFilePath = file;

	
	@FindBy(how = How.XPATH, using = "//a[text()=' Mode Of Pack ']") WebElement mop;
	@FindBy(how = How.XPATH, using = "//button[text()=' Create ']") WebElement create;
	@FindBy(how = How.XPATH, using = "//img[@class='close']") WebElement close;
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[1]") WebElement mop1;
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[2]") WebElement packstyle;
	@FindBy(how = How.XPATH, using = "//input[@type='search']") WebElement search;
	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[2]") WebElement add;
	@FindBy(how = How.XPATH, using = "//button[text()='Create ']") WebElement create1;
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-pencil']") WebElement edit;
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-trash']") WebElement delete;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]") WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()='Update ']") WebElement update;
	@FindBy(how = How.XPATH, using = "(//input[@trim='blur'])[1]") WebElement editmop1;
	@FindBy(how = How.XPATH, using = "(//input[@trim='blur'])[2]") WebElement editpackstyle;
	@FindBy(how = How.XPATH, using = "//textarea[@trim='blur']") WebElement comments;
	@FindBy(how = How.XPATH, using = "//p[text()='Comments is required']") WebElement commentsalert;
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']") WebElement enable;
	@FindBy(how = How.XPATH, using = "//button[text()='OK']") WebElement nochangealreadyexistsok;
	@FindBy(how = How.XPATH, using = "//button[text()=' Template ']") WebElement template;
	@FindBy(how = How.XPATH, using = "//button[text()=' Upload ']") WebElement upload;
	@FindBy(how = How.XPATH, using = "//button[text()='Yes']") WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()='No'])[2]") WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement submit2;
	
	 public ModeofPacking(WebDriver driver) {
		    
		 PageFactory.initElements(driver, this);	
		
	       }
	       
	       public void mopcreate() throws InterruptedException, IOException {
	    	   excelUtils.setExcelFile(excelFilePath,"Modeofpacking");
	    	   javascript(mop);
	    	   clickElement(create);
	    	   clickElement(close);
	    	   clickElement(create);
	    	   clickElement(mop1);
	    	   for(int i=1;i<2;i++) {
	        	   mop1.sendKeys(excelUtils.getCellData(i, 0));
	    	   clickElement(packstyle);
	    	   packstyle.sendKeys(excelUtils.getCellData(i, 1));
	    	   clickElement(add);
	    	   clickElement(delete);
	    	   clickElement(packstyle);
	    	   packstyle.sendKeys(excelUtils.getCellData(i, 1));
	    	   clickElement(add);
	    	   clickElement(create1);
	    	   }
	       }
	       
	       public void existedmopcreation() throws InterruptedException, IOException {
	    	   excelUtils.setExcelFile(excelFilePath,"Modeofpacking");
	    	   javascript(mop);
	    	   clickElement(create);
	    	   clickElement(mop1);
	    	   for(int i=1;i<2;i++) {
	        	   mop1.sendKeys(excelUtils.getCellData(i, 0));
	    	   clickElement(packstyle);
	    	   packstyle.sendKeys(excelUtils.getCellData(i, 1));
	    	   clickElement(add);
	    	   clickElement(create1);
	    		  if(nochangealreadyexistsok.isDisplayed()) {
	    	    		 System.out.println("this record is already existed");
	    	    		 extenttest.log(Status.PASS, "Already exist condition is working fine");
	    	    		 clickElement(nochangealreadyexistsok);
	    	    		 clickElement(close);
	    	    	  }else {
	    	    		extenttest.log(Status.FAIL,"Already exist condition is not working fine");
	    	    	  }
	       }
	       }
	       
	       public void existedconditionformopcreation() throws IOException, InterruptedException {
	    	   excelUtils.setExcelFile(excelFilePath,"Modeofpacking");
	    	   javascript(mop);
	    	   clickElement(create);
	    	   for (int i = 1; i <2; i++) {
				textbox(mop1, excelUtils.getCellData(i, 0));
				textbox(packstyle, excelUtils.getCellData(i, 3));
				clickElement(add);
				clickElement(create1);
				if(nochangealreadyexistsok.isDisplayed())
					extenttest.log(Status.PASS, "Expected already condition is working fine in creation");
				else
					extenttest.log(Status.FAIL, "Expected already condition is not working fine in creation");
			}
	    	   
	       }
	       public void addanothermopinedit(String comm) throws IOException, InterruptedException {
	    	   excelUtils.setExcelFile(excelFilePath,"Modeofpacking");
	    	   javascript(mop);
	    	   clickElement(search);
	    	   for (int i = 1; i <2; i++) {
				textbox(search, excelUtils.getCellData(i, 0));
				clickElement(createdrecord);
				textbox(comments, comm);
				clickElement(update);
				clickElement(nochangealreadyexistsok);
				javascript(editpackstyle);
				editpackstyle.sendKeys(excelUtils.getCellData(i, 4));
				clickElement(add);
				javawait();
				clickElement(update);
			}
	    	   
	       }
	       
	       
	       public void mopupdate(String comm) throws InterruptedException, IOException {
	    	   excelUtils.setExcelFile(excelFilePath,"Modeofpacking");
	    	   javascript(mop);
	    	   clickElement(search);
	    	   for(int i=1;i<2;i++) {
	    		   search.sendKeys(excelUtils.getCellData(i, 2));
	    	   clickElement(createdrecord);
	    	   clickElement(update);
	    	  softassert.assertEquals(commentsalert.getText(), "Comments is required");
	    	   clickElement(edit);
	    	   clickElement(mop1);
	    	   mop1.clear();
	    	   mop1.sendKeys(excelUtils.getCellData(i, 2));
	    	   clickElement(packstyle);
	    	   packstyle.clear();
	    	   packstyle.sendKeys(excelUtils.getCellData(i, 3));
	    	   clickElement(add);
	    	   textbox(comments, comm);
	    	   javawait();
	    	   clickElement(update);
	    	   }
	       }
	       
	       public void mopdisableenableZ(String comm) throws InterruptedException, IOException {
	    	   excelUtils.setExcelFile(excelFilePath,"Modeofpacking");
	    	   javascript(mop);
	    	   clickElement(search);
	    	   for(int i=1;i<2;i++) {
	    		   search.sendKeys(excelUtils.getCellData(i, 2));
	    	   clickElement(createdrecord);
	    	   clickElement(update);
	    	   softassert.assertEquals(commentsalert.getText(), "Comments is required");
	    	   textbox(comments, comm);
	    	   clickElement(enable);
	    	   javawait();
	    	   clickElement(update);
	    	   }
	       }
	       public void createactivity(String pass) throws InterruptedException {
				
				clickElement(No);
				clickElement(create1);
				clickElement(Yes);
				javawait();
				textbox(password, pass);
				clickElement(submit2);
				javawait();
				refresh();
			}
		    public void createactivity2(String pass) throws InterruptedException {

			clickElement(Yes);
			textbox(password, pass);
			clickElement(submit2);
			javawait();
			refresh();
		     }
		    
		    public void updateactivity(String pass) throws InterruptedException {
				
				clickElement(No);
				clickElement(update);
				clickElement(Yes);
				javawait();
				textbox(password, pass);
				clickElement(submit2);
				javawait();
				refresh();
			}
	       


}
