package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BMRPrintIssuanceInitiationandReceived;
import com.aventstack.extentreports.Status;

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
		extenttest.log(Status.PASS, "Login to the application with Production Executive id" +getprodexe()+" and password as "+getpassword()+ " ");
		issuance.printreqinitiationtab();
		LoggerUtil.logInfo("clicked on print request initiation tab and opened the record");
		extenttest.log(Status.PASS, "clicked on print request initiation tab and opened the record");
		issuance.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		issuance.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		issuance.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		issuance.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
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
		extenttest.log(Status.PASS, "Login to the application with Production Executive id" +getprodexe()+" and password as "+getpassword()+ " ");
		issuance.printreqinitiationtab();
		LoggerUtil.logInfo("clicked on print request initiation tab and opened the record");
		extenttest.log(Status.PASS, "clicked on print request initiation tab and opened the record");
		issuance.standardbatchnumber("FD");
		LoggerUtil.logInfo("Selected the blend batchnumber");
		extenttest.log(Status.PASS, "Selected the blend batchnumber");
		issuance.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		issuance.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		issuance.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		issuance.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and resubmitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and resubmitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
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
			extenttest.log(Status.PASS, "Login to the application with Production Executive id" +getprodexe()+" and password as "+getpassword()+ " ");
			issuance.printreqinitiationtab();
			LoggerUtil.logInfo("clicked on print request initiation tab and opened the record");
			extenttest.log(Status.PASS, "clicked on print request initiation tab and opened the record");
			issuance.commonbatchnumber("FD");
			LoggerUtil.logInfo("Selected the blend batchnumber");
			extenttest.log(Status.PASS, "Selected the blend batchnumber");
			issuance.batchsize();
			LoggerUtil.logInfo("Entered the blend size");
			extenttest.log(Status.PASS, "Entered the blend size");
			issuance.submit();
			LoggerUtil.logInfo("clicked on submit");
			extenttest.log(Status.PASS, "clicked on submit");
			issuance.comments();
			LoggerUtil.logInfo("validated comments and entered comments");
			extenttest.log(Status.PASS, "validated comments and entered comments");
			issuance.submit();
			LoggerUtil.logInfo("clicked on submit");
			extenttest.log(Status.PASS, "clicked on submit");
			issuance.submitactivity(getpassword());
			LoggerUtil.logInfo("Entered password and submitted the record");
			extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
			as.logout();
			LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
			extenttest.log(Status.PASS, "Logout from the application");
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
			extenttest.log(Status.PASS, "Login to the application with Production Executive id" +getprodexe()+" and password as "+getpassword()+ " ");
			issuance.printreqinitiationtab();
			LoggerUtil.logInfo("clicked on print request initiation tab and opened the record");
			extenttest.log(Status.PASS, "clicked on print request initiation tab and opened the record");
			//issuance.bulkbilayerbatchnumber("FD", "FD");
			issuance.bulkbilayerbatchnumbersize("F", "F");
			LoggerUtil.logInfo("Selected the blend batchnumbers");
			extenttest.log(Status.PASS, "Selected the blend batchnumbers");
			issuance.submit();
			LoggerUtil.logInfo("clicked on submit");
			extenttest.log(Status.PASS, "clicked on submit");
			issuance.comments();
			LoggerUtil.logInfo("validated comments and entered comments");
			extenttest.log(Status.PASS, "validated comments and entered comments");
		    issuance.submit();
			LoggerUtil.logInfo("clicked on submit");
			extenttest.log(Status.PASS, "clicked on submit");
			issuance.submitactivity(getpassword());
			LoggerUtil.logInfo("Entered password and submitted the record");
			extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
			as.logout();
			LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
			extenttest.log(Status.PASS, "Logout from the application");
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
		extenttest.log(Status.PASS, "Login to the application with Production Executive id" +getprodexe()+" and password as "+getpassword()+ " ");
		issuance.printreqReinitiation();
		LoggerUtil.logInfo("clicked on print request initiation tab");
		extenttest.log(Status.PASS, "clicked on print request initiation tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Returned status tab and opened the record");
		issuance.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		extenttest.log(Status.PASS, "clicked on resubmit");
		issuance.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		issuance.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		extenttest.log(Status.PASS, "clicked on resubmit");
		issuance.resubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and resubmitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and resubmitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
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
		extenttest.log(Status.PASS, "Login to the application with Production Executive id" +getprodexe()+" and password as "+getpassword()+ " ");
		issuance.printreceivedtab();
		LoggerUtil.logInfo("clicked on print request initiation tab");
		extenttest.log(Status.PASS, "clicked on print request initiation tab");
		LoggerUtil.logInfo("clicked on Issued status tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Issued status tab and opened the record");
		issuance.printreceived();
		LoggerUtil.logInfo("clicked on print received");
		extenttest.log(Status.PASS, "clicked on print received");
		issuance.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		issuance.printreceived();
		LoggerUtil.logInfo("clicked on print received");
		extenttest.log(Status.PASS, "clicked on print received");
		issuance.printreceivedsubmit(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
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
