package com.ProductionInchargePageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRBPRObsoleteReview extends BRMSCommonMethods{
	 SoftAssert softassert = new SoftAssert();
		
		static ExcelUtils excelutils = new ExcelUtils();
		
		static String excelFilePath =file;
		
		@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
		WebElement bpr;
		@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
		WebElement tab;
		@FindBy(how = How.XPATH, using = "//span[text()='Master Obsolete Review']")
		WebElement obsoletereview;
		@FindBy(how = How.XPATH, using = "//input[@type='search']")
		WebElement search;
		@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
		WebElement createdrecord;
		@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
		WebElement submit;
		@FindBy(how = How.XPATH, using = "//textarea[@trim='blur']")
		WebElement comments;
		@FindBy(how = How.XPATH, using = "//p[text()='Comments is required']")
		WebElement commalert;
		@FindBy(how = How.XPATH, using = "(//button[@type='button'])[3]")
		WebElement Yes;
		@FindBy(how = How.XPATH, using = "(//button[@type='button'])[5]")
		WebElement No;
		@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
		WebElement password;
		@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
		WebElement submit2;
		@FindBy(how = How.XPATH, using = "//button[text()=' Return ']")
		WebElement returnbutton;
		
		
		
		public BMRBPRObsoleteReview(WebDriver driver) {
			PageFactory.initElements(driver, this);	
		}
		
		
		public void obsoleteReview() throws IOException, InterruptedException {
			excelutils.setExcelFile(excelFilePath, "Productdetails");
			javawait();
		//	clickElement(tab);
			javascript(obsoletereview);
			javawait();
			clickElement(search);
			for (int i = 1; i < 2; i++) {
				search.sendKeys(excelutils.getCellData(i, 14));
				clickElement(createdrecord);
			}
		}
		public void bprobsoleteReview() throws IOException, InterruptedException {
			javawait();
		//	clickElement(tab);
			clickElement(bpr);
			excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
			javascript(obsoletereview);
			javawait();
			clickElement(search);
			for (int i = 1; i < 2; i++) {
				search.sendKeys(excelutils.getCellData(i, 14));
				clickElement(createdrecord);
			}
		}
		
		public void submit() throws InterruptedException {
			javawait();
			clickElement(submit);
		}
		
		public void returnbutton() throws InterruptedException {
			javawait();
			clickElement(returnbutton);
		}
		public void comments(String comm) {
			softassert.assertEquals("Comments is required", commalert.getText());
			clickElement(comments);
			comments.sendKeys(comm);
		}
		public void submitactivity(String pass) throws InterruptedException {

			clickElement(No);
			clickElement(submit);
			clickElement(Yes);
			javawait();
			textbox(password, pass);
			clickElement(submit2);
		}
		public void returnactivity(String pass) throws InterruptedException {

			clickElement(No);
			clickElement(returnbutton);
			clickElement(Yes);
			javawait();
			textbox(password, pass);
			clickElement(submit2);
		}
}
