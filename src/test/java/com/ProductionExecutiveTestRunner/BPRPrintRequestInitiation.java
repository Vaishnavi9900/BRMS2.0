package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BPRPrintIssuanceInitiationReceived;


public class BPRPrintRequestInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRPrintIssuanceInitiationReceived issuance;
	
	@Test
	public void bprprintRequestInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BPRPrintIssuanceInitiationReceived(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		issuance.bprprintreqinitiationtab();
		LoggerUtil.logInfo("clicked on Print Request Initiation tab");
		issuance.submit();
		LoggerUtil.logInfo("clicked on submit");
		issuance.batchnumberdateformats("DD/MM/YYYY", "15-12-2024", "FD");
		LoggerUtil.logInfo("selected the required dates and format");
		issuance.batchsize();
		LoggerUtil.logInfo("Entered the batch size");
		issuance.comments(getinitiatorcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		issuance.submit();
		LoggerUtil.logInfo("clicked on submit");
		issuance.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Request Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
		
	}
	@Test
    public void bprprintRequestReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BPRPrintIssuanceInitiationReceived(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		issuance.bprprintreqReinitiation();
		LoggerUtil.logInfo("clicked on Print Request Initiation tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
		issuance.submit();
		LoggerUtil.logInfo("clicked on submit");
		issuance.batchsize();
		LoggerUtil.logInfo("modified the batch size");
		issuance.comments(getinitiatorcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		issuance.submit();
		LoggerUtil.logInfo("clicked on submit");
		issuance.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Request ReInitiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
    public void bprprintRecievedAcknowledgment() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BPRPrintIssuanceInitiationReceived(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		issuance.printreceivedtab();
		LoggerUtil.logInfo("clicked on Print Request Initiation tab");
		LoggerUtil.logInfo("clicked on Issued status tab and opened the record");
		issuance.printreceived();
		LoggerUtil.logInfo("clicked on print received");
		issuance.comments("Print Received successfully.");
		LoggerUtil.logInfo("validateed comments and entered comments");
		issuance.printreceived();
		LoggerUtil.logInfo("clicked on print received");
		issuance.printreceivedsubmit(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Received Acknowledgment Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
		
	}

}
