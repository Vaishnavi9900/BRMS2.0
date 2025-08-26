package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.CFTActivity;
import com.aventstack.extentreports.Status;

public class CFTRevieworReturn extends ConfigurationReader {
	public Assignmenu as;
	public CFTActivity cft;
	
	@Test
	public void cftReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		try {
		as.userlogin(getQAIncharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Incharge id and password");
		extenttest.log(Status.PASS, "Login to the application with QA Incharge id" +getQAIncharge()+" and password as "+getpassword()+ " ");
		cft.CFTreview(getapprovalcomments());
		LoggerUtil.logInfo("clicked on CFT Review tab and opened the record");
		extenttest.log(Status.PASS, "clicked on CFT Review tab and opened the record");
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		cft.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR QA Incharge CFT Review Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
		
	}
	@Test
	public void cftReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		try {
		as.userlogin(getQAIncharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Incharge id and password");
		extenttest.log(Status.PASS, "Login to the application with QA Incharge id" +getQAIncharge()+" and password as "+getpassword()+ " ");
		cft.CFTreturn(getreturncomments());
		LoggerUtil.logInfo("clicked on CFT Review tab and opened the record");
		extenttest.log(Status.PASS, "clicked on CFT Review tab and opened the record");
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		cft.returnactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR CFT Return Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void hodcftReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		extenttest.log(Status.PASS, "Login to the application with QA HOD id" +getQAHOD()+" and password as "+getpassword()+ " ");
		cft.CFTreview(getapprovalcomments());
		LoggerUtil.logInfo("clicked on CFT Review tab and opened the record");
		extenttest.log(Status.PASS, "clicked on CFT Review tab and opened the record");
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		cft.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR HOD CFT Review Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void hodcftReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		try {
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		extenttest.log(Status.PASS, "Login to the application with Production Incharge id" +getproductionincharge()+" and password as "+getpassword()+ " ");
		cft.CFTreturn(getreturncomments());
		LoggerUtil.logInfo("clicked on CFT Review tab and opened the record");
		extenttest.log(Status.PASS, "clicked on CFT Review tab and opened the record");
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		cft.returnactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR HOD CFT Return Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void bprcftReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		try {
		as.userlogin(getQAIncharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Incharge id and password");
		extenttest.log(Status.PASS, "Login to the application with QA Incharge id" +getQAIncharge()+" and password as "+getpassword()+ " ");
		cft.bprCFTreview(getapprovalcomments());
		LoggerUtil.logInfo("clicked on CFT Review tab and opened the record");
		extenttest.log(Status.PASS, "clicked on CFT Review tab and opened the record");
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		cft.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR QA Incharge CFT Review Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void bprcftReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		try {
		as.userlogin(getQAIncharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Incharge id and password");
		extenttest.log(Status.PASS, "Login to the application with QA Incharge id" +getQAIncharge()+" and password as "+getpassword()+ " ");
		cft.bprCFTreturn(getreturncomments());
		LoggerUtil.logInfo("clicked on CFT Review tab and opened the record");
		extenttest.log(Status.PASS, "clicked on CFT Review tab and opened the record");
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		cft.returnactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR QA Incharge CFT Return Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}

}
