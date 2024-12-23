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

public class BMRBPRObsoleteApproval extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();
	
	static ExcelUtils excelutils = new ExcelUtils();
	
	static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";
	
	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "//span[text()='Master Obsolete Approval']")
	WebElement obsoleteapproval;
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
	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[3]")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[5]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()=' Reject ']")
	WebElement reject;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return ']")
	WebElement returnbutton;
	
	public BMRBPRObsoleteApproval(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void obsoleteApproval() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javascript(obsoleteapproval);
		javawait();
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	public void bprobsoleteApproval() throws IOException, InterruptedException {
		clickElement(bpr);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javascript(obsoleteapproval);
		javawait();
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	public void reject() throws InterruptedException {
		javawait();
		clickElement(reject);
	}
	
	public void returnbutton() throws InterruptedException {
		javawait();
		clickElement(returnbutton);
	}
	public void comments(String comm) {
		softassert.assertEquals("Comments is required", commalert.getText());
		clickElement(comments);
		comments.sendKeys(comm);
	}
	public void submitactivity(String pass) throws InterruptedException {

		clickElement(No);
		javawait();
		clickElement(submit);
		javawait();
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
	}
	public void rejectactivity(String pass) throws InterruptedException {

		clickElement(No);
		javawait();
		clickElement(reject);
		javawait();
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
	}
	public void returnactivity(String pass) throws InterruptedException {

		clickElement(No);
		javawait();
		clickElement(returnbutton);
		javawait();
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
	}
}
