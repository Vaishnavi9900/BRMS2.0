package com.ProductionExecutivePageObjects;

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

public class BPRPrintIssuanceInitiationReceived extends BRMSCommonMethods{
	
	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();
	
	static String excelFilePath = file;
	
	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//span[text()='Print Request Initiation']")
	WebElement printinitiation;
	@FindBy(how = How.XPATH, using = "//span[text()='Additional Page Print Request Initiation']")
	WebElement additionalpageprintinitiation;
	@FindBy(how =How.XPATH, using ="(//input[@type='text'])[1]")
	WebElement mprno;
	@FindBy(how =How.XPATH, using ="//button[text()=' Get ']")
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
	@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[4]")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[3]")
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
	@FindBy(how = How.XPATH, using = "//a[text()='Status ']")
	WebElement status;
	@FindBy(how = How.XPATH, using = "//a[text()=' Status']")
	WebElement additionalstatus;
	@FindBy(how = How.XPATH, using = "//button[text()=' Returned']")
	WebElement returned;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Printed '])[1]")
	WebElement additionalprinted;
	@FindBy(how = How.XPATH, using = "//button[text()=' Issued']")
	WebElement issued;
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
	@FindBy(how =How.XPATH, using ="//select[@formcontrolname='dateFormat']")
	WebElement dateformat;
	@FindBy(how =How.XPATH, using ="//input[@formcontrolname='manufacturingDate']")
	WebElement manufacturedate;
	@FindBy(how =How.XPATH, using ="//input[@formcontrolname='expiryDate']")
	WebElement expdate;
	@FindBy(how =How.XPATH, using ="//select[@formcontrolname='mprNumber']")
	WebElement mprnumber;
	@FindBy(how =How.XPATH, using ="//input[@formcontrolname='requriedBatchSize']")
	WebElement batchsize;

	
	
	public BPRPrintIssuanceInitiationReceived(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void bprprintreqinitiationtab() throws InterruptedException, IOException {
		javawait();
		//clickElement(tab);
		clickElement(bpr);
		javawait();
		javascript(printinitiation);
		javawait();
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
		clickElement(mprno);
		for (int i = 1; i < 2; i++) {
			mprno.sendKeys(excelutils.getCellData(i, 14), Keys.ENTER);
		}
		clickElement(get);
		javawait();
	    clickElement(createdrecord);
		
	}
	public void bprprintreqReinitiation() throws InterruptedException, IOException {
		javawait();
	//	clickElement(tab);
		clickElement(bpr);
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
	
	public void batchsize() {
		javascript(batchsize);
		batchsize.clear();
		batchsize.sendKeys("10");
	}
	public void resubmit() throws InterruptedException {
		javawait();
		javascript(resubmit);
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
	
	public void batchnumberdateformats(String format, String mandate, String expd, String batchno) throws InterruptedException, IOException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		clickElement(dateformat);
		dateformat.sendKeys(format, Keys.ENTER);
		javawait();
		clickElement(manufacturedate);
		manufacturedate.sendKeys(mandate);
		javawait();
		clickElement(expdate);
		expdate.sendKeys(expd);
		javawait();
		clickElement(mprnumber);
		for (int i = 1; i < 2; i++) {
			mprnumber.sendKeys(excelutils.getCellData(i, 14));
		}
		javawait();
		clickElement(batchnumber);
		batchnumber.sendKeys(batchno, Keys.ENTER);
	}
	
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	public void comments(String comm) throws IOException {
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		clickElement(comments);
			comments.sendKeys(comm);
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
public void printreceivedtab() throws InterruptedException, IOException {
	javawait();
//	clickElement(tab);
	clickElement(bpr);
	 javascript(printinitiation);
	excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
	clickElement(status);
	javawait();
	clickElement(issued);
	clickElement(search);
	for (int i = 1; i < 2; i++) {
		search.sendKeys(excelutils.getCellData(i, 14));
	}
	javawait();
//	List<WebElement> allElement=driver.findElements(By.xpath("//span[@class='cBlue font-w-600']"));
//   int count=allElement.size();
//   allElement.get(count-1).click();
   clickElement(createdrecord);
}
public void additioanlpageprintreceivedtab() throws InterruptedException, IOException {
	javawait();
//	clickElement(tab);
	javascript(additionalpageprintinitiation);
	javawait();
	excelutils.setExcelFile(excelFilePath, "productdetails");
	clickElement(additionalstatus);
	clickElement(search);
	for (int i = 1; i < 2; i++) {
		search.sendKeys(excelutils.getCellData(i, 14));
	}
	clickElement(additionalprinted);
	javawait();
//	List<WebElement> allElement=driver.findElements(By.xpath("//span[@class='cBlue font-w-600']"));
//   int count=allElement.size();
//   allElement.get(count-1).click();
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
