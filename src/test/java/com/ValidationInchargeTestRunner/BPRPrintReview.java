package com.ValidationInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ValidationInchargePageObjects.BMRBPRValidationInchargePrintReview;

public class BPRPrintReview extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRValidationInchargePrintReview val;
	
	@Test
	public void printReturntoExecutive() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		val = new BMRBPRValidationInchargePrintReview(driver);
		
		try {
		as.userlogin(getvalidationincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Validation incharge id and password");
		val.bprprintreqreviewtab();
		LoggerUtil.logInfo("Clicked on Print Request Review tab and opened the record");
		val.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		val.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		val.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		val.returntoexeactivity(getpassword());
		LoggerUtil.logInfo("selected return as Production executive");
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Request Return by Validation Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	
	@Test
	public void printReturntoIncharge() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		val = new BMRBPRValidationInchargePrintReview(driver);
		
		try {
		as.userlogin(getvalidationincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Validation incharge id and password");
		val.bprprintreqreviewtab();
		LoggerUtil.logInfo("Clicked on Print Request Review tab and opened the record");
		val.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		val.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		val.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		val.returntoinchargeactivity(getpassword());
		LoggerUtil.logInfo("selected return as Poduction Incharge");
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Request Return by Validation Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	
	@Test
	public void printReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		val = new BMRBPRValidationInchargePrintReview(driver);
		
		try {
		as.userlogin(getvalidationincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Validation incharge id and password");
		val.bprprintreqreviewtab();
		LoggerUtil.logInfo("Clicked on Print Request Review tab and opened the record");
		val.submit();
		LoggerUtil.logInfo("clicked on submit");
		val.commentsbatchtype(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		val.submit();
		LoggerUtil.logInfo("clicked on submit");
		val.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Request Review by Validation Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void printReReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		val = new BMRBPRValidationInchargePrintReview(driver);
		
		try {
		as.userlogin(getvalidationincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Validation incharge id and password");
		val.bprreReview();
		LoggerUtil.logInfo("Clicked on Print Request Review tab and opened the record");
		val.submit();
		LoggerUtil.logInfo("clicked on submit");
		val.REcommentsbatchtype(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		val.submit();
		LoggerUtil.logInfo("clicked on submit");
		val.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Request Re Review by Validation Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}


}
