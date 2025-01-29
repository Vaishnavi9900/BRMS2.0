package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;
import com.QAHODorInChargePageObjects.BMRBPRQAHODMasterauthorization;

public class BPRMasterApprovalbyQAHOD extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRQAHODMasterauthorization auth;
	public BMRBPRProductionInchargeReview review;
	
	@Test
	public void bprmasterApprovalReturnbyQAHOD() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		auth = new BMRBPRQAHODMasterauthorization(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		auth.bprmasterauthorizationtab();
		LoggerUtil.logInfo("clicked on Master Authorization tab and opened the record");
		review.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		review.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		review.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		review.returnactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Master Approval Return by QAHOD Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
    public void bprqaHODMasterApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		auth = new BMRBPRQAHODMasterauthorization(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		auth.bprmasterauthorizationtab();
		LoggerUtil.logInfo("clicked on Master Authorization tab and opened the record");
		auth.authorize();
		LoggerUtil.logInfo("clicked on authorize");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		auth.authorize();
		LoggerUtil.logInfo("clicked on authorize");
		auth.authorizationactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Master Approval by QAHOD Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}


}
