package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BPRReprintIssuanceandPrint;
import com.aventstack.extentreports.Status;


public class BPRReprintIssueandPrint extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRReprintIssuanceandPrint issue;
	
	@Test
	public void RePrintPrint() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issue = new BPRReprintIssuanceandPrint(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		extenttest.log(Status.PASS, "Login to the application with QA Officer id" +getQAOfficer()+" and password as "+getpassword()+ " ");
		issue.reprinttab();
		LoggerUtil.logInfo("clicked on RePrint Issuance tab");
		extenttest.log(Status.PASS, "clicked on RePrint Issuance tab");
		LoggerUtil.logInfo("clicked on RePrint Issuance Issued tab and opened the record");
		extenttest.log(Status.PASS, "clicked on RePrint Issuance Issued tab and opened the record");
		issue.additionalprint();
		LoggerUtil.logInfo("clicked on Print");
		extenttest.log(Status.PASS, "clicked on Print");
		issue.additionalcomments(getprintcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		issue.additionalprint();
		issue.printer();
		LoggerUtil.logInfo("clicked on Print and selected the printer");
		extenttest.log(Status.PASS, "clicked on Print and selected the printer");
		issue.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		issue.additionalprintactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR RePrint Issuance print Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void ReprintIssue() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issue = new BPRReprintIssuanceandPrint(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		extenttest.log(Status.PASS, "Login to the application with QA Officer id" +getQAOfficer()+" and password as "+getpassword()+ " ");
		issue.reprintissuancetab();
		LoggerUtil.logInfo("clicked on RePrint Issuance tab");
		extenttest.log(Status.PASS, "clicked on RePrint Issuance tab");
		LoggerUtil.logInfo("clicked on RePrint Approved Issued tab and opened the record");
		extenttest.log(Status.PASS, "clicked on RePrint Approved Issued tab and opened the record");
		issue.additionalissue();
		LoggerUtil.logInfo("clicked on Issue");
		extenttest.log(Status.PASS, "clicked on Issue");
		issue.additionalcomments(getissuedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		issue.additionalissue();
		LoggerUtil.logInfo("clicked on Issue");
		extenttest.log(Status.PASS, "clicked on Issue");
		issue.additionalissueactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR RePrint Issuance Issue Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}


}
