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
import com.BasicData.ExcelUtils;

public class BMRBatchClosureInitiation extends BRMSCommonMethods {
	
	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath =file;

	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[2]")
	WebElement tab2;
	@FindBy(how = How.XPATH, using = "//span[text()='Batch Closure Initiation']")
	WebElement batchclosureinitiation;
	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[1]")
	WebElement mprno;
	@FindBy(how = How.XPATH, using = "//button[text()=' Get ']")
	WebElement get;
	@FindBy(how = How.XPATH, using = "//button[text()=' Get']")
	WebElement bprget;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[@class='btn successBtn btn-block']")
	WebElement bprsubmit;
	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "(//div[@class='ng-star-inserted'])[2]")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@class='btn successBtn']")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//label[@for='fileInput']")
	WebElement exebmrattachment;
	@FindBy(how = How.XPATH, using = "(//div[@class='card p-4 bg-gray-100'])[2]")
	WebElement otherfiles;
	@FindBy(how = How.XPATH, using = "//img[@class='close']")
	WebElement close;
	@FindBy(how = How.XPATH, using = "//a[text()=' Status']")
	WebElement status;
	@FindBy(how = How.XPATH, using = "//button[text()=' Re-Submit ']")
	WebElement resubmit;
	@FindBy(how = How.XPATH, using = "(//p[@class='boldF font16 mb-1 mr-1'])[1]")
	WebElement bprexebmrattachment;
	@FindBy(how = How.XPATH, using = "(//p[@class='boldF font16 mb-1 mr-1'])[2]")
	WebElement bprotherfiles;

	public BMRBatchClosureInitiation(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void batchclosureinitiation() throws IOException, InterruptedException {
		javawait();
		//clickElement(tab);
		//clickElement(tab2);
		javascript(batchclosureinitiation);
		excelutils.setExcelFile(excelFilePath, "productdetails");
		//clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			//mprno.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		clickElement(get);
		Thread.sleep(2000);
		search.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
	    clickElement(createdrecord);
		}
	}
	public void bprbatchclosureinitiation() throws IOException, InterruptedException {
		javawait();
	//	clickElement(tab);
		//clickElement(tab2);
		clickElement(bpr);
		javascript(batchclosureinitiation);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
		clickElement(bprget);
	    clickElement(createdrecord);
	}
	public void batchclosureReinitiation() throws IOException, InterruptedException {
		javawait();
		//clickElement(tab2);
	//	clickElement(tab);
		javascript(batchclosureinitiation);
		clickElement(status);
		excelutils.setExcelFile(excelFilePath, "productdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
		}
	    clickElement(createdrecord);
	}
	public void bprbatchclosureReinitiation() throws IOException, InterruptedException {
		javawait();
		//clickElement(tab2);
//		clickElement(tab);
		clickElement(bpr);
		javascript(batchclosureinitiation);
		clickElement(status);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
		}
	    clickElement(createdrecord);
	}
	
	public void resubmit() {
		clickElement(resubmit);
	}

	public void comments() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		softassert.assertEquals("Comments are required.", commalert.getText());
		clickElement(comments);
		for (int i = 1; i < 2; i++) {
			comments.sendKeys(excelutils.getCellData(i, 10));
		}
	}
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	public void bprsubmit() throws InterruptedException {
		javawait();
		clickElement(bprsubmit);
	}
	public void bmrexefileupload() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		exebmrattachment.click();
		Thread.sleep(5000);
		 String filePath = "C:\\Users\\vaishnavi.t\\Downloads\\VGC-T-029-02 7.pdf";
		 // Press 'Ctrl' + 'V' to paste the file path;
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        // Press 'Enter' to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void otherfiles() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		otherfiles.click();
		Thread.sleep(10000);
		 String filePath = "C:\\Users\\vaishnavi.t\\Downloads\\VGC-T-029-02 7.pdf";
		 // Press 'Ctrl' + 'V' to paste the file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        // Press 'Enter' to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
      //  otherfiles.sendKeys("C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMS v2.0 flow 4.pdf");
	}
	public void bprexefileupload() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		bprexebmrattachment.click();
		Thread.sleep(10000);
		 String filePath = "C:\\Users\\vaishnavi.t\\Downloads\\VGC-T-029-02 7.pdf";
		 // Press 'Ctrl' + 'V' to paste the file path;
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        // Press 'Enter' to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void bprotherfiles() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		bprotherfiles.click();
		Thread.sleep(10000);
		 String filePath = "";
		 // Press 'Ctrl' + 'V' to paste the file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        // Press 'Enter' to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
      //  otherfiles.sendKeys("C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMS v2.0 flow 4.pdf");
	}
	
	public void close() throws InterruptedException {
		javawait();
		clickElement(close);
	}
	public void submitactivity(String pass) throws InterruptedException {
		javawait();
		clickElement(No);
		clickElement(submit);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
	public void bprsubmitactivity(String pass) throws InterruptedException {
		javawait();
		clickElement(No);
		clickElement(bprsubmit);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
	public void submitactivity2(String pass) throws InterruptedException {
		javawait();
		javascript(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
	
	
	

}
