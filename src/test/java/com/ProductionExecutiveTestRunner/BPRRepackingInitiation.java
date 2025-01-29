package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BPRRePackingReqInitiation;

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
		repack.repcakingqtyinitiation();
		LoggerUtil.logInfo("clicked on Repacking Qty Initiation tab");
		repack.submit();
		LoggerUtil.logInfo("clicked on submit");
		repack.repackingdetails();
		LoggerUtil.logInfo("validated repacking alerts and entered the details");
		repack.comments(getinitiatorcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		repack.submit();
		LoggerUtil.logInfo("clicked on submit");
		repack.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
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
		repack.repcakingqtyReinitiation();
		LoggerUtil.logInfo("clicked on Repacking Qty Initiation tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
		repack.submit();
		LoggerUtil.logInfo("clicked on submit");
		repack.repackingdetails();
		LoggerUtil.logInfo("entered the repacking details");
		repack.comments(getinitiatorcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		repack.submit();
		LoggerUtil.logInfo("clicked on submit");
		repack.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
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
