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

public class DosageForm extends BRMSCommonMethods {
	
	SoftAssert softassert = new SoftAssert();
	   static ExcelUtils excelUtils = new ExcelUtils();
	    
	    //using the Constants class values for excel file path 
	    static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";
	
	
	@FindBy(xpath = "//a[text()=' Dosage Form ']") WebElement dosageform;
	@FindBy(xpath = "//button[text()=' Create']") WebElement create;
	@FindBy(xpath = "(//button[@type='button'])[2]") WebElement create1;
	@FindBy(xpath = "//img[@class='close']") WebElement close;
	@FindBy(xpath = "(//input[@type='text'])[1]") WebElement dosagename;
	//@FindBy(xpath = "//button[text()='Ok']") WebElement nochangesalreadyok;
	@FindBy(xpath = "//input[@type='search']") WebElement search;
	@FindBy(xpath = "(//tr[@role='row'])[2]") WebElement createdrecord;
	@FindBy(xpath = "//div[text()=' Comments are required ']") WebElement commentalert;
	@FindBy(xpath = "//textarea[@formcontrolname='comments']") WebElement comments;
	@FindBy(xpath = "//div[text()=' Dosage Form Name is required ']") WebElement dosageformalert;
	@FindBy(xpath = "//input[@type='checkbox']") WebElement enable; 
	@FindBy(xpath = "//button[text()=' Upload ']") WebElement upload;
	@FindBy(xpath = "//button[text()='Yes']") WebElement Yes;
	@FindBy(xpath = "(//button[text()='No'])[2]") WebElement No;
	@FindBy(xpath = "//button[text()='OK']") WebElement updateok;
	@FindBy(xpath = "(//button[@type='button'])[2]") WebElement update;

	public DosageForm(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	public void dosageformcreatewithspace() throws InterruptedException {
		javascript(dosageform);
		javawait();
		clickElement(create);
		javawait();
		clickElement(close);
		javawait();
		clickElement(create);
		javawait();
		clickElement(create1);
		javawait();
		softassert.assertEquals(dosageformalert.getText(), "Dosage Form Name is required");
		javawait();
		textbox(dosagename, " ");
		javawait();
		clickElement(create1);
		if(Yes.isDisplayed() || dosageformalert.isDisplayed()) {
			 extenttest.log(Status.FAIL, "validation is not working fine with space");
			clickElement(No);
			javawait();
			clickElement(close);
		}
		else {
			
			 extenttest.log(Status.PASS, "validation is working fine with space");
		}
	}
	public void dosageformcreate() throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"Dosageform");
		javascript(dosageform);
		javawait();
		clickElement(create);
		javawait();
		clickElement(close);
		javawait();
		clickElement(create);
		javawait();
		clickElement(create1);
		javawait();
		softassert.assertEquals(dosageformalert.getText(), "Dosage Form Name is required");
		clickElement(dosagename);
		for (int i = 1; i <2; i++) {
			dosagename.sendKeys(excelUtils.getCellData(i, 0));
		javawait();
		clickElement(create1);
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
	
	public void existeddosageform() throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"Dosageform");
		javascript(dosageform);
		javawait();
		clickElement(create);
		javawait();
		clickElement(create1);
		javawait();
		softassert.assertEquals(dosageformalert.getText(), "Dosage Form Name is required");
		javawait();
		clickElement(dosagename);
		for (int i = 1; i <2; i++) {
			dosagename.sendKeys(excelUtils.getCellData(i, 0));
		javawait();
		clickElement(create1);
		 if(No.isDisplayed()) {
    		 System.out.println("this record is already exist, already existed condition has been failed");
    		extenttest.log(Status.FAIL,"this test is failed, validation is not showing" );
    		 clickElement(No);
    		 javawait();
    		 clickElement(close);
    	  }else {
    		  extenttest.log(Status.PASS,"this test is passed, validation is showing" );
    	  }
		}
	}
	
	public void dosageupdatewithspace() throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"Dosageform");
		javascript(dosageform);
		clickElement(search);
		for (int i = 1; i <2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 0));
		javawait();
    	clickElement(createdrecord);
    	javawait();
    	clickElement(update);
    	javawait();
    	softassert.assertEquals(commentalert.getText(), "Comments are required");
    	textboxc(dosagename, " ");
    	javawait();
    	textbox(comments, " ");
    	javawait();
    	clickElement(update);
    	javawait();
    	if(No.isDisplayed() || dosageformalert.isDisplayed() || commentalert.isDisplayed()) {
    		System.out.println("validations are not working fine with comments space(market & comments)");
    		extenttest.log(Status.FAIL,"this test is failed, validation is not showing" );
    		clickElement(No);
    		javawait();
    		clickElement(close);
    	}
    	else {
    		 extenttest.log(Status.PASS,"this test is passed, validation is showing" );
    	}
    	
    	
		}
	}
	
	public void dosageupdate(String comm) throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"Dosageform");
		javascript(dosageform);
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
    	clickElement(dosagename);
    	dosagename.clear();
    	dosagename.sendKeys(excelUtils.getCellData(i, 1));
    	javawait();
    	textbox(comments, comm);
    	javawait();
    	clickElement(update);
		}
	}
	
	public void dosageenabledisable(String comm) throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"Dosageform");
		javascript(dosageform);
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
    	clickElement(update);	
		}
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
