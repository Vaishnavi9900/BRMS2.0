package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;
import com.aventstack.extentreports.Status;

public class BMRMasterApproval extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRMasterApprovalInitiation app;
	
	@Test
	public void masterApprovalInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		extenttest.log(Status.PASS, "Login to the application with initiator id" +getinitiator()+" and password as "+getpassword()+ " ");
		app.masterinitiationtab();
		LoggerUtil.logInfo("clicked the Master Initiation tab and open the record");
		extenttest.log(Status.PASS, "clicked the Master Initiation tab and open the record");
		app.documents();
		LoggerUtil.logInfo("Open the Documents and review the approval details");
		extenttest.log(Status.PASS, "Open the Documents and review the approval details");
		app.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		app.comments();
		LoggerUtil.logInfo("Verified the validations");
		extenttest.log(Status.PASS, "Verified the validations");
		app.submit();
		LoggerUtil.logInfo("Clicked on submit button");
		extenttest.log(Status.PASS, "Clicked on submit button");
		app.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		extenttest.log(Status.PASS, "Entered the password as " +getpassword()+" and submitted the master approval record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Master Approval Initiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
		
	}
	@Test
    public void masterApprovalReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		extenttest.log(Status.PASS, "Login to the application with initiator id" +getinitiator()+" and password as "+getpassword()+ " ");
		app.masterreinitiation();
		LoggerUtil.logInfo("clicked the Master Initiation tab,returned status tab and open the record");
		extenttest.log(Status.PASS, "clicked the Master Initiation tab,returned status tab and open the record");
		app.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		extenttest.log(Status.PASS, "clicked on resubmit");
		app.reinitiationcomments();
		LoggerUtil.logInfo("Verified the validations");
		extenttest.log(Status.PASS, "Verified the validations");
		app.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		extenttest.log(Status.PASS, "clicked on resubmit");
		app.resubmitactivity2(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		extenttest.log(Status.PASS, "Entered the password as " +getpassword()+" and submitted the master approval Reinitiation record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Master Approval ReInitiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
		}
}
