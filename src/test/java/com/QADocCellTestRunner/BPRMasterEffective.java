package com.QADocCellTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;
import com.QADocCellPageObjects.BMRBPRQADoccellMasterEffective;

public class BPRMasterEffective extends ConfigurationReader{
	

	public Assignmenu as;
	public BMRBPRQADoccellMasterEffective ef;
	public BMRBPRProductionInchargeReview review;

	@Test
	public void bprmasterApprovalEffectivebyQADocCell() throws InterruptedException, IOException {
		

		as = new Assignmenu(driver);
		ef = new BMRBPRQADoccellMasterEffective(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		try {
		as.userlogin(getQADoccell(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		ef.bprmastereffectivetab();
		LoggerUtil.logInfo("clicked on Master Effective tab and opened the record");
		ef.effective();
		LoggerUtil.logInfo("clicked on effective");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		ef.effective();
		LoggerUtil.logInfo("clicked on effective");
		ef.effectiveactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and effective the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Master Approval Effective Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
