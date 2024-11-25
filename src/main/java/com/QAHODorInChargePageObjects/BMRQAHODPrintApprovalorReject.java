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

public class BMRQAHODPrintApprovalorReject extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";

	@FindBy(how = How.XPATH, using = "//span[text()='Print Request Approval']")
	WebElement printreqapproval;
	@FindBy(how = How.XPATH, using = "//span[text()='Before Print Received Cancel Approval']")
	WebElement beforeprintcancelapproval;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()=' Reviewed']")
	WebElement reviewed;
	@FindBy(how = How.XPATH, using = "//button[text()=' Returned']")
	WebElement returned;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return']")
	WebElement returnbutton;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[text()=' Reject']")
	WebElement reject;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return ']")
	WebElement returnbutton1;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit1;
	@FindBy(how = How.XPATH, using = "//button[text()=' Reject ']")
	WebElement reject1;
	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add your comments here..']")
	WebElement comments1;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please Enter Comments ']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']")
	WebElement commalert1;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return To Production Executive']")
	WebElement returntoprodexe;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return To Production Incharge']")
	WebElement returntoprodincharge;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return To Production Incharge']")
	WebElement returntovalncharge;
	@FindBy(how = How.XPATH, using = "//button[text()='Yes']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()='No'])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes1;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No1;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "(//div[@class='d-flex align-items-center'])[2]")
	WebElement close;

	public BMRQAHODPrintApprovalorReject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void printapprovalrejecttab() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javascript(printreqapproval);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 1));
			clickElement(createdrecord);
			
		}
	}
	public void beforeprintapprovalrejecttab() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javascript(beforeprintcancelapproval);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 1));
			clickElement(createdrecord);
			
		}
	}
	
	public void beforeprintcomments(String comm) {
		softassert.assertEquals("Please Enter Comments", commalert1.getText());
	    textbox(comments1, comm);
	}

	public void comments(String comm) throws IOException {
		
		softassert.assertEquals("Please Enter Comments", commalert.getText());
	    textbox(comments, comm);
		
	}
public void comments1(String comm) throws IOException {
		
	    textbox(comments, comm);
		
	}
	
	public void close() {
	    
		clickElement(close);
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
		clickElement(ok);
	}
	
	public void beforeprintsubmit() {
		clickElement(submit1);
	}
	public void beforeprintreturn() {
		clickElement(returnbutton1);
	}
	public void beforeprintreject() {
		clickElement(reject1);
	}
	
	public void beforeprintsubmitactivity(String pass) throws InterruptedException {
		
		clickElement(No1);
		javawait();
		clickElement(submit1);
		javawait();
		clickElement(Yes1);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		javawait();
		clickElement(ok);
	}
	
	public void beforeprintreturnactivity(String pass) throws InterruptedException {
		clickElement(No1);
		javawait();
		clickElement(returnbutton1);
		javawait();
		clickElement(Yes1);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		javawait();
		clickElement(ok);
	}
	public void beforeprintrejectactivity(String pass) throws InterruptedException {
		clickElement(No1);
		javawait();
		clickElement(reject1);
		javawait();
		clickElement(Yes1);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		javawait();
		clickElement(ok);
	}
	
	public void submit() {
		clickElement(submit);
	}
	public void returnbutton() {
		clickElement(returnbutton);
	}
	public void reject() {
		clickElement(reject);
	}

	public void submitactivity2(String pass) throws InterruptedException {

		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		javawait();
		clickElement(ok);
	}
	
	public void returntoexeactivity(String pass) throws InterruptedException {
	    clickElement(returntoprodexe);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		javawait();
		clickElement(ok);
	}
	public void returntoinchargeactivity(String pass) throws InterruptedException {
		
		clickElement(returntoprodincharge);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		javawait();
		clickElement(ok);
	}
	public void returntovalidationactivity(String pass) throws InterruptedException {
		
		clickElement(returntovalncharge);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		javawait();
		clickElement(ok);
	}


}
