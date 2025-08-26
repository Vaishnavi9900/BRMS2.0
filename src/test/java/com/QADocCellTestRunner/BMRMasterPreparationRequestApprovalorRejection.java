package com.QADocCellTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QADocCellPageObjects.BMRMasterPreparationapprovals;
import com.aventstack.extentreports.Status;


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
		extenttest.log(Status.PASS, "Login to the application with QA Doccell id" +getQADoccell()+" and password as "+getpassword()+ " ");
		mp.masterprerejection(getrejectedcomments());
		LoggerUtil.logInfo("clicked on Master Preparation Req. Approval tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Master Preparation Req. Approval tab and opened the record");
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		mp.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and rejeted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and rejected the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
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
		extenttest.log(Status.PASS, "Login to the application with QA Doccell id" +getQADoccell()+" and password as "+getpassword()+ " ");
		//mp.masterprepapprovaltab();
		mp.masterpreapproval(getapprovalcomments());
		LoggerUtil.logInfo("clicked on Master Preparation Req. Approval tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Master Preparation Req. Approval tab and opened the record");
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		mp.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
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
		extenttest.log(Status.PASS, "Login to the application with QA Doccell id" +getQADoccell()+" and password as "+getpassword()+ " ");
		//mp.masterprepapprovaltab();
		mp.masterprepreqapprovalforblockversion(getapprovalcomments());
		LoggerUtil.logInfo("clicked on Master Preparation Req. Approval tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Master Preparation Req. Approval tab and opened the record");
		LoggerUtil.logInfo("validated comments, blocked the previous version and entered comments");
		extenttest.log(Status.PASS, "validated comments, blocked the previous version and entered comments");
		mp.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
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
