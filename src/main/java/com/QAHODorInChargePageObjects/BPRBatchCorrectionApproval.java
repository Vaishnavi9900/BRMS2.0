package com.QAHODorInChargePageObjects;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BPRBatchCorrectionApproval extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";

	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "//span[text()='Executed Document Correction Approval']")
	WebElement executebatchcorrectiontab;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add your comments here..']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Submit '])[2]")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return ']")
	WebElement returnbutton;
	
	public BPRBatchCorrectionApproval(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void bprbatchCorrectionApproval() throws InterruptedException, IOException {
		clickElement(bpr);
		javascript(executebatchcorrectiontab);
		javawait();
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
		search.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
		javawait();
	    clickElement(createdrecord);	
	}
	public void batchCorrectionApproval() throws InterruptedException, IOException {
		javascript(executebatchcorrectiontab);
		javawait();
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
		search.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
		javawait();
	    clickElement(createdrecord);	
	}
	
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	public void returnbutton() throws InterruptedException {
		javawait();
		clickElement(returnbutton);
	}
	
	public void comments(String comm) throws IOException, InterruptedException {
		softassert.assertEquals("Please Enter Comments", commalert.getText());
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
