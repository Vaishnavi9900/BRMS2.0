package com.IPQAPageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRBPRIPQABatchCompletionReview extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath = file;

	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[2]")
	WebElement tab2;
	@FindBy(how = How.XPATH, using = "//span[text()='Batch Completion Review']")
	WebElement batchcompletionreview;
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[1]")
	WebElement mprno;
	@FindBy(how = How.XPATH, using = "//button[text()=' Get']")
	WebElement get;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[@data-target='#confirmation']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[@data-target='#Return']")
	WebElement returnbutton;
	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please Enter Comments ']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[3]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Submit '])[2] | //button[text()=' Submit ']")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//a[text()='Return']")
	WebElement returntab;
	

	public BMRBPRIPQABatchCompletionReview(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}

	public void batchcompletionreviewtab() throws InterruptedException, IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
		//clickElement(tab);
		//clickElement(tab2);
		javascript(batchcompletionreview);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}

	}
	public void bprbatchcompletionreviewtab() throws InterruptedException, IOException {
		javawait();
		//clickElement(tab);
		//clickElement(tab2);
		clickElement(bpr);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javascript(batchcompletionreview);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}

	}
	
	public void bprbatchcompletionRereview() throws IOException, InterruptedException {
		javawait();
		//clickElement(tab);
		//clickElement(tab2);
		clickElement(bpr);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javascript(batchcompletionreview);
		clickElement(returntab);
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	public void batchcompletionRereview() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
		//clickElement(tab);
		//clickElement(tab2);
		javascript(batchcompletionreview);
		clickElement(returntab);
		Thread.sleep(2000);
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}

	public void submit() {
		clickElement(submit);
	}
	
	public void returnbutton() {
		clickElement(returnbutton);
	}

	public void comments(String comm) throws IOException {
		
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		clickElement(comments);
	    comments.sendKeys(comm);
	}

	public void submitactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(submit);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
	public void submitactivity2(String pass) throws InterruptedException {

		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}

	public void returnactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(returnbutton);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}

}
