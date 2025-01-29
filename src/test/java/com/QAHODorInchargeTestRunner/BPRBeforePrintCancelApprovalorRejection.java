package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BPRPrintApprovalorReject;

public class BPRBeforePrintCancelApprovalorRejection extends ConfigurationReader{
	
	
	public Assignmenu as;
	public BPRPrintApprovalorReject app;
	
	
	@Test
	public void beforePrintCancelReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BPRPrintApprovalorReject(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		app.beforeprintapprovalrejecttab();
		LoggerUtil.logInfo("clicked on Before Print Cancel Approval tab and opened the record");
		app.beforeprintreturn();
		LoggerUtil.logInfo("clicked on return");
		app.beforeprintcomments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		app.beforeprintreturn();
		LoggerUtil.logInfo("clicked on return");
		app.beforeprintreturnactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Before Print Cancel Return Test is failed", e);
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
		app = new BPRPrintApprovalorReject(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		app.beforeprintapprovalrejecttab();
		LoggerUtil.logInfo("clicked on Before Print Cancel Approval tab and opened the record");
		app.beforeprintsubmit();
		LoggerUtil.logInfo("clicked on submit");
		app.beforeprintcomments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		app.beforeprintsubmit();
		LoggerUtil.logInfo("clicked on submit");
		app.beforeprintsubmitactivity(getpassword());	
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Before Print Cancel Approval Test is failed", e);
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
		app = new BPRPrintApprovalorReject(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		app.beforeprintapprovalrejecttab();
		LoggerUtil.logInfo("clicked on Before Print Cancel Approval tab and opened the record");
		app.beforeprintreject();
		LoggerUtil.logInfo("clicked on reject");
		app.beforeprintcomments(getrejectedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		app.beforeprintreject();
		LoggerUtil.logInfo("clicked on reject");
		app.beforeprintrejectactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Before Print Cancel Rejection Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	

}
