package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BMRBPRBatchCompletionInitiation;

public class BPRBatchCompletionInitiation extends ConfigurationReader {


	public Assignmenu as;
	public BMRBPRBatchCompletionInitiation batch;
	
	@Test
	public void bprbatchinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchCompletionInitiation(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		batch.bprbatchcompletiontab();
		LoggerUtil.logInfo("clicked on Batch Completion Initiation tab");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		batch.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		batch.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Batch Completion Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
		
	}
	@Test
    public void bprbatchReinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchCompletionInitiation(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		batch.bprreinitiation();
		LoggerUtil.logInfo("clicked on Batch Completion Initiation tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		batch.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		batch.dateformats("12-10-2024");
		LoggerUtil.logInfo("selected the dates for batch");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		batch.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and resubmitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Batch Completion ReInitiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
		
	}
}
