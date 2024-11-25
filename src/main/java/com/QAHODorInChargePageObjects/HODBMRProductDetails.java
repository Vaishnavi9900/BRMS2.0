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

public class HODBMRProductDetails extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();
	static ExcelUtils excelUtils = new ExcelUtils();

	// using the Constants class values for excel file path
	static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";

	@FindBy(how = How.XPATH, using = "//a[text()=' Product Details ']")
	WebElement productdetails;
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
	@FindBy(how = How.XPATH, using = "//button[text()='Yes']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()='No'])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	WebElement submit2;

	public HODBMRProductDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void commentsvalidate() throws IOException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		javascript(productdetails);
		try {
			javawait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 1));
			clickElement(createdrecord);
			clickElement(submit);
			softassert.assertEquals(commalert.getText(), "Comments is required");
		}
	}

	public void HODReturn(String comm) throws InterruptedException, IOException {

		clickElement(commentstab);
		javawait();
		clickElement(productdetailstab);
		javawait();
		clickElement(returnbutton);
		javawait();
		textbox(comments, " ");
		clickElement(returnbutton);
		softassert.assertEquals(commalert.getText(), "Comments is required");
		textbox(comments, comm);
		javawait();
		clickElement(returnbutton);

	}

	public void HODSubmit(String comm) throws InterruptedException, IOException {

		clickElement(commentstab);
		javawait();
		clickElement(productdetailstab);
		javawait();
		clickElement(submit);
		javawait();
		textbox(comments, " ");
		clickElement(submit);
		softassert.assertEquals(commalert.getText(), "Comments is required");
		textbox(comments, comm);
		javawait();
		clickElement(submit);

	}

	public void priority() {
		clickElement(priority);
		System.out.println(priority.getCssValue("background-color"));
	}

	public void reinitiation(String comm) {
		textbox(comments, comm);
		try {
			javawait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement(submit);
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
		clickElement(ok);
	}

	public void submitactivity2(String pass) throws InterruptedException {

		clickElement(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		clickElement(ok);
	}
}
