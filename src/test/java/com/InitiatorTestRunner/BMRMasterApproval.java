package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;

public class BMRMasterApproval extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRMasterApprovalInitiation app;
	
	@Test
	public void masterApprovalInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("clicking the Master Initiation tab and open the record");
		app.masterinitiationtab();
		LoggerUtil.logInfo("click on submit");
		app.submit();
		LoggerUtil.logInfo("Verified the validations");
		app.comments();
		LoggerUtil.logInfo("Submit the required record");
		app.submit();
		LoggerUtil.logInfo("Entering the password");
		app.submitactivity2(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("Master Approval Initiation test is failed", e);
			Assert.fail();
		}
		
	}
	@Test
    public void masterApprovalReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("clicking the Master Initiation tab,returned status tab and open the record");
		app.masterreinitiation();
		LoggerUtil.logInfo("click on resubmit");
		app.resubmit();
		LoggerUtil.logInfo("Verified the validations");
		app.reinitiationcomments();
		LoggerUtil.logInfo("Submit the required record");
		app.resubmit();
		LoggerUtil.logInfo("Entering the password");
		app.resubmitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("Master Approval Reinitiation test is failed", e);
			Assert.fail();
		}
	}

}
