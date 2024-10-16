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

public class BMRDraftInitiation extends BRMSCommonMethods {
	
	SoftAssert softassert = new SoftAssert();
	   static ExcelUtils excelUtils = new ExcelUtils();
	    
	    //using the Constants class values for excel file path 
	    static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";
	
	@FindBy(how = How.XPATH, using = "//span[text()='Master Draft Initiation']") WebElement masterprepapprovaltab;
	@FindBy(how = How.XPATH, using = "//*[@id=\"myModal\"]/div/div/div[2]/div/div/div/div[1]/div[1]/span/img") WebElement templateprep;
	@FindBy(how = How.XPATH, using = "//*[@id=\"myModal\"]/div/div/div[2]/div/div/div/div[1]/div[2]/span/img") WebElement changehostorytemplate;
	@FindBy(how = How.XPATH, using = "(//input[@type='radio'])[1]") WebElement finalapproval;
	@FindBy(how = How.XPATH, using = "(//input[@type='radio'])[2]") WebElement cftreview;
	@FindBy(how = How.XPATH, using = "//textarea[@trim='blur']") WebElement comments;
	@FindBy(how = How.XPATH, using = "//p[text()='Comments is required']") WebElement commalert;
	@FindBy(how = How.XPATH, using = "//select[@name='department']") WebElement department;
	@FindBy(how = How.XPATH, using = "//select[@name='role']") WebElement role;
	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[2]") WebElement addcft;
	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[3]") WebElement remove;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']") WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[text()='Yes']") WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()='No'])[2]") WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']") WebElement ok;
	@FindBy(how = How.XPATH, using = "//input[@type='search']") WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]") WebElement createdrecord;
	
	
	public BMRDraftInitiation(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void masterapprovaltab() throws IOException {
		excelUtils.setExcelFile(excelFilePath,"Productdetails");
		javascript(masterprepapprovaltab);
		for (int i = 1; i <2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 1));
	    	clickElement(createdrecord);
		}
	}
	
	public void wordtemplates() {
		clickElement(templateprep);
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement(changehostorytemplate);
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void finalapproval() {
		
		clickElement(finalapproval);
	}
	public void cftreview() {
		clickElement(cftreview);
	}
	
	public void draftsubmit(String dept, String rol, String comm) throws InterruptedException {
		
		if(finalapproval.isSelected()) {
			
			textbox(comments, "");
			clickElement(submit);
			try {
				javawait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			softassert.assertEquals(commalert.getText(), "Comments is required");
			textbox(comments, comm);
			javawait();
			clickElement(submit);
			
		}else {
			textbox(department, dept);
			javawait();
			textbox(role, rol);
			javawait();
			clickElement(addcft);
			javawait();
			clickElement(remove);
			textbox(department, dept);
			javawait();
			textbox(role, rol);
			clickElement(addcft);
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
