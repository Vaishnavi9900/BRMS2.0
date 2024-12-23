package com.ProductionExecutivePageObjects;

import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//span[text()='Additional Page Print Request Initiation']")
	WebElement additionalpageprintinitiation;
	@FindBy(how =How.XPATH, using ="(//input[@type='text'])[1]")
	WebElement mprno;
	@FindBy(how =How.XPATH, using ="//button[text()=' Get']")
	WebElement get;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//span[@class='cBlue font-w-600'])[1]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "(//tr[@class='ng-star-inserted'])[1]")
	WebElement createdrecord1;
	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add your comments here..']")
	WebElement addcomments;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please Enter Comments ']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']")
	WebElement addcommalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit22;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//img[@class='close']")
	WebElement close;
	@FindBy(how = How.XPATH, using = "//a[text()='Status']")
	WebElement status;
	@FindBy(how = How.XPATH, using = "//a[text()=' Status']")
	WebElement additionalstatus;
	@FindBy(how = How.XPATH, using = "//button[text()=' Returned']")
	WebElement returned;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Printed '])[1]")
	WebElement additionalprinted;
	@FindBy(how = How.XPATH, using = "//button[text()=' Issued']")
	WebElement issued;
	@FindBy(how = How.XPATH, using = "//button[text()=' Issued ']")
	WebElement addissued;
	@FindBy(how = How.XPATH, using = "//*[@id=\"DataTables_Table_2\"]/tbody/tr[1]/td[1]")
	WebElement issuedrecord;
	@FindBy(how = How.XPATH, using = "//button[text()=' Print Received']")
	WebElement printreceived;
	@FindBy(how = How.XPATH, using = "//button[text()=' Print Received ']")
	WebElement additionalprintreceived;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement printreceivedsubmit;
	@FindBy(how =How.XPATH, using ="//button[text()='Re-Submit']")
	WebElement resubmit;
	@FindBy(how =How.XPATH, using ="//button[text()=' Submit ']")
	WebElement additionalsubmit;
	@FindBy(how =How.XPATH, using ="//select[@formcontrolname='batchNumber']")
	WebElement batchnumber;
	@FindBy(how =How.XPATH, using ="//input[@formcontrolname='requiredBatchSize']")
	WebElement batchsize;
	@FindBy(how =How.XPATH, using ="//select[@formcontrolname='bilayerBatchNumber']")
	WebElement batchnumber2;
	@FindBy(how =How.XPATH, using ="//input[@formcontrolname='bilayerRequiredBatchSize']")
	WebElement batchsize2;
	@FindBy(how =How.XPATH, using ="//option[@class='ng-star-inserted']")
	WebElement option2;
	
	
	
	public BMRPrintIssuanceInitiationandReceived(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void printreqinitiationtab() throws InterruptedException, IOException {
		clickElement(tab);
		javascript(printinitiation);
		javawait();
		excelutils.setExcelFile(excelFilePath, "productdetails");
		javawait();
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
		clickElement(get);
		javawait();
	    clickElement(createdrecord);
		
	}
	
	public void batchnumber(String batchno) {
		clickElement(batchnumber);
		batchnumber.sendKeys(batchno, Keys.ENTER);
	}
	public void bulkbilayerbatchnumber(String batchno, String batchno2) throws InterruptedException {
		clickElement(batchnumber);
		clickElement2(option2, Keys.ENTER);
		//batchnumber.sendKeys(batchno, Keys.ENTER);
		javawait();
		clickElement(batchnumber2);
		batchnumber2.sendKeys(batchno, Keys.ENTER);
	}
	public void batchsize() {
		javascript(batchsize);
		batchsize.clear();
		batchsize.sendKeys("10");
	}
	public void bulkbilayerbatchnumbersize(String batchno, String batchno2) throws InterruptedException {
		clickElement(batchnumber);
		batchnumber.sendKeys(batchno, Keys.ENTER);
		javascript(batchsize);
		batchsize.clear();
		batchsize.sendKeys("10");
		javawait();
		clickElement(batchnumber2);
		batchnumber2.sendKeys(batchno2, Keys.ENTER);
		javascript(batchsize2);
		batchsize2.clear();
		batchsize2.sendKeys("10");
		
		
	}
	public void printreqReinitiation() throws InterruptedException, IOException {
		clickElement(tab);
		javascript(printinitiation);
		javawait();
		clickElement(status);
		javawait();
		clickElement(returned);
//		excelutils.setExcelFile(excelFilePath, "productdetails");
//		javawait();
//		clickElement(search);
//		for (int i = 1; i <2; i++) {
//			search.sendKeys(excelutils.getCellData(i, 1));
//		}
		javawait();
//		List<WebElement> allElement=driver.findElements(By.xpath("//span[@class='cBlue font-w-600']"));
//	    int count=allElement.size();
//        allElement.get(count-1).click();
		clickElement(createdrecord);
        
	}
	public void submit() throws InterruptedException {
		javawait();
		javascript(submit);
	}
	public void resubmit() throws InterruptedException {
		javawait();
		javascript(resubmit);
	}
	public void comments() throws IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		clickElement(comments);
		for (int i = 1; i < 2; i++) {
			comments.sendKeys(excelutils.getCellData(i, 10));
		}
	}
	public void additionalcomments() throws IOException {
		softassert.assertEquals("Comments is required", addcommalert.getText());
		clickElement(addcomments);
		addcomments.sendKeys("Print Received Successfully.");
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
   public void resubmitactivity(String pass) throws InterruptedException {
 		
 		clickElement(No);
 		javawait();
 		clickElement(resubmit);
 		javawait();
 		clickElement(Yes);
 		javawait();
 		textbox(password, pass);
 		javawait();
 		clickElement(submit22);
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
     public void close() throws InterruptedException {
    	 javawait();
 		clickElement(close);
 	}
     
     public void printreceivedtab() throws InterruptedException, IOException {
    	 javascript(printinitiation);
 		javawait();
 		excelutils.setExcelFile(excelFilePath, "productdetails");
 		clickElement(mprno);
 		for (int i = 1; i < 2; i++) {
 			mprno.sendKeys(excelutils.getCellData(i, 14));
 		
 		clickElement(status);
 		javawait();
 		clickElement(issued);
 		javawait();
 		clickElement(search);
 		search.sendKeys(excelutils.getCellData(i, 14));
 		}
// 		List<WebElement> allElement=driver.findElements(By.xpath("//span[@class='cBlue font-w-600']"));
//	    int count=allElement.size();
//        allElement.get(count-1).click();
        clickElement(createdrecord);
     }
     public void additioanlpageprintreceivedtab() throws InterruptedException, IOException {
    	javascript(additionalpageprintinitiation);
 		javawait();
 		excelutils.setExcelFile(excelFilePath, "productdetails");
 		clickElement(additionalstatus);
 		javawait();
 		clickElement(addissued);
 		clickElement(search);
 		for (int i = 1; i < 2; i++) {
 			search.sendKeys(excelutils.getCellData(i, 14));
 		}
 		javawait();
// 		List<WebElement> allElement=driver.findElements(By.xpath("//span[@class='cBlue font-w-600']"));
//	    int count=allElement.size();
//        allElement.get(count-1).click();
        clickElement(createdrecord);
     }
     
     public void additionalprintreceived() throws InterruptedException {
    	 javawait();
    	 clickElement(additionalprintreceived);
     }
     
     public void printreceived() throws InterruptedException {
    	 javawait();
    	 clickElement(printreceived);
     }
     public void additionalprintreceivedsubmit(String pass) throws InterruptedException {
     	clickElement(No);
   		javawait();
   		clickElement(additionalprintreceived);
   		javawait();
   		clickElement(Yes);
   		javawait();
   		textbox(password, pass);
   		javawait();
   		clickElement(additionalsubmit);
   		javawait();
   		clickElement(ok);
     	 
      }
     
     public void printreceivedsubmit(String pass) throws InterruptedException {
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
