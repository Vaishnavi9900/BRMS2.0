package com.QAOfficerTestRunner;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BMRBPRBatchRecordCorrectionInitiation;

public class BMRBatchCorrectionInitiation extends ConfigurationReader{

	public Assignmenu as;
	public BMRBPRBatchRecordCorrectionInitiation batch;
	
	@Test
	public void BatchCorrectionInitiation() throws InterruptedException, IOException, AWTException {
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchRecordCorrectionInitiation(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		batch.batchCorrectionInitiation();
		LoggerUtil.logInfo("clicked on Batch Correction Initiation tab and opened the record");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		batch.fileupload();
		LoggerUtil.logInfo("uploaded the files");
		batch.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		batch.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Batch Correction Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void BatchCorrectionReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchRecordCorrectionInitiation(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		batch.batchCorrectionReInitiation();
		LoggerUtil.logInfo("clicked on Batch Correction Initiation tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
		batch.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");		
		batch.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		batch.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		batch.resubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Batch Correction ReInitiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
