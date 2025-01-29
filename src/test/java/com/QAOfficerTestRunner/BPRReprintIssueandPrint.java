package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BPRReprintIssuanceandPrint;


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
		issue.reprinttab();
		LoggerUtil.logInfo("clicked on RePrint Issuance tab");
		LoggerUtil.logInfo("clicked on RePrint Issuance Issued tab and opened the record");
		issue.additionalprint();
		LoggerUtil.logInfo("clicked on Print");
		issue.additionalcomments(getprintcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		issue.additionalprint();
		LoggerUtil.logInfo("clicked on Print");
		issue.additionalprintactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
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
		issue.reprintissuancetab();
		LoggerUtil.logInfo("clicked on RePrint Issuance tab");
		LoggerUtil.logInfo("clicked on RePrint Approved Issued tab and opened the record");
		issue.additionalissue();
		LoggerUtil.logInfo("clicked on Issue");
		issue.additionalcomments(getissuedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		issue.additionalissue();
		LoggerUtil.logInfo("clicked on Issue");
		issue.additionalissueactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
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
