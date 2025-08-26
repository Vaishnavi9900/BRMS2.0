package com.QAHODorInChargePageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class CFTActivity extends BRMSCommonMethods {
	
	SoftAssert softassert = new SoftAssert();
	   static ExcelUtils excelUtils = new ExcelUtils();
	    
	    //using the Constants class values for excel file path 
	    static String excelFilePath = file;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Master Draft Review']") WebElement masterdraftrevtab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[2]")
	WebElement tab2;
	@FindBy(how = How.XPATH, using = "//*[@id=\"myModal\"]/div/div/div[2]/div/div/div[2]/div/div[1]/div[1]/span/img") WebElement templateprep;
	@FindBy(how = How.XPATH, using = "//*[@id=\"myModal\"]/div/div/div[2]/div/div/div[2]/div/div[1]/div[2]/span/img") WebElement changehostorytemplate;
	@FindBy(how = How.XPATH, using = "//textarea[@trim='blur']") WebElement comments;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']") WebElement commalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return ']") WebElement returnbutton;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']") WebElement submit;
	@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[5]")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[4]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']") WebElement ok;
	@FindBy(how = How.XPATH, using = "//input[@type='search']") WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]") WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//a[text()='Review']") WebElement reviewtab;
	@FindBy(how = How.XPATH, using = "//a[text()='Product Details']") WebElement productdetails;
	@FindBy(how =How.XPATH, using ="//a[text()='Comments']") WebElement commentstab;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Submit '])[2]")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	public CFTActivity(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void CFTreview(String comm) throws IOException, InterruptedException {
		javawait();
	//	clickElement(tab);
		//clickElement(tab2);
		javascript(masterdraftrevtab);
		excelUtils.setExcelFile(excelFilePath,"Productdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
			clickElement(reviewtab);
			clickElement(commentstab);
			clickElement(productdetails);
			clickElement(templateprep);
			Thread.sleep(40000);
			clickElement(changehostorytemplate);
			Thread.sleep(40000);
			clickElement(submit);
			softassert.assertEquals(commalert.getText(), "Comments is required");
			textbox(comments, " ");
			clickElement(submit);
			softassert.assertEquals(commalert.getText(), "Comments is required");
			clickElement(comments);
			comments.sendKeys(comm);
			clickElement(submit);
		}
	}
	public void bprCFTreview(String comm) throws IOException, InterruptedException {
		javawait();
	//	clickElement(tab);
		//clickElement(tab2);
		clickElement(bpr);
		javascript(masterdraftrevtab);
		excelUtils.setExcelFile(excelFilePath,"BPRproductdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
			clickElement(reviewtab);
			clickElement(commentstab);
			clickElement(productdetails);
			clickElement(templateprep);
			Thread.sleep(40000);
			clickElement(changehostorytemplate);
			Thread.sleep(40000);
			clickElement(productdetails);
			clickElement(submit);
			softassert.assertEquals(commalert.getText(), "Comments is required");
			textbox(comments, " ");
			clickElement(submit);
			softassert.assertEquals(commalert.getText(), "Comments is required");
			comments.click();
			comments.sendKeys(comm);
			clickElement(submit);
		}
	}
	
	public void CFTreturn(String comm) throws IOException, InterruptedException {
		javawait();
	//	clickElement(tab);
		//clickElement(tab2);
		javascript(masterdraftrevtab);
		excelUtils.setExcelFile(excelFilePath,"Productdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
			clickElement(reviewtab);
			clickElement(commentstab);
			clickElement(productdetails);
			clickElement(templateprep);
			Thread.sleep(40000);
			clickElement(changehostorytemplate);
			Thread.sleep(40000);
			clickElement(returnbutton);
			softassert.assertEquals(commalert.getText(), "Comments is required");
			textbox(comments, " ");
			comments.click();
			comments.sendKeys(comm);
			clickElement(returnbutton);
	}
	}
	public void bprCFTreturn(String comm) throws IOException, InterruptedException {
		javawait();
	//	clickElement(tab);
		//clickElement(tab2);
		clickElement(bpr);
		javascript(masterdraftrevtab);
		excelUtils.setExcelFile(excelFilePath,"BPRproductdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
			clickElement(reviewtab);
			clickElement(commentstab);
			clickElement(productdetails);
			clickElement(templateprep);
			Thread.sleep(40000);
			clickElement(changehostorytemplate);
			Thread.sleep(40000);
			clickElement(returnbutton);
			softassert.assertEquals(commalert.getText(), "Comments is required");
			textbox(comments, " ");
			comments.click();
			comments.sendKeys(comm);
			clickElement(returnbutton);
	}
	}
	
	public void submitactivity(String pass) throws InterruptedException {
 		
 		javascript(No);
 		clickElement(submit);
 		Thread.sleep(2000);
 		clickElement(Yes);
 		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
 	}
	
	public void returnactivity(String pass) throws InterruptedException {
 		
		Thread.sleep(2000);
 		clickElement(No);
 		Thread.sleep(2000);
 		clickElement(returnbutton);
 		Thread.sleep(2000);
 		clickElement(Yes);
 		Thread.sleep(2000);
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
 	}

	 public void submitactivity2(String pass) throws InterruptedException {

		    Thread.sleep(2000);
		 	clickElement(Yes);
		 	javawait();
			textbox(password, pass);
			clickElement(submit2);
			javawait();
			refresh();
		  }
}
