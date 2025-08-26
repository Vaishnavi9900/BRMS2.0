package com.IPQATestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.IPQAPageObjects.BMRBPRIPQABatchCompletionReview;
import com.aventstack.extentreports.Status;

public class BPRBatchClosureReview extends ConfigurationReader{
	

	public Assignmenu as;
	public BMRBPRIPQABatchCompletionReview review;
	
	@Test
	public void batchCompletionReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRIPQABatchCompletionReview(driver);
		
		try {
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		extenttest.log(Status.PASS, "Login to the application with IPQA id" +getIPQA()+" and password as "+getpassword()+ " ");
		review.bprbatchcompletionreviewtab();
		LoggerUtil.logInfo("Clicked on BPR Batch completion Review tab and opened the record");
		extenttest.log(Status.PASS, "Clicked on BPR Batch completion Review tab and opened the record");
		review.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		review.comments(getreturncomments());
		LoggerUtil.logInfo("Validated the comments and entered the comments");
		extenttest.log(Status.PASS, "Validated the comments and entered the comments");
		review.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		review.returnactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and returned the record");
		extenttest.log(Status.PASS, "Entered the password: "+getpassword()+" and returned the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Batch Completion Return by IPQA Test is failed", e);
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
		extenttest.log(Status.PASS, "Login to the application with IPQA id" +getIPQA()+" and password as "+getpassword()+ " ");
		review.bprbatchcompletionreviewtab();
		LoggerUtil.logInfo("Clicked on BPR Batch completion Review tab and opened the record");
		extenttest.log(Status.PASS, "Clicked on BPR Batch completion Review tab and opened the record");
		review.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("Validated the comments and entered the comments");
		extenttest.log(Status.PASS, "Validated the comments and entered the comments");
		review.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		review.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and returned the record");
		extenttest.log(Status.PASS, "Entered the password: "+getpassword()+" and returned the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Batch Completion Review by IPQA Test is failed", e);
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
		extenttest.log(Status.PASS, "Login to the application with IPQA id" +getIPQA()+" and password as "+getpassword()+ " ");
		review.bprbatchcompletionRereview();
		LoggerUtil.logInfo("Clicked on BPR Batch completion Review tab and opened the record");
		extenttest.log(Status.PASS, "Clicked on BPR Batch completion Review tab and opened the record");
		review.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("Validated the comments and entered the comments");
		extenttest.log(Status.PASS, "Validated the comments and entered the comments");
		review.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		review.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and returned the record");
		extenttest.log(Status.PASS, "Entered the password: "+getpassword()+" and returned the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Batch Completion Re Review by IPQA Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	            throw e;
		}	
			
	}


}
