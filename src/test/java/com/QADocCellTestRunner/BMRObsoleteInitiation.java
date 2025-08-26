package com.QADocCellTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QADocCellPageObjects.BMRBPRObsoleteInitiation;
import com.aventstack.extentreports.Status;

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
		extenttest.log(Status.PASS, "Login to the application with QA Doccell id" +getQADoccell()+" and password as "+getpassword()+ " ");
		obs.obsoleteInitiation();
		LoggerUtil.logInfo("clicked on Obsolete Initiation tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Obsolete Initiation tab and opened the record");
		obs.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		obs.comments(getinitiatorcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		obs.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		obs.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
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
		extenttest.log(Status.PASS, "Login to the application with QA Doccell id" +getQADoccell()+" and password as "+getpassword()+ " ");
		obs.obsoleteReInitiation();
		LoggerUtil.logInfo("clicked on Obsolete Initiation tab");
		extenttest.log(Status.PASS, "clicked on Obsolete Initiation tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Returned status tab and opened the record");
		obs.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		extenttest.log(Status.PASS, "clicked on resubmit");
		obs.comments(getinitiatorcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		obs.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		extenttest.log(Status.PASS, "clicked on resubmit");
		obs.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
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
		extenttest.log(Status.PASS, "Login to the application with QA Doccell id" +getQADoccell()+" and password as "+getpassword()+ " ");
		obs.finalobsolete();
		LoggerUtil.logInfo("clicked on Obsolete Initiation tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Obsolete Initiation tab and opened the record");
		obs.bmrobsolete();
		LoggerUtil.logInfo("clicked on obsolete");
		extenttest.log(Status.PASS, "clicked on obsolete");
		obs.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		obs.bmrobsolete();
		LoggerUtil.logInfo("clicked on osbolete");
		extenttest.log(Status.PASS, "clicked on obsolete");
		obs.bmrobsoleteactivity(getpassword());
		LoggerUtil.logInfo("Entered password and obsolete the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and obsoleted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
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
