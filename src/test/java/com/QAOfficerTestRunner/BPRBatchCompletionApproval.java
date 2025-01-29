package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BMRBPRBatchCompletionApproval;

public class BPRBatchCompletionApproval extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRBatchCompletionApproval approval;
	
	@Test
	public void batchcoompletionReturntoipqa() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		approval = new BMRBPRBatchCompletionApproval(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		approval.bprbatchcompletionapprovaltab();
		LoggerUtil.logInfo("clicked on Batch Completion Approval tab and opened the record");
		approval.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		approval.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		approval.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		approval.selectreturntoipqa();
		LoggerUtil.logInfo("selected the return to as IPQA");
		approval.returntoipqaactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Batch Completion Return to IPQA Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void batchcoompletionReturntoexe() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		approval = new BMRBPRBatchCompletionApproval(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		approval.bprbatchcompletionapprovaltab();
		LoggerUtil.logInfo("clicked on Batch Completion Approval tab and opened the record");
		approval.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		approval.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		approval.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		approval.selectreturntoexe();
		LoggerUtil.logInfo("selected the return to as Production Exe");
		approval.returntoexeactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Batch Completion Return to Production Exe Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void batchcoompletionApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		approval = new BMRBPRBatchCompletionApproval(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		approval.bprbatchcompletionapprovaltab();
		LoggerUtil.logInfo("clicked on Batch Completion Approval tab and opened the record");
		approval.submit();
		LoggerUtil.logInfo("clicked on submit");
		approval.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		approval.submit();
		LoggerUtil.logInfo("clicked on submit");
		approval.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Batch Completion Approval Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}


}
