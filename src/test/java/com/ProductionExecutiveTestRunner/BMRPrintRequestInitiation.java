package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BMRPrintIssuanceInitiationandReceived;

public class BMRPrintRequestInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRPrintIssuanceInitiationandReceived issuance;
	
	@Test
	public void printRequestInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BMRPrintIssuanceInitiationandReceived(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		issuance.printreqinitiationtab();
		LoggerUtil.logInfo("clicked on print request initiation tab and opened the record");
		issuance.submit();
		LoggerUtil.logInfo("clicked on submit");
		issuance.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		issuance.submit();
		LoggerUtil.logInfo("clicked on submit");
		issuance.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Blend record Print Request Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
    public void standalonebulkprintRequestInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BMRPrintIssuanceInitiationandReceived(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		issuance.printreqinitiationtab();
		LoggerUtil.logInfo("clicked on print request initiation tab and opened the record");
		issuance.batchnumber("FD");
		LoggerUtil.logInfo("Selected the blend batchnumber");
		issuance.submit();
		LoggerUtil.logInfo("clicked on submit");
		issuance.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		issuance.submit();
		LoggerUtil.logInfo("clicked on submit");
		issuance.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and resubmitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Bulk-standard record Print Request Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	 @Test
	 public void commonbulkprintRequestInitiation() throws InterruptedException, IOException {
			
			as = new Assignmenu(driver);
			issuance = new BMRPrintIssuanceInitiationandReceived(driver);
			
			try {
			as.userlogin(getprodexe(), getpassword());
			LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
			issuance.printreqinitiationtab();
			LoggerUtil.logInfo("clicked on print request initiation tab and opened the record");
			issuance.batchnumber("FD");
			LoggerUtil.logInfo("Selected the blend batchnumber");
			issuance.batchsize();
			LoggerUtil.logInfo("Entered the blend size");
			issuance.submit();
			LoggerUtil.logInfo("clicked on submit");
			issuance.comments();
			LoggerUtil.logInfo("validated comments and entered comments");
			issuance.submit();
			LoggerUtil.logInfo("clicked on submit");
			issuance.submitactivity(getpassword());
			LoggerUtil.logInfo("Entered password and submitted the record");
			}
			catch (AssertionError e) {
				LoggerUtil.logError("BMR Bulk-common record Print Request Initiation Test is failed", e);
		            // Log the failure to ExtentReports
		            extenttest.fail("Test failed: " + e.getMessage());
		            // Optionally, you can log the stack trace if needed
		            extenttest.fail(e);
		        	throw e;		
			}
				
		}
	 @Test
	 public void bilayerbulkprintRequestInitiation() throws InterruptedException, IOException {
			
			as = new Assignmenu(driver);
			issuance = new BMRPrintIssuanceInitiationandReceived(driver);
			
			try {
			as.userlogin(getprodexe(), getpassword());
			LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
			issuance.printreqinitiationtab();
			LoggerUtil.logInfo("clicked on print request initiation tab and opened the record");
			//issuance.bulkbilayerbatchnumber("FD", "FD");
			issuance.bulkbilayerbatchnumbersize("FE250020", "FE250005");
			LoggerUtil.logInfo("Selectd the blend batchnumbers");
			issuance.submit();
			LoggerUtil.logInfo("clicked on submit");
			issuance.comments();
			LoggerUtil.logInfo("validated comments and entered comments");
		    issuance.submit();
			LoggerUtil.logInfo("clicked on submit");
			issuance.submitactivity(getpassword());
			LoggerUtil.logInfo("Entered password and submitted the record");
			}
			catch (AssertionError e) {
				LoggerUtil.logError("BMR Bulk-bilayer record Print Request Initiation Test is failed", e);
		            // Log the failure to ExtentReports
		            extenttest.fail("Test failed: " + e.getMessage());
		            // Optionally, you can log the stack trace if needed
		            extenttest.fail(e);
		        	throw e;		
			}
				
		}
	@Test
    public void printRequestReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BMRPrintIssuanceInitiationandReceived(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		issuance.printreqReinitiation();
		LoggerUtil.logInfo("clicked on print request initiation tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
		issuance.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		issuance.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		issuance.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		issuance.resubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and resubmitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Print Request ReInitiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
		
	}
	@Test
    public void printRecievedAcknowledgment() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BMRPrintIssuanceInitiationandReceived(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		issuance.printreceivedtab();
		LoggerUtil.logInfo("clicked on print request initiation tab");
		LoggerUtil.logInfo("clicked on Issued status tab and opened the record");
		issuance.printreceived();
		LoggerUtil.logInfo("clicked on print received");
		issuance.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		issuance.printreceived();
		LoggerUtil.logInfo("clicked on print received");
		issuance.printreceivedsubmit(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Print Acknowledgment Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	
	

}
