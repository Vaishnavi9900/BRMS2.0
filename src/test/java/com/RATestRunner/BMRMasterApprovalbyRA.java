package com.RATestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;
import com.ProductionHODPageObjects.BMRBPRProductionHODTechTransferRAQAIncharge;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;

public class BMRMasterApprovalbyRA extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRProductionHODTechTransferRAQAIncharge tech;
	public BMRBPRProductionInchargeReview review;
	public BMRBPRMasterApprovalInitiation app;
	
	@Test
	public void masterApprovalReturnbyRA() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		tech = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Regulatory Affairs(RA) id and password");
		as.userlogin(getRA(), getpassword());
		LoggerUtil.logInfo("Click on Master Approval tab and open the record");
		tech.masterapprovaltab();
		LoggerUtil.logInfo("Click on return");
		review.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		review.comments(getreturncomments());
		LoggerUtil.logInfo("Click on return");
		review.returnbutton();
		LoggerUtil.logInfo("Enter password and submit the record");
		review.returnactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Master Approval return by RA Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void rAMasterApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		tech = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);

		try {
		LoggerUtil.logInfo("Login to the application with Regulatory Affairs(RA) id and password");
		as.userlogin(getRA(), getpassword());
		LoggerUtil.logInfo("Click on Master Approval tab and open the record");
		tech.masterapprovaltab();
		LoggerUtil.logInfo("Click on submit");
		review.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("Click on submit");
		review.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		app.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Master Approval by RA Test is failed", e);
			Assert.fail();
		}
	}

}
