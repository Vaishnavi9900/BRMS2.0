package com.QADocCellPageObjects;

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

public class BMRMasterPreparationapprovals extends BRMSCommonMethods {
	
	SoftAssert softassert = new SoftAssert();
	   static ExcelUtils excelUtils = new ExcelUtils();
	    
	    //using the Constants class values for excel file path 
	    static String excelFilePath = file;
	
	    @FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
		WebElement tab;
	@FindBy(how = How.XPATH, using = "//span[text()='Master Preparation Request Approval']") WebElement masterprepapprovaltab;
	@FindBy(how = How.XPATH, using = "//a[@id='Comments1-tab']") WebElement commentstab;
	@FindBy(how = How.XPATH, using = "//a[@id='Product1-tab']") WebElement productdetailstab;
	@FindBy(how = How.XPATH, using = "//textarea[@trim='blur']") WebElement comments;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']") WebElement commalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Reject ']") WebElement reject;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']") WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[text()=' Priority ']") WebElement priority;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']") WebElement ok;
	@FindBy(how = How.XPATH, using = "//input[@type='search']") WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]") WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Submit '])[2]")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "//span[text()='Master Preparation Request Approval']")
	WebElement masterprereqapprovaltab;
	
	
	public BMRMasterPreparationapprovals(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void masterprepapprovaltab() {
		javascript(masterprepapprovaltab);
	}
	
	public void masterprerejection(String comm) throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"Productdetails");
		javawait();
		clickElement(tab);
		masterprepapprovaltab();
		clickElement(masterprepapprovaltab);
		 clickElement(search);
		 for (int i = 1; i < 2; i++) {
				search.sendKeys(excelUtils.getCellData(i, 14));
		    	clickElement(createdrecord);
		clickElement(commentstab);
    	clickElement(productdetailstab);
    	clickElement(reject);
    	textbox(comments, " ");
    	clickElement(reject);
    	softassert.assertEquals(commalert.getText(), "Comments is required");
    	textbox(comments, comm);
    	assert reject.isDisplayed();
    	reject.click();
	}
	}
	public void masterpreapproval(String comm) throws InterruptedException, IOException {
		excelUtils.setExcelFile(excelFilePath,"Productdetails");
		javawait();
		clickElement(tab);
		masterprepapprovaltab();
		 clickElement(search);
		 for (int i = 1; i < 2; i++) {
				search.sendKeys(excelUtils.getCellData(i, 14));
		    	clickElement(createdrecord);
		clickElement(commentstab);
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
	}
	public void bprmasterprerejection(String comm) throws InterruptedException, IOException {
		javawait();
		clickElement(tab);
		clickElement(bpr);
		javawait();
		clickElement(masterprereqapprovaltab);
		excelUtils.setExcelFile(excelFilePath,"BPRproductdetails");
		 clickElement(search);
		 for (int i = 1; i < 2; i++) {
				search.sendKeys(excelUtils.getCellData(i, 14));
		    	clickElement(createdrecord);
		clickElement(commentstab);
    	clickElement(productdetailstab);
    	clickElement(reject);
    	textbox(comments, " ");
    	clickElement(reject);
    	softassert.assertEquals(commalert.getText(), "Comments is required");
    	textbox(comments, comm);
    	assert reject.isDisplayed();
    	reject.click();
	}
	}
	public void bprmasterpreapproval(String comm) throws InterruptedException, IOException {
		javawait();
		clickElement(tab);
		clickElement(bpr);
		javawait();
		clickElement(masterprereqapprovaltab);
		excelUtils.setExcelFile(excelFilePath,"BPRproductdetails");
		 clickElement(search);
		 for (int i = 1; i < 2; i++) {
				search.sendKeys(excelUtils.getCellData(i, 14));
		    	clickElement(createdrecord);
		clickElement(commentstab);
    	clickElement(productdetailstab);
    	clickElement(submit);
    	textbox(comments, " ");
    	clickElement(submit);
    	softassert.assertEquals(commalert.getText(), "Comments is required");
    	textbox(comments, comm);
    	clickElement(submit);
			}
	}
	
	
	
	  public void priority() {
	    	 clickElement(priority);
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
	   public void submitactivity2(String pass) throws InterruptedException {

	 	clickElement(Yes);
	 	javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	      }
		
	
	
	


}
