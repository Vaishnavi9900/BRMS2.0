package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRQAHODRePrintApproval;
import com.aventstack.extentreports.Status;

public class BPRRePrintApproval extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRQAHODRePrintApproval app;
	
	@Test
	public void rePrintReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODRePrintApproval(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		extenttest.log(Status.PASS, "Login to the application with QA HOD id" +getQAHOD()+" and password as "+getpassword()+ " ");
		app.bprreprintapprovaltab();
		LoggerUtil.logInfo("clicked on RePrint Approval tab and opened the record");
		extenttest.log(Status.PASS, "clicked on RePrint Approval tab and opened the record");
		app.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		app.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		app.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		app.returnactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR RePrint Return Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void rePrintApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODRePrintApproval(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		extenttest.log(Status.PASS, "Login to the application with QA HOD id" +getQAHOD()+" and password as "+getpassword()+ " ");
		app.bprreprintapprovaltab();
		LoggerUtil.logInfo("clicked on RePrint Approval tab and opened the record");
		extenttest.log(Status.PASS, "clicked on RePrint Approval tab and opened the record");
		app.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		app.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		app.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		app.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR RePrint Approval Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void rePrintReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODRePrintApproval(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		extenttest.log(Status.PASS, "Login to the application with QA HOD id" +getQAHOD()+" and password as "+getpassword()+ " ");
		app.bprreprintapprovaltab();
		LoggerUtil.logInfo("clicked on RePrint Approval tab and opened the record");
		extenttest.log(Status.PASS, "clicked on RePrint Approval tab and opened the record");
		app.reject();
		LoggerUtil.logInfo("clicked on reject");
		extenttest.log(Status.PASS, "clicked on reject");
		app.comments(getrejectedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		app.reject();
		LoggerUtil.logInfo("clicked on reject");
		extenttest.log(Status.PASS, "clicked on reject");
		app.rejectnactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR RePrint Reject Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}

}
