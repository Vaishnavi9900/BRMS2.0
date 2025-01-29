package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRMasterCancelApproval;

public class BPRMasterCancelAppovalorRejection extends ConfigurationReader{
	public Assignmenu as;
	public BMRBPRMasterCancelApproval cancel;
	
	@Test
	public void bprmasterCancelApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancelApproval(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		cancel.bprmastercancelapprovaltab();
		LoggerUtil.logInfo("clicked on Master Cancel Approval tab and opened the record");
		cancel.submit();
		LoggerUtil.logInfo("clicked on submit");
		cancel.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		cancel.submit();
		LoggerUtil.logInfo("clicked on submit");
		cancel.bprsubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Master Cancel Approval Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
    public void bprmasterCancelRejection() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancelApproval(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		cancel.bprmastercancelapprovaltab();
		LoggerUtil.logInfo("clicked on Master Cancel Approval tab and opened the record");
		cancel.reject();
		LoggerUtil.logInfo("clicked on reject");
		cancel.comments(getrejectedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		cancel.reject();
		LoggerUtil.logInfo("clicked on reject");
		cancel.bprrejectactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Master Cancel Rejection Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}


}
