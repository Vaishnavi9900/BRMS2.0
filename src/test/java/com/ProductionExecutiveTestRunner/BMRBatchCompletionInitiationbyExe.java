package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BMRBPRBatchCompletionInitiation;
import com.aventstack.extentreports.Status;

public class BMRBatchCompletionInitiationbyExe extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRBatchCompletionInitiation batch;
	
	@Test
	public void batchinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchCompletionInitiation(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		extenttest.log(Status.PASS, "Login to the application with Production Executive id" +getprodexe()+" and password as "+getpassword()+ " ");
		batch.batchcompletiontab();
		LoggerUtil.logInfo("Clicked on batch completion initiation tab and opened the record");
		extenttest.log(Status.PASS, "Clicked on batch completion initiation tab and opened the record");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		batch.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		batch.dateformats("22-04-2025");
		LoggerUtil.logInfo("Selected the dates for batch");
		extenttest.log(Status.PASS, "Selected the dates for batch");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		batch.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Blend Batch Completion Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
	}
	@Test
     public void bulkbatchinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchCompletionInitiation(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		extenttest.log(Status.PASS, "Login to the application with Production Executive id" +getprodexe()+" and password as "+getpassword()+ " ");
		batch.batchcompletiontab();
		LoggerUtil.logInfo("Clicked on batch completion initiation tab and opened the record");
		extenttest.log(Status.PASS, "Clicked on batch completion initiation tab and opened the record");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		batch.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		//batch.dateformats("22-10-2024", "12-10-2025");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		batch.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Bulk Batch Completion Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
	
	}
	@Test
    public void batchReinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchCompletionInitiation(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		extenttest.log(Status.PASS, "Login to the application with Production Executive id" +getprodexe()+" and password as "+getpassword()+ " ");
		batch.reinitiation();
		LoggerUtil.logInfo("Clicked on batch completion initiation tab");
		extenttest.log(Status.PASS, "Clicked on batch completion initiation tab");
		LoggerUtil.logInfo("Clicked on Returned status tab and opened the record");
		extenttest.log(Status.PASS, "Clicked on Returned status tab and opened the record");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		batch.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		//batch.dateformats("12-10-2024", "12-10-2025");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		batch.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and resubmitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and resubmitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Blend Batch Completion ReInitiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}	
	}
	@Test
	 public void bulkbatchReinitiation() throws InterruptedException, IOException {
			
			as = new Assignmenu(driver);
			batch = new BMRBPRBatchCompletionInitiation(driver);
			
			try {
			as.userlogin(getprodexe(), getpassword());
			LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
			extenttest.log(Status.PASS, "Login to the application with Production Executive id" +getprodexe()+" and password as "+getpassword()+ " ");
			batch.reinitiation();
			LoggerUtil.logInfo("Clicked on batch completion initiation tab");
			extenttest.log(Status.PASS, "Clicked on batch completion initiation tab");
			LoggerUtil.logInfo("Clicked on Returned status tab and opened the record");
			extenttest.log(Status.PASS, "Clicked on Returned status tab and opened the record");
			batch.submit();
			LoggerUtil.logInfo("clicked on submit");
			extenttest.log(Status.PASS, "clicked on submit");
			batch.comments();
			LoggerUtil.logInfo("validated comments and entered comments");
			extenttest.log(Status.PASS, "validated comments and entered comments");
			//batch.dateformats("12-10-2024", "12-10-2025");
			batch.submit();
			LoggerUtil.logInfo("clicked on submit");
			extenttest.log(Status.PASS, "clicked on submit");
			batch.submitactivity2(getpassword());
			LoggerUtil.logInfo("Entered password and resubmitted the record");
			extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and resubmitted the record");
			as.logout();
			LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
			extenttest.log(Status.PASS, "Logout from the application");
			}
			catch (AssertionError e) {
				LoggerUtil.logError("BMR Bulk Batch Completion ReInitiation Test is failed", e);
		            // Log the failure to ExtentReports
		            extenttest.fail("Test failed: " + e.getMessage());
		            // Optionally, you can log the stack trace if needed
		            extenttest.fail(e);
		        	throw e;		
			}	
				
		}
	

}
