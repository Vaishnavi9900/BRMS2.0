package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BPRUnusedQuantityInitiation;

public class BPRUnUsedQunatityInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRUnusedQuantityInitiation qty;
	
	@Test
	public void unusedqtyInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		qty = new BPRUnusedQuantityInitiation(driver);
		
		try {
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		qty.unusedqtyInitiation();
		LoggerUtil.logInfo("clicked on Unused Qty Initiation tab");
		qty.submit();
		LoggerUtil.logInfo("clicked on submit");
		qty.unusedqtydetails();
		LoggerUtil.logInfo("validated unused alerts and entered the details");
		qty.comments();
		LoggerUtil.logInfo("validated comments and entered comments");
		qty.submit();
		LoggerUtil.logInfo("clicked on submit");
		qty.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Unused Qty Initiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	

}
