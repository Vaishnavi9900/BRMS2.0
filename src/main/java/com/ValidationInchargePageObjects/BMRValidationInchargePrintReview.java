package com.ValidationInchargePageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRValidationInchargePrintReview extends BRMSCommonMethods{

	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";

	@FindBy(how = How.XPATH, using = "//span[text()='Print Request Review']")
	WebElement printreqreview;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()=' Reviewed']")
	WebElement reviewed;
	@FindBy(how = How.XPATH, using = "//button[text()=' Returned']")
	WebElement returned;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return']")
	WebElement returnbutton;
	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please Enter Comments ']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//span[@class='dropdown-btn']")
	WebElement batchtype;
	@FindBy(how = How.XPATH, using = "//div[text()='Select All']")
	WebElement selectall;
	@FindBy(how = How.XPATH, using = "//div[text()='Commerical']")
	WebElement commercial;
	@FindBy(how = How.XPATH, using = "//div[text()='Validation']")
	WebElement validation;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please Select Batch Type ']")
	WebElement batchtypealert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return To Production Executive']")
	WebElement returntoprodexe;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return To Production Incharge']")
	WebElement returntoprodincharge;
	@FindBy(how = How.XPATH, using = "//button[text()='Yes']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()='No'])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[text()='Submit'])[2]")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//img[@class='close']")
	WebElement close;

	public BMRValidationInchargePrintReview(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void printreqreviewtab() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javascript(printreqreview);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 1));
			clickElement(createdrecord);
			
		}
	}

	public void commentsbatchtype(String comm) throws InterruptedException {
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		textbox(comments, comm);
		javawait();
	    softassert.assertEquals("Please Select Batch Type", batchtypealert.getText());
	    clickElement(batchtype);
	    javawait();
		clickElement(commercial);
	}
	
	public void comments(String comm) throws InterruptedException {
		
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		javawait();
		textbox(comments, comm);
		
	}
	
	public void close() {
		clickElement(close);
	}
	
	public void reReview() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javascript(printreqreview);
		clickElement(returned);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 1));
			clickElement(createdrecord);			
		}
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
	
	public void submit() {
		clickElement(submit);
	}
	public void returnbutton() {
		clickElement(returnbutton);
	}

	public void submitactivity2(String pass) throws InterruptedException {

		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		javawait();
		clickElement(ok);
	}
	
	public void returntoexeactivity(String pass) throws InterruptedException {
		clickElement(returntoprodexe);
		clickElement(No);
		javawait();
		clickElement(returntoprodexe);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		javawait();
		clickElement(ok);
	}
	public void returntoinchargeactivity(String pass) throws InterruptedException {
		clickElement(returntoprodincharge);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		javawait();
		clickElement(ok);
	}
	

}
