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

public class BMRQAOfficerIssuanceandPrint extends BRMSCommonMethods {
	
	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";

	@FindBy(how = How.XPATH, using = "//span[text()='Print Request Issuance']")
	WebElement printissuance;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()=' Issue']")
	WebElement issue;
	@FindBy(how = How.XPATH, using = "//button[text()=' Print']")
	WebElement print;
	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please Enter Comments ']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//button[text()='Yes']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()='No'])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//img[@class='close']")
	WebElement close;

	public BMRQAOfficerIssuanceandPrint(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void printissuancetab() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javascript(printissuance);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 1));
			clickElement(createdrecord);
		}
	}

	public void comments(String comm) throws IOException {

		softassert.assertEquals("Please Enter Comments", commalert.getText());
		textbox(comments, comm);
	}
	
	public void comments2(String comm) {
		textbox(comments, comm);
	}
	
	public void close() {
		clickElement(close);
	}
	
	public void print() {
		clickElement(print);
	}
	public void issue() {
		clickElement(issue);
	}

	public void printactivity(String pass) throws InterruptedException {

		clickElement(No);
		javawait();
		clickElement(print);
		javawait();
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		javawait();
		clickElement(ok);
	}

	public void issueactivity2(String pass) throws InterruptedException {

		clickElement(No);
		javawait();
		clickElement(issue);
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
