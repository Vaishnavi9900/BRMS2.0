package com.ProductionHODTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;
import com.ProductionHODPageObjects.BMRBPRProductionHODTechTransferRAQAIncharge;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;

public class BPRMasterApproval extends ConfigurationReader{
	public Assignmenu as;
	public BMRBPRProductionHODTechTransferRAQAIncharge hod;
	public BMRBPRMasterApprovalInitiation app;
	public BMRBPRProductionInchargeReview review;
	
	@Test
	public void bprproductionhodapproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution HOD id and password");
		as.userlogin(getproductionhod(), getpassword());
		LoggerUtil.logInfo("Click on Master Approval tab and open the record");
		hod.bprmasterapprovaltab();
		LoggerUtil.logInfo("Click on submit");
		app.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		hod.comments(getapprovalcomments());
		LoggerUtil.logInfo("Click on submit");
		app.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		app.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Master Approval by Production HOD Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void bprproductionhodreturn() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution HOD id and password");
		as.userlogin(getproductionhod(), getpassword());
		LoggerUtil.logInfo("Click on Master Approval tab and open the record");
		hod.bprmasterapprovaltab();
		LoggerUtil.logInfo("Click on return");
		review.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		hod.comments(getreturncomments());
		LoggerUtil.logInfo("Click on return");
		review.returnbutton();
		LoggerUtil.logInfo("Enter password and submit the record");
		app.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Master Approval Return by Production HOD Test is failed", e);
			Assert.fail();
		}
	}
	

}
