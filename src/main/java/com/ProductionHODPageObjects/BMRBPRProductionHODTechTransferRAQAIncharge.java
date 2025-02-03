package com.ProductionHODPageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRBPRProductionHODTechTransferRAQAIncharge extends BRMSCommonMethods{
	
	SoftAssert softassert = new SoftAssert();
	
	static ExcelUtils excelutils = new ExcelUtils();
	
	static String excelFilePath = file;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Master Approval']")
	WebElement masterapprovaltab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[text()='Return ']")
	WebElement returnbutton;
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
	@FindBy(how = How.XPATH, using = "(//button[text()=' Submit '])[2]")
	WebElement submit2;
	
	
	public BMRBPRProductionHODTechTransferRAQAIncharge(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void masterapprovaltab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
		clickElement(tab);
		javascript(masterapprovaltab);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	public void bprmasterapprovaltab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
		clickElement(tab);
		clickElement(bpr);
		javascript(masterapprovaltab);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	
	public void comments(String comm) throws InterruptedException {
		softassert.assertEquals("Comments is required", commalert.getText());
		clickElement(comments);
		comments.sendKeys(comm);
	}
}
