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

	static String excelFilePath = file;

	@FindBy(how = How.XPATH, using = "//span[text()='Print Request Issuance']")
	WebElement printissuance;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//span[text()='Additional Page Print Request Issuance']")
	WebElement addtionalpageissuance;
	@FindBy(how = How.XPATH, using = "//span[text()='Re Print Request Initiation']")
	WebElement reprintreqinitiation;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()=' Issue']")
	WebElement issue;
	@FindBy(how = How.XPATH, using = "//button[text()=' Issue ']")
	WebElement additionalissue;
	@FindBy(how = How.XPATH, using = "//button[text()=' Print']")
	WebElement print;
	@FindBy(how = How.XPATH, using = "//button[text()=' Print ']")
	WebElement additionalprint;
	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add your comments here..']")
	WebElement addcomments;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please Enter Comments ']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']")
	WebElement addcommalert;
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
	@FindBy(how = How.XPATH, using = "//img[@class='close']")
	WebElement close;
	@FindBy(how =How.XPATH, using ="//select[@formcontrolname='formatNumber']")
	WebElement formatnumber;
	@FindBy(how =How.XPATH, using ="//select[@formcontrolname='formatTitle']")
	WebElement formattitle;
	@FindBy(how =How.XPATH, using ="//select[@formcontrolname='versionNumber']")
	WebElement version;
	@FindBy(how =How.XPATH, using ="//input[@formcontrolname='noOfCopies']")
	WebElement noofcopies;
	@FindBy(how =How.XPATH, using ="//button[text()=' Reject ']")
	WebElement reject;
	@FindBy(how =How.XPATH, using ="//a[text()=' Status']")
	WebElement status;
	@FindBy(how =How.XPATH, using ="(//button[text()=' Approved '])[1]")
	WebElement approved;
	@FindBy(how =How.XPATH, using ="(//button[text()=' Issued '])[1]")
	WebElement issued;

	public BMRQAOfficerIssuanceandPrint(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void printissuancetab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
		clickElement(tab);
		javascript(printissuance);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
			
		}
	}
	public void additionalpageprintissuancetab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
		clickElement(tab);
		javascript(addtionalpageissuance);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
			
		}
	}
	public void reprintissuancetab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
		clickElement(tab);
		javascript(reprintreqinitiation);
		clickElement(status);
		clickElement(issued);
		Thread.sleep(2000);
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	public void reprinttab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
		clickElement(tab);
		javascript(reprintreqinitiation);
		clickElement(status);
		clickElement(approved);
		Thread.sleep(2000);
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
	}
	}
	
	
	public void printcopydetails() throws InterruptedException {
		textbox(formatnumber, "Blend-01-00");
		javawait();
		textbox(formattitle, "Blend Format");
		javawait();
		textbox(version, "00");
		javawait();
		textbox(noofcopies, "2");
	}
	public void bulkprintcopydetails() throws InterruptedException {
		textbox(formatnumber, "Bulk-001-00");
		javawait();
		textbox(formattitle, "bulk Format");
		javawait();
		textbox(version, "00");
		javawait();
		textbox(noofcopies, "2");
	}

	public void comments(String comm) throws IOException {

		softassert.assertEquals("Please Enter Comments", commalert.getText());
		textbox(comments, comm);
	}
	public void additionalcomments(String comm) throws IOException {

		softassert.assertEquals("Comments is required", addcommalert.getText());
		clickElement(addcomments);
		addcomments.sendKeys(comm);
	}
	
	public void comments2(String comm) {
		textbox(comments, comm);
	}
	
	public void close() throws InterruptedException {
		javawait();
		clickElement(close);
	}
	
	public void print() throws InterruptedException {
		javawait();
		clickElement(print);
	}

	public void reject() throws InterruptedException {
		javawait();
		clickElement(reject);
	}
	public void issue() throws InterruptedException {
		javawait();
		clickElement(issue);
	}
	public void additionalissue() throws InterruptedException {
		javawait();
		clickElement(additionalissue);
	}
	public void additionalprint() throws InterruptedException {
		javawait();
		clickElement(additionalprint);
	}

	public void additionalissueactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(additionalissue);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	}
	public void printactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(print);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	}
	public void additionalprintactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(additionalprint);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	}


	public void issueactivity2(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(issue);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	}
	public void rejectactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(reject);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	}
	
	
	
	

}
