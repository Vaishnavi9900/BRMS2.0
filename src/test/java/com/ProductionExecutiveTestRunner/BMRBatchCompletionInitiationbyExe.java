package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BMRBPRBatchCompletionInitiation;

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
		batch.batchcompletiontab();
		LoggerUtil.logInfo("Clicked on batch completion initiation tab and opened the record");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		batch.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		batch.dateformats("22-10-2024", "12-10-2025");
		LoggerUtil.logInfo("Selected the dates for batch");
		//batch.submit();
		batch.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
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
		batch.batchcompletiontab();
		LoggerUtil.logInfo("Clicked on batch completion initiation tab and opened the record");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		batch.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		//batch.dateformats("22-10-2024", "12-10-2025");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		batch.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
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
		batch.reinitiation();
		LoggerUtil.logInfo("Clicked on batch completion initiation tab");
		LoggerUtil.logInfo("Clicked on Returned status tab and opened the record");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		batch.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		//batch.dateformats("12-10-2024", "12-10-2025");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		batch.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and resubmitted the record");
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
			batch.reinitiation();
			LoggerUtil.logInfo("Clicked on batch completion initiation tab");
			LoggerUtil.logInfo("Clicked on Returned status tab and opened the record");
			batch.submit();
			LoggerUtil.logInfo("clicked on submit");
			batch.comments();
			LoggerUtil.logInfo("validated comments and entered comments");
			//batch.dateformats("12-10-2024", "12-10-2025");
			batch.submit();
			LoggerUtil.logInfo("clicked on submit");
			batch.submitactivity2(getpassword());
			LoggerUtil.logInfo("Entered password and resubmitted the record");
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
