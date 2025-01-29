package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BMRBPRQAOfficerRePrintReqInitiation;

public class BPRReprintReqInitiation extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRQAOfficerRePrintReqInitiation reprint;
	
	@Test
	public void bprrePrintInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		reprint = new BMRBPRQAOfficerRePrintReqInitiation(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		reprint.bprreprintreqinitiationtab();
		LoggerUtil.logInfo("clicked on RePrint Req. Initiation tab and opened the record");
		reprint.selectallpages();
		LoggerUtil.logInfo("selected the select all pages");
		reprint.selectspecificpages1();
		LoggerUtil.logInfo("selected the select specific pages");
		//reprint.selectspecificpages2();
		reprint.selectallpages2();
		LoggerUtil.logInfo("selected the select specific pages for format log and validated");
		reprint.selectspecificrange1();
		LoggerUtil.logInfo("selected the select specific range and validated");
		reprint.submit();
		LoggerUtil.logInfo("clicked on submit");
		reprint.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		reprint.submit();
		LoggerUtil.logInfo("clicked on submit");
		reprint.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submittes the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR RePrint Req. Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void bprrePrintReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		reprint = new BMRBPRQAOfficerRePrintReqInitiation(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		reprint.bprreprintreqReinitiationtab();
		LoggerUtil.logInfo("clicked on RePrint Req. Initiation tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
		reprint.selectallpages();
		LoggerUtil.logInfo("selected select all pages");
		reprint.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		reprint.reinitiationcomments();
		LoggerUtil.logInfo("validated comments and entered comments");
		reprint.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		reprint.resubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR RePrint Req. ReInitiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}


}
