package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;

public class BPRMasterApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRMasterApprovalInitiation app;
	
    @Test
	public void bprmasterApprovalInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		app.bprmasterinitiationtab();
		LoggerUtil.logInfo("Clicked on BPR Master Initiation tab and opened the record");
		app.submit();
		LoggerUtil.logInfo("clicked on submit");
		app.comments();
		LoggerUtil.logInfo("validated the comments and entered the comments");
		app.submit();
		LoggerUtil.logInfo("clicked on submit");
		app.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Master Approval initiation without CFT Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
		
	}
	@Test
    public void bprmasterApprovalReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		app.bprmasterreinitiation();
//		app.resubmit();
		LoggerUtil.logInfo("Clicked on BPR Master Initiation tab, returned status record and opened the record");
		app.reinitiationcomments();
		LoggerUtil.logInfo("validated the comments and entered the comments");
		app.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		app.resubmitactivity2(getpassword());
		LoggerUtil.logInfo("Entered the password and resubmitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Master Approval ReInitiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
		
	}

}
