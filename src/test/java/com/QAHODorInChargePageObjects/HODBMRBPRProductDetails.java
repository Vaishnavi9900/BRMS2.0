package com.QAHODorInChargePageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;
import com.InitiatorPageObjects.BMRProductDetails;

public class HODBMRBPRProductDetails extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();
	static ExcelUtils excelUtils = new ExcelUtils();

	// using the Constants class values for excel file path
	static String excelFilePath =file;
	
	BMRProductDetails bmr = new BMRProductDetails(driver);

	@FindBy(how = How.XPATH, using = "//span[text()='Product Details Approval']")
	WebElement productdetails;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[2]")
	WebElement tab2;
	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
    WebElement BPR;
	@FindBy(how = How.XPATH, using = "//a[@id='Comments-tab']")
	WebElement commentstab;
	@FindBy(how = How.XPATH, using = "//a[@id='Product-tab']")
	WebElement productdetailstab;
	@FindBy(how = How.XPATH, using = "//textarea[@trim='blur']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//p[text()='Comments is required']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//button[text()=' Return ']")
	WebElement returnbutton;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[text()=' Priority ']")
	WebElement priority;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[3]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "(//input[@type='search'])[2]")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//input[@type='search'])[1]")
	WebElement bprsearch;
	@FindBy(how = How.XPATH, using = "(//span[@class='cBlue font-w-600'])[6] | (//span[@class='cBlue font-w-600'])[11]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "(//span[@class='cBlue font-w-600'])[1]")
	WebElement bprcreatedrecord;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit '] | (//button[text()=' Submit '])[2]")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Submit '])[2]")
	WebElement bprsubmit2;
	@FindBy(how = How.XPATH, using = "//a[text()=' BPR Product Details']")
	WebElement bprdetails;
	@FindBy(how = How.XPATH, using = "//h6[text()='Returned Successfully']")
	WebElement returnpopup1;
	@FindBy(how = How.XPATH, using = "//p[text()='BMR Product Details']")
	WebElement returnpopup2;

	public HODBMRBPRProductDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void commentsvalidate() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		
		javawait();
		//clickElement(tab);
		//clickElement(tab2);
		//Thread.sleep(2000);
		javascript(productdetails);
		Thread.sleep(2000);
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
			clickElement(submit);
			softassert.assertEquals(commalert.getText(), "Comments is required");
		}
	}
	
	public void bprcomments() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "BPRproductdetails");
		//Thread.sleep(2000);
		//clickElement(tab);
		//clickElement(tab2);
		Thread.sleep(2000);
		clickElement(BPR);
		javascript(productdetails);
		Thread.sleep(10000);	
//		clickElement(bprdetails);
//		Thread.sleep(2000);
		clickElement(bprsearch);
		for (int i = 1; i < 2; i++) {
			bprsearch.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(bprcreatedrecord);
		}
	}
	public void bprcommentsvalidate() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "BPRproductdetails");
		Thread.sleep(2000);
		//clickElement(tab);
		//clickElement(tab2);
		Thread.sleep(2000);
		clickElement(BPR);
		javascript(productdetails);
		Thread.sleep(10000);	
//		clickElement(bprdetails);
//		Thread.sleep(2000);
		clickElement(bprsearch);
		for (int i = 1; i < 2; i++) {
			bprsearch.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(bprcreatedrecord);
			clickElement(submit);
			softassert.assertEquals(commalert.getText(), "Comments is required");
		}
	}

	public void HODReturn(String comm) throws InterruptedException, IOException {

		clickElement(commentstab);
		clickElement(productdetailstab);
		clickElement(returnbutton);
		textbox(comments, " ");
		clickElement(returnbutton);
		softassert.assertEquals(commalert.getText(), "Comments is required");
		clickElement(comments);
		comments.sendKeys(comm);
		clickElement(returnbutton);

	}
	public void bprHODReturn(String comm) throws InterruptedException, IOException {
		clickElement(commentstab);
		clickElement(productdetailstab);
		clickElement(comments);
		comments.sendKeys(comm);
		clickElement(returnbutton);

	}
	
	public void bprHODApproval(String comm) throws InterruptedException, IOException {
		clickElement(commentstab);
		clickElement(productdetailstab);
		clickElement(comments);
		comments.sendKeys(comm);
		clickElement(submit);

	}


	public void HODSubmit(String comm) throws InterruptedException, IOException {

		clickElement(commentstab);
		clickElement(productdetailstab);
		clickElement(submit);
		textbox(comments, " ");
		clickElement(submit);
		softassert.assertEquals(commalert.getText(), "Comments is required");
		textbox(comments, comm);
		clickElement(submit);

	}

	public void priority() {
		clickElement(priority);
		 String actualbgColor = priority.getCssValue("background-color");
		System.out.println(priority.getCssValue("background-color"));
		 String expectedColor = "rgba(238, 202, 205, 1)";
		 if (actualbgColor.equals(expectedColor)) {
			    System.out.println("Background color matches expected color.");
			} else {
			    System.out.println("Expected: " + expectedColor);
			    System.out.println("Actual: " + actualbgColor);
			    System.out.println("Background color does NOT match.");
			}
		
		
	}

	public void reinitiation(String comm) {
		textbox(comments, comm);
		clickElement(submit);
	}

	public void submitactivity(String pass) throws InterruptedException {

		clickElement(No);
		Thread.sleep(3000);
		clickElement(submit);
		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
		refresh();
	}

	public void submitactivity2(String pass) throws InterruptedException {

		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		Thread.sleep(8000);
		String a1 = returnpopup1.getText();
		String e1 = "Returned Successfully";
	    Assert.assertEquals(a1, e1);
	    String a2 = returnpopup2.getText();
		String e2 = "BMR Product Details";
	    Assert.assertEquals(a2, e2);
		refresh();
	}
}
