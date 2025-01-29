package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterCancellationp;

public class BMRMasterCancellation extends ConfigurationReader{
 
	public Assignmenu as;
	public BMRBPRMasterCancellationp cancel;
	
	@Test
	public void bmrMasterCancelinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancellationp(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		cancel.mastercancellationtab();
		LoggerUtil.logInfo("clicked on master cancel tab and opne the record");
		cancel.submit();
		LoggerUtil.logInfo("clicked on submit");
		cancel.comments();
		LoggerUtil.logInfo("Verified the validations");
		cancel.submit();
		LoggerUtil.logInfo("clicked on submit");
		cancel.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Master Cancel Initiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
		
}
