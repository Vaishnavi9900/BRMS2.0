package com.QAHODorInChargePageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRBPRQAHODAfterPrintApprovalorReject extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath =file;
	public static String batchno1;

	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[2]")
	WebElement tab2;
	@FindBy(how = How.XPATH, using = "//span[text()='Print Request Approval']")
	WebElement printreqapproval;
	@FindBy(how = How.XPATH, using = "//span[text()='Before Print Received Cancel Approval']")
	WebElement beforeprintcancelapproval;
	@FindBy(how = How.XPATH, using = "//span[text()='After Print Receive Cancel Approval']")
	WebElement afterprintcancelapproval;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()=' Reviewed']")
	WebElement reviewed;
	@FindBy(how = How.XPATH, using = "//button[text()=' Returned']")
	WebElement returned;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return ']")
	WebElement returnbutton;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[text()=' Reject ']")
	WebElement reject;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return ']")
	WebElement afterreturnbutton;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement aftersubmit;
	@FindBy(how = How.XPATH, using = "//button[text()=' Reject ']")
	WebElement afterreject;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return ']")
	WebElement returnbutton1;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit1;
	@FindBy(how = How.XPATH, using = "//button[text()=' Reject ']")
	WebElement reject1;
	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add your comments here..']")
	WebElement comments1;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please Enter Comments ']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']")
	WebElement commalert1;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return To Production Executive ']")
	WebElement returntoprodexe;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return To Production Incharge ']")
	WebElement returntoprodincharge;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return To Validation Incharge ']")
	WebElement returntovalncharge;
	@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[8] | //button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[7] | (//button[text()=' No '])[3]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes1;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No1;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement submit22;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "(//div[@class='d-flex align-items-center'])[2]")
	WebElement close;
	@FindBy(how = How.XPATH, using = "(//h4[@class='modal-title font20'])[2]")
	WebElement batchnumber;

	public BMRBPRQAHODAfterPrintApprovalorReject(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void printapprovalrejecttab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
	//	clickElement(tab);
		//clickElement(tab2);
		javascript(printreqapproval);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
			
		}
	}
	public void setbmrbatchnumber() throws IOException {
		 batchno1 = batchnumber.getText();
		 batchno1=batchno1.substring(20, 29);
	excelutils.writecellvalues(excelFilePath,"Productdetails", batchno1,2,14);
}
	public void beforeprintapprovalrejecttab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
	//	clickElement(tab);
		//clickElement(tab2);
		javascript(beforeprintcancelapproval);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
			
		}
	}
	public void afterprintapprovaltab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
	//	clickElement(tab);
		//clickElement(tab2);
		javascript(afterprintcancelapproval);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
			
		}
	}
	public void bprafterprintapprovaltab() throws IOException, InterruptedException {
		javawait();
	//	clickElement(tab);
		//clickElement(tab2);
		clickElement(bpr);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javascript(afterprintcancelapproval);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
			
		}
	}
	
	public void beforeprintcomments(String comm) {
		softassert.assertEquals("Please Enter Comments", commalert1.getText());
		clickElement(comments1);
	    comments1.sendKeys(comm);
	}

	public void comments(String comm) throws IOException {
		
		softassert.assertEquals("Please Enter Comments", commalert.getText());
	    clickElement(comments);
	    comments.sendKeys(comm);
		
	}
   public void comments1(String comm) throws IOException {
		
	softassert.assertEquals("Please Enter Comments", commalert.getText());
    clickElement(comments);
    comments.sendKeys(comm);
		
	}
   public void afterprintcomments(String comm) throws IOException {
		
		softassert.assertEquals("Comments is required", commalert1.getText());
	    clickElement(comments1);
	    comments1.sendKeys(comm);
   }
	
	public void close() throws InterruptedException {
	    javawait();
		clickElement(close);
	}
	
	public void submitactivity(String pass) throws InterruptedException, IOException {

		clickElement(No);
		clickElement(submit);
		//setbmrbatchnumber();
		javawait();
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit22);
		javawait();
		refresh();
	}
	
	public void afterprintsubmit() throws InterruptedException {
		javawait();
		clickElement(aftersubmit);
	}
	public void afterprintreturn() throws InterruptedException {
		javawait();
		clickElement(afterreturnbutton);
	}
	public void afterprintreject() throws InterruptedException {
		javawait();
		clickElement(afterreject);
	}
    public void afterprintsubmitactivity(String pass) throws InterruptedException {
		
		clickElement(No);
		clickElement(aftersubmit);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
	
	public void afterprintreturnactivity(String pass) throws InterruptedException {
		clickElement(No);
		clickElement(afterreturnbutton);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
	public void afterprintrejectactivity(String pass) throws InterruptedException {
		clickElement(No);
		clickElement(afterreject);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
	
	
	public void beforeprintsubmit() throws InterruptedException {
		javawait();
		clickElement(submit1);
	}
	public void beforeprintreturn() throws InterruptedException {
		javawait();
		clickElement(returnbutton1);
	}
	public void beforeprintreject() throws InterruptedException {
		javawait();
		clickElement(reject1);
	}
	
	public void beforeprintsubmitactivity(String pass) throws InterruptedException {
		
		clickElement(No1);
		clickElement(submit1);
		clickElement(Yes1);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
	
	public void beforeprintreturnactivity(String pass) throws InterruptedException {
		clickElement(No);
		clickElement(returnbutton1);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
	public void beforeprintrejectactivity(String pass) throws InterruptedException {
		clickElement(No);
		clickElement(reject1);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
	
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	public void returnbutton() throws InterruptedException {
		javawait();
		clickElement(returnbutton);
	}
	public void reject() throws InterruptedException {
		javawait();
		clickElement(reject);
	}

	public void submitactivity2(String pass) throws InterruptedException {

		javascript(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit22);
		javawait();
		refresh();
	}
	
	public void returntoexeactivity(String pass) throws InterruptedException {
	    clickElement(returntoprodexe);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit22);
		javawait();
		refresh();
	}
	public void returntoinchargeactivity(String pass) throws InterruptedException {
		
		clickElement(returntoprodincharge);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit22);
		javawait();
		refresh();
	}
	public void returntovalidationactivity(String pass) throws InterruptedException {
		
		clickElement(returntovalncharge);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit22);
		javawait();
		refresh();
	}


}
