package com.ProductionInchargePageObjects;

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

public class BPRPrintRevieworCancel extends BRMSCommonMethods {


	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath =file;

	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//span[text()='Print Request Review']")
	WebElement printreqreview;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@class='ng-star-inserted odd'])[1]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return']")
	WebElement returnbutton;
	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how =How.XPATH, using ="//button[text()=' Submit ']")
	WebElement printsubmit;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how =How.XPATH, using ="(//input[@type='text'])[1]")
	WebElement mprno;
	@FindBy(how =How.XPATH, using ="//button[text()=' Get ']")
	WebElement get;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add your comments here..']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add your comments hereassets']")
	WebElement printcomments;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please Enter Comments ']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments are required']")
	WebElement commalert1;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']")
	WebElement commalert2;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "//img[@class='close']")
	WebElement close;
	@FindBy(how = How.XPATH, using = "//button[text()=' Initiated ']")
	WebElement initiated;
	@FindBy(how = How.XPATH, using = "//button[text()=' Approved ']")
	WebElement approved;
	@FindBy(how = How.XPATH, using = "//span[text()='Before Print Receive Cancel Initiation']")
	WebElement printcancelinitiation;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement cancelflowsubmit;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement cancelYes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement cancelNo;
	@FindBy(how = How.XPATH, using = "//button[text()=' Returned']")
	WebElement returned;
	@FindBy(how = How.XPATH, using = "//a[text()=' Status']")
	WebElement status;
	@FindBy(how = How.XPATH, using = "//button[text()=' Re-Submit ']")
	WebElement resubmit;
	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
	WebElement cancelsubmit2;

	public BPRPrintRevieworCancel(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}

	public void bprprintreqreviewtab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
	//	clickElement(tab);
		clickElement(bpr);
		javascript(printreqreview);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}

	public void comments(String comm) throws IOException, InterruptedException {
		javawait();
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		clickElement(printcomments);
		printcomments.sendKeys(comm);
	}
	public void reinitiationcomments(String comm) throws IOException, InterruptedException {
		javawait();
		softassert.assertEquals("Comments are required", commalert1.getText());
		clickElement(comments);
		comments.sendKeys(comm);
	}
	public void cancelreinitiationcomments(String comm) throws IOException, InterruptedException {
		javawait();
		softassert.assertEquals("Comments is required", commalert2.getText());
		clickElement(comments);
		comments.sendKeys(comm);
	}
	
	public void reReview() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
//		clickElement(tab);
		clickElement(bpr);
		javascript(printreqreview);
		clickElement(returned);
		javawait();
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);			
		}
	}
	public void returnactivity2(String pass) throws InterruptedException {

		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	}

	public void close() throws InterruptedException {
		javawait();
		clickElement(close);
	}
	

	public void printsubmitactivity(String pass) throws InterruptedException {

		clickElement(No);
		javawait();
		clickElement(submit);
		javawait();
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(printsubmit);
		javawait();
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

	public void submitactivity2(String pass) throws InterruptedException {

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
	}
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	public void resubmit() throws InterruptedException {
		javawait();
		clickElement(resubmit);
	}
	public void returnbutton() throws InterruptedException {
		javawait();
		clickElement(returnbutton);
	}
	public void cancelprintinitiationtab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
	//	clickElement(tab);
		clickElement(bpr);
		javascript(printcancelinitiation);
		javawait();
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
			javawait();
			clickElement(get);
			javawait();
			clickElement(createdrecord);
		}
	}
	public void cancelprintReinitiationtab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
	//	clickElement(tab);
		clickElement(bpr);
		javascript(printcancelinitiation);
		javawait();
		clickElement(status);
		javawait();
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
			javawait();
			clickElement(createdrecord);
		}
	}
	
	public void cancelsubmit() throws InterruptedException {
		javawait();
		clickElement(cancelflowsubmit);
	}
	
	public void cancelsubmitactivity(String pass) throws InterruptedException {

		clickElement(cancelNo);
		clickElement(cancelflowsubmit);
		clickElement(cancelYes);
		javawait();
		textbox(password, pass);
		clickElement(cancelsubmit2);
		javawait();
	}
	public void cancelresubmitactivity(String pass) throws InterruptedException {

		clickElement(cancelNo);
		clickElement(resubmit);
		clickElement(cancelYes);
		javawait();
		textbox(password, pass);
		clickElement(cancelsubmit2);
		javawait();
	}
}
