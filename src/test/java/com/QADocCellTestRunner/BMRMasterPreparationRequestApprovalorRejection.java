package com.QADocCellTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QADocCellPageObjects.BMRMasterPreparationapprovals;

public class BMRMasterPreparationRequestApprovalorRejection extends ConfigurationReader {
	public Assignmenu as;
	public BMRMasterPreparationapprovals mp;
	
	@Test
	public void bmrmasterreqrejection() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparationapprovals(driver);
		
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		as.userlogin(getQADoccell(), getpassword());
		//mp.masterprepapprovaltab();
		LoggerUtil.logInfo("click on Master Preparation Req. Approval tab and open the record");
		LoggerUtil.logInfo("validate comments and enter comments");
		mp.masterprerejection(getrejectedcomments());
		LoggerUtil.logInfo("Enter password and submit the record");
		mp.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Master Preparation Req. Rejection  Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void bmrmasterreqapproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparationapprovals(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		as.userlogin(getQADoccell(), getpassword());
		//mp.masterprepapprovaltab();
		LoggerUtil.logInfo("click on Master Preparation Req. Approval tab and open the record");
		LoggerUtil.logInfo("validate comments and enter comments");
		mp.masterpreapproval(getapprovalcomments());
		LoggerUtil.logInfo("Enter password and submit the record");
		mp.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Master Preparation Req. Approval Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void bmrblockversionmasterreqapproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparationapprovals(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		as.userlogin(getQADoccell(), getpassword());
		LoggerUtil.logInfo("click on Master Preparation Req. Approval tab and open the record");
		LoggerUtil.logInfo("validate comments, block the previous version and enter comments");
		//mp.masterprepapprovaltab();
		mp.masterprepreqapprovalforblockversion(getapprovalcomments());
		LoggerUtil.logInfo("Enter password and submit the record");
		mp.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Master Preparation Req. Approval with block previous version est is failed", e);
			Assert.fail();
		}
	}

}
