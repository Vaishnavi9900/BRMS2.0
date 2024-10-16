package com.InitiatorPageObjects;

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

public class BMRMasterPreparation extends BRMSCommonMethods{

	SoftAssert softassert = new SoftAssert();
	   static ExcelUtils excelUtils = new ExcelUtils();
	    
	    //using the Constants class values for excel file path 
	    static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";

	@FindBy(how = How.XPATH, using = "//span[text()='Master Preparation Request Initiation']") WebElement masterprepreq;
	@FindBy(how = How.XPATH, using = "//textarea[@trim='blur']") WebElement comments;
	@FindBy(how = How.XPATH, using = "//p[text()='Comments is required']") WebElement commalert;
	@FindBy(how = How.XPATH, using = "//button[text()='Block Previous']") WebElement blockprevious;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']") WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[@class='btn outLineBtn']") WebElement refresh;
	@FindBy(how = How.XPATH, using = "//button[text()=' Get ']") WebElement Get;
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='mprNumber']") WebElement mprno;
	@FindBy(how = How.XPATH, using = "(//tr[@class='ng-star-inserted'])[1]") WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()='Yes']") WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()='No'])[2]") WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']") WebElement ok;
	public BMRMasterPreparation(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void masterprepreq() {
		
		javascript(masterprepreq);
		
	}
	
	public void bmrmasterreqinitation(String comm) throws IOException, InterruptedException {
		
		excelUtils.setExcelFile(excelFilePath,"Productdetails");
		clickElement(mprno);
		for (int i = 1; i <2; i++) {
			mprno.sendKeys(excelUtils.getCellData(i, 1));
			clickElement(Get);
	    	clickElement(createdrecord);
		clickElement(submit);
		javawait();
		softassert.assertEquals(commalert.getText(), "Comments is required");
		javawait();
		textbox(comments, comm);
		javawait();
		clickElement(submit);
		}
	}
		public void submitactivity() throws InterruptedException {
	 		
	 		clickElement(No);
	 		javawait();
	 		clickElement(submit);
	 		javawait();
	 		clickElement(Yes);
	 		javawait();
	 		clickElement(ok);
	 	}
	     public void submitactivity2() throws InterruptedException {

	 	clickElement(Yes);
	 	javawait();
	 	clickElement(ok);
	  }

	
	
}
