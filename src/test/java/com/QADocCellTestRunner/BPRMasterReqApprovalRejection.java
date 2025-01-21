package com.QADocCellTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QADocCellPageObjects.BMRMasterPreparationapprovals;

public class BPRMasterReqApprovalRejection extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRMasterPreparationapprovals mp;
	
	@Test
	public void bprmasterreqrejection() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparationapprovals(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		as.userlogin(getQADoccell(), getpassword());
		LoggerUtil.logInfo("click on Master Prep. Approval tab and open the record");
		LoggerUtil.logInfo("validate comments and enter comments");
		mp.bprmasterprerejection(getrejectedcomments());
		LoggerUtil.logInfo("Enter password and submit the record");
		mp.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR  Master Prep Req. Reject Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void bprmasterreqapproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparationapprovals(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		as.userlogin(getQADoccell(), getpassword());
		LoggerUtil.logInfo("click on Master Prep. Approval tab and open the record");
		LoggerUtil.logInfo("validate comments and enter comments");
		mp.bprmasterpreapproval(getapprovalcomments());
		LoggerUtil.logInfo("Enter password and submit the record");
		mp.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR  Master Prep Req. Approval Test is failed", e);
			Assert.fail();
		}
	}

}
