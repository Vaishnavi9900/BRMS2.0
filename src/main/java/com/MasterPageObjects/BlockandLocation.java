package com.MasterPageObjects;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;
import com.aventstack.extentreports.Status;

public class BlockandLocation extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();
   static ExcelUtils excelUtils = new ExcelUtils();
    
    //using the Constants class values for excel file path 
    static String excelFilePath = file;
 

	@FindBy(xpath = "//a[text()=' Block And Location ']") WebElement blockandlocation;
	@FindBy(xpath = "//button[text()=' Create ']") WebElement create;
	@FindBy(xpath = "//img[@class='close']") WebElement close;
	@FindBy(xpath = "(//input[@type='text'])[1]") WebElement block;
	@FindBy(xpath = "(//input[@type='text'])[2]") WebElement location;
	@FindBy(xpath = "(//button[@type='button'])[2]") WebElement add;
	@FindBy(xpath = "//button[text()='Create ']") WebElement create1;
	@FindBy(xpath = "//i[@class='fa fa-pencil']") WebElement edit;
	@FindBy(xpath = "//i[@class='fa fa-trash']") WebElement delete;
	@FindBy(xpath = "//select[@name='DataTables_Table_9_length']") WebElement showentries;
	@FindBy(xpath = "(//tr[@role='row'])[2]") WebElement createdrecord;
	@FindBy(xpath = "//button[text()='Update ']") WebElement update;
	@FindBy(xpath = "(//input[@trim='blur'])[1]") WebElement editblock;
	@FindBy(xpath = "(//input[@trim='blur'])[2]") WebElement editlocation;
	@FindBy(xpath = "//textarea[@trim='blur']") WebElement comments;
	@FindBy(xpath = "//p[text()='Comments is required']") WebElement commentsalert;
	@FindBy(xpath = "//input[@type='checkbox']") WebElement enable;
	@FindBy(xpath = "//button[text()='OK']") WebElement nochangealreadyexistsok;
	@FindBy(xpath = "//button[text()=' Template ']") WebElement template;
	@FindBy(xpath = "//button[text()=' Upload ']") WebElement upload;
	@FindBy(xpath = "//input[@type='search']") WebElement search;
	@FindBy(how = How.XPATH, using = "//button[text()='Yes']") WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()='No'])[2]") WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']") WebElement ok;
	@FindBy(how = How.XPATH, using = "//a[@id='navbarDropdown']") WebElement profile;
	@FindBy(how = How.XPATH, using = "//a[text()=' Logout']") WebElement logout;
	@FindBy(how = How.XPATH, using = "//a[text()='Yes']") WebElement profileyes;
	@FindBy(how = How.XPATH, using = "//button[text()=' No ']") WebElement profileno;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement submit2;
	@FindBy(xpath = "//li[@class='navLink']")
	WebElement menu;
	@FindBy(how =How.XPATH, using ="//a[text()='Masters ']")
	WebElement masters;
	
       public BlockandLocation(WebDriver driver) {
    	  
    	   PageFactory.initElements(driver, this);	
	
       }
       
       public void blocklocationcreate() throws InterruptedException {
    	   try {
			excelUtils.setExcelFile(excelFilePath,"BlockorLocation");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   mouseover(menu);
    	   javawait();
    	   mouseover(masters);
    	   javascript(blockandlocation);
    	   clickElement(create);
    	   clickElement(close);
    	   clickElement(create);
    	   javawait();
    	   clickElement(block);
    	   for(int i=1;i<2;i++) {
    	   block.sendKeys(excelUtils.getCellData(i, 0));
    	   clickElement(location);
    	   location.sendKeys(excelUtils.getCellData(i, 1));
    	   clickElement(add);
    	   javawait();
    	   clickElement(delete);
    	   clickElement(location);
    	   location.sendKeys(excelUtils.getCellData(i, 1));
    	   clickElement(add);
    	   clickElement(create1);
       }
       }
       public void existedblockloactioncreation() throws InterruptedException, IOException {
    	   excelUtils.setExcelFile(excelFilePath,"BlockorLocation");
    	   javascript(blockandlocation);
    	   javawait();
    	   clickElement(create);
    	   for(int i=1;i<2;i++) {
    	    	  
        	   block.sendKeys(excelUtils.getCellData(i, 0));
        	   clickElement(location);
        	   location.sendKeys(excelUtils.getCellData(i, 1));
        	   clickElement(add);
        	   clickElement(create1);
    	       javawait();
    	  if(nochangealreadyexistsok.isDisplayed()) {
    		  
    		  extenttest.log(Status.PASS, "this record is already existed, so already exist condition is working fine");
    		 System.out.println("this record is already existed");
    		 clickElement(nochangealreadyexistsok);
    		 clickElement(close);
    	  }else throw new RuntimeException("already existed condition has been failed");
       }
       }
       
       public void existedconditionforblockcreation() throws IOException, InterruptedException {
    	   excelUtils.setExcelFile(excelFilePath,"BlockorLocation");
    	   javascript(blockandlocation);
    	   clickElement(create);
    	   for (int i = 1; i <2; i++) {
			textbox(block, excelUtils.getCellData(i, 0));
			textbox(location, excelUtils.getCellData(i, 3));
			clickElement(add);
			clickElement(create1);
			if(nochangealreadyexistsok.isDisplayed())
				extenttest.log(Status.PASS, "Expected already condition is working fine in creation");
			else
				extenttest.log(Status.FAIL, "Expected already condition is not working fine in creation");
		}
    	   
       }
       public void addanotherblockinedit(String comm) throws IOException, InterruptedException {
    	   excelUtils.setExcelFile(excelFilePath,"BlockorLocation");
    	   javascript(blockandlocation);
    	   clickElement(search);
    	   for (int i = 1; i <2; i++) {
			textbox(search, excelUtils.getCellData(i, 0));
			clickElement(createdrecord);
			textbox(comments, comm);
			clickElement(update);
			clickElement(nochangealreadyexistsok);
            javascript(editlocation);
			editlocation.sendKeys(excelUtils.getCellData(i, 4));
			javawait();
			clickElement(add);
			clickElement(update);
		}
    	   
       }
       
       public void blocklocationedit(String comm) throws InterruptedException, IOException {
    	   excelUtils.setExcelFile(excelFilePath,"BlockorLocation");
    	   javascript(blockandlocation);
    	   clickElement(search);
    	   for(int i=1;i<4;i=i+3) {
    	   search.sendKeys(excelUtils.getCellData(i, 0));
    	   javawait();
    	   clickElement(createdrecord);
    	   clickElement(update);
    	   softassert.assertEquals(commentsalert.getText(), "Comments is required");
    	   javawait();
    	   clickElement(edit);
    	   clickElement(location);
    	   location.clear();
    	   location.sendKeys(excelUtils.getCellData(i, 3));
    	   clickElement(add);
    	   javawait();
    	   textbox(comments, comm);
    	   clickElement(update);
    	   }	   
       }
       
       public void blocklocationdisableenable(String comm) throws InterruptedException, IOException {
    	   excelUtils.setExcelFile(excelFilePath,"BlockorLocation");
    	   javascript(blockandlocation);
    	   clickElement(search);
    	   for(int i=1;i<2;i++) {
    	   search.sendKeys(excelUtils.getCellData(i, 0));
    	   clickElement(createdrecord);
    	   javawait();
    	   clickElement(update);
    	   softassert.assertEquals(commentsalert.getText(), "Comments is required");
    	   textbox(comments, comm);
    	   clickElement(enable);
    	   clickElement(update);
    	   }
       }
       public void createactivity(String pass) throws InterruptedException {
			
			clickElement(No);
			javawait();
			clickElement(create1);
			clickElement(Yes);
			textbox(password, pass);
			clickElement2(submit2,Keys.ENTER);
			javawait();
		}
	    public void createactivity2(String pass) throws InterruptedException {

		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement2(submit2,Keys.ENTER);
		javawait();
	     }
	    
	    public void updateactivity(String pass) throws InterruptedException {
			
			javascript(No);
			javawait();
			javascript(update);
			clickElement(Yes);
			javawait();
			textbox(password, pass);
			clickElement2(submit2, Keys.ENTER);
			clickElement(ok);
		}
	    
	    public void logout() throws InterruptedException {
	    	clickElement(profile);
	    	clickElement(logout);
	    	javawait();
	    	clickElement(profileno);
	    	clickElement(profile);
	    	javawait();
	    	clickElement(logout);
	    	clickElement(profileyes);
	    }
       
	
}
