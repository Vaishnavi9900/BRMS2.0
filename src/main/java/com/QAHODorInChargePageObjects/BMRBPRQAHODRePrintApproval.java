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

public class BMRBPRQAHODRePrintApproval extends BRMSCommonMethods{

	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();
	
	static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";
	
	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "//span[text()='Re-Print Request Approval']")
	WebElement reprintapprovaltab;
	@FindBy(how = How.XPATH, using = "//span[text()='Re Print Request Approval']")
	WebElement bprreprintapprovaltab;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return ']")
	WebElement returnbutton;
	@FindBy(how = How.XPATH, using = "//button[text()=' Reject ']")
	WebElement reject;
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
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	
	public BMRBPRQAHODRePrintApproval(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void reprintapprovaltab() throws InterruptedException, IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javascript(reprintapprovaltab);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}

	}
	public void bprreprintapprovaltab() throws InterruptedException, IOException {
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(bpr);
		javascript(bprreprintapprovaltab);
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
	public void reject() {
		clickElement(reject);
	}

	public void comments(String comm) throws IOException {

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
		clickElement(ok);
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
		clickElement(ok);
	}
	
	public void rejectnactivity(String pass) throws InterruptedException {

		clickElement(No);
		javawait();
		clickElement(reject);
		javawait();
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		javawait();
		clickElement(ok);
	}

	
}
