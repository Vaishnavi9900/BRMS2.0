package com.QAHODorInChargePageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;
import com.InitiatorPageObjects.BMRProductDetails;

public class HODBMRBPRProductDetails extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();
	static ExcelUtils excelUtils = new ExcelUtils();

	// using the Constants class values for excel file path
	static String excelFilePath =file;
	
	BMRProductDetails bmr = new BMRProductDetails(driver);

	@FindBy(how = How.XPATH, using = "//a[text()=' Product Details ']")
	WebElement productdetails;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//a[@id='Comments-tab']")
	WebElement commentstab;
	@FindBy(how = How.XPATH, using = "//a[@id='Product-tab']")
	WebElement productdetailstab;
	@FindBy(how = How.XPATH, using = "//textarea[@trim='blur']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//p[text()='Comments is required']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return ']")
	WebElement returnbutton;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[text()=' Priority ']")
	WebElement priority;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@class='ng-star-inserted odd'])[1]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Submit '])[2]")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//a[text()=' BPR Product Details']")
	WebElement bprdetails;

	public HODBMRBPRProductDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void commentsvalidate() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		
		javawait();
		//clickElement(tab);
		javascript(productdetails);
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
			clickElement(submit);
			softassert.assertEquals(commalert.getText(), "Comments is required");
		}
	}
	
	public void bprcomments() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "BPRproductdetails");
		javascript(productdetails);
		javawait();
		clickElement(bprdetails);
		javawait();
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	public void bprcommentsvalidate() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "BPRproductdetails");
		javascript(productdetails);
		javawait();
		clickElement(bprdetails);
		javawait();
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			javawait();
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
			javawait();
			clickElement(submit);
			softassert.assertEquals(commalert.getText(), "Comments is required");
		}
	}

	public void HODReturn(String comm) throws InterruptedException, IOException {

		clickElement(commentstab);
		javawait();
		clickElement(productdetailstab);
		clickElement(returnbutton);
		textbox(comments, " ");
		clickElement(returnbutton);
		softassert.assertEquals(commalert.getText(), "Comments is required");
		clickElement(comments);
		comments.sendKeys(comm);
		clickElement(returnbutton);

	}
	public void bprHODReturn(String comm) throws InterruptedException, IOException {
		clickElement(commentstab);
		javawait();
		clickElement(productdetailstab);
		clickElement(comments);
		comments.sendKeys(comm);
		clickElement(returnbutton);

	}
	
	public void bprHODApproval(String comm) throws InterruptedException, IOException {
		clickElement(commentstab);
		javawait();
		clickElement(productdetailstab);
		clickElement(comments);
		javawait();
		comments.sendKeys(comm);
		clickElement(submit);

	}


	public void HODSubmit(String comm) throws InterruptedException, IOException {

		clickElement(commentstab);
		clickElement(productdetailstab);
		clickElement(submit);
		textbox(comments, " ");
		clickElement(submit);
		softassert.assertEquals(commalert.getText(), "Comments is required");
		textbox(comments, comm);
		clickElement(submit);

	}

	public void priority() {
		clickElement(priority);
		System.out.println(priority.getCssValue("background-color"));
	}

	public void reinitiation(String comm) {
		textbox(comments, comm);
		clickElement(submit);
	}

	public void submitactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(submit);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	}

	public void submitactivity2(String pass) throws InterruptedException {

		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	}
}
