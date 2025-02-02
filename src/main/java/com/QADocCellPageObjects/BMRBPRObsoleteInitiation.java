package com.QADocCellPageObjects;

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

public class BMRBPRObsoleteInitiation extends BRMSCommonMethods{
	
	  SoftAssert softassert = new SoftAssert();
		
		static ExcelUtils excelutils = new ExcelUtils();
		
		static String excelFilePath = file;
		
		@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
		WebElement bpr;
		@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
		WebElement tab;
		@FindBy(how = How.XPATH, using = "//span[text()='Master Obsolete Initiation']")
		WebElement obsoleteinitiation;
		@FindBy(how = How.XPATH, using = "(//div[@class='ng-input'])[1]")
		WebElement mprno;
		@FindBy(how = How.XPATH, using = "//button[text()=' Get ']")
		WebElement get;
		@FindBy(how = How.XPATH, using = "//input[@type='search']")
		WebElement search;
		@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
		WebElement createdrecord;
		@FindBy(how = How.XPATH, using = "//button[text()='Submit ']")
		WebElement submit;
		@FindBy(how = How.XPATH, using = "//textarea[@trim='blur']")
		WebElement comments;
		@FindBy(how = How.XPATH, using = "//p[text()='Comments is required']")
		WebElement commalert;
		@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[4]")
		WebElement Yes;
		@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[3]")
		WebElement No;
		@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
		WebElement password;
		@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
		WebElement submit2;
		@FindBy(how =How.XPATH, using="(//span[@class='ng-option-label ng-star-inserted'])[1]")
		WebElement mprnosel;
		@FindBy(how = How.XPATH, using = "//a[text()='Status']")
		WebElement status;
		@FindBy(how = How.XPATH, using = "//button[text()=' Returned ']")
		WebElement returned;
		@FindBy(how = How.XPATH, using = "//button[text()=' Approved ']")
		WebElement approved;
		@FindBy(how = How.XPATH, using = "//button[text()='Re-Submit ']")
		WebElement resubmit;
		@FindBy(how = How.XPATH, using = "//button[text()=' Obsolete ']")
		WebElement obsolete;
		@FindBy(how = How.XPATH, using = "//button[text()='Obsolete ']")
		WebElement bmrobsolete;
		
		
		public BMRBPRObsoleteInitiation(WebDriver driver) {
			PageFactory.initElements(driver, this);	
		}
		
		public void obsoleteInitiation() throws IOException, InterruptedException {
			excelutils.setExcelFile(excelFilePath, "Productdetails");
			javawait();
			clickElement(tab);
			javascript(obsoleteinitiation);
			//clickElement(mprno);
			for (int i = 1; i < 2; i++) {
//				clickElement(mprnosel);
//				mprno.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
				clickElement(get);
				Thread.sleep(2000);
				search.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
				clickElement(createdrecord);
			}
		}
		public void bprobsoleteInitiation() throws IOException, InterruptedException {
			javawait();
			clickElement(tab);
			clickElement(bpr);
			excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
			javascript(obsoleteinitiation);
			//clickElement(mprno);
			for (int i = 1; i < 2; i++) {
				javawait();
//				mprno.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
//				clickElement(mprnosel);
				clickElement(get);
				search.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
				clickElement(createdrecord);
			}
		}
		public void obsoleteReInitiation() throws IOException, InterruptedException {
			excelutils.setExcelFile(excelFilePath, "Productdetails");
			javawait();
			clickElement(tab);
			javascript(obsoleteinitiation);
			clickElement(status);
			clickElement(returned);
			for (int i = 1; i < 2; i++) {
				clickElement(search);
				search.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
				clickElement(createdrecord);
		}
		}
		public void bprobsoleteReInitiation() throws IOException, InterruptedException {
			javawait();
			clickElement(tab);
			clickElement(bpr);
			excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
			javascript(obsoleteinitiation);
			clickElement(status);
			clickElement(returned);
			for (int i = 1; i < 2; i++) {
				clickElement(search);
				Thread.sleep(2000);
				search.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
				clickElement(createdrecord);
		}
		}
		
		public void finalobsolete() throws IOException, InterruptedException {
			excelutils.setExcelFile(excelFilePath, "Productdetails");
			javawait();
			clickElement(tab);
			javascript(obsoleteinitiation);
			clickElement(status);
			clickElement(approved);
			for (int i = 1; i < 2; i++) {
				clickElement(search);
				Thread.sleep(2000);
				search.sendKeys(excelutils.getCellData(i, 14));
				clickElement(createdrecord);
		}
		}
		public void bprfinalobsolete() throws IOException, InterruptedException {
			javawait();
			clickElement(tab);
			clickElement(bpr);
			excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
			javawait();
			javascript(obsoleteinitiation);
			clickElement(status);
			clickElement(approved);
			for (int i = 1; i < 2; i++) {
				clickElement(search);
				Thread.sleep(2000);
				search.sendKeys(excelutils.getCellData(i, 14));
				clickElement(createdrecord);
		}
		}
		
		public void comments(String comm) {
			softassert.assertEquals("Comments is required", commalert.getText());
			clickElement(comments);
			comments.sendKeys(comm);
		}
		
		public void submit() throws InterruptedException {
			javawait();
			clickElement(submit);
		}
		public void obsolete() throws InterruptedException {
			javawait();
			clickElement(obsolete);
		}
		public void bmrobsolete() throws InterruptedException {
			javawait();
			clickElement(bmrobsolete);
		}
		public void resubmit() throws InterruptedException {
			javawait();
			clickElement(resubmit);
		}
		public void obsoleteactivity(String pass) throws InterruptedException {

			clickElement(No);
			clickElement(obsolete);
			clickElement(Yes);
			javawait();
			textbox(password, pass);
			clickElement(submit2);
			javawait();
		}
		public void bmrobsoleteactivity(String pass) throws InterruptedException {

			clickElement(No);
			clickElement(bmrobsolete);
			clickElement(Yes);
			javawait();
			textbox(password, pass);
			clickElement(submit2);
			javawait();
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
		public void resubmitactivity(String pass) throws InterruptedException {

			clickElement(No);
			clickElement(resubmit);
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
