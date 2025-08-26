package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionInchargePageObjects.BPRPrintRevieworCancel;
import com.aventstack.extentreports.Status;

public class BPRPrintReview extends ConfigurationReader{

	
	public Assignmenu as;
	public BPRPrintRevieworCancel incharge;
	
	@Test
	public void printReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		incharge = new BPRPrintRevieworCancel(driver);
		
		try {
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		extenttest.log(Status.PASS, "Login to the application with Production Incharge id" +getproductionincharge()+" and password as "+getpassword()+ " ");
		incharge.bprprintreqreviewtab();
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
			LoggerUtil.logError("BPR Print Req. Review by Production Incharge Test is failed", e);
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
		incharge = new BPRPrintRevieworCancel(driver);
		
		try {
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		extenttest.log(Status.PASS, "Login to the application with Production Incharge id" +getproductionincharge()+" and password as "+getpassword()+ " ");
		incharge.reReview();
		LoggerUtil.logInfo("clicked on Print Req. Review tab");
		extenttest.log(Status.PASS, "clicked on Print Req. Review tab");
		LoggerUtil.logInfo("clicked on Returned status tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Returned status tab and opened the record");
		incharge.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		incharge.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		incharge.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		incharge.submitactivity(getpassword());	
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Req.Re Review by Production Incharge Test is failed", e);
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
		incharge = new BPRPrintRevieworCancel(driver);
		
		try {
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		extenttest.log(Status.PASS, "Login to the application with Production Incharge id" +getproductionincharge()+" and password as "+getpassword()+ " ");
		incharge.bprprintreqreviewtab();
		LoggerUtil.logInfo("clicked on Print Req. Review tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Print Req. Review tab and opened the record");
		incharge.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		incharge.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		incharge.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		incharge.returnactivity(getpassword());	
		LoggerUtil.logInfo("Entered password and returned the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and returned the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Req. Return by Production Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
}
