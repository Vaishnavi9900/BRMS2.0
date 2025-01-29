package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRObsoleteApproval;

public class BMRObsoleteApprovalNdReject extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRObsoleteApproval app;

	@Test
	public void obsoleteReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRObsoleteApproval(driver);

		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		app.obsoleteApproval();
		LoggerUtil.logInfo("clicked on Obsolete Approval tab and opened the record");
		app.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		app.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		app.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		app.returnactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Obsolete Approval Return Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void obsoleteApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRObsoleteApproval(driver);

		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		app.obsoleteApproval();
		LoggerUtil.logInfo("clicked on Obsolete Approval tab and opened the record");
		app.submit();
		LoggerUtil.logInfo("clicked on submit");
		app.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		app.submit();
		LoggerUtil.logInfo("clicked on submit");
		app.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Obsolete Approval Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void obsoleteReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRObsoleteApproval(driver);

		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		app.obsoleteApproval();
		LoggerUtil.logInfo("clicked on Obsolete Approval tab and opened the record");
		app.reject();
		LoggerUtil.logInfo("clicked on reject");
		app.comments(getrejectedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		app.reject();
		LoggerUtil.logInfo("clicked on reject");
		app.rejectactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Obsolete Approval Reject Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
