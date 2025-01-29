package com.QADocCellTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QADocCellPageObjects.BMRMasterPreparationapprovals;

public class BPRMasterReqApprovalRejection extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRMasterPreparationapprovals mp;
	
	@Test
	public void bprmasterreqrejection() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparationapprovals(driver);
		
		try {
		as.userlogin(getQADoccell(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		mp.bprmasterprerejection(getrejectedcomments());
		LoggerUtil.logInfo("clicked on Master Prep. Approval tab and opened the record");
		LoggerUtil.logInfo("validated comments and entered comments");
		mp.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and rejected the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR  Master Prep Req. Reject Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
		
	}
	@Test
	public void bprmasterreqapproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparationapprovals(driver);
		
		try {
		as.userlogin(getQADoccell(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		mp.bprmasterpreapproval(getapprovalcomments());
		LoggerUtil.logInfo("clicked on Master Prep. Approval tab and opened the record");
		LoggerUtil.logInfo("validated comments and entered comments");
		mp.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR  Master Prep Req. Approval Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
