package com.QADocCellTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QADocCellPageObjects.BMRBPRObsoleteInitiation;

public class BMRObsoleteInitiation extends ConfigurationReader {

	public Assignmenu as;
	public BMRBPRObsoleteInitiation obs;

	@Test
	public void obsoleteInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		obs = new BMRBPRObsoleteInitiation(driver);

		try {
		as.userlogin(getQADoccell(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		obs.obsoleteInitiation();
		LoggerUtil.logInfo("clicked on Obsolete Initiation tab and opened the record");
		obs.submit();
		LoggerUtil.logInfo("clicked on submit");
		obs.comments(getinitiatorcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		obs.submit();
		LoggerUtil.logInfo("clicked on submit");
		obs.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Obsolete Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void obsoleteReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		obs = new BMRBPRObsoleteInitiation(driver);

		try {
		as.userlogin(getQADoccell(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		obs.obsoleteReInitiation();
		LoggerUtil.logInfo("clicked on Obsolete Initiation tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
		obs.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		obs.comments(getinitiatorcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		obs.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		obs.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Obsolete ReInitiation  Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void finalobsolete() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		obs = new BMRBPRObsoleteInitiation(driver);

		try {
		as.userlogin(getQADoccell(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		obs.finalobsolete();
		LoggerUtil.logInfo("clicked on Obsolete Initiation tab and opened the record");
		obs.obsolete();
		LoggerUtil.logInfo("clicked on obsolete");
		obs.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		obs.obsolete();
		LoggerUtil.logInfo("clicked on osbolete");
		obs.obsoleteactivity(getpassword());
		LoggerUtil.logInfo("Entered password and obsolete the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Final Obsolete Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
