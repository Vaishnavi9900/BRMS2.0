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

public class BMRPrintIssuanceInitiationandReceived extends BRMSCommonMethods {
	
	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();
	
	static String excelFilePath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMSdata.xlsx";
	
	@FindBy(how = How.XPATH, using = "//span[text()='Print Request Initiation']")
	WebElement printinitiation;
	@FindBy(how =How.XPATH, using ="(//input[@type='text'])[1]")
	WebElement mprno;
	@FindBy(how =How.XPATH, using ="//button[text()=' Get']")
	WebElement get;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//span[@class='cBlue font-w-600'])[1]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please Enter Comments ']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//button[text()='Yes']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()='No'])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[text()='Submit'])[2]")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//img[@class='close']")
	WebElement close;
	@FindBy(how = How.XPATH, using = "//a[text()='Status']")
	WebElement status;
	@FindBy(how = How.XPATH, using = "//button[text()=' Issued']")
	WebElement issued;
	@FindBy(how = How.XPATH, using = "//*[@id=\"DataTables_Table_2\"]/tbody/tr[1]/td[1]")
	WebElement issuedrecord;
	@FindBy(how = How.XPATH, using = "//button[text()=' Print Received']")
	WebElement printreceived;
	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	WebElement printreceivedsubmit;
	
	
	public BMRPrintIssuanceInitiationandReceived(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void printreqinitiationtab() throws InterruptedException, IOException {
		javascript(printinitiation);
		javawait();
		excelutils.setExcelFile(excelFilePath, "productdetails");
		clickElement(mprno);
		for (int i = 1; i <2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 1));
		}
		clickElement(get);
	    clickElement(createdrecord);
		
	}
	public void submit() {
		javascript(submit);
	}
	public void comments() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		clickElement(comments);
		for (int i = 1; i < 2; i++) {
			comments.sendKeys(excelutils.getCellData(i, 10));
		}
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
 		clickElement(ok);
 	}
     public void submitactivity2(String pass) throws InterruptedException {

 	clickElement(Yes);
 	javawait();
	textbox(password, pass);
	javawait();
	clickElement(submit2);
	javawait();
 	clickElement(ok);
      }
     public void close() {
 		clickElement(close);
 	}
     
     public void printreceivedtab() throws InterruptedException, IOException {
    	 javascript(printinitiation);
 		javawait();
 		excelutils.setExcelFile(excelFilePath, "productdetails");
 		clickElement(mprno);
 		for (int i = 1; i <2; i++) {
 			mprno.sendKeys(excelutils.getCellData(i, 1));
 		}
 		clickElement(status);
 		clickElement(issued);
 		clickElement(issuedrecord);
     }
     
     public void printreceived() {
    	 clickElement(printreceived);
     }
     
     public void printreceivedsubmit(String pass) throws InterruptedException {
    	textbox(comments, "Print Received");
    	clickElement(No);
  		javawait();
  		clickElement(printreceived);
  		javawait();
  		clickElement(Yes);
  		javawait();
  		textbox(password, pass);
  		javawait();
  		clickElement(printreceivedsubmit);
  		javawait();
  		clickElement(ok);
    	 
     }

}
