package com.QAOfficerPageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ConfigurationReader;
import com.BasicData.ExcelUtils;

public class BMRBPRBatchRecordCorrectionInitiation extends BRMSCommonMethods {
	

	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath = file;

	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//span[text()='Executed Document Correction Initiation']")
	WebElement executebatchcorrectiontab;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Submit '])[2]")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how =How.XPATH, using ="(//input[@type='text'])[1]")
	WebElement mprno;
	@FindBy(how =How.XPATH, using ="//button[text()=' Get ']")
	WebElement get;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add your comments here..']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link']")
	WebElement status;
	@FindBy(how = How.XPATH, using = "//button[@class='btn successBtn btn-block']")
	WebElement resubmit;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Returned '])[1]")
	WebElement returned;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement resubmit2;
	@FindBy(how = How.XPATH, using = "//p[text()=' Click To Upload ']")
	WebElement uploadfile;
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-minus-circle ml-2']")
	WebElement removefile;
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-eye ml-2']")
	WebElement viewfile;
	
	public BMRBPRBatchRecordCorrectionInitiation(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void batchCorrectionInitiation() throws InterruptedException, IOException {
		javawait();
		clickElement(tab);
		javascript(executebatchcorrectiontab);
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		clickElement(get);
		//search.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
	    clickElement(createdrecord);	
	}
	public void batchCorrectionReInitiation() throws InterruptedException, IOException {
		javawait();
		clickElement(tab);
		javascript(executebatchcorrectiontab);
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		clickElement(status);
		clickElement(returned);
		for (int i = 1; i < 2; i++) {
		search.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
	    clickElement(createdrecord);	
	}
	
	public void bprbatchCorrectionInitiation() throws InterruptedException, IOException {
		javawait();
		clickElement(tab);
		clickElement(bpr);
		javascript(executebatchcorrectiontab);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		clickElement(get);
		//search.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
	    clickElement(createdrecord);	
	}
	public void bprbatchCorrectionReInitiation() throws InterruptedException, IOException {
		javawait();
		clickElement(tab);
		clickElement(bpr);
		javascript(executebatchcorrectiontab);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(status);
		clickElement(returned);
		for (int i = 1; i < 2; i++) {
		search.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
	    clickElement(createdrecord);	
	}
	
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	public void resubmit() throws InterruptedException {
		javawait();
		clickElement(resubmit);
	}
	
	public void comments() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		clickElement(comments);
		for (int i = 1; i < 2; i++) {
			comments.sendKeys(excelutils.getCellData(i, 10));
			Thread.sleep(10000);
		}
	}
	public void fileupload() throws InterruptedException, AWTException {
		Robot robot = new Robot();
         uploadfile.click();
		Thread.sleep(10000);
		 String filePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMS v2.0 flow 4.pdf";
		 // Press 'Ctrl' + 'V' to paste the file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        // Press 'Enter' to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
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
	public void resubmitactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(resubmit);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(resubmit2);
		javawait();
	}

}
