package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BPRPrintApprovalorReject;
import com.aventstack.extentreports.Status;

public class BPRPrintReqApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRPrintApprovalorReject hod;
	
	@Test
	public void printReturntoExe() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BPRPrintApprovalorReject(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		extenttest.log(Status.PASS, "Login to the application with QA HOD id" +getQAHOD()+" and password as "+getpassword()+ " ");
		hod.printapprovalrejecttab();
		LoggerUtil.logInfo("clicked on Print Approval tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Print Approval tab and opened the record");
		hod.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		hod.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		//hod.close();
		hod.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		hod.returntoexeactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Req. Return to Production Exe Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void printReturntoProductionIncharge() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BPRPrintApprovalorReject(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		extenttest.log(Status.PASS, "Login to the application with QA HOD id" +getQAHOD()+" and password as "+getpassword()+ " ");
		hod.printapprovalrejecttab();
		LoggerUtil.logInfo("clicked on Print Approval tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Print Approval tab and opened the record");
		hod.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		hod.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		//hod.close();
		//hod.returnbutton();
		hod.returntoinchargeactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Req. Return to Production Incharge Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void printReturntoValidationIncharge() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BPRPrintApprovalorReject(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		extenttest.log(Status.PASS, "Login to the application with QA HOD id" +getQAHOD()+" and password as "+getpassword()+ " ");
		hod.printapprovalrejecttab();
		LoggerUtil.logInfo("clicked on Print Approval tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Print Approval tab and opened the record");
		hod.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		hod.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		hod.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		hod.close();
		LoggerUtil.logInfo("clicked on close");
		extenttest.log(Status.PASS, "clicked on close");
		hod.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		extenttest.log(Status.PASS, "clicked on return");
		hod.returntovalidationactivity(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Print Req. Return to Validation Incharge Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
    public void printReject() throws InterruptedException, IOException {
			
			as = new  Assignmenu(driver);
			hod = new BPRPrintApprovalorReject(driver);
			
			try {
			as.userlogin(getQAHOD(), getpassword());
			LoggerUtil.logInfo("Login to the application with QA HOD id and password");
			extenttest.log(Status.PASS, "Login to the application with QA HOD id" +getQAHOD()+" and password as "+getpassword()+ " ");
			hod.printapprovalrejecttab();
			LoggerUtil.logInfo("clicked on Print Approval tab and opened the record");
			extenttest.log(Status.PASS, "clicked on Print Approval tab and opened the record");
			hod.reject();
			LoggerUtil.logInfo("clicked on reject");
			extenttest.log(Status.PASS, "clicked on reject");
			hod.comments(getrejectedcomments());
			LoggerUtil.logInfo("validated comments and entered comments");
			extenttest.log(Status.PASS, "validated comments and entered comments");
			hod.reject();
			LoggerUtil.logInfo("clicked on reject");
			extenttest.log(Status.PASS, "clicked on reject");
			hod.submitactivity2(getpassword());
			LoggerUtil.logInfo("Entered password and submitted the record");
			extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
			as.logout();
			LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
			extenttest.log(Status.PASS, "Logout from the application");
			}
			catch (AssertionError e) {
				LoggerUtil.logError("BPR Print Req. Reject Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	            throw e;
			}
				
		}
	  @Test(invocationCount = 4)
	  public void printApproval() throws InterruptedException, IOException {
			
			as = new  Assignmenu(driver);
			hod = new BPRPrintApprovalorReject(driver);
			
			try {
			as.userlogin(getQAHOD(), getpassword());
			LoggerUtil.logInfo("Login to the application with QA HOD id and password");
			extenttest.log(Status.PASS, "Login to the application with QA HOD id" +getQAHOD()+" and password as "+getpassword()+ " ");
			hod.printapprovalrejecttab();
			LoggerUtil.logInfo("clicked on Print Approval tab and opened the record");
			extenttest.log(Status.PASS, "clicked on Print Approval tab and opened the record");
			hod.submit();
			LoggerUtil.logInfo("clicked on submit");
			extenttest.log(Status.PASS, "clicked on submit");
			//hod.comments(getapprovalcomments());
			hod.comments1(getapprovalcomments());
			LoggerUtil.logInfo("validated comments and entered comments and entered the batch");
			extenttest.log(Status.PASS, "validated comments and entered comments and entered the batch");
//			hod.batchnumber();
//			LoggerUtil.logInfo("entered the batch number");
			hod.submit();
			LoggerUtil.logInfo("clicked on submit");
			extenttest.log(Status.PASS, "clicked on submit");
			hod.submitactivity(getpassword());
			LoggerUtil.logInfo("Entered password and submitted the record");
			extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
			as.logout();
			LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
			extenttest.log(Status.PASS, "Logout from the application");
			}
			catch (AssertionError e) {
				LoggerUtil.logError("BPR Print Req. Approval Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	            throw e;
			}
				
		}


}
