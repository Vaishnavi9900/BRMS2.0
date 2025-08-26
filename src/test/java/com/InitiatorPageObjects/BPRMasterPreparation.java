package com.InitiatorPageObjects;

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

public class BPRMasterPreparation extends BRMSCommonMethods{
	
	SoftAssert softassert = new SoftAssert();
	static ExcelUtils excelUtils = new ExcelUtils();

	// using the Constants class values for excel file path
	static String excelFilePath = file;


	
	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[2]")
	WebElement tab2;
	@FindBy(how = How.XPATH, using = "//span[text()='Master Preparation Request Initiation']")
	WebElement masterpreparation;
	@FindBy(how = How.XPATH, using = "(//div[@class='ng-select-container'])[1]")
	WebElement mprno;
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[1]")
	WebElement mprnosel;
	@FindBy(how = How.XPATH, using = "//input[@type='search']") WebElement search;
	@FindBy(how = How.XPATH, using = "//textarea[@trim='blur']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[@class='btn outLineBtn']")
	WebElement refresh;
	@FindBy(how = How.XPATH, using = "//button[text()=' Get ']")
	WebElement Get;
	@FindBy(how = How.XPATH, using = "(//tr[@class='bg-priority ng-star-inserted odd'])[1]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[5]")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[4]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "//div[@class='swal2-container swal2-center swal2-backdrop-show']")
	WebElement popupclick;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
	WebElement submit2;
	
	public BPRMasterPreparation(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}
	
	public void bprMasterPrereqInitiation(String comm) throws IOException, InterruptedException {
		
		excelUtils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
		//clickElement(tab);
		//clickElement(tab2);
		clickElement(bpr);
		clickElement(masterpreparation);
		Thread.sleep(2000);
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			Thread.sleep(2000);
			mprnosel.sendKeys(excelUtils.getCellData(i, 14), Keys.ENTER);
		clickElement(Get);
		search.sendKeys(excelUtils.getCellData(i, 14), Keys.ENTER);
		clickElement(createdrecord);
		clickElement(submit);
		softassert.assertEquals(commalert.getText(), "Comments is required");
		textbox(comments, comm);
		clickElement(submit);
		}
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
	
	
	

}
