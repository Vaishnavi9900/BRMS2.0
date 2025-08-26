package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionInchargePageObjects.BMRProductionInchargePrintReviewOrCancel;
import com.aventstack.extentreports.Status;

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
		extenttest.log(Status.PASS, "Login to the application with Production Incharge id" +getproductionincharge()+" and password as "+getpassword()+ " ");
		cancel.cancelprintinitiationtab();
		LoggerUtil.logInfo("clicked on Before Print Cancel Initiation tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Before Print Cancel Initiation tab and opened the record");
		cancel.cancelsubmit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		cancel.cancelcomments(getinitiatorcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		cancel.cancelsubmit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		cancel.cancelsubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and returned the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and returned the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
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
		extenttest.log(Status.PASS, "Login to the application with Production Incharge id" +getproductionincharge()+" and password as "+getpassword()+ " ");
		cancel.cancelprintReinitiationtab();
		LoggerUtil.logInfo("clicked on Before Print Cancel Initiation tab, Returned tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Before Print Cancel Initiation tab, Returned tab and opened the record");
		cancel.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		extenttest.log(Status.PASS, "clicked on resubmit");
		cancel.cancelreinitiationcomments(getinitiatorcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		cancel.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		extenttest.log(Status.PASS, "clicked on resubmit");
		cancel.cancelresubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and resubmitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and resubmitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
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
