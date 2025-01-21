package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;
import com.ProductionHODPageObjects.BMRBPRProductionHODTechTransferRAQAIncharge;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;

public class MasterApprovalByQAIncharge extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRProductionHODTechTransferRAQAIncharge tech;
	public BMRBPRProductionInchargeReview review;
	public BMRBPRMasterApprovalInitiation app;
	
	@Test
	public void masterApprovalReturnbyQAIncharge() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		tech = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Incharge id and password");
		as.userlogin(getQAIncharge(), getpassword());
		LoggerUtil.logInfo("click on Master Approval tab and open the record");
		tech.masterapprovaltab();
		LoggerUtil.logInfo("click on return");
		review.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		review.comments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		review.returnbutton();
		LoggerUtil.logInfo("Enter password and submit the record");
		review.returnactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Master Approval Return by QA Incharge Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void qaInchargeMasterApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		tech = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Incharge id and password");
		as.userlogin(getQAIncharge(), getpassword());
		LoggerUtil.logInfo("click on Master Approval tab and open the record");
		tech.masterapprovaltab();
		LoggerUtil.logInfo("click on submit");
		review.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		review.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		app.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Master Approval by QA Incharge Test is failed", e);
			Assert.fail();
		}
	}

}
