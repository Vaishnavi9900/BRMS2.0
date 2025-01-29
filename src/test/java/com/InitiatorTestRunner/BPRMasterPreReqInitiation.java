package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BPRMasterPreparation;

public class BPRMasterPreReqInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRMasterPreparation bpr;
	
	@Test
	public void bprmasterreqinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		bpr = new BPRMasterPreparation(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		bpr.bprMasterPrereqInitiation(getinitiatorcomments());
		LoggerUtil.logInfo("clicked on master prep. req. tab, validateed the comments and entered the comments");
		bpr.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Master Preparation Request Initiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}

}
