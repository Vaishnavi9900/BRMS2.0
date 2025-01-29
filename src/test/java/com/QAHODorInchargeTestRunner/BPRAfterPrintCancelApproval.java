package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRQAHODAfterPrintApprovalorReject;

public class BPRAfterPrintCancelApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRQAHODAfterPrintApprovalorReject app;
	
	@Test
	public void afterPrintcancelReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		app.bprafterprintapprovaltab();
		LoggerUtil.logInfo("clicked on After Print Cancel Approval tab and opened the record");
		app.afterprintreturn();
		LoggerUtil.logInfo("clicked on return");
		app.afterprintcomments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		app.afterprintreturn();
		LoggerUtil.logInfo("clicked on return");
		app.afterprintreturnactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR After Print Cancel Return Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void afterPrintcancelApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		app.bprafterprintapprovaltab();
		LoggerUtil.logInfo("clicked on After Print Cancel Approval tab and opened the record");
		app.afterprintsubmit();
		LoggerUtil.logInfo("clicked on submit");
		app.afterprintcomments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		app.afterprintsubmit();
		LoggerUtil.logInfo("clicked on submit");
		app.afterprintsubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR After Print Cancel Approval Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void afterPrintcancelReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		app.bprafterprintapprovaltab();
		LoggerUtil.logInfo("clicked on After Print Cancel Approval tab and opened the record");
		app.afterprintreject();
		LoggerUtil.logInfo("clicked on reject");
		app.afterprintcomments(getrejectedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		app.afterprintreject();
		LoggerUtil.logInfo("clicked on reject");
		app.afterprintrejectactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR After Print Cancel Reject Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}

}
