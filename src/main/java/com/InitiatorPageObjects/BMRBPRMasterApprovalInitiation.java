package com.InitiatorPageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRBPRMasterApprovalInitiation extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();
	static ExcelUtils excelUtils = new ExcelUtils();

	// using the Constants class values for excel file path
	static String excelFilePath = file;
	
	

	@FindBy(how = How.XPATH, using = "//span[text()='Master Initiation']")
	WebElement masterinitiationtab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//textarea[@trim='blur']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//p[text()='Comments is required']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments are required']")
	WebElement commalert1;
	@FindBy(how = How.XPATH, using = "//div[text()=' QMS Reference No. is required ']")
	WebElement qmsrefalert;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='qmsReferenceNumber' or @id='qmsReferenceNumber'] ")
	WebElement qmsrefnumber;
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
	@FindBy(how = How.XPATH, using = "(//button[text()=' Submit '])[2]")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
    WebElement submit1;
	@FindBy(how = How.XPATH, using ="//button[text()=' Re-Submit ']")
	WebElement resubmit;


	public BMRBPRMasterApprovalInitiation(WebDriver driver) {

		PageFactory.initElements(driver, this);	

	}

	public void masterinitiationtab() throws IOException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		clickElement(tab);
		javascript(masterinitiationtab);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	public void bprmasterinitiationtab() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
		clickElement(tab);
		clickElement(bpr);
		javascript(masterinitiationtab);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}

	public void masterreinitiation() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
	    clickElement(tab);
		javascript(masterinitiationtab);
		clickElement(status);
		clickElement(returned);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	public void bprmasterreinitiation() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
	    clickElement(tab);
		clickElement(bpr);
		javascript(masterinitiationtab);
		clickElement(status);
		clickElement(returned);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}

	public void comments() throws IOException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		softassert.assertEquals("Comments is required", commalert.getText());
		clickElement(comments);
		for (int i = 1; i < 2; i++) {
			comments.sendKeys(excelUtils.getCellData(i, 10));
		}
		softassert.assertEquals("QMS Reference No. is required", qmsrefalert.getText());
		clickElement(qmsrefnumber);
		qmsrefnumber.sendKeys("QMS-2023-001");

	}
	public void reinitiationcomments() throws IOException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		//softassert.assertEquals("Comments are required", commalert1.getText());
		clickElement(comments);
		for (int i = 1; i < 2; i++) {
			comments.sendKeys(excelUtils.getCellData(i, 10));
			clickElement(qmsrefnumber);
			qmsrefnumber.clear();
			qmsrefnumber.sendKeys("QMS-2024-001");
		}

	}

	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}

	public void resubmit() throws InterruptedException {
		javawait();
		clickElement(resubmit);
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
	public void resubmitactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(resubmit);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit1);
		javawait();
	}
	public void resubmitactivity2(String pass) throws InterruptedException {

		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit1);
		javawait();
	}

	public void submitactivity2(String pass) throws InterruptedException {

		javascript(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	}

}
