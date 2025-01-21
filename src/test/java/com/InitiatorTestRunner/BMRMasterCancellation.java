package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterCancellationp;

public class BMRMasterCancellation extends ConfigurationReader{
 
	public Assignmenu as;
	public BMRBPRMasterCancellationp cancel;
	
	@Test
	public void bmrMasterCancelinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancellationp(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("click on master cancel tab and opne the record");
		cancel.mastercancellationtab();
		LoggerUtil.logInfo("click on submit");
		cancel.submit();
		LoggerUtil.logInfo("Verifying the validations");
		cancel.comments();
		LoggerUtil.logInfo("click on submit");
		cancel.submit();
		LoggerUtil.logInfo("click yes and enter the password & submit the record");
		cancel.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Master Cancel Initiation test is failed", e);
			Assert.fail();
		}
	}
		
}
