package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionInchargePageObjects.BPRPrintRevieworCancel;

public class BPRBeforePrintCancellation extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRPrintRevieworCancel cancel;
	
	@Test
	public void beforeprintcancelinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BPRPrintRevieworCancel(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Before Cancel Print Initiation tab and open the record");
		cancel.cancelprintinitiationtab();
		LoggerUtil.logInfo("click on submit");
		cancel.cancelsubmit();
		LoggerUtil.logInfo("validate comments and enter comments");
		cancel.reinitiationcomments(getinitiatorcomments());
		LoggerUtil.logInfo("click on submit");
		cancel.cancelsubmit();
		LoggerUtil.logInfo("Enter password and submit the record");
		cancel.cancelsubmitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Before Cancel Print Initiation by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void beforeprintcancelReinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BPRPrintRevieworCancel(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Before Cancel Print Initiation tab");
		LoggerUtil.logInfo("click on Returned status tab and open the record");
		cancel.cancelprintReinitiationtab();
		LoggerUtil.logInfo("click on resubmit");
		cancel.resubmit();
		LoggerUtil.logInfo("validate comments and enter comments");
		cancel.cancelreinitiationcomments(getinitiatorcomments());
		LoggerUtil.logInfo("click on resubmit");
		cancel.resubmit();
		LoggerUtil.logInfo("Enter password and submit the record");
		cancel.cancelresubmitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Before Cancel Print ReInitiation by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}

}
