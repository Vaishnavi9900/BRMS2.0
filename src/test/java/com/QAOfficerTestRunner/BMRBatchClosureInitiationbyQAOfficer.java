package com.QAOfficerTestRunner;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BMRBatchClosureInitiation;

public class BMRBatchClosureInitiationbyQAOfficer extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBatchClosureInitiation closure;
	
	@Test
	public void batchclosureInitiation() throws InterruptedException, IOException, AWTException {
		
		as = new Assignmenu(driver);
		closure = new BMRBatchClosureInitiation(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		closure.batchclosureinitiation();
		LoggerUtil.logInfo("clicked on Batch Closure Initiation tab and opened the record");
		closure.submit();
		LoggerUtil.logInfo("clicked on submit");
		closure.bmrexefileupload();
		LoggerUtil.logInfo("BMR Executed file uploads");
		closure.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		closure.submit();
		LoggerUtil.logInfo("clicked on submit");
		//closure.close();
		closure.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Batch Closure Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
	}
			
	@Test
    public void batchclosureReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		closure = new BMRBatchClosureInitiation(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		closure.batchclosureReinitiation();
		LoggerUtil.logInfo("clicked on Batch Closure Initiation tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
		//closure.submit();
		//closure.bmrexefileupload();
		closure.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		closure.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		//closure.close();
		closure.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Batch Closure ReInitiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
