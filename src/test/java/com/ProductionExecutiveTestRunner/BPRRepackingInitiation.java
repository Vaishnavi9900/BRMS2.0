package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BPRRePackingReqInitiation;
import com.aventstack.extentreports.Status;

public class BPRRepackingInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRRePackingReqInitiation repack;
	
	@Test
	public void bprRePackingreqInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		repack = new BPRRePackingReqInitiation(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		extenttest.log(Status.PASS, "Login to the application with Production Executive id" +getprodexe()+" and password as "+getpassword()+ " ");
		repack.repcakingqtyinitiation();
		LoggerUtil.logInfo("clicked on Repacking Qty Initiation tab");
		extenttest.log(Status.PASS, "clicked on Repacking Qty Initiation tab");
		repack.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		repack.repackingdetails();
		LoggerUtil.logInfo("validated repacking alerts and entered the details");
		extenttest.log(Status.PASS, "validated repacking alerts and entered the details");
		repack.comments(getinitiatorcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		repack.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		repack.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Repacking Qty Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
   public void bprRePackingreqReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		repack = new BPRRePackingReqInitiation(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		extenttest.log(Status.PASS, "Login to the application with Production Executive id" +getprodexe()+" and password as "+getpassword()+ " ");
		repack.repcakingqtyReinitiation();
		LoggerUtil.logInfo("clicked on Repacking Qty Initiation tab");
		extenttest.log(Status.PASS, "clicked on Repacking Qty Initiation tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Returned status tab and opened the record");
		repack.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		extenttest.log(Status.PASS, "clicked on resubmit");
		repack.repackingdetails1();
		LoggerUtil.logInfo("modified the repacking details");
		extenttest.log(Status.PASS, "modified the repacking details");
		repack.comments(getinitiatorcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		repack.resubmit();
		LoggerUtil.logInfo("clicked on resubmit");
		extenttest.log(Status.PASS, "clicked on resubmit");
		repack.resubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Repacking Qty ReInitiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
