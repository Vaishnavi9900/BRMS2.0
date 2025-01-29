package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;

public class BPRMasterReview extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRProductionInchargeReview review;
	public BMRBPRMasterApprovalInitiation app;
	
	@Test
	public void bprmasterApprovalReturn() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		try {
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		review.bprmasterreviewtab();
		LoggerUtil.logInfo("clicked on Master Review tab and opened the record");
		review.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		review.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		review.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		review.returnactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and retured the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Master Return by Production Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	
	@Test
     public void bprmasterReview() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		try {
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		review.bprmasterreviewtab();
		LoggerUtil.logInfo("clicked on Master Review tab and opened the record");
		review.submit();
		LoggerUtil.logInfo("clicked on submit");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		review.submit();
		LoggerUtil.logInfo("clicked on submit");
		review.bprsubmitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Master Review by Production Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
