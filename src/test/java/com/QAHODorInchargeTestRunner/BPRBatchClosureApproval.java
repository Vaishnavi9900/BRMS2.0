package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRClosureApproval;

public class BPRBatchClosureApproval extends ConfigurationReader{
	public Assignmenu as;
	public BMRBPRClosureApproval app;
	
	@Test
	public void bprbatchclosureReturn() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRClosureApproval(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		app.bprbatchClosureReturn();
		LoggerUtil.logInfo("clicked on Batch Closure Approval tab and opened the record");
		app.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		app.bprcomments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		app.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		app.returnactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Batch Closure Return Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
		
	}
	@Test
    public void bprbatchclosureApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRClosureApproval(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		app.bprbatchClosureApproval();
		LoggerUtil.logInfo("clicked on Batch Closure Approval tab and opened the record");
		app.submit();
		LoggerUtil.logInfo("clicked on submit");
		app.bprcomments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		app.submit();
		LoggerUtil.logInfo("clicked on submit");
		app.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Batch Closure Approval Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	

}
