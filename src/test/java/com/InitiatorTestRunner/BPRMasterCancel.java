package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterCancellationp;
import com.aventstack.extentreports.Status;

public class BPRMasterCancel extends ConfigurationReader{
	public Assignmenu as;
	public BMRBPRMasterCancellationp cancel;
	
	@Test
	public void bprMasterCancelinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancellationp(driver);
		
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		extenttest.log(Status.PASS, "Login to the application with initiator id" +getinitiator()+" and password as "+getpassword()+ " ");
		cancel.bprmastercancellationtab();
		LoggerUtil.logInfo("Clicked on BPR Master Cancel Initiation Tab and opened the record");
		extenttest.log(Status.PASS, "Clicked on BPR Master Cancel Initiation Tab and opened the record");
		cancel.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		cancel.comments();
		LoggerUtil.logInfo("validated the comments and entered the comments");
		extenttest.log(Status.PASS, "validated the comments and entered the comments");
		cancel.submit();
		LoggerUtil.logInfo("again clicked on submit");
		extenttest.log(Status.PASS, "again clicked on submit");
		cancel.bprsubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		extenttest.log(Status.PASS, "Entered the password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Master Cancel Initiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}

}
