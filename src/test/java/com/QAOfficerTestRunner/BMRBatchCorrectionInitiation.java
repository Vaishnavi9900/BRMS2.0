package com.QAOfficerTestRunner;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BMRBPRBatchRecordCorrectionInitiation;
import com.aventstack.extentreports.Status;

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
		extenttest.log(Status.PASS, "Login to the application with QA Officer id" +getQAOfficer()+" and password as "+getpassword()+ " ");
		batch.batchCorrectionInitiation();
		LoggerUtil.logInfo("clicked on Batch Correction Initiation tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Batch Correction Initiation tab and opened the record");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		batch.fileupload();
		LoggerUtil.logInfo("uploaded the files");
		extenttest.log(Status.PASS, "uploaded the files");
		batch.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		batch.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		batch.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
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
	public void BatchCorrectionReInitiation() throws InterruptedException, IOException, AWTException {
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchRecordCorrectionInitiation(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		extenttest.log(Status.PASS, "Login to the application with QA Officer id" +getQAOfficer()+" and password as "+getpassword()+ " ");
		batch.batchCorrectionReInitiation();
		LoggerUtil.logInfo("clicked on Batch Correction Initiation tab");
		extenttest.log(Status.PASS, "clicked on Batch Correction Initiation tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Returned status tab and opened the record");
		batch.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");		
		extenttest.log(Status.PASS, "clicked on resubmit");
		batch.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		batch.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		extenttest.log(Status.PASS, "clicked on resubmit");
		refresh();
		LoggerUtil.logInfo("Refreshed the page");
		extenttest.log(Status.PASS, "Refreshed the page");
		batch.status();
		LoggerUtil.logInfo("Clicked on status tab and Returned Record with searching of MPR No.");
		extenttest.log(Status.PASS, "Clicked on status tab and Returned Record with searching of MPR No.");
		batch.fileupload2();
		LoggerUtil.logInfo("Removed the file and uploaded the file");
		extenttest.log(Status.PASS, "Removed the file and uploaded the file");
		batch.comments1();
		LoggerUtil.logInfo("Entered the ReInitiation Comments");
		extenttest.log(Status.PASS, "Entered the ReInitiation Comments");
		batch.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		extenttest.log(Status.PASS, "clicked on resubmit");
		batch.resubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
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
