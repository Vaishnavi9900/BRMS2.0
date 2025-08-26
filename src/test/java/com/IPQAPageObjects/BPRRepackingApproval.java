package com.IPQAPageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BPRRepackingApproval extends BRMSCommonMethods{
	
	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath = file;

	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[2]")
	WebElement tab2;
	@FindBy(how = How.XPATH, using = "//span[text()='Re-Packing Request Approval']")
	WebElement repackingreqapproval;
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[1]")
	WebElement mprno;
	@FindBy(how = How.XPATH, using = "//div[@role='option']")
	WebElement mpnosel;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement get;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[@class='btn successBtn btn-block mt-0 ng-star-inserted']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[@class='btn outLineBtn btn-block mt-0 mr-3 ng-star-inserted']")
	WebElement returnbutton;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add your comments here..']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//p[text()='Please select an option.']")
	WebElement batchselalert;
	@FindBy(how = How.XPATH, using = "(//input[@type='radio'])[1]")
	WebElement radioYes;
	@FindBy(how = How.XPATH, using = "(//input[@type='radio'])[2]")
	WebElement radioNo;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[3]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Submit '])[2]")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//a[text()='Return']")
	WebElement returntab;
	

	public BPRRepackingApproval(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void repackingapproval() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
		//clickElement(tab);
		//clickElement(tab2);
		clickElement(bpr);
		javascript(repackingreqapproval);
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	
	public void batchseldetails() {
		softassert.assertEquals("Please select an option.", batchselalert.getText());
		//clickElement(radioYes);
		clickElement(radioNo);
	}
	
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	public void returnbutton() throws InterruptedException {
		javawait();
		clickElement(returnbutton);
	}
	
public void comments(String comm) throws IOException {
		
		softassert.assertEquals("Comments is required", commalert.getText());
		clickElement(comments);
		comments.sendKeys(comm);
	}

	public void submitactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(submit);
		javascript(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
	public void returnactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(returnbutton);
		javascript(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}

}
