package com.QADocCellPageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRBPRQADoccellMasterEffective extends BRMSCommonMethods {
     SoftAssert softassert = new SoftAssert();
	
	static ExcelUtils excelutils = new ExcelUtils();
	
	static String excelFilePath =file;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Master Effective']")
	WebElement mastereffectivetab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[2]")
	WebElement tab2;
	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()='Effective ']")
	WebElement effective;
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
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit2;
	
	
	public BMRBPRQADoccellMasterEffective(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void mastereffectivetab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
		clickElement(tab);
		//clickElement(tab2);
		javascript(mastereffectivetab);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	public void bprmastereffectivetab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
		clickElement(tab);
		//clickElement(tab2);
		clickElement(bpr);
		javascript(mastereffectivetab);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	
	public void effective() throws InterruptedException {
		javawait();
		clickElement(effective);
	}
	
	public void effectiveactivity(String pass) throws InterruptedException {
 		
 		clickElement(No);
 		clickElement(effective);
 		clickElement(Yes);
 		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
 	}
     public void effectiveactivity2(String pass) throws InterruptedException {

 	clickElement(Yes);
 	javawait();
	textbox(password, pass);
	clickElement(submit2);
	javawait();
      }

}
