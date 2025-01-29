package com.IPQATestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.IPQAPageObjects.BMRBPRIPQABatchCompletionReview;

public class BatchCompletionReview extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRIPQABatchCompletionReview review;
	
	@Test
	public void batchCompletionReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRIPQABatchCompletionReview(driver);
		
		try {
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		review.batchcompletionreviewtab();
		LoggerUtil.logInfo("Clicked on BMR batch completion review tab and opened the recod");
		review.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		review.comments(getreturncomments());
		LoggerUtil.logInfo("Validated the comments and entered the comments");
		review.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		review.returnactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and returned the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Batch Completion Return by IPQA Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	            throw e;
		}
	}
	@Test
	public void batchCompletionReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRIPQABatchCompletionReview(driver);
		
		try {
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		review.batchcompletionreviewtab();
		LoggerUtil.logInfo("Clicked on BMR batch completion review tab and opened the recod");
		review.submit();
		LoggerUtil.logInfo("clicked on submit");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("Validated the comments and entered the comments");
		review.submit();
		LoggerUtil.logInfo("clicked on submit");
		review.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered the password and reviewed the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Batch Completion Review by IPQA Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	            throw e;
		}	
	}
	@Test
	public void batchCompletionReReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRIPQABatchCompletionReview(driver);
		
		try {
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		review.batchcompletionRereview();
		LoggerUtil.logInfo("Clicked on BMR batch completion review tab and opened the recod");
		review.submit();
		LoggerUtil.logInfo("clicked on submit");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("Validated the comments and entered the comments");
		review.submit();
		LoggerUtil.logInfo("clicked on submit");
		review.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered the password and Re reviewed the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Batch Completion Re Review by IPQA Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	            throw e;
		}	
		
	}

}
