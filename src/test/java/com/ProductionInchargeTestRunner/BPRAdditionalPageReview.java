package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionInchargePageObjects.BMRBPRAdditionalPrintReview;

public class BPRAdditionalPageReview extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRAdditionalPrintReview review;
	
	@Test
	public void bpradditionalPageReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAdditionalPrintReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Additional Page Print Review tab and open the record");
		review.bpradditionalPageReturn();
		LoggerUtil.logInfo("click on return");
		review.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		review.comments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		review.returnbutton();
		LoggerUtil.logInfo("Enter password and return the record");
		review.returnactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Additional Page Print Return by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void bpradditionalPageReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAdditionalPrintReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Additional Page Print Review tab and open the record");
		review.bpradditionalPageReturn();
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
			LoggerUtil.logError("BPR Additional Page Print review by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void bpradditionalPageReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAdditionalPrintReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Additional Page Print Review tab and open the record");
		review.bpradditionalPageReturn();
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
			LoggerUtil.logError("BPR Additional Page Print Reject by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}


}
