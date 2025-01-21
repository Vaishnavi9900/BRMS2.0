package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BPRMasterPreparation;

public class BPRMasterPreReqInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRMasterPreparation bpr;
	
	@Test
	public void bprmasterreqinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		bpr = new BPRMasterPreparation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("click on master prep. req. tab, validate the comments and enter the comments");
		bpr.bprMasterPrereqInitiation(getinitiatorcomments());
		LoggerUtil.logInfo("Enter the password and submit the record");
		bpr.submitactivity(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("BPR Master Preparation Request Initiation Test is failed", e);
			Assert.fail();
		}
	}

}
