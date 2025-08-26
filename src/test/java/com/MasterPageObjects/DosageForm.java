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

public class DosageForm extends BRMSCommonMethods {
	
	SoftAssert softassert = new SoftAssert();
	   static ExcelUtils excelUtils = new ExcelUtils();
	    
	    //using the Constants class values for excel file path 
	    static String excelFilePath = file;
	
	
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
	@FindBy(xpath = "//button[text()='Ok']") WebElement updateok;
	@FindBy(xpath = "(//button[@type='button'])[2]") WebElement update;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement submit2;

	public DosageForm(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
		
	}
	public void dosageformcreatewithspace() throws InterruptedException {
		javascript(dosageform);
		clickElement(create);
		clickElement(close);
		clickElement(create);
		javawait();
		clickElement(create1);
		softassert.assertEquals(dosageformalert.getText(), "Dosage Form Name is required");
		javawait();
		textbox(dosagename, " ");
		clickElement(create1);
		if(Yes.isDisplayed() || dosageformalert.isDisplayed()) {
			 extenttest.log(Status.FAIL, "validation is not working fine with space");
			clickElement(No);
			clickElement(close);
		}
		else {
			
			 extenttest.log(Status.PASS, "validation is working fine with space");
		}
	}
	public void dosageformcreate() throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"Dosageform");
		javascript(dosageform);
		clickElement(create);
		clickElement(close);
		clickElement(create);
		clickElement(create1);
		softassert.assertEquals(dosageformalert.getText(), "Dosage Form Name is required");
		clickElement(dosagename);
		for (int i = 1; i <2; i++) {
			dosagename.sendKeys(excelUtils.getCellData(i, 0));
		clickElement(create1);
		}
	}
    public void updateactivity() throws InterruptedException {
		
		clickElement(No);
		clickElement(update);
		clickElement(Yes);
		clickElement(updateok);
		refresh();
	}
    public void updateactivity2() throws InterruptedException {

	clickElement(Yes);
	clickElement(updateok);
	refresh();
     }
	
	public void existeddosageform() throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"Dosageform");
		javascript(dosageform);
		clickElement(create);
		clickElement(create1);
		softassert.assertEquals(dosageformalert.getText(), "Dosage Form Name is required");
		clickElement(dosagename);
		for (int i = 1; i <2; i++) {
			dosagename.sendKeys(excelUtils.getCellData(i, 0));
		javawait();
		clickElement(create1);
		 if(No.isDisplayed()) {
    		 System.out.println("this record is already exist, already existed condition has been failed");
    		extenttest.log(Status.FAIL,"this test is failed, validation is not showing" );
    		 clickElement(No);
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
    	clickElement(createdrecord);
    	clickElement(update);
    	softassert.assertEquals(commentalert.getText(), "Comments are required");
    	textboxc(dosagename, " ");
    	textbox(comments, " ");
    	clickElement(update);
    	javawait();
    	if(No.isDisplayed() || dosageformalert.isDisplayed() || commentalert.isDisplayed()) {
    		System.out.println("validations are not working fine with comments space(market & comments)");
    		extenttest.log(Status.FAIL,"this test is failed, validation is not showing" );
    		clickElement(No);
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
    	clickElement(createdrecord);
    	clickElement(update);
    	softassert.assertEquals(commentalert.getText(), "Comments are required");
    	javawait();
    	clickElement(dosagename);
    	dosagename.clear();
    	dosagename.sendKeys(excelUtils.getCellData(i, 1));
    	textbox(comments, comm);
    	clickElement(update);
		}
	}
	
	public void dosageenabledisable(String comm) throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"Dosageform");
		javascript(dosageform);
		clickElement(search);
		for (int i = 1; i <2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 1));
    	clickElement(createdrecord);
    	javawait();
    	clickElement(update);
    	softassert.assertEquals(commentalert.getText(), "Comments are required");
    	textbox(comments, comm);
    	clickElement(enable);
    	clickElement(update);	
		}
	}
public void createactivity(String pass) throws InterruptedException {
		
		clickElement(No);
		clickElement(create1);
		clickElement(Yes);
		textbox(password, pass);
		javawait();
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
}
