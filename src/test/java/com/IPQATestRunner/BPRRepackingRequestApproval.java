package com.IPQATestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.IPQAPageObjects.BPRRepackingApproval;
import com.aventstack.extentreports.Status;

public class BPRRepackingRequestApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRRepackingApproval app;
	
	@Test
	public void repackingReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BPRRepackingApproval(driver);
		
		try {
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		extenttest.log(Status.PASS, "Login to the application with IPQA id" +getIPQA()+" and password as "+getpassword()+ " ");
		app.repackingapproval();
		LoggerUtil.logInfo("clicked on BPR Repacking request approval tab and opened the record");
		extenttest.log(Status.PASS, "clicked on BPR Repacking request approval tab and opened the record");
		app.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		app.batchseldetails();
		LoggerUtil.logInfo("validated alerts and selected the required batch details");
		extenttest.log(Status.PASS, "validated alerts and selected the required batch details");
		app.comments(getreturncomments());
		LoggerUtil.logInfo("Validated the comments and entered the comments");
		extenttest.log(Status.PASS, "Validated the comments and entered the comments");
		app.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		app.returnactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and returned the record");
		extenttest.log(Status.PASS, "Entered the password: "+getpassword()+" and returned the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Repacking Return by IPQA Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	            throw e;
		}	
			
	}
	
	@Test
	public void repackingApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BPRRepackingApproval(driver);
		
		try {
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		extenttest.log(Status.PASS, "Login to the application with IPQA id" +getIPQA()+" and password as "+getpassword()+ " ");
		app.repackingapproval();
		LoggerUtil.logInfo("clicked on BPR Repacking request approval tab and opened the record");
		extenttest.log(Status.PASS, "clicked on BPR Repacking request approval tab and opened the record");
		app.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		app.batchseldetails();
		LoggerUtil.logInfo("validated the batch alerts");
		extenttest.log(Status.PASS, "validated the batch alerts");
		app.comments(getapprovalcomments());
		LoggerUtil.logInfo("Validated the comments and entered the comments");
		extenttest.log(Status.PASS, "Validated the comments and entered the comments");
		app.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		app.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and approved the record");
		extenttest.log(Status.PASS, "Entered the password: "+getpassword()+" and approved the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Repacking approve by IPQA Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	            throw e;
		}	
	
	}

}
