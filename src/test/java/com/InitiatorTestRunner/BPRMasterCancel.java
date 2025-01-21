package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterCancellationp;

public class BPRMasterCancel extends ConfigurationReader{
	public Assignmenu as;
	public BMRBPRMasterCancellationp cancel;
	
	@Test
	public void bprMasterCancelinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancellationp(driver);
		
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("BPR Master Cancel Initiation Tab and open the record");
		cancel.bprmastercancellationtab();
		LoggerUtil.logInfo("click on submit");
		cancel.submit();
		LoggerUtil.logInfo("validate the comments and enter the comments");
		cancel.comments();
		LoggerUtil.logInfo("again click on submit");
		cancel.submit();
		LoggerUtil.logInfo("Enter the password and submit the record");
		cancel.bprsubmitactivity(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("BPR Master Cancel Initiation Test is failed", e);
			Assert.fail();
		}
	}

}
