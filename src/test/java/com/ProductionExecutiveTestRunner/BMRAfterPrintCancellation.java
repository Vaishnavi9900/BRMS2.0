package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BMRBPRAfterPrintCancelInitiation;

public class BMRAfterPrintCancellation extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRAfterPrintCancelInitiation cancel;
	
	@Test
	public void afterPrintCancelInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cancel = new BMRBPRAfterPrintCancelInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Click on after print cancel initiation tab and open the record");
		cancel.afterPrintcanelinitiation();
		LoggerUtil.logInfo("click on submit");
		cancel.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		cancel.comments();
		LoggerUtil.logInfo("click on submit");
		cancel.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		cancel.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR After Print Cancel Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void afterPrintCancelReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cancel = new BMRBPRAfterPrintCancelInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Click on after print cancel initiation tab");
		LoggerUtil.logInfo("Click on Returned tab and open the record");
		cancel.afterPrintcanelReinitiation();
		LoggerUtil.logInfo("click on resubmit");
		cancel.resubmit();
		LoggerUtil.logInfo("validate comments and enter comments");
		cancel.reinitiationcomments();
		LoggerUtil.logInfo("click on resubmit");
		cancel.resubmit();
		LoggerUtil.logInfo("Enter password and submit the record");
		cancel.resubmitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR After Print Cancel ReInitiation Test is failed", e);
			Assert.fail();
		}
	}

}
