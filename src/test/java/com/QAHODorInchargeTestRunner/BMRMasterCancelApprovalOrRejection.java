package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRMasterCancelApproval;

public class BMRMasterCancelApprovalOrRejection extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRMasterCancelApproval cancel;
	
	@Test
	public void masterCancelApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancelApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Master Cancel Approval tab and open the record");
		cancel.mastercancelapprovaltab();
		LoggerUtil.logInfo("validate comments and enter comments");
		cancel.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		cancel.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		cancel.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Master Cancel Approval Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void masterCancelRejection() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancelApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Master Cancel Approval tab and open the record");
		cancel.mastercancelapprovaltab();
		LoggerUtil.logInfo("validate comments and enter comments");
		cancel.comments(getrejectedcomments());
		LoggerUtil.logInfo("click on reject");
		cancel.reject();
		LoggerUtil.logInfo("Enter password and submit the record");
		cancel.rejectactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Master Cancel Rejection Test is failed", e);
			Assert.fail();
		}
	}

}
