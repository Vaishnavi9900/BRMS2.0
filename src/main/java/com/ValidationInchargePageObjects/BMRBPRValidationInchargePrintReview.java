package com.ValidationInchargePageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRBPRValidationInchargePrintReview extends BRMSCommonMethods{

	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath = file;

	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//span[text()='Print Request Review']")
	WebElement printreqreview;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()=' Reviewed']")
	WebElement reviewed;
	@FindBy(how = How.XPATH, using = "//button[text()=' Returned']")
	WebElement returned;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return']")
	WebElement returnbutton;
	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please Enter Comments ']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//span[@class='dropdown-btn']")
	WebElement batchtype;
	@FindBy(how = How.XPATH, using = "//span[@class='dropdown-multiselect__caret']")
	WebElement batchtyp1;
	@FindBy(how = How.XPATH, using = "//div[text()='Select All']")
	WebElement selectall;
	@FindBy(how = How.XPATH, using = "//div[text()='Commerical']")
	WebElement commercial;
	@FindBy(how = How.XPATH, using = "//div[text()='Validation']")
	WebElement validation;
	@FindBy(how = How.XPATH, using = "//div[text()='Exhibit']")
	WebElement exhibit;
	@FindBy(how = How.XPATH, using = "//div[text()='Stability']")
	WebElement stability;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please Select Batch Type ']")
	WebElement batchtypealert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return To Production Executive']")
	WebElement returntoprodexe;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return To Production Incharge']")
	WebElement returntoprodincharge;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//img[@class='close']")
	WebElement close;

	public BMRBPRValidationInchargePrintReview(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}

	public void printreqreviewtab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
	//	clickElement(tab);
		javascript(printreqreview);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
			
		}
	}
	public void bprprintreqreviewtab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
	//	clickElement(tab);
		clickElement(bpr);
		javawait();
		javascript(printreqreview);
		for (int i = 1; i < 2; i++) {
			javawait();
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
			
		}
	}

	public void commentsbatchtype(String comm) throws InterruptedException {
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		textbox(comments, comm);
	    softassert.assertEquals("Please Select Batch Type", batchtypealert.getText());
	    clickElement(batchtype);
		clickElement(commercial);
	}
	public void REcommentsbatchtype(String comm) throws InterruptedException {
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		clickElement(comments);
		comments.sendKeys(comm);
	    clickElement(batchtyp1);
		clickElement(exhibit);
	}
	
	public void comments(String comm) throws InterruptedException {
		
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		javawait();
		textbox(comments, comm);
		
	}
	
	public void close() {
		clickElement(close);
	}
	
	public void reReview() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
	//	clickElement(tab);
		javascript(printreqreview);
		clickElement(returned);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);			
		}
	}
	public void bprreReview() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
	//	clickElement(tab);
		clickElement(bpr);
		javascript(printreqreview);
		clickElement(returned);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);			
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
	}
	
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	public void returnbutton() throws InterruptedException {
		javawait();
		clickElement(returnbutton);
	}

	public void submitactivity2(String pass) throws InterruptedException {

		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();

	}
	
	public void returntoexeactivity(String pass) throws InterruptedException {
		javawait();
		clickElement(returntoprodexe);
		clickElement(No);
		clickElement(returntoprodexe);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		
	}
	public void returntoinchargeactivity(String pass) throws InterruptedException {
		clickElement(returntoprodincharge);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		
	}
	

}
