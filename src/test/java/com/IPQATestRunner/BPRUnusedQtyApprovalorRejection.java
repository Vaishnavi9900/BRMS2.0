package com.IPQATestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.IPQAPageObjects.BPRUnusedqtyApprovalorRejection;
import com.aventstack.extentreports.Status;

public class BPRUnusedQtyApprovalorRejection extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRUnusedqtyApprovalorRejection qty;
	
	@Test
	public void unusedqtyRejection() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		qty = new BPRUnusedqtyApprovalorRejection(driver);
		
		try {
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		extenttest.log(Status.PASS, "Login to the application with IPQA id" +getIPQA()+" and password as "+getpassword()+ " ");
		qty.unusedqtyApproval();
		LoggerUtil.logInfo("clicked on BPR Unused Qty approval tab and opened the record");
		extenttest.log(Status.PASS, "clicked on BPR Unused Qty approval tab and opened the record");
		qty.reject();
		LoggerUtil.logInfo("clicked on reject");
		extenttest.log(Status.PASS, "clicked on reject");
		qty.comments(getrejectedcomments());
		LoggerUtil.logInfo("Validated the comments and entered the comments");
		extenttest.log(Status.PASS, "Validated the comments and entered the comments");
		qty.reject();
		LoggerUtil.logInfo("clicked on reject");
		extenttest.log(Status.PASS, "clicked on reject");
		qty.rejectactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and returned the record");
		extenttest.log(Status.PASS, "Entered the password: "+getpassword()+" and returned the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Unused Qty Rejection by IPQA Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	            throw e;
		}	
		
	}
	@Test
	public void unusedqtyApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		qty = new BPRUnusedqtyApprovalorRejection(driver);
		
		try {
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		extenttest.log(Status.PASS, "Login to the application with IPQA id" +getIPQA()+" and password as "+getpassword()+ " ");
		qty.unusedqtyApproval();
		LoggerUtil.logInfo("clicked on BPR Unused Qty approval tab and opened the record");
		extenttest.log(Status.PASS, "clicked on BPR Unused Qty approval tab and opened the record");
		qty.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		qty.comments(getapprovalcomments());
		LoggerUtil.logInfo("Validated the comments and entered the comments");
		extenttest.log(Status.PASS, "Validated the comments and entered the comments");
		qty.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		qty.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and approved the record");
		extenttest.log(Status.PASS, "Entered the password: "+getpassword()+" and approved the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Unused Qty Approval by IPQA Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	            throw e;
		}	
			
	}

}
