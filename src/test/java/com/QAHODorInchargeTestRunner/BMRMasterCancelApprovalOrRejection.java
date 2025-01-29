package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRMasterCancelApproval;

public class BMRMasterCancelApprovalOrRejection extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRMasterCancelApproval cancel;
	
	@Test
	public void masterCancelApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancelApproval(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		cancel.mastercancelapprovaltab();
		LoggerUtil.logInfo("clicked on Master Cancel Approval tab and opened the record");
		cancel.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		cancel.submit();
		LoggerUtil.logInfo("clicked on submit");
		cancel.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Master Cancel Approval Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
    public void masterCancelRejection() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancelApproval(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		cancel.mastercancelapprovaltab();
		LoggerUtil.logInfo("clicked on Master Cancel Approval tab and opened the record");
		cancel.comments(getrejectedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		cancel.reject();
		LoggerUtil.logInfo("clicked on reject");
		cancel.rejectactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Master Cancel Rejection Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
