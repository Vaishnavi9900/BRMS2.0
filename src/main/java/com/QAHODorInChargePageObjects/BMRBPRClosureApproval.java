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

public class BMRBPRClosureApproval extends BRMSCommonMethods{
	
	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";

	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "//span[text()='Batch Closure Approval']")
	WebElement batchclosureinitiation;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return ']")
	WebElement returnbutton;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please Enter Comments ']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//div[text()=' Comments are required. ']")
	WebElement bprcommalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;

	public BMRBPRClosureApproval(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void batchClosureReturn() throws InterruptedException, IOException {
		javawait();
		javascript(batchclosureinitiation);
		excelutils.setExcelFile(excelFilePath, "productdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
		}
	    clickElement(createdrecord);
	}
	public void bprbatchClosureReturn() throws InterruptedException, IOException {
		clickElement(bpr);
		javawait();
		javascript(batchclosureinitiation);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
		}
	    clickElement(createdrecord);
	}
	public void batchClosureApproval() throws InterruptedException, IOException {
		javawait();
		javascript(batchclosureinitiation);
		excelutils.setExcelFile(excelFilePath, "productdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
		}
	    clickElement(createdrecord);
	}
	public void bprbatchClosureApproval() throws InterruptedException, IOException {
		clickElement(bpr);
		javawait();
		javascript(batchclosureinitiation);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
		}
	    clickElement(createdrecord);
	}
	
	public void comments(String comm) {
		//softassert.assertEquals("Please Enter Comments", commalert.getText());
	    clickElement(comments);
	    comments.sendKeys(comm);
	}
	
	public void bprcomments(String comm) {
		
		softassert.assertEquals("Comments are required.", bprcommalert.getText());
	    clickElement(comments);
	    comments.sendKeys(comm);
	}
	
	public void returnbutton() throws InterruptedException {
		javawait();
		clickElement(returnbutton);
	}
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
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
		javawait();
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
		javawait();
	}


}
