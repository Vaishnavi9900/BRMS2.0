package com.QAOfficerPageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRBPRBatchCompletionApproval extends BRMSCommonMethods{
	
	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";

	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "//span[text()='Batch Completion Approve']")
	WebElement batchcompletionapprove;
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
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return To Production Executive']")
	WebElement returntoexe;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return To IPQA Incharge']")
	WebElement returntoipqa;
	

	public BMRBPRBatchCompletionApproval(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void batchcompletionapprovaltab() throws InterruptedException, IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javascript(batchcompletionapprove);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}

	}
	public void bprbatchcompletionapprovaltab() throws InterruptedException, IOException {
		clickElement(bpr);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javascript(batchcompletionapprove);
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
	
	public void selectreturntoexe() {
		javascript(returntoexe);
	}

	public void selectreturntoipqa() {
		javascript(returntoipqa);
	}

	public void comments(String comm) throws IOException {
		
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		clickElement(comments);
		comments.sendKeys(comm);
	}

	public void submitactivity(String pass) throws InterruptedException {

		javawait();
		clickElement(No);
		javawait();
		javascript(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();

	}
	public void submitactivity2(String pass) throws InterruptedException {
		javawait();
		javascript(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	}


	public void returntoexeactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(returnbutton);
		selectreturntoexe();
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	}
	public void returntoipqaactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(returnbutton);
		selectreturntoipqa();
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	}



}
