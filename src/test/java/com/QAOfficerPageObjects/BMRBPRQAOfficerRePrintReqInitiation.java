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

public class BMRBPRQAOfficerRePrintReqInitiation extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath = file;

	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[2]")
	WebElement tab2;
	@FindBy(how = How.XPATH, using = "//span[text()='Re Print Request Initiation']")
	WebElement reprintreqinitiation;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[3]")
	WebElement resubmitNo;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Submit '])[2]")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how =How.XPATH, using ="(//input[@type='text'])[1]")
	WebElement mprno;
	@FindBy(how =How.XPATH, using ="//button[text()=' Get ']")
	WebElement get;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add your comments here..']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//img[@class='close']")
	WebElement close;
	@FindBy(how = How.XPATH, using = "(//label[text()=' All Pages'])[1]")
	WebElement allpages1;
	@FindBy(how = How.XPATH, using = "(//label[text()=' All Pages'])[2]")
	WebElement allpages2;
	@FindBy(how = How.XPATH, using = "(//label[text()=' Specific Page'])[1]")
	WebElement specificpages1;
	@FindBy(how = How.XPATH, using = "(//label[text()=' Specific Page'])[2]")
	WebElement specificpages2;
	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Page Number'])[1]")
	WebElement pagenumber1;
	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Page Number'])[2]")
	WebElement pagenumber2;
	@FindBy(how = How.XPATH, using = "(//label[text()=' Specific Page Range'])[1]")
	WebElement specificpagerange1;
	@FindBy(how = How.XPATH, using = "(//label[text()=' Specific Page Range'])[2]")
	WebElement specificpagerange2;
	@FindBy(how = How.XPATH, using = "(//input[@placeholder='From Page No'])[1]")
	WebElement frompageno1;
	@FindBy(how = How.XPATH, using = "(//input[@placeholder='From Page No'])[2]")
	WebElement frompageno2;
	@FindBy(how = How.XPATH, using = "(//input[@placeholder='To Page No'])[1]")
	WebElement topageno1;
	@FindBy(how = How.XPATH, using = "(//input[@placeholder='To Page No'])[1]")
	WebElement topageno2;
	@FindBy(how = How.XPATH, using = "//p[text()=' Page number must be greater than zero. ']")
	WebElement lesspagealert;
	@FindBy(how = How.XPATH, using = "//p[text()=' Page number must be equal or less than document pages ']")
	WebElement morepagealert;
	@FindBy(how = How.XPATH, using = "//p[text()=' End page should be greater than start page. ']")
	WebElement only1pagealert;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Add '])[1]")
	WebElement add1;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Add '])[2]")
	WebElement add2;
	@FindBy(how = How.XPATH, using = "//button[@class='btn xsBtn']")
	WebElement delete;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link']")
	WebElement status;
	@FindBy(how = How.XPATH, using = "//button[@class='btn successBtn btn-block']")
	WebElement resubmit;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Returned '])[1]")
	WebElement returned;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']")
	WebElement reinitiationcommalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement resubmit2;
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[9]")
	WebElement formatgroup;
	@FindBy(how = How.XPATH, using = "(//input[@type='radio'])[4]")
	WebElement select;
	
	
	

	public BMRBPRQAOfficerRePrintReqInitiation(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}

	public void reprintreqinitiationtab() throws IOException, InterruptedException {
		javawait();
	//	clickElement(tab);
	//	clickElement(tab2);
		javascript(reprintreqinitiation);
		excelutils.setExcelFile(excelFilePath, "productdetails");
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
		clickElement(get);
	    clickElement(createdrecord);
	}
	public void bprreprintreqinitiationtab() throws IOException, InterruptedException {
		javawait();
	//	clickElement(tab);
	//	clickElement(tab2);
		clickElement(bpr);
		javascript(reprintreqinitiation);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
		clickElement(get);
	    clickElement(createdrecord);
	}
	public void reprintreqReinitiationtab() throws IOException, InterruptedException {
		javawait();
	//	clickElement(tab);
	//	clickElement(tab2);
		javascript(reprintreqinitiation);
		clickElement(status);
		clickElement(returned);
		excelutils.setExcelFile(excelFilePath, "productdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
		}
	    clickElement(createdrecord);
	}
	public void bprreprintreqReinitiationtab() throws IOException, InterruptedException {
		javawait();
	//	clickElement(tab);
	//	clickElement(tab2);
		clickElement(bpr);
		javascript(reprintreqinitiation);
		clickElement(status);
		clickElement(returned);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
		}
	    clickElement(createdrecord);
	}

	public void comments() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		clickElement(comments);
		for (int i = 1; i < 2; i++) {
			comments.sendKeys(excelutils.getCellData(i, 10));
		}
	}
	public void reinitiationcomments() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		softassert.assertEquals("Comments is required", reinitiationcommalert.getText());
		clickElement(comments);
		for (int i = 1; i < 2; i++) {
			comments.sendKeys(excelutils.getCellData(i, 10));
		}
	}
	
	public void selectallpages() throws InterruptedException {
		clickElement(allpages1);
		javawait();
		//clickElement(allpages2);
	}
	public void selectallpages2() throws InterruptedException {
		javawait();
		clickElement(allpages2);
	}
	
	public void formatgroup(String group) throws InterruptedException {
		javascript(formatgroup);
		formatgroup.sendKeys(group, Keys.ENTER);
		clickElement(select);
	}
	
	public void pageno1() throws InterruptedException {
		textbox(pagenumber1, "1");
		javawait();
		clickElement(add1);
	}
	public void pageno2() throws InterruptedException {
		textbox(pagenumber2, "1");
		javawait();
		clickElement(add2);
	}
	
	public void selectspecificpages1() throws InterruptedException {
		clickElement(specificpages1);
		textboxc(pagenumber1, "0");
		clickElement(add1);
		softassert.assertEquals(lesspagealert.getText(),"Page number must be greater than zero.");
		javawait();
		textboxc(pagenumber1, "10");
		clickElement(add1);
		softassert.assertEquals(morepagealert.getText(),"Page number must be equal or less than document pages");
		textboxc(pagenumber1, "1");
		clickElement(add1);
		javawait();
		clickElement(delete);
	}
	public void selectspecificpages2() throws InterruptedException {
		clickElement(specificpages2);
		textboxc(pagenumber2, "0");
		clickElement(add2);
		softassert.assertEquals("Page number must be greater than zero.", lesspagealert.getText());
		javawait();
		textboxc(pagenumber2, "10");
		clickElement(add2);
		softassert.assertEquals("Page number must be equal or less than document pages", morepagealert.getText());
		textboxc(pagenumber2, "1");
		clickElement(add2);
		javawait();
		clickElement(add2);
		//clickElement(delete);
	}
	
	
	public void fromtopage1() throws InterruptedException {
		textbox(frompageno1, "1");
		javawait();
		textbox(topageno1, "2");
		clickElement(add1);
	}
	public void fromtopage2() throws InterruptedException {
		textbox(frompageno2, "1");
		javawait();
		textbox(topageno2, "2");
		clickElement(add2);
	}
	
	public void selectspecificrange1() throws InterruptedException {
		javawait();
		clickElement(specificpagerange1);
		textboxc(frompageno1, "0");
		clickElement(add1);
		softassert.assertEquals("Page number must be greater than zero.", lesspagealert.getText());
		javawait();
		textboxc(frompageno1, "1");
		clickElement(add1);
		textboxc(frompageno1, "1");
		clickElement(add1);
		softassert.assertEquals("End page should be greater than start page.", only1pagealert.getText());
		textboxc(topageno2, "4");
		clickElement(add1);
		javawait();
//		clickElement(add1);
//		clickElement(delete);
	}
	
	public void submitactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(submit);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
	public void submitactivity2(String pass) throws InterruptedException {

		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
	public void resubmitactivity(String pass) throws InterruptedException {

		clickElement(resubmitNo);
		clickElement(resubmit);
		clickElement(Yes);
		javawait();
		textbox(password, pass);		
		clickElement(resubmit2);
		javawait();
		refresh();
	}
	
	public void resubmit() {
		clickElement(resubmit);
	}
	public void submit() {
		clickElement(submit);
	}
	
	public void resubmitreprint() {
		
	}

	
	
	
}
