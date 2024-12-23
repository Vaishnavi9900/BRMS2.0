package com.QAOfficerPageObjects;

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

public class BMRBatchClosureInitiation extends BRMSCommonMethods {
	
	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";

	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "//span[text()='Batch Closure Initiation']")
	WebElement batchclosureinitiation;
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[1]")
	WebElement mprno;
	@FindBy(how = How.XPATH, using = "//button[text()=' Get ']")
	WebElement get;
	@FindBy(how = How.XPATH, using = "//button[text()=' Get']")
	WebElement bprget;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[@class='btn successBtn btn-block']")
	WebElement bprsubmit;
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
	@FindBy(how = How.XPATH, using = "//button[@class='btn successBtn']")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "(//div[@class='card p-4 bg-gray-100'])[1]")
	WebElement exebmrattachment;
	@FindBy(how = How.XPATH, using = "(//div[@class='card p-4 bg-gray-100'])[2]")
	WebElement otherfiles;
	@FindBy(how = How.XPATH, using = "//img[@class='close']")
	WebElement close;
	@FindBy(how = How.XPATH, using = "//a[text()=' Status']")
	WebElement status;
	@FindBy(how = How.XPATH, using = "//button[text()=' Re-Submit ']")
	WebElement resubmit;

	public BMRBatchClosureInitiation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void batchclosureinitiation() throws IOException, InterruptedException {
		javascript(batchclosureinitiation);
		javawait();
		excelutils.setExcelFile(excelFilePath, "productdetails");
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
		clickElement(get);
	    clickElement(createdrecord);
	}
	public void bprbatchclosureinitiation() throws IOException, InterruptedException {
		clickElement(bpr);
		javascript(batchclosureinitiation);
		javawait();
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
		clickElement(bprget);
	    clickElement(createdrecord);
	}
	public void batchclosureReinitiation() throws IOException, InterruptedException {
		javascript(batchclosureinitiation);
		javawait();
		clickElement(status);
		excelutils.setExcelFile(excelFilePath, "productdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
		}
	    clickElement(createdrecord);
	}
	public void bprbatchclosureReinitiation() throws IOException, InterruptedException {
		clickElement(bpr);
		javawait();
		javascript(batchclosureinitiation);
		javawait();
		clickElement(status);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
		}
	    clickElement(createdrecord);
	}
	
	public void resubmit() {
		clickElement(resubmit);
	}

	public void comments() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		//softassert.assertEquals("Please Enter Comments", commalert.getText());
		clickElement(comments);
		for (int i = 1; i < 2; i++) {
			comments.sendKeys(excelutils.getCellData(i, 10));
		}
	}
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	public void bprsubmit() throws InterruptedException {
		javawait();
		clickElement(bprsubmit);
	}
	public void bmrexefileupload() throws InterruptedException {
		
		exebmrattachment.click();
		Thread.sleep(10000);
		//exebmrattachment.sendKeys("C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMS v2.0 flow 4.pdf");
	}
	
	public void otherfiles() throws InterruptedException {
		
		otherfiles.click();
		Thread.sleep(10000);
      //  otherfiles.sendKeys("C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMS v2.0 flow 4.pdf");
	}
	
	public void close() throws InterruptedException {
		javawait();
		clickElement(close);
	}
	public void submitactivity(String pass) throws InterruptedException {
		javawait();
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
	public void bprsubmitactivity(String pass) throws InterruptedException {
		javawait();
		clickElement(No);
		javawait();
		clickElement(bprsubmit);
		javawait();
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		javawait();
	}
	public void submitactivity2(String pass) throws InterruptedException {
		javawait();
		javascript(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		javawait();
	}
	
	
	

}
