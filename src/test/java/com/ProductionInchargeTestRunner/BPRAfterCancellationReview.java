package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionInchargePageObjects.BMRBPRAfterPrintCancelReview;

public class BPRAfterCancellationReview extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRAfterPrintCancelReview review;
	
	@Test
	public void afterPrintCancelReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAfterPrintCancelReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on After Print Cancel Review tab and open the record");
		review.bprafterPrintcanelReviewtab();
		LoggerUtil.logInfo("click on return");
		review.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		review.comments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		review.returnbutton();
		LoggerUtil.logInfo("Enter password and submit the record");
		review.returnactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR After Print Cancel Return by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void afterPrintCancelReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAfterPrintCancelReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on After Print Cancel Review tab and open the record");
		review.bprafterPrintcanelReviewtab();
		LoggerUtil.logInfo("click on submit");
		review.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		review.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		review.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR After Print Cancel Review by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void afterPrintCancelReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAfterPrintCancelReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on After Print Cancel Review tab and open the record");
		review.bprafterPrintcanelReviewtab();
		LoggerUtil.logInfo("click on reject");
		review.reject();
		LoggerUtil.logInfo("validate comments and enter comments");
		review.comments(getrejectedcomments());
		LoggerUtil.logInfo("click on reject");
		review.reject();
		LoggerUtil.logInfo("Enter password and submit the record");
		review.rejectactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR After Print Cancel Reject by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}

}
