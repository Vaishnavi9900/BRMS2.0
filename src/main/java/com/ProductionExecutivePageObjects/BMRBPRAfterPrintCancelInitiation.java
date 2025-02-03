package com.ProductionExecutivePageObjects;

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

public class BMRBPRAfterPrintCancelInitiation extends BRMSCommonMethods{
	
	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath = file;

	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//span[text()='After Print Receive Cancel Initiation']")
	WebElement afterprintcanceltab;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments are required']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']")
	WebElement reinitiationcommalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Submit '])[2]")
	WebElement submit2;
	@FindBy(how =How.XPATH, using ="(//input[@type='text'])[1]")
	WebElement mprno;
	@FindBy(how =How.XPATH, using ="//button[text()=' Get ']")
	WebElement get;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add your comments here..']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//img[@class='close']")
	WebElement close;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link']")
	WebElement status;
	@FindBy(how = How.XPATH, using = "//button[@class='btn successBtn btn-block']")
	WebElement resubmit;
	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
	WebElement resubmit2;
	
	public BMRBPRAfterPrintCancelInitiation(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void afterPrintcanelinitiation() throws InterruptedException, IOException {
		javawait();
		clickElement(tab);
		javascript(afterprintcanceltab);
		excelutils.setExcelFile(excelFilePath, "productdetails");
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
		clickElement(get);
	    clickElement(createdrecord);
	}
	public void bprafterPrintcanelinitiation() throws InterruptedException, IOException {
		javawait();
		clickElement(tab);
		clickElement(bpr);
		javascript(afterprintcanceltab);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 14),Keys.ENTER);
		}
		clickElement(get);
	    clickElement(createdrecord);
	}
	public void afterPrintcanelReinitiation() throws InterruptedException, IOException {
		javawait();
		clickElement(tab);
		javascript(afterprintcanceltab);
		clickElement(status);
		excelutils.setExcelFile(excelFilePath, "productdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
	    clickElement(createdrecord);
	}
	public void bprafterPrintcanelReinitiation() throws InterruptedException, IOException {
		javawait();
		clickElement(tab);
		clickElement(bpr);
		javascript(afterprintcanceltab);
		clickElement(status);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
		}
	    clickElement(createdrecord);
	}
	
	public void comments() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		softassert.assertEquals("Comments are required", commalert.getText());
		clickElement(comments);
		for (int i = 1; i < 2; i++) {
			comments.sendKeys(excelutils.getCellData(i, 10));
		}
	}
	public void reinitiationcomments() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		softassert.assertEquals("Comments is required", reinitiationcommalert.getText());
		clickElement(comments);
		for (int i = 1; i < 2; i++) {
			comments.sendKeys(excelutils.getCellData(i, 10));
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
		clickElement(resubmit2);
		javawait();
	}


}
