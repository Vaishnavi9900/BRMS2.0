package com.IPQATestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.IPQAPageObjects.BMRBPRIPQABatchCompletionReview;

public class BPRBatchClosureReview extends ConfigurationReader{
	

	public Assignmenu as;
	public BMRBPRIPQABatchCompletionReview review;
	
	@Test
	public void batchCompletionReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRIPQABatchCompletionReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("Click on BPR Batch completion Review tab and open the record");
		review.bprbatchcompletionreviewtab();
		LoggerUtil.logInfo("click on return");
		review.returnbutton();
		LoggerUtil.logInfo("Validate the comments and enter the comments");
		review.comments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		review.returnbutton();
		LoggerUtil.logInfo("Enter the passowrd and return the record");
		review.returnactivity(getpassword());
		}
		catch (Exception e) {
		
			LoggerUtil.logError("BPR Batch Completion Return by IPQA Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void batchCompletionReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRIPQABatchCompletionReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("Click on BPR Batch completion Review tab and open the record");
		review.bprbatchcompletionreviewtab();
		LoggerUtil.logInfo("click on submit");
		review.submit();
		LoggerUtil.logInfo("Validate the comments and enter the comments");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		review.submit();
		LoggerUtil.logInfo("Enter the passowrd and return the record");
		review.submitactivity(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("BPR Batch Completion Review by IPQA Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void batchCompletionReReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRIPQABatchCompletionReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("Click on BPR Batch completion Review tab and open the record");
		review.bprbatchcompletionRereview();
		LoggerUtil.logInfo("click on submit");
		review.submit();
		LoggerUtil.logInfo("Validate the comments and enter the comments");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		review.submit();
		LoggerUtil.logInfo("Enter the passowrd and return the record");
		review.submitactivity(getpassword());
		}
        catch (Exception e) {
			
			LoggerUtil.logError("BPR Batch Completion Re Review by IPQA Test is failed", e);
			Assert.fail();
		}
	}


}
