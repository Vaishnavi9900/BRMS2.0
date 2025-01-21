package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionInchargePageObjects.BMRBPRObsoleteReview;

public class BPRObsoleteReview extends ConfigurationReader{


	public Assignmenu as;
	public BMRBPRObsoleteReview review;

	@Test
	public void obsoleteReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRObsoleteReview(driver);

		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Obsolete Review tab and open the record");
		review.bprobsoleteReview();
		LoggerUtil.logInfo("click on return");
		review.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		review.comments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		review.returnbutton();
		LoggerUtil.logInfo("Enter password and submit the record");
		review.returnactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Obsolete Return by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void obsoleteReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRObsoleteReview(driver);

		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Obsolete Review tab and open the record");
		review.bprobsoleteReview();
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
			LoggerUtil.logError("BPR Obsolete Review by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}

}
