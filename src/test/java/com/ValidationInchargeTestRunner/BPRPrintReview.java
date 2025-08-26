package com.ValidationInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ValidationInchargePageObjects.BMRBPRValidationInchargePrintReview;
import com.aventstack.extentreports.Status;

public class BPRPrintReview extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRValidationInchargePrintReview val;
	
	@Test
	public void printReturntoExecutive() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		val = new BMRBPRValidationInchargePrintReview(driver);
		
		try {
		as.userlogin(getvalidationincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Validation incharge id and password");
		extenttest.log(Status.PASS, "Login to the application with Validation Incharge id" +getvalidationincharge()+" and password as "+getpassword()+ " ");
		val.bprprintreqreviewtab();
		LoggerUtil.logInfo("Clicked on Print Request Review tab and opened the record");
		extenttest.log(Status.PASS, "Clicked on Print Request Review tab and opened the record");
		val.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		val.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		val.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		val.returntoexeactivity(getpassword());
		LoggerUtil.logInfo("selected return as Production executive");
		extenttest.log(Status.PASS, "selected return as Production executive");
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Request Return by Validation Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	
	@Test
	public void printReturntoIncharge() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		val = new BMRBPRValidationInchargePrintReview(driver);
		
		try {
		as.userlogin(getvalidationincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Validation incharge id and password");
		extenttest.log(Status.PASS, "Login to the application with Validation Incharge id" +getvalidationincharge()+" and password as "+getpassword()+ " ");
		val.bprprintreqreviewtab();
		LoggerUtil.logInfo("Clicked on Print Request Review tab and opened the record");
		extenttest.log(Status.PASS, "Clicked on Print Request Review tab and opened the record");
		val.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		val.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		val.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		val.returntoinchargeactivity(getpassword());
		LoggerUtil.logInfo("selected return as Poduction Incharge");
		extenttest.log(Status.PASS, "selected return as Poduction Incharge");
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Request Return by Validation Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	
	@Test(invocationCount = 4)
	public void printReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		val = new BMRBPRValidationInchargePrintReview(driver);
		
		try {
		as.userlogin(getvalidationincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Validation incharge id and password");
		extenttest.log(Status.PASS, "Login to the application with Validation Incharge id" +getvalidationincharge()+" and password as "+getpassword()+ " ");
		val.bprprintreqreviewtab();
		LoggerUtil.logInfo("Clicked on Print Request Review tab and opened the record");
		extenttest.log(Status.PASS, "Clicked on Print Request Review tab and opened the record");
		val.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		val.commentsbatchtype(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		val.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		val.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Request Review by Validation Incharge Test is failed", e);
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
		val = new BMRBPRValidationInchargePrintReview(driver);
		
		try {
		as.userlogin(getvalidationincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Validation incharge id and password");
		extenttest.log(Status.PASS, "Login to the application with Validation Incharge id" +getvalidationincharge()+" and password as "+getpassword()+ " ");
		val.bprreReview();
		LoggerUtil.logInfo("Clicked on Print Request Review tab and opened the record");
		extenttest.log(Status.PASS, "Clicked on Print Request Review tab and opened the record");
		val.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		val.Recommentsbatchtype(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		val.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		val.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Request Re Review by Validation Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}


}
