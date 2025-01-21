package com.ProductionExecutivePageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BPRUnusedQuantityInitiation extends BRMSCommonMethods{
	
	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();
	
	static String excelFilePath = file;
	
	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//span[text()='Unused Quantity Initiation']")
	WebElement unusedqtyinitiation;
	@FindBy(how =How.XPATH, using ="(//input[@type='text'])[1]")
	WebElement mprno;
	@FindBy(how =How.XPATH, using ="//button[text()=' Get ']")
	WebElement get;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='unusedQuantity']")
	WebElement unusedqty;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please enter unusedQuantity ']")
	WebElement unusedqtyalert;
	@FindBy(how = How.XPATH, using = "//button[@data-toggle='modal']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please Enter Comments ']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement submit2;
	
	public BPRUnusedQuantityInitiation(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}
	
	public void unusedqtyInitiation() throws InterruptedException, IOException {
		javawait();
		//clickElement(tab);
		clickElement(bpr);
		javascript(unusedqtyinitiation);
		javawait();
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 14));
		}
		clickElement(get);
	    clickElement(createdrecord);
	}
	
	public void comments() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		clickElement(comments);
		for (int i = 1; i < 2; i++) {
			comments.sendKeys(excelutils.getCellData(i, 10));
		}
	}
	
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	
	public void unusedqtydetails() {
		softassert.assertEquals("Please enter unusedQuantity", unusedqtyalert.getText());
		clickElement(unusedqty);
		unusedqty.sendKeys("5");	
	}
	
	  public void submitactivity(String pass) throws InterruptedException {
	 		
	 		clickElement(No);
	 		javawait();
	 		clickElement(submit);
	 		javawait();
	 		clickElement(Yes);
	 		javawait();
	 		textbox(password, pass);
	 		javawait();
	 		clickElement(submit2);
	 		javawait();
	 	}
}
