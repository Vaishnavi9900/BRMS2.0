package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BPRBatchCorrectionApproval;

public class BMRBatchCorrectionApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRBatchCorrectionApproval batch;
	
	@Test
	public void BatchCorrectionReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		batch = new BPRBatchCorrectionApproval(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		batch.batchCorrectionApproval();
		LoggerUtil.logInfo("clicked on Batch Correction Approval tab and opened the record");
		batch.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		batch.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		batch.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		batch.returnactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Batch Correction Return Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void BatchCorrectionApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		batch = new BPRBatchCorrectionApproval(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		batch.batchCorrectionApproval();
		LoggerUtil.logInfo("clicked on Batch Correction Approval tab and opened the record");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		batch.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		batch.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Batch Correction Approval Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}


}
