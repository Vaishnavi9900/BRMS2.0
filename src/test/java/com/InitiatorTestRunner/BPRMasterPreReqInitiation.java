package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BPRMasterPreparation;
import com.aventstack.extentreports.Status;

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
		extenttest.log(Status.PASS, "Login to the application with initiator id" +getinitiator()+" and password as "+getpassword()+ " ");
		bpr.bprMasterPrereqInitiation(getinitiatorcomments());
		LoggerUtil.logInfo("clicked on master prep. req. tab, validateed the comments and entered the comments");
		extenttest.log(Status.PASS, "clicked on master prep. req. tab, validateed the comments and entered the comments");
		bpr.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		extenttest.log(Status.PASS, "Entered the password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
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
