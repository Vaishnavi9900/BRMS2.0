package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.BRMSCommonMethods;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;


public class ProductionInchargeMasterApprovalReview extends ConfigurationReader{
	public Assignmenu as;
	public BMRBPRProductionInchargeReview review;
	public BMRBPRMasterApprovalInitiation app;
	
	@Test
	public void masterApprovalReturn() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Master Approval Review tab and open the record");
		review.masterreviewtab();
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
			LoggerUtil.logError("BPR Master Approval Return by Production Incharge Test is failed", e);
			Assert.fail();
		}
		
	}
	
	@Test
     public void masterApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Master Approval Review tab and open the record");
		review.masterreviewtab();
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
			LoggerUtil.logError("BPR Master Approval Review by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}

}
