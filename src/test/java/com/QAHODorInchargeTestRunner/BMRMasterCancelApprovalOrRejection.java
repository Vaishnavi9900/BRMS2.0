package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRMasterCancelApproval;
import com.aventstack.extentreports.Status;

public class BMRMasterCancelApprovalOrRejection extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRMasterCancelApproval cancel;
	
	@Test
	public void masterCancelApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancelApproval(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		extenttest.log(Status.PASS, "Login to the application with QA HOD id" +getQAHOD()+" and password as "+getpassword()+ " ");
		cancel.mastercancelapprovaltab();
		LoggerUtil.logInfo("clicked on Master Cancel Approval tab and opened the record");	
		extenttest.log(Status.PASS, "clicked on Master Cancel Approval tab and opened the record");
		cancel.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");	
		extenttest.log(Status.PASS, "validated comments and entered comments");
		cancel.submit();
		LoggerUtil.logInfo("clicked on submit");	
		extenttest.log(Status.PASS, "clicked on submit");
		cancel.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Master Cancel Approval Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
    public void masterCancelRejection() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancelApproval(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		extenttest.log(Status.PASS, "Login to the application with QA HOD id" +getQAHOD()+" and password as "+getpassword()+ " ");
		cancel.mastercancelapprovaltab();
		LoggerUtil.logInfo("clicked on Master Cancel Approval tab and opened the record");	
		extenttest.log(Status.PASS, "clicked on Master Cancel Approval tab and opened the record");
		cancel.comments(getrejectedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");	
		extenttest.log(Status.PASS, "validated comments and entered comments");
		cancel.reject();
		LoggerUtil.logInfo("clicked on reject");	
		extenttest.log(Status.PASS, "clicked on reject");
		cancel.rejectactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Master Cancel Rejection Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
