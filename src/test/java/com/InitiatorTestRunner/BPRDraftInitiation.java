package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.aventstack.extentreports.Status;

public class BPRDraftInitiation extends ConfigurationReader {
	
	public Assignmenu as;
	public com.InitiatorPageObjects.BMRDraftInitiation df;
	
	@Test
	public void bprdraftinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		extenttest.log(Status.PASS, "Login to the application with initiator id" +getinitiator()+" and password as "+getpassword()+ " ");
		df.bprmasterdraftinitiationtab();
		LoggerUtil.logInfo("clicked on BPR Draft Initiation");
		df.bprwordtemplates();
		LoggerUtil.logInfo("saved the word templated");
		//df.finalapproval();
		df.cftreview();
		LoggerUtil.logInfo("selected the cft radio button");
		df.draftsubmit(getdepartment(), getrole(), getdepartment1(), getrole1(),getcomments());
		LoggerUtil.logInfo("selected the required cft's ");
		df.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR draft initiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	@Test
	public void bprdraftReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		extenttest.log(Status.PASS, "Login to the application with initiator id" +getinitiator()+" and password as "+getpassword()+ " ");
		df.bprdraftReinitiation();
		LoggerUtil.logInfo("clicked on BPR Draft Reinitiation");
		extenttest.log(Status.PASS, "clicked on BPR Draft Reinitiation");
		//df.finalapproval();
		df.comments(getinitiatorcomments());
		LoggerUtil.logInfo("verified validations and entered the comments");
		extenttest.log(Status.PASS, "verified validations and entered the comments");
		df.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		df.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		extenttest.log(Status.PASS, "Entered the password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR draft ReInitiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	@Test
	public void bprdraftinitiationwithoutcft() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		extenttest.log(Status.PASS, "Login to the application with initiator id" +getinitiator()+" and password as "+getpassword()+ " ");
		df.bprmasterdraftinitiationtab();
		LoggerUtil.logInfo("clicked on BPR Draft Initiation");
		extenttest.log(Status.PASS, "clicked on BPR Draft Initiation");
		df.bprwordtemplates();
		LoggerUtil.logInfo("saved the word templates");
		extenttest.log(Status.PASS, "saved the word templates");
		df.finalapproval();
		LoggerUtil.logInfo("selected the final approval radio button");
		extenttest.log(Status.PASS, "selected the final approval radio button");
		df.draftsubmit(getdepartment(), getrole(),getdepartment1(), getrole1(), getcomments());
		LoggerUtil.logInfo("Validated the comments and entered the comments");
		extenttest.log(Status.PASS, "Validated the comments and entered the comments");
		df.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		extenttest.log(Status.PASS, "Entered the password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR draft initiation without CFT Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}


}
