package com.InitiatorPageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.BasicData.BRMSCommonMethods;
import com.BasicData.ExcelUtils;

public class BMRDraftInitiation extends BRMSCommonMethods {

	SoftAssert softassert = new SoftAssert();
	static ExcelUtils excelUtils = new ExcelUtils();

	// using the Constants class values for excel file path
	static String excelFilePath = file;

	@FindBy(how = How.XPATH, using = "//span[text()='Master Draft Initiation']")
	WebElement masterdrfatinitiationtab;
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
	WebElement tab;
	@FindBy(how = How.XPATH, using = "//*[@id=\"myModal\"]/div/div/div[2]/div/div/div/div[1]/div[1]/span/img")
	WebElement templateprep;
	@FindBy(how = How.XPATH, using = "//*[@id=\"myModal\"]/div/div/div[2]/div/div/div/div[1]/div[2]/span/img")
	WebElement changehostorytemplate;
	@FindBy(how = How.XPATH, using = "(//input[@type='radio'])[1]")
	WebElement finalapproval;
	@FindBy(how = How.XPATH, using = "(//input[@type='radio'])[2]")
	WebElement cftreview;
	@FindBy(how = How.XPATH, using = "//textarea[@trim='blur']")
	WebElement comments;
	@FindBy(how = How.XPATH, using = "//p[text()='Comments is required']")
	WebElement commalert;
	@FindBy(how = How.XPATH, using = "//select[@name='department']")
	WebElement department;
	@FindBy(how = How.XPATH, using = "//select[@name='role']")
	WebElement role;
	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[2]")
	WebElement addcft;
	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[3]")
	WebElement remove;
	@FindBy(how = How.XPATH, using = "//button[text()=' Submit ']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "//button[text()=' Yes ']")
	WebElement Yes;
	@FindBy(how = How.XPATH, using = "(//button[text()=' No '])[2]")
	WebElement No;
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	WebElement search;
	@FindBy(how = How.XPATH, using = "(//tr[@role='row'])[2]")
	WebElement createdrecord;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "(//button[text()=' Submit '])[2]")
	WebElement submit2;
	@FindBy(how = How.XPATH, using = "//a[text()=' Status']")
	WebElement status;
	@FindBy(how = How.XPATH, using = "//*[@id=\"myModal\"]/div/div/div[2]/div/div/div/div[1]/div[1]/span/img")
	WebElement bprtemplateprep;
	@FindBy(how = How.XPATH, using = "//*[@id=\"myModal\"]/div/div/div[2]/div/div/div/div[1]/div[2]/span/img")
	WebElement bprchangehostorytemplate;
	@FindBy(how = How.XPATH, using = "//a[text()='BPR']")
	WebElement bpr;
	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[4]")
	WebElement returned;
	

	public BMRDraftInitiation(WebDriver driver) {

		PageFactory.initElements(driver, this);	
	}

	
	public void bmrmasterdraftinitiationtab() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
		clickElement(tab);
		javascript(masterdrfatinitiationtab);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	public void bprmasterdraftinitiationtab() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
	    clickElement(tab);
		clickElement(bpr);
		javascript(masterdrfatinitiationtab);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}
	public void draftReinitiation() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "Productdetails");
		javawait();
		clickElement(tab);
		javascript(masterdrfatinitiationtab);
		clickElement(status);
		clickElement(returned);
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}

	public void bprdraftReinitiation() throws IOException, InterruptedException {
		excelUtils.setExcelFile(excelFilePath, "BPRproductdetails");
		javawait();
		clickElement(tab);
		clickElement(bpr);
		javascript(masterdrfatinitiationtab);
		clickElement(status);
		clickElement(search);
		for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 14));
			clickElement(createdrecord);
		}
	}

	public void wordtemplates() throws InterruptedException, AWTException {
		clickElement(templateprep);
	
		try {
           Thread.sleep(40000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement(changehostorytemplate);
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        }
		
	public void bprwordtemplates() {
		clickElement(bprtemplateprep);
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement(bprchangehostorytemplate);
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void comments(String comm) throws InterruptedException {
		
		clickElement(comments);
		comments.sendKeys(comm);
	}
	public void finalapproval() {

		clickElement(finalapproval);
	}

	public void cftreview() {
		clickElement(cftreview);
	}
	
	public void submit() throws InterruptedException {
		javawait();
		clickElement(submit);
	}

	public void draftsubmit(String dept, String rol, String dept1, String rol2, String comm) throws InterruptedException {

		if (finalapproval.isSelected()) {

			textbox(comments, "");
			clickElement(submit);
			try {
				javawait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			softassert.assertEquals(commalert.getText(), "Comments is required");
			textbox(comments, comm);
			javawait();
			clickElement(submit);

		} else {
			textbox(department, dept);
			textbox(role, rol);
			clickElement(addcft);
			javawait();
			clickElement(remove);
			textbox(department, dept);
			textbox(role, rol);
			clickElement(addcft);
			textbox(department,dept1);
			textbox(role, rol2);
			clickElement(addcft);
			clickElement(comments);
			comments.sendKeys(comm);
			javawait();
			clickElement(submit);

		}

	}
	public void draftsubmit1(String dept, String rol,String comm) throws InterruptedException {

		if (finalapproval.isSelected()) {

			textbox(comments, "");
			clickElement(submit);
			try {
				javawait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			softassert.assertEquals(commalert.getText(), "Comments is required");
			textbox(comments, comm);
			javawait();
			clickElement(submit);

		} else {
			textbox(department, dept);
			textbox(role, rol);
			clickElement(addcft);
			clickElement(remove);
			textbox(department, dept);
			textbox(role, rol);
			clickElement(addcft);
			textbox(comments, comm);
			javawait();
			clickElement(submit);

		}

	}
	public void reinitiationdraftsubmit(String dept, String rol2, String comm) throws InterruptedException {

		if (finalapproval.isSelected()) {

			textbox(comments, "");
			clickElement(submit);
			try {
				javawait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			softassert.assertEquals(commalert.getText(), "Comments is required");
			textbox(comments, comm);
			javawait();
			clickElement(submit);

		} else {
			clickElement(remove);
			clickElement(remove);
			textbox(department, dept);
			textbox(role, rol2);
			clickElement(addcft);
			javawait();
			textbox(comments, comm);
			javawait();
			clickElement(submit);
			javawait();
		}

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
	}

	public void submitactivity2(String pass) throws InterruptedException {

		clickElement(Yes);
		javawait();
		textbox(password, pass);
		clickElement(submit2);
		javawait();
	}

}
