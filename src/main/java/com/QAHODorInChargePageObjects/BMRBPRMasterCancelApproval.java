package com.QAHODorInChargePageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRBPRMasterCancelApproval extends BRMSCommonMethods{
	
	SoftAssert softassert = new SoftAssert();
	static ExcelUtils excelUtils = new ExcelUtils();

	// using the Constants class values for excel file path
	static String excelFilePath = file;

	@FindBy(how = How.XPATH, using = "//span[text()='Master Cancel Approval']")
	WebElement mastercancelapprovaltab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how =How.XPATH, using ="(//input[@type='text'])[1]")
	WebElement mprno;
	@FindBy(how =How.XPATH, using ="//button[text()=' Get ']")
	WebElement get;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//textarea[@trim='blur']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//a[text()=' Status']")
	WebElement status;
	@FindBy(how = How.XPATH, using = "//button[text()=' Returned ']")
	WebElement returned;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()=' Reject ']")
	WebElement reject;
	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
	WebElement bprsubmit2;
	

	public BMRBPRMasterCancelApproval(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}

	public void mastercancelapprovaltab() throws IOException, InterruptedException {
		javawait();
		clickElement(tab);
		javascript(mastercancelapprovaltab);
		clickElement(search);
		excelUtils.setExcelFile(excelFilePath, "productdetails");
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
		}
	    clickElement(createdrecord);
	}
	public void bprmastercancelapprovaltab() throws IOException, InterruptedException {
		javawait();
		clickElement(tab);
		clickElement(bpr);
		javascript(mastercancelapprovaltab);
		clickElement(search);
		excelUtils.setExcelFile(excelFilePath, "BPRproductdetails");
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
		}
	    clickElement(createdrecord);
	}

	public void comments(String comm) throws IOException {
	
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		clickElement(comments);
		comments.sendKeys(comm);

	}
	
	public void submit() {
		
		clickElement(submit);
	}
    public void reject() {
		
		clickElement(reject);
	}
	
	public void submitactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(submit);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	}
	public void bprsubmitactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(submit);
		clickElement(Yes);
		javawait();
		textbox(password, pass);		
		clickElement(submit2);
		javawait();
	}
	public void rejectactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(reject);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(bprsubmit2);
		javawait();
	}
	public void bprrejectactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(reject);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(bprsubmit2);
		javawait();
	}


}
