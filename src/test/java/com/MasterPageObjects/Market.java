package com.MasterPageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import com.aventstack.extentreports.Status;

public class Market extends BRMSCommonMethods{
	
	SoftAssert softassert = new SoftAssert();
	   static ExcelUtils excelUtils = new ExcelUtils();
	    
	    //using the Constants class values for excel file path 
	    static String excelFilePath = file;
	    static String excelpath = "C:\\Users\\Vaishnavi.T\\Downloads\\Market Name.xlsx";
	
	@FindBy(how = How.XPATH, using = "(//a[@class='flex-item ng-star-inserted'])[1]")
    WebElement tab;
	@FindBy(xpath = "//a[text()=' Market ']") WebElement market;
	@FindBy(xpath = "//button[text()=' Create ']") WebElement create;
	@FindBy(xpath = "(//button[@type='button'])[2]") WebElement create1;
	@FindBy(xpath = "//img[@class='close']") WebElement close;
	@FindBy(xpath = "(//input[@type='text'])[1]") WebElement marketname;
	@FindBy(xpath = "//button[text()='OK']") WebElement nochangesalreadyok;
	@FindBy(xpath = "//input[@type='search']") WebElement search;
	@FindBy(xpath = "(//tr[@role='row'])[2]") WebElement createdrecord;
	@FindBy(xpath = "(//button[@type='button'])[2]") WebElement update;
	@FindBy(xpath = "//div[text()=' Comments are required ']") WebElement commentalert;
	@FindBy(xpath = "//textarea[@formcontrolname='comments']") WebElement comments;
	@FindBy(xpath = "//div[text()=' Market Name is required ']") WebElement marketalert;
	@FindBy(xpath = "//input[@type='checkbox'] ") WebElement enable; 
	@FindBy(xpath = "//button[text()=' Upload ']") WebElement upload;
	@FindBy(xpath = "//button[text()='Yes']") WebElement Yes;
	@FindBy(xpath = "(//button[text()='No'])[2]") WebElement No;
	@FindBy(xpath = "//button[text()='Ok']") WebElement updateok;
	@FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement submit2;
	@FindBy(xpath = "(//button[@class='btnCreate btn-outline-defualt checkApproved ml-3 widthAuto'])[2]")
	WebElement template;
	@FindBy(xpath = "(//button[@class='btnCreate btn-outline-defualt checkApproved ml-3 widthAuto'])[3]")
	WebElement fileupload;
	
	public Market(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
		
	}
	
	public void marketcreatewithspace() throws InterruptedException {
		
		javascript(market);
		javawait();
		clickElement(create);
		javawait();
		clickElement(close);
		javawait();
		clickElement(create);
		javawait();
		clickElement(create1);
		javawait();
		softassert.assertEquals(marketalert.getText(), "Market Name is required");
		javawait();
		textbox(marketname, " ");
		javawait();
		clickElement(create1);
		if(Yes.isDisplayed()) {
			extenttest.log(Status.FAIL, "validation is not working fine with space");
			clickElement(No);
			javawait();
			clickElement(close);
		}
		else {
			
			 extenttest.log(Status.PASS, "validation is working fine with space");
		}
	}
	public void marketcreate() throws InterruptedException, IOException {
		
		excelUtils.setExcelFile(excelFilePath,"Market");
		clickElement(tab);
		javascript(market);
		clickElement(create);
		javawait();
		clickElement(close);
		clickElement(create);
		javawait();
		clickElement(create1);
		softassert.assertEquals(marketalert.getText(), "Market Name is required");
		javawait();
		clickElement(marketname);
		for (int i = 1; i < 2; i++) {
			marketname.sendKeys(excelUtils.getCellData(i, 0));
		clickElement(create1);
		}
	}
	
	public void writeitinexcel() throws IOException, InterruptedException {
		javawait();
		excelUtils.writecellvalues(excelpath, "Sheet1", "Australia", 0, 0);
	}
	
	public void fileupload() throws IOException, InterruptedException, AWTException {
		excelUtils.setExcelFile(excelFilePath,"Market");
		clickElement(tab);
		javascript(market);
		writeitinexcel();
		javawait();
		clickElement(fileupload);
		javawait();
		 String filePath = "C:\\Users\\Vaishnavi.T\\Downloads\\Market Name.xlsx";  // Update with the correct file path
	        
	        // Use Robot class to interact with the file dialog
	        Robot robot = new Robot();
	        
	        // Delay for file dialog to open
	        Thread.sleep(2000);
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	   
	        
	        // Press 'Enter' to confirm the file selection
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
      
	        // Wait for the upload to complete
	        Thread.sleep(5000);  // Adjust the sleep time as necessary
	        
	        // Optional: Print success message
	        System.out.println("File uploaded successfully.");
		
	}
    public void updateactivity(String pass) throws InterruptedException {
		
		clickElement(No);
		javawait();
		clickElement(update);
		clickElement(Yes);
		clickElement(password);
		password.sendKeys(pass);
		clickElement(submit2);
		refresh();
	}
    public void updateactivity2(String pass) throws InterruptedException {

	clickElement(Yes);
	clickElement(password);
	password.sendKeys(pass);
	clickElement(submit2);
	refresh();
     }
    public void existedmarketcreation() throws InterruptedException, IOException {
    	excelUtils.setExcelFile(excelFilePath,"Market");
    	javascript(market);
		clickElement(create);
		javawait();
		clickElement(create1);
		softassert.assertEquals(marketalert.getText(), "Market Name is required");
		clickElement(marketname);
		for (int i = 1; i < 2; i++) {
			marketname.sendKeys(excelUtils.getCellData(i, 0));
		clickElement(create1);
		javawait();
		 if(nochangesalreadyok.isDisplayed()) {
    		 System.out.println("this record is already existed");
    		 extenttest.log(Status.PASS, "already exist condition is working fine");
    		  clickElement(nochangesalreadyok);
              clickElement(close);
    	  }else throw new RuntimeException("already existed condition has been failed");
		}
    }
    public void marketupdatewithspace() throws InterruptedException, IOException {
    	excelUtils.setExcelFile(excelFilePath,"Market");
    	javascript(market);
    	clickElement(search);
    	for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 0));
    	clickElement(createdrecord);
    	clickElement(update);
    	softassert.assertEquals(commentalert.getText(), "Comments are required");
    	textboxc(marketname, " ");
    	javawait();
    	textbox(comments, "");
    	clickElement(update);
    	if(Yes.isDisplayed()) {
    		extenttest.log(Status.FAIL, "validation is not working fine with space");
    	clickElement(No);
    	clickElement(close);
    	}
    	else throw new RuntimeException("validations are working with space(market & comments)");
    	}
    }
    public void marketupdate(String comm) throws InterruptedException, IOException {
    	excelUtils.setExcelFile(excelFilePath,"Market");
    	javascript(market);
    	clickElement(search);
    	for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 0));
    	clickElement(createdrecord);
    	clickElement(update);
    	softassert.assertEquals(commentalert.getText(), "Comments are required");
    	clickElement(marketname);
    	marketname.clear();
    	marketname.sendKeys(excelUtils.getCellData(i, 1));
    	javawait();
    	textbox(comments, comm);
    	clickElement(update);
    	}
    }
    public void marketdisableenable(String comm) throws InterruptedException, IOException {
    	excelUtils.setExcelFile(excelFilePath,"Market");
    	javascript(market);
    	clickElement(search);
    	for (int i = 1; i < 2; i++) {
			search.sendKeys(excelUtils.getCellData(i, 1));
    	clickElement(createdrecord);
    	javawait();
    	clickElement(update);
    	softassert.assertEquals(commentalert.getText(), "Comments are required");
    	textbox(comments, comm);
    	clickElement(enable);
    	clickElement(update);	
    	}
    }
public void createactivity(String pass) throws InterruptedException {
		
		clickElement(No);
		clickElement(create1);
		clickElement(Yes);
		javawait();
		clickElement(password);
		password.sendKeys(pass);
		clickElement(submit2);
		javawait();
		refresh();
	}
    public void createactivity2(String pass) throws InterruptedException {

	clickElement(Yes);
	javawait();
	clickElement(password);
	password.sendKeys(pass);
	clickElement(submit2);
	javawait();
	refresh();
     }
	

     }
