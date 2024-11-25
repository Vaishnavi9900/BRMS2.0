package com.InitiatorPageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRMasterCancellationp extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();
	static ExcelUtils excelUtils = new ExcelUtils();

	// using the Constants class values for excel file path
	static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";

	@FindBy(how = How.XPATH, using = "//span[text()='Master Cancel Initiation']")
	WebElement mastercancelinitiationtab;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how =How.XPATH, using ="(//input[@type='text'])[1]")
	WebElement mprno;
	@FindBy(how =How.XPATH, using ="//button[text()=' Get ']")
	WebElement get;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//textarea[@trim='blur']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//a[text()=' Status']")
	WebElement status;
	@FindBy(how = How.XPATH, using = "//button[text()=' Returned ']")
	WebElement returned;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[text()='Submit'])[2]")
	WebElement submit2;
	

	public BMRMasterCancellationp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void mastercancellationtab() throws IOException, InterruptedException {
		javascript(mastercancelinitiationtab);
		javawait();
		excelUtils.setExcelFile(excelFilePath, "productdetails");
		clickElement(mprno);
		for (int i = 1; i <2; i++) {
			mprno.sendKeys(excelUtils.getCellData(i, 1));
		}
		clickElement(get);
	    clickElement(createdrecord);
	}

	public void comments() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		clickElement(comments);
		javawait();
		for (int i = 1; i < 2; i++) {
			comments.sendKeys(excelUtils.getCellData(i, 10));
		}
	}
	
	public void submit() {
		clickElement(submit);
	}
	
	public void submitactivity(String pass) throws InterruptedException {

		clickElement(No);
		javawait();
		clickElement(submit);
		javawait();
		clickElement(Yes);
		javawait();
//		textbox(password, pass);
//		javawait();
//		clickElement(submit2);
//		javawait();
		clickElement(ok);
	}
	
	
}
