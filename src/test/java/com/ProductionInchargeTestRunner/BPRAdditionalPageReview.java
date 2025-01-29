package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionInchargePageObjects.BMRBPRAdditionalPrintReview;

public class BPRAdditionalPageReview extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRAdditionalPrintReview review;
	
	@Test
	public void bpradditionalPageReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAdditionalPrintReview(driver);
		
		try {
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		review.bpradditionalPageReturn();
		LoggerUtil.logInfo("clicked on Additional Page Print Review tab and opened the record");
		review.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		review.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		review.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		review.returnactivity(getpassword());
		LoggerUtil.logInfo("Entered password and returned the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Additional Page Print Return by Production Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void bpradditionalPageReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAdditionalPrintReview(driver);
		
		try {
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		review.bpradditionalPageReturn();
		LoggerUtil.logInfo("clicked on Additional Page Print Review tab and opened the record");
		review.submit();
		LoggerUtil.logInfo("clicked on submit");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		review.submit();
		LoggerUtil.logInfo("clicked on submit");
		review.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Additional Page Print review by Production Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void bpradditionalPageReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAdditionalPrintReview(driver);
		
		try {
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		review.bpradditionalPageReturn();
		LoggerUtil.logInfo("clicked on Additional Page Print Review tab and opened the record");
		review.reject();
		LoggerUtil.logInfo("clicked on reject");
		review.comments(getrejectedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		review.reject();
		LoggerUtil.logInfo("clicked on reject");
		review.rejectactivity(getpassword());
		LoggerUtil.logInfo("Entered password and rejected the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Additional Page Print Reject by Production Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}


}
