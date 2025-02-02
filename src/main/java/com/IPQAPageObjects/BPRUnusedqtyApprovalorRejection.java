package com.IPQAPageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BPRUnusedqtyApprovalorRejection extends BRMSCommonMethods{
	
	SoftAssert softassert = new SoftAssert();

	static ExcelUtils excelutils = new ExcelUtils();
	
	static String excelFilePath =file;
	
	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//span[text()='Unused Quality Approval']")
	WebElement unusedqtyapproval;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "(//button[@data-toggle='modal'])[1]")
	WebElement reject;
	@FindBy(how = How.XPATH, using = "(//button[@data-toggle='modal'])[2]")
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
	
public BPRUnusedqtyApprovalorRejection(WebDriver driver) {
		
	PageFactory.initElements(driver, this);	
	}
	
	public void unusedqtyApproval() throws InterruptedException, IOException {
		javawait();
		clickElement(tab);
		clickElement(bpr);
		javascript(unusedqtyapproval);
		excelutils.setExcelFile(excelFilePath, "BPRproductdetails");
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelutils.getCellData(i, 14));
		}
	    clickElement(createdrecord);
	}
	
	public void comments(String comm) throws IOException {
		softassert.assertEquals("Please Enter Comments", commalert.getText());
		clickElement(comments);
		comments.sendKeys(comm);
	
	}
	
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}
	public void reject() throws InterruptedException {
		javawait();
		clickElement(reject);
	}
	 public void rejectactivity(String pass) throws InterruptedException {
	 		
		     		
		    clickElement(No);
		    Thread.sleep(2000);	
	 		clickElement(reject);
	 		clickElement(Yes);
	 		javawait();
	 		textbox(password, pass);
	 		clickElement(submit2);
	 		javawait();
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

}
