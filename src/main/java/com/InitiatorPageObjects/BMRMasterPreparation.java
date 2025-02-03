package com.InitiatorPageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRMasterPreparation extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();
	static ExcelUtils excelUtils = new ExcelUtils();

	// using the Constants class values for excel file path
	static String excelFilePath = file;
	static String newmprnumber;

	@FindBy(how = How.XPATH, using = "//span[text()='Master Preparation Request Initiation']")
	WebElement masterprepreq;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//textarea[@trim='blur']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//p[text()='Comments is required']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//ul[@class='product-details d-flex align-items-center']/button")
	WebElement blockprevious;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[@class='btn outLineBtn']")
	WebElement refresh;
	@FindBy(how = How.XPATH, using = "//button[text()=' Get ']")
	WebElement Get;
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[1]")
	WebElement mprno;
	@FindBy(how = How.XPATH, using = "(//tr[@class='ng-star-inserted odd'])[1]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Submit '])[2]")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//input[@type='search']") WebElement search;
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link active']")
	WebElement status;
	@FindBy(how = How.XPATH, using = "//table[@class='table dateTable no-footer dataTable']/tbody/tr[2]/td[1]")
	WebElement newmprno;
	@FindBy(how = How.XPATH, using = "//modal-container[@class='modal fade show']")
	WebElement popupok;
	

	public BMRMasterPreparation(WebDriver driver) {

		PageFactory.initElements(driver, this);	
	}

	public void masterprepreq() {

		javascript(masterprepreq);

	}
	public void blockpreviousversion() {
		
		clickElement(blockprevious);
	}
	public void popupok() {
		clickElement(popupok);
	}
	
	public void getmprno() throws IOException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		for (int i = 1; i < 2; i++) {
		clickElement(status);
		clickElement(search);
		search.sendKeys(excelUtils.getCellData(i, 1));
		newmprnumber = newmprno.getText();
		excelUtils.writecellvalue2(excelFilePath,"Productdetails", newmprnumber);
		}
	}
	public void bmrmasterreqinitation1(String comm) throws IOException, InterruptedException {

		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		clickElement(tab);
		clickElement(masterprepreq);
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelUtils.getCellData(i, 14), Keys.ENTER);
		clickElement(Get);
		Thread.sleep(2000);
		clickElement(search);
		Thread.sleep(2000);
		search.sendKeys(excelUtils.getCellData(i, 14));
		clickElement(createdrecord);
//		List<WebElement> allElement=driver.findElements(By.xpath("(//tr[@class='ng-star-inserted'])"));
//		int count=allElement.size();
//		allElement.get(count-1).click();
			clickElement(submit);
			javawait();
			softassert.assertEquals(commalert.getText(), "Comments is required");
			javawait();
			textbox(comments, comm);
			javawait();
			clickElement(submit);
		}
	}
	public void bmrmasterreqinitation(String comm) throws IOException, InterruptedException {

		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		clickElement(tab);
		javawait();
		clickElement(masterprepreq);
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelUtils.getCellData(i, 14), Keys.ENTER);
			javawait();
		    clickElement(Get);
		    Thread.sleep(2000);
			clickElement(createdrecord);
			clickElement(submit);
			softassert.assertEquals(commalert.getText(), "Comments is required");
			textbox(comments, comm);
			javawait();
		//	clickElement(submit);
		}
	}
	public void submit() {
		clickElement(submit);
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
