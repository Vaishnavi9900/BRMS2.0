package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRQAHODAfterPrintApprovalorReject;

public class BMRBeforePrintCancelApprovalorRejection extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRQAHODAfterPrintApprovalorReject hod;
	
	
	@Test
	public void beforePrintCancelReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		hod.beforeprintapprovalrejecttab();
		LoggerUtil.logInfo("clicked on Before Print Cancel Approval tab and opened the record");
		hod.beforeprintreturn();
		LoggerUtil.logInfo("clicked on return");
		hod.beforeprintcomments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		hod.beforeprintreturn();
		LoggerUtil.logInfo("clicked on return");
		hod.beforeprintreturnactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Before Print Cancel Return Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void beforePrintCancelApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		hod.beforeprintapprovalrejecttab();
		LoggerUtil.logInfo("clicked on Before Print Cancel Approval tab and opened the record");
		hod.beforeprintsubmit();
		LoggerUtil.logInfo("clicked on submit");		
		hod.beforeprintcomments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		hod.beforeprintsubmit();
		LoggerUtil.logInfo("clicked on submit");
		hod.beforeprintsubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Before Print Cancel Approval Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void beforePrintCancelRejection() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		hod.beforeprintapprovalrejecttab();
		LoggerUtil.logInfo("clicked on Before Print Cancel Approval tab and opened the record");
		hod.beforeprintreject();
		LoggerUtil.logInfo("clicked on reject");
		hod.beforeprintcomments(getrejectedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		hod.beforeprintreject();
		LoggerUtil.logInfo("clicked on reject");
		hod.beforeprintrejectactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Before Print Cancel Rejection Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	

}
