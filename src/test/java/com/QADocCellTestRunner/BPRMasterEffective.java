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
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		as.userlogin(getQADoccell(), getpassword());
		LoggerUtil.logInfo("click on Master Effective tab and open the record");
		ef.bprmastereffectivetab();
		LoggerUtil.logInfo("click on effective");
		ef.effective();
		LoggerUtil.logInfo("validate comments and enter comments");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on effective");
		ef.effective();
		LoggerUtil.logInfo("Enter password and submit the record");
		ef.effectiveactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Master Approval Effective Test is failed", e);
			Assert.fail();
		}
	}

}
