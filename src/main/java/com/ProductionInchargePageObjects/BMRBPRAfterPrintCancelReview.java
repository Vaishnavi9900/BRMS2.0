package com.ProductionInchargePageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRBPRAfterPrintCancelReview  extends BRMSCommonMethods{
	
	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath = file;

	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//span[text()='After Print Receive Cancel Review']")
	WebElement afterprintcancelreview;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
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
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add your comments here..']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[text()=' Reject ']")
	WebElement reject;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return ']")
	WebElement returnbutton;
	
	public BMRBPRAfterPrintCancelReview(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void afterPrintcanelReviewtab() throws InterruptedException, IOException {
		javawait();
		clickElement(tab);
		javascript(afterprintcancelreview);
		javawait();
		excelutils.setExcelFile(excelFilePath, "productdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
		}
	    clickElement(createdrecord);
	}
	public void bprafterPrintcanelReviewtab() throws InterruptedException, IOException {
		javawait();
		clickElement(tab);
		clickElement(bpr);
		javascript(afterprintcancelreview);
		javawait();
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
		}
	    clickElement(createdrecord);
	}
	
	public void comments(String comm) throws IOException {
		softassert.assertEquals("Comments is required", commalert.getText());
		clickElement(comments);
		comments.sendKeys(comm);
	
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
