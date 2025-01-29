package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRProductDetails;
import com.QAHODorInChargePageObjects.HODBMRBPRProductDetails;

public class BMRProductDetailsApprovalorReturn extends ConfigurationReader {
	public Assignmenu as;
	public BMRProductDetails bmr;
	public HODBMRBPRProductDetails hod;
	
	@Test
	public void hodApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		hod = new HODBMRBPRProductDetails(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		//bmr.createrecord();
		hod.commentsvalidate();
		LoggerUtil.logInfo("Clicked on Master--> Product details--> BMR Details and opened the record.");
		LoggerUtil.logInfo("validated comments and entered comments");
		hod.priority();
		hod.HODSubmit(getapprovalcomments());
		LoggerUtil.logInfo("clicked on submit");
		hod.submitactivity(getpassword());	
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR HOD Approval Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void hodReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		hod = new HODBMRBPRProductDetails(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		//bmr.createrecord();
		hod.commentsvalidate();
		LoggerUtil.logInfo("Clicked on Master--> Product details--> BMR Details and opened the record.");
		LoggerUtil.logInfo("validated comments and entered comments");
		hod.priority();
		hod.HODReturn(getreturncomments());
		LoggerUtil.logInfo("clicked on return");
		hod.submitactivity2(getpassword());	
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR HOD Return Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void bprhodApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		hod = new HODBMRBPRProductDetails(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		//bmr.createrecord();
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		hod.bprcomments();
		LoggerUtil.logInfo("Clicked on Master--> Product details--> BPR Details and opened the record.");
		LoggerUtil.logInfo("validated comments and entered comments");
		hod.priority();
		hod.bprHODApproval(getapprovalcomments());
		LoggerUtil.logInfo("clicked on submit");
		hod.submitactivity2(getpassword());	
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR draftinitiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	@Test
	public void bprhodReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		hod = new HODBMRBPRProductDetails(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		 LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		//bmr.createrecord();
		hod.bprcomments();
		LoggerUtil.logInfo("Clicked on Master--> Product details--> BPR Details and opened the record.");
		LoggerUtil.logInfo("validated comments and entered comments");
		hod.priority();
		hod.bprHODReturn(getreturncomments());
		LoggerUtil.logInfo("clicked on return");
		hod.submitactivity2(getpassword());	
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR draftinitiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	

}
