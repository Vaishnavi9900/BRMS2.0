package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BPRIssueandPrint;


public class BPRPrintIssuanceandPrint extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRIssueandPrint issuance;
	
	@Test
	public void issue() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issuance = new BPRIssueandPrint(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		issuance.printissuancetab();
		LoggerUtil.logInfo("clicked on Print Issuance tab");
		LoggerUtil.logInfo("clicked on Print Issuance Approved tab and opened the record");
		issuance.issue();
		LoggerUtil.logInfo("clicked on Issue");
		issuance.printcopydetails();
		LoggerUtil.logInfo("selected the print copy details");
		issuance.comments(getissuedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		issuance.issue();
		LoggerUtil.logInfo("clicked on Issue");
		issuance.issueactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Issuance Issue Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void print() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issuance = new BPRIssueandPrint(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		issuance.printissuancetab();
		LoggerUtil.logInfo("clicked on Print Issuance tab");
		LoggerUtil.logInfo("clicked on Print Issuance Approved tab and opened the record");
		issuance.print();
		LoggerUtil.logInfo("clicked on Print");
		issuance.comments(getprintcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		issuance.print();
		LoggerUtil.logInfo("clicked on Print");
		issuance.printactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Issuance Print Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
