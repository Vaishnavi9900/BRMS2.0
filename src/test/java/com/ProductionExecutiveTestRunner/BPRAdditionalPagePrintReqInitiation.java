package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BMRBPRAdditionalPageprintreqInitiation;
import com.ProductionExecutivePageObjects.BMRPrintIssuanceInitiationandReceived;
import com.aventstack.extentreports.Status;

public class BPRAdditionalPagePrintReqInitiation extends ConfigurationReader{

	public Assignmenu as;
	public BMRBPRAdditionalPageprintreqInitiation add;
	public BMRPrintIssuanceInitiationandReceived received;
	
	@Test
	public void bpradditionalPageInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		add = new BMRBPRAdditionalPageprintreqInitiation(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		extenttest.log(Status.PASS, "Login to the application with Production Executive id" +getprodexe()+" and password as "+getpassword()+ " ");
		add.bpradditionalprintreqinitiationtab();
		LoggerUtil.logInfo("clicked on additional print request initiation tab");
		extenttest.log(Status.PASS, "clicked on additional print request initiation tab");
		add.selectallpages();
		LoggerUtil.logInfo("selected the selectall pages");
		extenttest.log(Status.PASS, "selected the selectall pages");
		add.selectspecificpages1();
		LoggerUtil.logInfo("selected the specic pages, validate and entered the page numbers");
		extenttest.log(Status.PASS, "selected the specic pages, validate and entered the page numbers");
		//add.selectspecificpages2();
		//add.selectspecificrange1();
		add.formatgroup("Blend Format Group");
		LoggerUtil.logInfo("Selected the Format Group");
		extenttest.log(Status.PASS, "Selected the Format Group");
		add.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		add.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		add.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		add.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Additional Page Print Req. Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void bpradditionalPageReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		add = new BMRBPRAdditionalPageprintreqInitiation(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		extenttest.log(Status.PASS, "Login to the application with Production Executive id" +getprodexe()+" and password as "+getpassword()+ " ");
		add.bpradditionalprintreqReinitiationtab();
		LoggerUtil.logInfo("clicked on additional print request initiation tab");
		extenttest.log(Status.PASS, "clicked on additional print request initiation tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Returned status tab and opened the record");
		add.selectallpages();
		LoggerUtil.logInfo("selected the selectall pages");
		extenttest.log(Status.PASS, "selected the selectall pages");
		//add.selectspecificpages2();
		//add.selectspecificrange1();
		add.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		extenttest.log(Status.PASS, "clicked on resubmit");
		add.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		add.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		extenttest.log(Status.PASS, "clicked on resubmit");
		add.resubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and resubmitted the record");
		extenttest.log(Status.PASS, "Entered password:,"+getpassword()+" and resubmitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Additional Page Print Req. ReInitiation Test is failed", e);
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
		extenttest.log(Status.PASS, "Login to the application with Production Executive id" +getprodexe()+" and password as "+getpassword()+ " ");
		received.additioanlpageprintreceivedtab();
		LoggerUtil.logInfo("clicked on additional print request initiation tab");
		extenttest.log(Status.PASS, "clicked on additional print request initiation tab");
		LoggerUtil.logInfo("clicked on Issued status tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Issued status tab and opened the record");
		received.additionalprintreceived();
		LoggerUtil.logInfo("clicked on printreceived");
		extenttest.log(Status.PASS, "clicked on printreceived");
		received.additionalcomments();
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		received.additionalprintreceived();
		LoggerUtil.logInfo("clicked on printreceived");
		extenttest.log(Status.PASS, "clicked on printreceived");
		received.additionalprintreceivedsubmit(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Additional Page Print Acknowledgment Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
		
	}
}

