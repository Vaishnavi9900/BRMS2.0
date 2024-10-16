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

public class Strength extends BRMSCommonMethods{
	
	SoftAssert softassert = new SoftAssert();
	   static ExcelUtils excelUtils = new ExcelUtils();
	    
	    //using the Constants class values for excel file path 
	    static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";
	
	@FindBy(xpath = "//a[text()=' Strength ']") WebElement strength;
	@FindBy(xpath = "//button[text()=' Create ']") WebElement create;
	@FindBy(xpath = "//button[@type='submit']") WebElement create1;
	@FindBy(xpath = "//p[text()='Strength is required']") WebElement strengthalert;
	@FindBy(xpath = "//img[@class='close']") WebElement close;
	@FindBy(xpath = "(//input[@type='text'])[1]") WebElement strengthname;
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
	
	
	
	public Strength(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void strengthcreatewithspace() throws InterruptedException {
		javascript(strength);
		javawait();
		clickElement(create);
		javawait();
		clickElement(close);
		javawait();
		clickElement(create);
		javawait();
		clickElement(create1);
		softassert.assertEquals(strengthalert.getText(), "Strength is required");
		textbox(strengthname, " ");
		if(No.isDisplayed() || strengthalert.isDisplayed()) {
			System.out.println("validations are not working fine with space");
			 extenttest.log(Status.FAIL, "validation is not working fine with space");
			clickElement(No);
			javawait();
		    clickElement(close);
		}
		else {
			 extenttest.log(Status.PASS, "validation is working fine with space");
		}
	}
	
	public void strengthcreate() throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"Strength");
		javascript(strength);
		javawait();
		clickElement(create);
		javawait();
		clickElement(close);
		javawait();
		clickElement(create);
		javawait();
		clickElement(create1);
		javawait();
		softassert.assertEquals(strengthalert.getText(), "Strength is required");
		javawait();
		clickElement(strengthname);
		for (int i = 1; i <2; i++) {
			strengthname.sendKeys(excelUtils.getCellData(i, 0));
		javawait();
		clickElement(create1);
		}
	}

	public void existedstrengthcreate() throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"Strength");
		javascript(strength);
		javawait();
		clickElement(create);
		javawait();
		clickElement(create1);
		javawait();
		softassert.assertEquals(strengthalert.getText(), "Strength is required");
		clickElement(strengthname);
		for (int i = 1; i <2; i++) {
			strengthname.sendKeys(excelUtils.getCellData(i, 0));
		javawait();
		clickElement(create1);
		javawait();
		 if(alreadyexistok.isDisplayed()) {
    		 System.out.println("this record is already existed");
    		 extenttest.log(Status.PASS, "Already exist coindition is working fine");
    		 javawait();
    		 clickElement(alreadyexistok);
    	  }else {
    		 extenttest.log(Status.FAIL, "Already exist coindition is not working fine");
    	  }
		}
	}
	
	public void strengthupdatewithspace() throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"Strength");
		javascript(strength);
		clickElement(search);
		for (int i = 1; i <2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 0));
		javawait();
    	clickElement(createdrecord);
    	javawait();
    	clickElement(update);
    	javawait();
    	softassert.assertEquals(commentalert.getText(), "Comments are required");
    	textboxc(strengthname, " ");
    	javawait();
    	textbox(comments, "");
    	javawait();
    	clickElement(update);
    	if(strengthalert.isDisplayed() || commentalert.isDisplayed()) {
    		System.out.println("validation is working fine with comments space(strength & comments)");
    		 extenttest.log(Status.PASS, "validation is working fine with space(strength & comments)");
    		javawait();
    		clickElement(close);
    	}
    	else {
    		extenttest.log(Status.FAIL, "validation is not working fine with space");
    	}
		}
	}
	
	public void strengthupdate(String comm) throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"Strength");
		javascript(strength);
		clickElement(search);
		for (int i = 1; i <2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 0));
		javawait();
    	clickElement(createdrecord);
    	javawait();
    	clickElement(update);
    	javawait();
    	softassert.assertEquals(commentalert.getText(), "Comments are required");
    	clickElement(strengthname);
    	strengthname.clear();
    	strengthname.sendKeys(excelUtils.getCellData(i, 1));
    	javawait();
    	textbox(comments, comm);
    	javawait();
    	clickElement(update);
		}
	}
	
	public void stregnthdisableenable(String comm) throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"Strength");
		javascript(strength);
		clickElement(search);
		for (int i = 1; i <2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 1));
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
    	javawait();
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
