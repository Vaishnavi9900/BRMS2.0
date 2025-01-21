package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionInchargePageObjects.BMRProductionInchargePrintReviewOrCancel;

public class BMRBeforePrintCancelInitiation extends ConfigurationReader {

	public Assignmenu as;
	public BMRProductionInchargePrintReviewOrCancel cancel;
	
	@Test
	public void beforeprintcancelinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRProductionInchargePrintReviewOrCancel(driver);
		
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Before Print Cancel Initiation tab and open the record");
		cancel.cancelprintinitiationtab();
		LoggerUtil.logInfo("click on submit");
		cancel.cancelsubmit();
		LoggerUtil.logInfo("validate comments and enter comments");
		cancel.reinitiationcomments(getinitiatorcomments());
		LoggerUtil.logInfo("click on submit");
		cancel.cancelsubmit();
		LoggerUtil.logInfo("Enter password and return the record");
		cancel.cancelsubmitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Before Print Cancel Initiation by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void beforeprintcancelReinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRProductionInchargePrintReviewOrCancel(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Before Print Cancel Initiation tab and open the record");
		cancel.cancelprintReinitiationtab();
		LoggerUtil.logInfo("click on resubmit");
		cancel.resubmit();
		LoggerUtil.logInfo("validate comments and enter comments");
		cancel.cancelreinitiationcomments(getinitiatorcomments());
		LoggerUtil.logInfo("click on resubmit");
		cancel.resubmit();
		LoggerUtil.logInfo("Enter password and resubmit the record");
		cancel.cancelresubmitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Before Print Cancel ReInitiation by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}
}
