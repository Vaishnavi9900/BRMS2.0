package com.ProductionExecutivePageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRBatchCompletionInitiation extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();
	
	static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";
	
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
	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link']")
	WebElement status;
	@FindBy(how = How.XPATH, using = "//button[@class='btn successBtn btn-block']")
	WebElement resubmit;
	
	
	public BMRBatchCompletionInitiation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void batchcompletiontab() throws InterruptedException, IOException {
		javascript(batchcompletiontab);
		javawait();
		excelutils.setExcelFile(excelFilePath, "productdetails");
		clickElement(mprno);
		for (int i = 1; i <2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 1));
		}
		clickElement(get);
	    clickElement(createdrecord);
		
	}
	public void submit() {
		clickElement(submit);
	}
	
	public void reinitiation() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javascript(batchcompletiontab);
		clickElement(status);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 1));
			clickElement(createdrecord);
		}
	}
	public void resubmit() {
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
	
	public void dateformats(String mandate, String expdate) throws InterruptedException {
		dropdown(dateformat);
		javawait();
		textbox(manufacturingdate,mandate);
		javawait();
		textbox(expirydate, expdate);
		
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
public void resubmitactivity(String pass) throws InterruptedException {
 		
 		clickElement(No);
 		javawait();
 		clickElement(resubmit);
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
