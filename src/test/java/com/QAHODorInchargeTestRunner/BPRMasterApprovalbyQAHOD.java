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
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Master Authorization tab and open the record");
		auth.bprmasterauthorizationtab();
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
			LoggerUtil.logError("BPR Master Approval Return by QAHOD Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void bprqaHODMasterApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		auth = new BMRBPRQAHODMasterauthorization(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Master Authorization tab and open the record");
		auth.bprmasterauthorizationtab();
		LoggerUtil.logInfo("click on authorize");
		auth.authorize();
		LoggerUtil.logInfo("validate comments and enter comments");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on authorize");
		auth.authorize();
		LoggerUtil.logInfo("Enter password and submit the record");
		auth.authorizationactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Master Approval by QAHOD Test is failed", e);
			Assert.fail();
		}
	}


}
