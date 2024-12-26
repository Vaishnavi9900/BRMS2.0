package com.MasterPageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;
import com.aventstack.extentreports.Status;

public class UnitOfMeasurement extends BRMSCommonMethods{
	
	SoftAssert softassert = new SoftAssert();
	   static ExcelUtils excelUtils = new ExcelUtils();
	    
	    //using the Constants class values for excel file path 
	    static String excelFilePath = file;
	
	@FindBy(xpath = "//a[text()=' Unit of Measurement ']") WebElement uom;
	@FindBy(xpath = "//button[text()=' Create ']") WebElement create;
	@FindBy(xpath = "//button[@type='submit']") WebElement create1;
	@FindBy(xpath = "//p[text()='UOM Name is required']") WebElement uomnamealert;
	@FindBy(xpath = "//p[text()='UOM Code is required']") WebElement uomcodealert;
	@FindBy(xpath = "//img[@class='close']") WebElement close;
	@FindBy(xpath = "(//input[@type='text'])[1]") WebElement uomname;
	@FindBy(xpath = "(//input[@type='text'])[2]") WebElement uomcode;
	@FindBy(xpath = "//input[@type='search']") WebElement search;
	@FindBy(xpath = "(//tr[@role='row'])[2]") WebElement createdrecord;
	@FindBy(xpath = "//p[text()='Comments is required']") WebElement commentalert;
	@FindBy(xpath = "//textarea[@formcontrolname='comments']") WebElement comments;
	@FindBy(xpath = "//input[@type='checkbox']") WebElement enable; 
	@FindBy(xpath = "//button[text()=' Upload ']") WebElement upload;
	@FindBy(xpath = "//button[text()='Yes']") WebElement Yes;
	@FindBy(xpath = "(//button[text()='No'])[2]") WebElement No;
	@FindBy(xpath = "//button[text()='Ok']") WebElement updateok;
	@FindBy(xpath = "//button[@type='submit']") WebElement update;
	@FindBy(xpath = "//button[text()='OK']") WebElement alreadyexistok;
	
	public UnitOfMeasurement(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void uomcreatewithspace() throws InterruptedException {
		javascript(uom);
		javawait();
		clickElement(create);
		javawait();
		clickElement(close);
		javawait();
		clickElement(create);
		javawait();
		clickElement(create1);
		javawait();
		softassert.assertEquals(uomnamealert.getText(), "UOM Name is required");
		javawait();
		softassert.assertEquals(uomcodealert.getText(), "UOM Code is required");
		javawait();
		textbox(uomname, " ");
		javawait();
		textbox(uomcode, " ");
		javawait();
		clickElement(create1);
		if(uomnamealert.isDisplayed() && uomcodealert.isDisplayed()) {
			System.out.println("validations are working fine with space");
			 extenttest.log(Status.PASS, "validationa are working fine with space");
			javawait();
		    clickElement(close);
		}
		else {
			 extenttest.log(Status.FAIL, "validations are not working fine with space");
		}
		
	}
	
	public void uomcreate() throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"UOM");
		javascript(uom);
		javawait();
		clickElement(create);
		javawait();
		clickElement(close);
		javawait();
		clickElement(create);
		javawait();
		clickElement(create1);
		javawait();
		softassert.assertEquals(uomnamealert.getText(), "UOM Name is required");
		javawait();
		softassert.assertEquals(uomcodealert.getText(), "UOM Code is required");
		javawait();
		clickElement(uomname);
		for (int i = 1; i <2; i++) {
			uomname.sendKeys(excelUtils.getCellData(i, 0));
		javawait();
		clickElement(uomcode);
		uomcode.sendKeys(excelUtils.getCellData(i, 1));
		javawait();
		clickElement(create1);
		}
	}
	
	public void existeduomcreate() throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"UOM");
		javascript(uom);
		javawait();
		clickElement(create);
		javawait();
		clickElement(create1);
		javawait();
		softassert.assertEquals(uomnamealert.getText(), "UOM Name is required");
		javawait();
		softassert.assertEquals(uomcodealert.getText(), "UOM Code is required");
		javawait();
		clickElement(uomname);
		for (int i = 1; i <2; i++) {
			uomname.sendKeys(excelUtils.getCellData(i, 0));
		javawait();
		clickElement(uomcode);
		uomcode.sendKeys(excelUtils.getCellData(i, 1));
		javawait();
		clickElement(create1);
		javawait();
		 if(alreadyexistok.isDisplayed()) {
    		 System.out.println("this record is already existed");
    		 extenttest.log(Status.PASS, "Already exist condition is working fine");
    		 javawait();
    		 clickElement(alreadyexistok);
    		 javawait();
    		 clickElement(close);
    	  }else {
    		 extenttest.log(Status.FAIL, "Already exist condition is not working fine");
    	  }
		}
	}
	
	public void uomupdatewithspace() throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"UOM");
		javascript(uom);
		clickElement(search);
		for (int i = 1; i <2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 0));
		javawait();
    	clickElement(createdrecord);
    	javawait();
    	clickElement(update);
    	javawait();
    	softassert.assertEquals(commentalert.getText(), "Comments are required");
    	javawait();
    	textboxc(uomname, " ");
    	javawait();
    	textboxc(uomcode, " ");
    	javawait();
    	textbox(comments, "");
    	javawait();
    	clickElement(update);
    	javawait();
    	if(uomnamealert.isDisplayed() ||commentalert.isDisplayed()  || uomcodealert.isDisplayed()) {
    		System.out.println("validation is working fine with comments space(uom name, code & comments)");
    		 extenttest.log(Status.PASS, "validation is working fine with comments space(uom name, code & comments)");
    		javawait();
    		clickElement(close);
    	}
    	else throw new RuntimeException("validations are not working with space(uom name, code & comments)");
		}
	}
	
	public void uomupdate(String comm) throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"UOM");
		javascript(uom);
		clickElement(search);
		for (int i = 1; i <2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 0));
		javawait();
    	clickElement(createdrecord);
    	javawait();
    	clickElement(update);
    	javawait();
    	softassert.assertEquals(commentalert.getText(), "Comments are required");
    	javawait();
    	clickElement(uomname);
    	uomname.clear();
    	uomname.sendKeys(excelUtils.getCellData(i, 2));
    	javawait();
    	clickElement(uomcode);
    	uomcode.clear();
    	uomcode.sendKeys(excelUtils.getCellData(i, 3));
    	javawait();
    	textbox(comments, comm);
    	javawait();
    	clickElement(update);
		}
	}
	
	public void uomdisableenable(String comm) throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"UOM");
		javascript(uom);
		clickElement(search);
		for (int i = 1; i <2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 2));
		javawait();
    	clickElement(createdrecord);
    	javawait();
    	clickElement(update);
    	javawait();
    	softassert.assertEquals(commentalert.getText(), "Comments are required");
    	javawait();
    	textbox(comments, comm);
    	javawait();
    	clickElement(enable);
    	clickElement(update);	
		}
	}
    public void updateactivity() throws InterruptedException {
		
		clickElement(No);
		javawait();
		clickElement(update);
		javawait();
		clickElement(Yes);
		javawait();
		clickElement(updateok);
	}
    public void updateactivity2() throws InterruptedException {

	clickElement(Yes);
	javawait();
	clickElement(updateok);
     }
public void createactivity() throws InterruptedException {
		
		clickElement(No);
		javawait();
		clickElement(create1);
		javawait();
		clickElement(Yes);
		javawait();
		clickElement(updateok);
	}
    public void createactivity2() throws InterruptedException {

	clickElement(Yes);
	javawait();
	clickElement(updateok);
     }

}
