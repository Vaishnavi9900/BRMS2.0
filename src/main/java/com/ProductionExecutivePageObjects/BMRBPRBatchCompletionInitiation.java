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

public class BMRBPRBatchCompletionInitiation extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();
	
	static String excelFilePath = file;
	
	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//span[text()='Batch Completion Initiation']")
	WebElement batchcompletiontab;
	@FindBy(how =How.XPATH, using ="(//input[@type='text'])[1]")
	WebElement mprno;
	@FindBy(how =How.XPATH, using ="//button[text()=' Get']")
	WebElement get;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please Enter Comments ']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='dateFormat']")
	WebElement dateformat;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='manufacturingDate']")
	WebElement manufacturingdate;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='expiryDate']")
	WebElement expirydate;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link']")
	WebElement status;
	@FindBy(how = How.XPATH, using = "//button[@class='btn successBtn btn-block']")
	WebElement resubmit;
	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[3]")
	WebElement returned;
	@FindBy(how = How.XPATH, using = "//h6[text()='Blend Batch is in Progress']")
	WebElement batchalert;
	@FindBy(how = How.XPATH, using = "//modal-container[@class='modal fade show']")
	WebElement batchalertclick;
	
	
	public BMRBPRBatchCompletionInitiation(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void batchcompletiontab() throws InterruptedException, IOException {
		javawait();
		clickElement(tab);
		javascript(batchcompletiontab);
		excelutils.setExcelFile(excelFilePath, "productdetails");
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
		clickElement(get);
	    clickElement(createdrecord);
		
	}
	public void bprbatchcompletiontab() throws InterruptedException, IOException {
		javawait();
		clickElement(tab);
		clickElement(bpr);
		javascript(batchcompletiontab);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
		clickElement(get);
	    clickElement(createdrecord);
		
	}
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	
	public void reinitiation() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
		clickElement(tab);
		javascript(batchcompletiontab);
		clickElement(status);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	public void bprreinitiation() throws IOException, InterruptedException {
		javawait();
		clickElement(tab);
		clickElement(bpr);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javascript(batchcompletiontab);
		clickElement(status);
		clickElement(returned);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	public void resubmit() throws InterruptedException {
		javawait();
		clickElement(resubmit);
	}
	
	public void comments() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		clickElement(comments);
		for (int i = 1; i < 2; i++) {
			comments.sendKeys(excelutils.getCellData(i, 10));
		}
	}
	
	public void dateformats(String mandate) throws InterruptedException {
		dropdown(dateformat);
		clickElement(dateformat);
		dateformat.sendKeys("DD/MM/YYYY");
		Thread.sleep(2000);
		//clickElement(manufacturingdate);
		manufacturingdate.sendKeys(mandate);
//		javawait();
//		textbox(expirydate, expdate);
		
	}
	
	public void submitactivity(String pass) throws InterruptedException {
 		
 		javascript(No);
 		clickElement(submit);
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
public void resubmitactivity(String pass) throws InterruptedException {
 		
 		clickElement(No);
 		clickElement(resubmit);
 		clickElement(Yes);
 		javawait();
 		textbox(password, pass);
 		clickElement(submit2);
 		javawait();
 	}
}
