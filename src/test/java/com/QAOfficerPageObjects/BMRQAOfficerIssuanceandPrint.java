package com.QAOfficerPageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRQAOfficerIssuanceandPrint extends BRMSCommonMethods {
	
	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();

	static String excelFilePath = file;
	public static String batchno = null;

	@FindBy(how = How.XPATH, using = "//span[text()='Print Request Issuance']")
	WebElement printissuance;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[2]")
	WebElement tab2;
	@FindBy(how = How.XPATH, using = "//span[text()='Additional Page Print Request Issuance']")
	WebElement addtionalpageissuance;
	@FindBy(how = How.XPATH, using = "//span[text()='Re Print Request Initiation']")
	WebElement reprintreqinitiation;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "//button[text()=' Issue ']")
	WebElement issue;
	@FindBy(how = How.XPATH, using = "//button[text()=' Issue ']")
	WebElement additionalissue;
	@FindBy(how = How.XPATH, using = "//button[text()=' Print ']")
	WebElement print;
	@FindBy(how = How.XPATH, using = "//button[text()=' Print ']")
	WebElement additionalprint;
	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add your comments here..']")
	WebElement addcomments;
	@FindBy(how = How.XPATH, using = "//div[text()=' Please Enter Comments ']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//span[text()='Comments is required']")
	WebElement addcommalert;
	@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[5]")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[@data-dismiss='modal'])[4]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//img[@class='close']")
	WebElement close;
	@FindBy(how =How.XPATH, using ="//select[@formcontrolname='formatNumber']")
	WebElement formatnumber;
	@FindBy(how =How.XPATH, using ="//select[@formcontrolname='formatTitle']")
	WebElement formattitle;
	@FindBy(how =How.XPATH, using ="//select[@formcontrolname='versionNumber']")
	WebElement version;
	@FindBy(how =How.XPATH, using ="//input[@formcontrolname='noOfCopies']")
	WebElement noofcopies;
	@FindBy(how =How.XPATH, using ="//button[text()=' Reject ']")
	WebElement reject;
	@FindBy(how =How.XPATH, using ="//a[text()=' Status']")
	WebElement status;
	@FindBy(how =How.XPATH, using ="(//button[text()=' Approved '])[1]")
	WebElement approved;
	@FindBy(how =How.XPATH, using ="(//button[text()=' Issued '])[1]")
	WebElement issued;
	@FindBy(how =How.XPATH, using ="//h6[@class='mb-1 submit-text']")
	WebElement batchumber;
	@FindBy(how =How.XPATH, using ="//ng-select[@formcontrolname='formatGroup']")
	WebElement formatgroup1;
	@FindBy(how =How.XPATH, using ="(//input[@type='text'])[1]")
	WebElement formatgroup;
	@FindBy(how =How.XPATH, using ="//button[text()=' Issue Main Document ']")
	WebElement issuemaindocument;
	@FindBy(how =How.XPATH, using ="//button[text()=' Issue Format Log Document ']")
	WebElement issueformatlogdocument;
	@FindBy(how =How.XPATH, using ="//modal-container[@role='dialog']")
	WebElement screenclick;
	@FindBy(how =How.XPATH, using ="(//input[@type='text'])[3]")
	WebElement printerselection;
	@FindBy(how =How.XPATH, using ="(//input[@type='text'])[9]")
	WebElement reprinterselection;
	@FindBy(how =How.XPATH, using ="//button[text()=' Print Main Document ']")
	WebElement printmaindocument;
	@FindBy(how =How.XPATH, using ="//button[text()=' Print Format Log Document ']")
	WebElement printformatlogdocument;
	@FindBy(how =How.XPATH, using ="//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "(//span[contains(normalize-space(), '- Unit-V ONCO')])[2]")
	WebElement oncotext;
	@FindBy(how = How.XPATH, using = "(//span[contains(normalize-space(), 'Unit-V General')])[2]")
	WebElement generaltext;
	@FindBy(how = How.XPATH, using = "(//li[@class='nav-item'])[1]")
	WebElement bprdocument;
	public BMRQAOfficerIssuanceandPrint(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	
	
	public void printissuancetab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
	//	clickElement(tab);
		//clickElement(tab2);
		javascript(printissuance);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);	
		}
	}
	
	public void search() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);	
		}
	}
	public void search2() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);	
		}
	}
	public void additionalpageprintissuancetab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
	//	clickElement(tab);
	//	clickElement(tab2);
		javascript(addtionalpageissuance);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
			
		}
	}
	public void reprintissuancetab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
	//	clickElement(tab);
		//clickElement(tab2);
		javascript(reprintreqinitiation);
		clickElement(status);
		clickElement(issued);
		Thread.sleep(2000);
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	public void reprinttab() throws IOException, InterruptedException {
		excelutils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
	//	clickElement(tab);
		//clickElement(tab2);
		javascript(reprintreqinitiation);
		clickElement(status);
		clickElement(approved);
		Thread.sleep(2000);
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
			clickElement(createdrecord);
	}
	}
	
	public void batchnumber() throws IOException {
		batchno = batchumber.getText();
		excelutils.writecellvalue3(excelFilePath,"Productdetails", batchno);
	}
	
	
	public void printcopydetails() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		textbox(formattitle, "BRMS");
		Thread.sleep(2000);
		textbox(formatnumber, "BRMS/01");
//		javawait();
//		textbox(version, "00");
		javawait();
		textbox(noofcopies, "2");
	}
	public void bulkprintcopydetails() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		textbox(formattitle, "Bulk Packing");
		javawait();
		textbox(formatnumber, "001");
//		javawait();
	//	textbox(version, "00");
		javawait();
		textbox(noofcopies, "2");
	}

	public void comments(String comm) throws IOException, InterruptedException {

		softassert.assertEquals("Please Enter Comments", commalert.getText());
		comments.click();
		Thread.sleep(2000);
		comments.sendKeys(comm);
	}
	public void additionalcomments(String comm) throws IOException {

		softassert.assertEquals("Comments is required", addcommalert.getText());
		clickElement(addcomments);
		addcomments.sendKeys(comm);
	}
	
	public void comments2(String comm) {
		textbox(comments, comm);
	}
	
	public void close() throws InterruptedException {
		javawait();
		clickElement(close);
	}
	public void formatgroup() throws InterruptedException {
		try {
		javawait();
		clickElement(formatgroup);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		 wait.until(ExpectedConditions.visibilityOf(generaltext));
		
		if(generaltext.isDisplayed()) {
		formatgroup.sendKeys("Blend Format Group30", Keys.ENTER);
		}else if(bprdocument.isDisplayed()) {
			formatgroup.sendKeys("BPR Format Group", Keys.ENTER);
		}
		} catch (Exception e) {
			try {
			if (oncotext.isDisplayed()) {
				formatgroup.sendKeys("Grop-1", Keys.ENTER);// Click Onco Block
			                            }
			else if(bprdocument.isDisplayed()) {
				formatgroup.sendKeys("Blister Packing Group", Keys.ENTER);
			}
		         }catch (Exception e1) {
				System.out.println("no format group was found");
			}
		}
		}
	public void bulkformatgroup() throws InterruptedException {
		try {
		javawait();
		clickElement(formatgroup);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		 wait.until(ExpectedConditions.visibilityOf(generaltext));
		
		if(generaltext.isDisplayed()) {
		formatgroup.sendKeys("Bulk Format Group30", Keys.ENTER);
		}
		} catch (Exception e) {
			if (oncotext.isDisplayed()) {
				formatgroup.sendKeys("Cleaning Batch Group", Keys.ENTER);// Click Onco Block
			}
		}
	}
	
	public void issuemaindocument() throws InterruptedException {
		javawait();
		clickElement(issuemaindocument);
	}
	
	public void printmaindocument() throws InterruptedException {
		javawait();
		clickElement(printmaindocument);
	}	
	public void printformatlogdocument() throws InterruptedException {
		javawait();
		clickElement(printformatlogdocument);
	}
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	
	public void issueformatlogdocument() throws InterruptedException {
		javawait();
		clickElement(issueformatlogdocument);
	}
	
	public void printer() throws InterruptedException {
		Thread.sleep(5000);
		clickElement(printerselection);
		Thread.sleep(2000);
		printerselection.sendKeys("Canon", Keys.ENTER);
	}
	public void reprinter() throws InterruptedException {
		Thread.sleep(2000);
		clickElement(reprinterselection);
		Thread.sleep(2000);
		reprinterselection.sendKeys("Canon", Keys.ENTER);
	}
	public void print() throws InterruptedException {
		javawait();
		clickElement(print);
	}
	public void screenclick() throws InterruptedException {
		javawait();
		clickElement(screenclick);
		javawait();
	}

	public void reject() throws InterruptedException {
		javawait();
		clickElement(reject);
	}
	public void issue() throws InterruptedException {
		javawait();
		clickElement(issue);
	}
	public void additionalissue() throws InterruptedException {
		javawait();
		clickElement(additionalissue);
	}
	public void additionalprint() throws InterruptedException {
		javawait();
		clickElement(additionalprint);
	}

	public void additionalissueactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(additionalissue);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
	public void printactivity1(String pass) throws InterruptedException {

		//clickElement(No);
		//printmaindocument();
		//javawait();
		//clickElement(print);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		Thread.sleep(8000);
		refresh();
		}
	public void printactivity2(String pass) throws InterruptedException {

		//clickElement(No);
		//printformatlogdocument();
	//	javawait();
		//clickElement(print);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
	public void additionalprintactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(additionalprint);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}


	public void issueactivity1(String pass) throws InterruptedException, IOException {

		clickElement(No);
		//clickElement(issue);
		issuemaindocument();
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		batchnumber();
		javawait();
		refresh();
	}
	public void issueactivity2(String pass) throws InterruptedException, IOException {

		clickElement(No);
		//clickElement(issue);
		issueformatlogdocument();
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		batchnumber();
		javawait();
		refresh();
	}
	public void rejectactivity(String pass) throws InterruptedException {

		clickElement(No);
		clickElement(reject);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
	
	
	
	

}
