package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionInchargePageObjects.BMRProductionInchargePrintReviewOrCancel;

public class BMRPrintReview extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRProductionInchargePrintReviewOrCancel incharge;
	
	@Test
	public void printReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		incharge = new BMRProductionInchargePrintReviewOrCancel(driver);
		
		try {
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		incharge.printreqreviewtab();
		LoggerUtil.logInfo("clicked on Print Req. Review tab and opened the record");
		//incharge.reReview();
		incharge.submit();
		LoggerUtil.logInfo("clicked on submit");
		incharge.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		incharge.submit();
		LoggerUtil.logInfo("clicked on submit");
		incharge.printsubmitactivity(getpassword());	
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Print Req. Review by Production Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void printReReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		incharge = new BMRProductionInchargePrintReviewOrCancel(driver);
		
		try {
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		incharge.reReview();
		LoggerUtil.logInfo("clicked on Print Req. Review tab and opened the record");
		incharge.submit();
		LoggerUtil.logInfo("clicked on submit");
		incharge.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		incharge.submit();
		LoggerUtil.logInfo("clicked on submit");
		incharge.resubmitactivity(getpassword());	
		LoggerUtil.logInfo("Entered password and resubmitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Print Req.Re Review by Production Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void printReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		incharge = new BMRProductionInchargePrintReviewOrCancel(driver);
		
		try {
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		incharge.printreqreviewtab();
		LoggerUtil.logInfo("clicked on Print Req. Review tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
		incharge.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		incharge.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		incharge.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		incharge.returnactivity2(getpassword());	
		LoggerUtil.logInfo("Entered password and returned the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Print Req. Return by Production Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	

}
