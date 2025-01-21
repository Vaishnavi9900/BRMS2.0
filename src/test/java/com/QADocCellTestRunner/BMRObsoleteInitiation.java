package com.QADocCellTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QADocCellPageObjects.BMRBPRObsoleteInitiation;

public class BMRObsoleteInitiation extends ConfigurationReader {

	public Assignmenu as;
	public BMRBPRObsoleteInitiation obs;

	@Test
	public void obsoleteInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		obs = new BMRBPRObsoleteInitiation(driver);

		try {
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		as.userlogin(getQADoccell(), getpassword());
		LoggerUtil.logInfo("click on Obsolete Initiation tab and open the record");
		obs.obsoleteInitiation();
		LoggerUtil.logInfo("click on submit");
		obs.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		obs.comments(getinitiatorcomments());
		LoggerUtil.logInfo("click on submit");
		obs.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		obs.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Obsolete Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void obsoleteReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		obs = new BMRBPRObsoleteInitiation(driver);

		try {
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		as.userlogin(getQADoccell(), getpassword());
		LoggerUtil.logInfo("click on Obsolete Initiation tab");
		LoggerUtil.logInfo("click on Returned status tab and open the record");
		obs.obsoleteReInitiation();
		LoggerUtil.logInfo("click on resubmit");
		obs.resubmit();
		LoggerUtil.logInfo("validate comments and enter comments");
		obs.comments(getinitiatorcomments());
		LoggerUtil.logInfo("click on resubmit");
		obs.resubmit();
		LoggerUtil.logInfo("Enter password and submit the record");
		obs.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Obsolete ReInitiation  Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void finalobsolete() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		obs = new BMRBPRObsoleteInitiation(driver);

		try {
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		as.userlogin(getQADoccell(), getpassword());
		LoggerUtil.logInfo("click on Obsolete Initiation tab and open the record");
		obs.finalobsolete();
		LoggerUtil.logInfo("click on obsolete");
		obs.obsolete();
		LoggerUtil.logInfo("validate comments and enter comments");
		obs.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on osbolete");
		obs.obsolete();
		LoggerUtil.logInfo("Enter password and submit the record");
		obs.obsoleteactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Final Obsolete Test is failed", e);
			Assert.fail();
		}
	}

}
