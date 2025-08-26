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

public class BPRRePackingReqInitiation extends BRMSCommonMethods{
	
	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath = file;

	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[2]")
	WebElement tab2;
	@FindBy(how = How.XPATH, using = "//span[text()='Re-Packing Request Initiation']")
	WebElement repackingreqinitiation;
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
	@FindBy(how = How.XPATH, using = "//button[@data-target='#confirmation']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add your comments here..']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments are required']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='rePackingQuantity']")
	WebElement repackingqty;
	@FindBy(how = How.XPATH, using = "//div[text()=' Re-Packing Quantity is required ']")
	WebElement repackingqtyalert;
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
	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[4]")
	WebElement returntab;
	@FindBy(how = How.XPATH, using = "//a[text()=' Status']")
	WebElement status;
	@FindBy(how = How.XPATH, using = "//button[@data-toggle='modal']")
	WebElement resubmit;
	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
	WebElement resubmit2;
	

	public BPRRePackingReqInitiation(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}

	public void repcakingqtyinitiation() throws InterruptedException, IOException {
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
	//	clickElement(tab);
		//clickElement(tab2);
		clickElement(bpr);
		javascript(repackingreqinitiation);
//		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			//mprno.sendKeys(excelutils.getCellData(i, 2));
			clickElement(get);
			Thread.sleep(2000);
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	public void repcakingqtyReinitiation() throws InterruptedException, IOException {
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
	//	clickElement(tab);
		//clickElement(tab2);
		clickElement(bpr);
		Thread.sleep(2000);
		javascript(repackingreqinitiation);
		clickElement(status);
		Thread.sleep(2000);
		clickElement(returntab);
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			//mprno.sendKeys(excelutils.getCellData(i, 2));
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	
	public void repackingdetails() {
		softassert.assertEquals("Re-Packing Quantity is required", repackingqtyalert.getText());
		clickElement(repackingqty);
		repackingqty.sendKeys("2");
	}
	public void repackingdetails1() {
		clickElement(repackingqty);
		repackingqty.clear();
		repackingqty.sendKeys("2");
	}
	
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	public void resubmit() throws InterruptedException {
		javawait();
		clickElement(resubmit);
	}
	
 public void comments(String comm) throws IOException {
		
		softassert.assertEquals("Comments are required", commalert.getText());
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
	public void resubmitactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(resubmit);
		javascript(Yes);
		javawait();
		textbox(password, pass);
		clickElement(resubmit2);
		javawait();
		refresh();
	}

}
