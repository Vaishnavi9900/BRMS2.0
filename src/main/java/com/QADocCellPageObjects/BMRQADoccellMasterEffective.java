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

public class BMRQADoccellMasterEffective extends BRMSCommonMethods {
SoftAssert softassert = new SoftAssert();
	
	static ExcelUtils excelutils = new ExcelUtils();
	
	static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";
	
	@FindBy(how = How.XPATH, using = "//span[text()='Master Effective']")
	WebElement mastereffectivetab;
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
	@FindBy(how = How.XPATH, using = "//button[text()='Yes']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()='No'])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	WebElement submit2;
	
	
	public BMRQADoccellMasterEffective(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void mastereffectivetab() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javascript(mastereffectivetab);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 1));
			clickElement(createdrecord);
		}
	}
	
	public void effective() {
		clickElement(effective);
	}
	
	public void effectiveactivity(String pass) throws InterruptedException {
 		
 		clickElement(No);
 		javawait();
 		clickElement(effective);
 		javawait();
 		clickElement(Yes);
 		javawait();
		textbox(password, pass);
		javawait();
		clickElement(submit2);
 		clickElement(ok);
 	}
     public void effectiveactivity2(String pass) throws InterruptedException {

 	clickElement(Yes);
 	javawait();
//	textbox(password, pass);
//	javawait();
//	clickElement(submit2);
 	clickElement(ok);
      }

}
