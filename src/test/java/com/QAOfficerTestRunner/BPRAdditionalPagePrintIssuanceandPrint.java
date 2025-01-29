package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BPRIssueandPrint;


public class BPRAdditionalPagePrintIssuanceandPrint extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRIssueandPrint issue;
	
	@Test
	public void additionalPagePrint() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issue = new BPRIssueandPrint(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		issue.additionalpageprintissuancetab();
		LoggerUtil.logInfo("clicked on Additional Page Print Issuance tab");
		LoggerUtil.logInfo("clicked on Issued status tab and opened the record");
		issue.additionalprint();
		LoggerUtil.logInfo("clicked on print");
		issue.additionalcomments(getprintcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		issue.additionalprint();
		LoggerUtil.logInfo("clicked on print");
		issue.additionalprintactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Additional Page Print approval Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void additionalPageIssue() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issue = new BPRIssueandPrint(driver);
		
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		issue.additionalpageprintissuancetab();
		LoggerUtil.logInfo("clicked on Additional Page Print Issuance tab");
		LoggerUtil.logInfo("clicked on Approved status tab and opened the record");
		issue.additionalissue();
		LoggerUtil.logInfo("clicked on issue");
		issue.additionalcomments(getissuedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		issue.additionalissue();
		LoggerUtil.logInfo("clicked on issue");
		issue.additionalissueactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Additional Page Print Issue Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void additionalPagePrintReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issue = new BPRIssueandPrint(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		issue.additionalpageprintissuancetab();
		LoggerUtil.logInfo("clicked on Additional Page Print Issuance tab and opened the record");
		issue.additionalcomments(getrejectedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		issue.reject();
		LoggerUtil.logInfo("clicked on reject");
		issue.rejectactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Additional Page Print Reject Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
