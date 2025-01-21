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
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//a[text()='Return']")
	WebElement returntab;
	@FindBy(how = How.XPATH, using = "//a[text()=' Status']")
	WebElement status;
	

	public BPRRePackingReqInitiation(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}

	public void repcakingqtyinitiation() throws InterruptedException, IOException {
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
	//	clickElement(tab);
		clickElement(bpr);
		javascript(repackingreqinitiation);
//		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			//mprno.sendKeys(excelutils.getCellData(i, 2));
			clickElement(get);
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	public void repcakingqtyReinitiation() throws InterruptedException, IOException {
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
	//	clickElement(tab);
		clickElement(bpr);
		javascript(repackingreqinitiation);
		clickElement(status);
//		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			//mprno.sendKeys(excelutils.getCellData(i, 2));
			clickElement(get);
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	
	public void repackingdetails() {
		softassert.assertEquals("Re-Packing Quantity is required", repackingqtyalert.getText());
		clickElement(repackingqty);
		repackingqty.sendKeys("5");
	}
	
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	
public void comments(String comm) throws IOException {
		
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		clickElement(comments);
		comments.sendKeys(comm);
	}

	public void submitactivity(String pass) throws InterruptedException {

		clickElement(No);
		javawait();
		clickElement(submit);
		javawait();
		javascript(Yes);
		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
		javawait();

	}

}
