package com.IPQATestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.IPQAPageObjects.BMRBPRAdditionalPagePrintApproval;

public class BMRAdditionalPageApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRAdditionalPagePrintApproval app;
	
	@Test
	public void additionalPageReturnbyIPQA() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRAdditionalPagePrintApproval(driver);
		
		try {
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		app.additionalPageReturn();
		LoggerUtil.logInfo("clicked on BMR Additional Page Print req Approval tab and opened the record");
		app.returnbutton();
		LoggerUtil.logInfo("clickedd on return");		
		app.comments(getreturncomments());
		LoggerUtil.logInfo("Validate the comments and entered the comments");
		app.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		app.returnactivity(getpassword());
		LoggerUtil.logInfo("Entered the passowrd and returned the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Additional Page Print Request Return by IPQA Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	            throw e;
		}
			
	}
	@Test
	public void additionalPageApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRAdditionalPagePrintApproval(driver);
		
		try {
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		app.additionalPageReturn();
		LoggerUtil.logInfo("clicked on BMR Additional Page Print req Approval tab and opened the record");
		app.submit();
		LoggerUtil.logInfo("clicked on submit");
		app.comments(getapprovalcomments());
		LoggerUtil.logInfo("Validated the comments and entered the comments");
		app.submit();
		LoggerUtil.logInfo("clicked on submit");
		app.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and approved the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Additional Page Print Request Approval by IPQA Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	            throw e;
		}		
	}
	@Test
	public void additionalPageRejection() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRAdditionalPagePrintApproval(driver);
		
		try {
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		app.additionalPageReturn();
		LoggerUtil.logInfo("clicked on BMR Additional Page Print req Approval tab and opened the record");
		app.reject();
		LoggerUtil.logInfo("clicked on reject");
		app.comments(getrejectedcomments());
		LoggerUtil.logInfo("Validated the comments and entered the comments");
		app.reject();
		LoggerUtil.logInfo("clicked on reject");
		app.rejectactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and rejected the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Additional Page Print Request Rejection by IPQA Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	            throw e;
		}			
	}

}
