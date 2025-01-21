package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.CFTActivity;

public class CFTRevieworReturn extends ConfigurationReader {
	public Assignmenu as;
	public CFTActivity cft;
	
	@Test
	public void cftReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Incharge id and password");
		as.userlogin(getQAIncharge(), getpassword());
		cft.CFTreview(getapprovalcomments());
		cft.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR QA Incharge CFT Review Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void cftReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Incharge id and password");
		as.userlogin(getQAIncharge(), getpassword());
		LoggerUtil.logInfo("click on CFT Review tab and open the record");
		LoggerUtil.logInfo("validate comments and enter comments");
		cft.CFTreturn(getreturncomments());
		LoggerUtil.logInfo("Enter password and submit the record");
		cft.returnactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR CFT Return Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void hodcftReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on CFT Review tab and open the record");
		LoggerUtil.logInfo("validate comments and enter comments");
		cft.CFTreview(getapprovalcomments());
		LoggerUtil.logInfo("Enter password and submit the record");
		cft.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR HOD CFT Review Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void hodcftReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		try {
			LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on CFT Review tab and open the record");
		LoggerUtil.logInfo("validate comments and enter comments");
		cft.CFTreturn(getreturncomments());
		LoggerUtil.logInfo("Enter password and submit the record");
		cft.returnactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR HOD CFT Return Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void bprcftReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Incharge id and password");
		as.userlogin(getQAIncharge(), getpassword());
		LoggerUtil.logInfo("click on CFT Review tab and open the record");
		LoggerUtil.logInfo("validate comments and enter comments");
		cft.bprCFTreview(getapprovalcomments());
		LoggerUtil.logInfo("Enter password and submit the record");
		cft.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR QA Incharge CFT Review Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void bprcftReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Incharge id and password");
		as.userlogin(getQAIncharge(), getpassword());
		LoggerUtil.logInfo("click on CFT Review tab and open the record");
		LoggerUtil.logInfo("validate comments and enter comments");
		cft.bprCFTreturn(getreturncomments());
		LoggerUtil.logInfo("Enter password and submit the record");
		cft.returnactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR QA Incharge CFT Return Test is failed", e);
			Assert.fail();
		}
	}

}
