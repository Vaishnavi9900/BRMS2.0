package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BMRBPRBatchRecordCorrectionInitiation;

public class BPRBatchCorrectionInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRBatchRecordCorrectionInitiation batch;
	
	@Test
	public void bprBatchCorrectionInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchRecordCorrectionInitiation(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		batch.bprbatchCorrectionInitiation();
		LoggerUtil.logInfo("clicked on Batch Correction Initiation tab and opened the record");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		//batch.fileupload();
		batch.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		batch.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Batch Correction Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void bprBatchCorrectionReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchRecordCorrectionInitiation(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		batch.bprbatchCorrectionReInitiation();
		LoggerUtil.logInfo("clicked on Batch Correction Initiation tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
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
			LoggerUtil.logError("BPR Batch Correction ReInitiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
