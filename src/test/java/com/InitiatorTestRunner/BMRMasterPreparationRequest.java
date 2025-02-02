package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRMasterPreparation;
import com.InitiatorPageObjects.BMRProductDetails;

public class BMRMasterPreparationRequest extends ConfigurationReader {
	public Assignmenu as;
	public BMRMasterPreparation mp;
	
	@Test
	public void bmrMasterpreparation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparation(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		//mp.masterprepreq();
		mp.bmrmasterreqinitation1(getinitiatorcomments());
		LoggerUtil.logInfo("clicked on submit, verified the validations and also entered the comments");
		mp.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Master Preparation Req Initiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	@Test
	public void bmrblockpreviousversionMasterpreparation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparation(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		//mp.masterprepreq();
		mp.bmrmasterreqinitation(getinitiatorcomments());
		LoggerUtil.logInfo("clicked on submit, verified the validations and also entered the comments");
		mp.blockpreviousversion();
		LoggerUtil.logInfo("clicked the block version");
		mp.submit();
		LoggerUtil.logInfo("clicked the submit");
		mp.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		mp.popupok();
		LoggerUtil.logInfo("clicked on popup ok");
		mp.getmprno();
		LoggerUtil.logInfo("got the mprnpo");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR block revious version Master Preparation Req Initiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	
	
	
	
	

}
