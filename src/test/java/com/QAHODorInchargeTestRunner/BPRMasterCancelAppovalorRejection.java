package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRMasterCancelApproval;

public class BPRMasterCancelAppovalorRejection extends ConfigurationReader{
	public Assignmenu as;
	public BMRBPRMasterCancelApproval cancel;
	
	@Test
	public void bprmasterCancelApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancelApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Master Cancel Approval tab and open the record");
		cancel.bprmastercancelapprovaltab();
		LoggerUtil.logInfo("click on submit");
		cancel.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		cancel.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		cancel.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		cancel.bprsubmitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Master Cancel Approval Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void bprmasterCancelRejection() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancelApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Master Cancel Approval tab and open the record");
		cancel.bprmastercancelapprovaltab();
		LoggerUtil.logInfo("click on reject");
		cancel.reject();
		LoggerUtil.logInfo("validate comments and enter comments");
		cancel.comments(getrejectedcomments());
		LoggerUtil.logInfo("click on reject");
		cancel.reject();
		LoggerUtil.logInfo("Enter password and submit the record");
		cancel.bprrejectactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Master Cancel Rejection Test is failed", e);
			Assert.fail();
		}
	}


}
