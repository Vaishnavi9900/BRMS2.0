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

public class BMRBPRProductionInchargeReview extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();
	static ExcelUtils excelUtils = new ExcelUtils();

	// using the Constants class values for excel file path
	static String excelFilePath =file;

	@FindBy(how = How.XPATH, using = "//span[text()='Master Review']")
	WebElement masterreviewtab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[2]")
	WebElement tab2;
	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[text()='Return ']")
	WebElement returnbutton;
	@FindBy(how = How.XPATH, using = "//textarea[@trim='blur']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[4]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[5]")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[5]")
	WebElement bprYes;
	@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[4]")
	WebElement bprNo;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement submit2;

	public BMRBPRProductionInchargeReview(WebDriver driver) {

		PageFactory.initElements(driver, this);	
	}

	public void masterreviewtab() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
	//	clickElement(tab);
		//clickElement(tab2);
		javascript(masterreviewtab);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	public void bprmasterreviewtab() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
	//	clickElement(tab);
	//	clickElement(tab2);
		clickElement(bpr);
		Thread.sleep(5000);
		javascript(masterreviewtab);
		
	}
	public void mprselection() {
		for (int i = 1; i < 2; i++) {
			clickElement(search);
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}

	public void comments(String comm) throws InterruptedException {
		softassert.assertEquals("Comments is required", commalert.getText());
		clickElement(comments);
		comments.sendKeys(comm);
	}

	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	
	public void returnbutton() throws InterruptedException {
		javawait();
		clickElement(returnbutton);
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
		Thread.sleep(15000);
	}
	public void bprsubmitactivity(String pass) throws InterruptedException {

		clickElement(bprNo);
		clickElement(submit);
		clickElement(bprYes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
		Thread.sleep(15000);
	}
	public void bprsubmitactivity2(String pass) throws InterruptedException {
		clickElement(bprYes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
		Thread.sleep(15000);
	}
	public void returnactivity2(String pass) throws InterruptedException {

		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
		Thread.sleep(15000);
	}

	
}
