package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRQAHODRePrintApproval;

public class BMRRePrintApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRQAHODRePrintApproval app;
	
	@Test
	public void rePrintReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODRePrintApproval(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		app.reprintapprovaltab();
		LoggerUtil.logInfo("clicked on RePrint Approval tab and opened the record");
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
			LoggerUtil.logError("BMR RePrint Return Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
		
	}
	@Test
	public void rePrintApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODRePrintApproval(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		app.reprintapprovaltab();
		LoggerUtil.logInfo("clicked on RePrint Approval tab and opened the record");
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
			LoggerUtil.logError("BMR RePrint Approval Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void rePrintReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODRePrintApproval(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		app.reprintapprovaltab();
		LoggerUtil.logInfo("clicked on RePrint Approval tab and opened the record");
		app.reject();
		LoggerUtil.logInfo("clicked on reject");
		app.comments(getrejectedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		app.reject();
		LoggerUtil.logInfo("clicked on reject");
		app.rejectnactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR RePrint Rejection Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
}
