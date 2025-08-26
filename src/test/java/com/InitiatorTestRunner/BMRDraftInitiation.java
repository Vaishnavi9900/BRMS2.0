package com.InitiatorTestRunner;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.aventstack.extentreports.Status;

public class BMRDraftInitiation extends ConfigurationReader {
	public Assignmenu as;
	public com.InitiatorPageObjects.BMRDraftInitiation df;
	
	@Test
	public void draftinitiation() throws InterruptedException, IOException, AWTException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		//as.userlogin(getinitiator(), getpassword());
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiator and password details");
		extenttest.log(Status.PASS, "Login to the application with initiator id: " +getinitiator()+" and password: "+getpassword()+ " ");
		df.bmrmasterdraftinitiationtab();
		LoggerUtil.logInfo("clicked on bmr master draft initiation tab");
		extenttest.log(Status.PASS, "clicked on bmr master draft initiation tab");
		df.wordtemplates();
		LoggerUtil.logInfo("saved the word templates");
		extenttest.log(Status.PASS, "saved the word templates");
		//df.finalapproval();
		df.cftreview();
		LoggerUtil.logInfo("selected the cft radio button");
		extenttest.log(Status.PASS, "selected the cft radio button");
		df.draftsubmit(getdepartment(), getrole(),getdepartment1(), getrole1(), getinitiatorcomments());
		LoggerUtil.logInfo("selected the req. cft's");
		extenttest.log(Status.PASS, "selected the req. cft's");
		df.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the draft Reinitiation record");
		extenttest.log(Status.PASS, "Entered the password: " +getpassword()+" and submitted the draft record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR draftinitiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	@Test
	public void draftinitiation1() throws InterruptedException, IOException, AWTException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		//as.userlogin(getinitiator(), getpassword());
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiator and password details");
		extenttest.log(Status.PASS, "Login to the application with initiator id: " +getinitiator()+" and password: "+getpassword()+ " ");
		df.bmrmasterdraftinitiationtab();
		LoggerUtil.logInfo("clicked on bmr master draft initiation tab");
		extenttest.log(Status.PASS, "clicked on bmr master draft initiation tab");
		df.wordtemplates();
		LoggerUtil.logInfo("saved the word templates");
		extenttest.log(Status.PASS, "saved the word templates");
		//df.finalapproval();
		df.cftreview();
		LoggerUtil.logInfo("selected the cft radio button");
		extenttest.log(Status.PASS, "selected the cft radio button");
		df.draftsubmit1(getdepartment(), getrole2(), getinitiatorcomments());
		LoggerUtil.logInfo("selected the req. cft's");
		extenttest.log(Status.PASS, "selected the req. cft's");
		df.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the draft Reinitiation record");
		extenttest.log(Status.PASS, "Entered the password: " +getpassword()+" and submitted the draft record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR draftinitiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	@Test
	public void draftReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		try {
		//as.userlogin(getinitiator(), getpassword());
		as.userlogin(getinitiator(), getpassword());
		extenttest.log(Status.PASS, "Login to the application with initiator id: " +getinitiator()+" and password: "+getpassword()+ " ");
		df.draftReinitiation();
		LoggerUtil.logInfo("clicked on bmr master draft initiation tab and returned status tab");
		extenttest.log(Status.PASS, "clicked on bmr master draft initiation tab and returned status tab");
		//df.finalapproval()		
		df.reinitiationdraftsubmit(getdepartment(), getrole2(), getinitiatorcomments());;
		LoggerUtil.logInfo("selected the required cft's ");
		extenttest.log(Status.PASS, "selected the required cft's ");
		df.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the draft Reinitiation record");
		extenttest.log(Status.PASS, "Entered the password as " +getpassword()+"and submitted the draft Reinitiation record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Draft Reinitiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	@Test
	public void draftinitiationwithoutcft() throws InterruptedException, IOException, AWTException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiator and password details");
		extenttest.log(Status.PASS, "Login to the application with initiator id" +getinitiator()+" and password as "+getpassword()+ " ");
		df.bmrmasterdraftinitiationtab();
		LoggerUtil.logInfo("clicked on bmr master draft initiation tab");
		extenttest.log(Status.PASS, "clicked on bmr master draft initiation tab");
		df.wordtemplates();
		LoggerUtil.logInfo("saved the word templates");
		extenttest.log(Status.PASS, "saved the word templates");
		df.finalapproval();
		LoggerUtil.logInfo("selected the final approval radio button");
		extenttest.log(Status.PASS, "selected the final approval radio button");
		df.draftsubmit(getdepartment(), getrole(),getdepartment1(), getrole1(), getinitiatorcomments());
		df.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the draft Reinitiation record");
		extenttest.log(Status.PASS, "Entered the password as " +getpassword()+"and submitted the draft record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Draft Initiation without CFT Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}


}
