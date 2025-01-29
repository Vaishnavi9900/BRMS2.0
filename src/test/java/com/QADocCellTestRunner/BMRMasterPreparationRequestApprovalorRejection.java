package com.QADocCellTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QADocCellPageObjects.BMRMasterPreparationapprovals;

public class BMRMasterPreparationRequestApprovalorRejection extends ConfigurationReader {
	public Assignmenu as;
	public BMRMasterPreparationapprovals mp;
	
	@Test
	public void bmrmasterreqrejection() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparationapprovals(driver);
		
		
		try {
		as.userlogin(getQADoccell(), getpassword());
		//mp.masterprepapprovaltab();
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		mp.masterprerejection(getrejectedcomments());
		LoggerUtil.logInfo("clicked on Master Preparation Req. Approval tab and opened the record");
		LoggerUtil.logInfo("validated comments and entered comments");
		mp.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and rejeted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Master Preparation Req. Rejection  Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void bmrmasterreqapproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparationapprovals(driver);
		
		try {
		as.userlogin(getQADoccell(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		//mp.masterprepapprovaltab();
		mp.masterpreapproval(getapprovalcomments());
		LoggerUtil.logInfo("clicked on Master Preparation Req. Approval tab and opened the record");
		LoggerUtil.logInfo("validated comments and entered comments");
		mp.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Master Preparation Req. Approval Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void bmrblockversionmasterreqapproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparationapprovals(driver);
		
		try {
		as.userlogin(getQADoccell(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		//mp.masterprepapprovaltab();
		mp.masterprepreqapprovalforblockversion(getapprovalcomments());
		LoggerUtil.logInfo("clicked on Master Preparation Req. Approval tab and opened the record");
		LoggerUtil.logInfo("validated comments, blocked the previous version and entered comments");
		mp.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Master Preparation Req. Approval with block previous version est is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
