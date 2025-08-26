package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BMRBPRQAOfficerRePrintReqInitiation;
import com.aventstack.extentreports.Status;

public class BMRReprintReqInitiation extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRQAOfficerRePrintReqInitiation reprint;
	
	@Test
	public void rePrintInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		reprint = new BMRBPRQAOfficerRePrintReqInitiation(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		extenttest.log(Status.PASS, "Login to the application with QA Officer id" +getQAOfficer()+" and password as "+getpassword()+ " ");
		reprint.reprintreqinitiationtab();
		LoggerUtil.logInfo("clicked on RePrint Req. Initiation tab and opened the record");
		extenttest.log(Status.PASS, "clicked on RePrint Req. Initiation tab and opened the record");
		reprint.selectallpages();
		LoggerUtil.logInfo("selected the select all pages");
		extenttest.log(Status.PASS, "selected the select all pages");
		reprint.selectspecificpages1();
		LoggerUtil.logInfo("selected the select specific pages");
		extenttest.log(Status.PASS, "clicked on Issue");
//		reprint.selectspecificpages2();
//		LoggerUtil.logInfo("selected the  select specific pages for format log and validate");
		reprint.selectspecificrange1();
		LoggerUtil.logInfo("selected the select specific range and validate");
		extenttest.log(Status.PASS, "selected the select specific range and validate");
		reprint.formatgroup("Blend Format Group30");
		LoggerUtil.logInfo("Selected the Format Group");
		extenttest.log(Status.PASS, "Selected the Format Group");
		reprint.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		reprint.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		reprint.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		reprint.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR RePrint Req. Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void rePrintReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		reprint = new BMRBPRQAOfficerRePrintReqInitiation(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		extenttest.log(Status.PASS, "Login to the application with QA Officer id" +getQAOfficer()+" and password as "+getpassword()+ " ");
		reprint.reprintreqReinitiationtab();
		LoggerUtil.logInfo("clicked on RePrint Req. Initiation tab");
		extenttest.log(Status.PASS, "clicked on RePrint Req. Initiation tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Returned status tab and opened the record");
		reprint.selectallpages();
		LoggerUtil.logInfo("selected the all pages option");
		extenttest.log(Status.PASS, "selected the all pages option");
		reprint.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		extenttest.log(Status.PASS, "clicked on resubmit");
		reprint.reinitiationcomments();
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		reprint.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		extenttest.log(Status.PASS, "clicked on resubmit");
		reprint.resubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR RePrint Req. ReInitiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
