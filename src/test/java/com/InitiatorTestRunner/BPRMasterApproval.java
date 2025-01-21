package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;

public class BPRMasterApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRMasterApprovalInitiation app;
	
	@Test
	public void bprmasterApprovalInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("BPR Master Initiation tab and open the record");
		app.bprmasterinitiationtab();
		LoggerUtil.logInfo("click on submit");
		app.submit();
		LoggerUtil.logInfo("validate the comments and enter the comments");
		app.comments();
		LoggerUtil.logInfo("click on submit");
		app.submit();
		LoggerUtil.logInfo("Enter the password and submit the record");
		app.submitactivity2(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("BPR Master Approval Initiation Test is failed", e);
			Assert.fail();
		}
		
	}
	@Test
    public void bprmasterApprovalReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("BPR Master Initiation tab, returned status record and open the record");
		app.bprmasterreinitiation();
//		app.resubmit();
		LoggerUtil.logInfo("validate the comments and enter the comments");
		app.reinitiationcomments();
		LoggerUtil.logInfo("click on resubmit");
		app.resubmit();
		LoggerUtil.logInfo("Enter the password and resubmit the record");
		app.resubmitactivity2(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("BPR Master Approval ReInitiation Test is failed", e);
			Assert.fail();
		}
		
	}

}
