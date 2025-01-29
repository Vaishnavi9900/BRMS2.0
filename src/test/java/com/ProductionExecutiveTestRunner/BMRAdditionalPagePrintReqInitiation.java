package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BMRBPRAdditionalPageprintreqInitiation;
import com.ProductionExecutivePageObjects.BMRPrintIssuanceInitiationandReceived;


public class BMRAdditionalPagePrintReqInitiation extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRAdditionalPageprintreqInitiation add;
	public BMRPrintIssuanceInitiationandReceived received;
	
	@Test
	public void additionalPageInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		add = new BMRBPRAdditionalPageprintreqInitiation(driver);
		
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		add.additionalprintreqinitiationtab();
		LoggerUtil.logInfo("Clicked on BMR Additional Page Print req initiation tab");
		LoggerUtil.logInfo("and Opened the record");
		add.selectallpages();
		LoggerUtil.logInfo("Selected the selectall pages");
		add.selectspecificpages1();
		LoggerUtil.logInfo("selected the specific pages, validated and entered the pages");
		//add.selectspecificpages2();
		//add.selectspecificrange1();
		add.submit();
		LoggerUtil.logInfo("clicked on submit");
		add.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		add.submit();
		LoggerUtil.logInfo("clicked on submit");
		add.submitactivity(getpassword());	
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Additional Page Print Req.Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
	}
	@Test
	public void additionalPageReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		add = new BMRBPRAdditionalPageprintreqInitiation(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		add.additionalprintreqReinitiationtab();
		LoggerUtil.logInfo("Clicked on BMR Additional Page Print req initiation tab");
		LoggerUtil.logInfo("clicked on Returned status tab and Opened the record");
		add.selectallpages();
		LoggerUtil.logInfo("Selected the selectall pages");
		//add.selectspecificpages2();
		//add.selectspecificrange1();
		add.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		add.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		add.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		add.resubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Additional Page Print Req. ReInitiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void additionalPageAcknowledgment() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		received = new BMRPrintIssuanceInitiationandReceived(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		received.additioanlpageprintreceivedtab();
		LoggerUtil.logInfo("Clicked on BMR Additional Page Print req initiation tab");
		LoggerUtil.logInfo("clicked on Issued status tab and Opened the record");
		received.additionalprintreceived();
		LoggerUtil.logInfo("clicked on print received");
		received.additionalcomments();
		LoggerUtil.logInfo("validated comments and entered comments");
		received.additionalprintreceived();
		LoggerUtil.logInfo("clicked on print received");
		received.additionalprintreceivedsubmit(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Additional Page Print Acknowledgment Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
