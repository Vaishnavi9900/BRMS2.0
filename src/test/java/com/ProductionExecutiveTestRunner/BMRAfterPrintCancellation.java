package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BMRBPRAfterPrintCancelInitiation;

public class BMRAfterPrintCancellation extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRAfterPrintCancelInitiation cancel;
	
	@Test
	public void afterPrintCancelInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cancel = new BMRBPRAfterPrintCancelInitiation(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		cancel.afterPrintcanelinitiation();
		LoggerUtil.logInfo("Clicked on after print cancel initiation tab and opened the record");
		cancel.submit();
		LoggerUtil.logInfo("clicked on submit");
		cancel.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		cancel.submit();
		LoggerUtil.logInfo("clicked on submit");
		cancel.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR After Print Cancel Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void afterPrintCancelReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cancel = new BMRBPRAfterPrintCancelInitiation(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		cancel.afterPrintcanelReinitiation();
		LoggerUtil.logInfo("Clicked on after print cancel initiation tab");
		LoggerUtil.logInfo("Clicked on Returned tab and opened the record");
		cancel.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		cancel.reinitiationcomments();
		LoggerUtil.logInfo("validated comments and entered comments");
		cancel.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		cancel.resubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR After Print Cancel ReInitiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
