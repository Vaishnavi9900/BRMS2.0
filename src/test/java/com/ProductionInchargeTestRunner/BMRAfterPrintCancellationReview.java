package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionInchargePageObjects.BMRBPRAfterPrintCancelReview;
import com.aventstack.extentreports.Status;
public class BMRAfterPrintCancellationReview extends ConfigurationReader{
	public Assignmenu as;
	public BMRBPRAfterPrintCancelReview review;
	
	@Test
	public void afterPrintCancelReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAfterPrintCancelReview(driver);
		
		try {
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		extenttest.log(Status.PASS, "Login to the application with Production Incharge id" +getproductionincharge()+" and password as "+getpassword()+ " ");
		review.afterPrintcanelReviewtab();
		LoggerUtil.logInfo("clicked on After Print Cancel Review tab and opened the record");
		extenttest.log(Status.PASS, "clicked on After Print Cancel Review tab and opened the record");
		review.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		review.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		review.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		review.returnactivity(getpassword());
		LoggerUtil.logInfo("Entered password and returned the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and returned the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR After Print Cancel Return by Production Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
		
	}
	@Test
	public void afterPrintCancelReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAfterPrintCancelReview(driver);
		
		try {
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		extenttest.log(Status.PASS, "Login to the application with Production Incharge id" +getproductionincharge()+" and password as "+getpassword()+ " ");
		review.afterPrintcanelReviewtab();
		LoggerUtil.logInfo("clicked on After Print Cancel Review tab and opened the record");
		extenttest.log(Status.PASS, "clicked on After Print Cancel Review tab and opened the record");
		review.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		review.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		review.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR After Print Cancel Review by Production Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void afterPrintCancelReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAfterPrintCancelReview(driver);
		
		try {
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		extenttest.log(Status.PASS, "Login to the application with Production Incharge id" +getproductionincharge()+" and password as "+getpassword()+ " ");
		review.afterPrintcanelReviewtab();
		LoggerUtil.logInfo("clicked on After Print Cancel Review tab and opened the record");
		extenttest.log(Status.PASS, "clicked on After Print Cancel Review tab and opened the record");
		review.reject();
		LoggerUtil.logInfo("clicked on reject");
		extenttest.log(Status.PASS, "clicked on reject");
		review.comments(getrejectedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		review.reject();
		LoggerUtil.logInfo("clicked on reject");
		extenttest.log(Status.PASS, "clicked on reject");
		review.rejectactivity(getpassword());
		LoggerUtil.logInfo("Entered password and rejected the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and rejected the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR After Print Cancel Reject by Production Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
}
