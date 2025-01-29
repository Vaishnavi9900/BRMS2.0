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
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		cancel.cancelprintinitiationtab();
		LoggerUtil.logInfo("clicked on Before Print Cancel Initiation tab and opened the record");
		cancel.cancelsubmit();
		LoggerUtil.logInfo("clicked on submit");
		cancel.reinitiationcomments(getinitiatorcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		cancel.cancelsubmit();
		LoggerUtil.logInfo("clicked on submit");
		cancel.cancelsubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and returned the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Before Print Cancel Initiation by Production Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
    public void beforeprintcancelReinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRProductionInchargePrintReviewOrCancel(driver);
		
		try {
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		cancel.cancelprintReinitiationtab();
		LoggerUtil.logInfo("clicked on Before Print Cancel Initiation tab, Returned tab and opened the record");
		cancel.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		cancel.cancelreinitiationcomments(getinitiatorcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		cancel.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		cancel.cancelresubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and resubmitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Before Print Cancel ReInitiation by Production Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
}
