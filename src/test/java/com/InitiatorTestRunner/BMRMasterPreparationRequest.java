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
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		//mp.masterprepreq();
		LoggerUtil.logInfo("click on submit, verify the validations and also enter the comments");
		mp.bmrmasterreqinitation1(getinitiatorcomments());
		LoggerUtil.logInfo("enter the password and submit the record");
		mp.submitactivity2(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("BMR Master Preparation Req. Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void bmrblockpreviousversionMasterpreparation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		//mp.masterprepreq();
		LoggerUtil.logInfo("click on submit, verify the validations and also enter the comments");
		mp.bmrmasterreqinitation(getinitiatorcomments());
		LoggerUtil.logInfo("clicking the block version");
		mp.blockpreviousversion();
		LoggerUtil.logInfo("clicking the submit");
		mp.submit();
		LoggerUtil.logInfo("Enter the password");
		mp.submitactivity2(getpassword());
		LoggerUtil.logInfo("clicking popup ok");
		mp.popupok();
		LoggerUtil.logInfo("getting mprnpo");
		mp.getmprno();
		}
		catch (Exception e) {
			
			LoggerUtil.logError("BMR blocking the previous version Master Preparation test is failed", e);
			Assert.fail();
		}
	}
	
	
	
	
	

}
