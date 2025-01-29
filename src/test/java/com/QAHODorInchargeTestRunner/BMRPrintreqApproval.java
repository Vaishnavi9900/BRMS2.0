package com.QAHODorInchargeTestRunner;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRQAHODAfterPrintApprovalorReject;

@Test
public class BMRPrintreqApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRQAHODAfterPrintApprovalorReject hod;
	
	public void printReturntoExe() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		hod.printapprovalrejecttab();
		LoggerUtil.logInfo("clicked on Print Approval tab and opened the record");
		hod.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		hod.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		//hod.close();
		hod.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		hod.returntoexeactivity(getpassword());
		LoggerUtil.logInfo("Selected the return to Production Exe");
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Print Approval Return to Production Exe Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
	}
	
	public void printReturntoProductionIncharge() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		hod.printapprovalrejecttab();
		LoggerUtil.logInfo("clicked on Print Approval tab and opened the record");
		hod.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		//hod.comments(getreturncomments());
		//hod.close();
		//hod.returnbutton();
		hod.returntoinchargeactivity(getpassword());
		LoggerUtil.logInfo("Selected the return to Production Incharge");
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Print Approval Return to Production Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	
	public void printReturntoValidationIncharge() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		try {
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		hod.printapprovalrejecttab();
		LoggerUtil.logInfo("clicked on Print Approval tab and opened the record");
		hod.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		hod.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		hod.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		hod.close();
		LoggerUtil.logInfo("clicked on close");
		hod.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		hod.returntovalidationactivity(getpassword());
		LoggerUtil.logInfo("Selected the return to Validation Incharge");
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Print Approval Return to Validation Incharge Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	  public void printReject() throws InterruptedException, IOException {
			
			as = new  Assignmenu(driver);
			hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
			
			try {
			as.userlogin(getQAHOD(), getpassword());
			LoggerUtil.logInfo("Login to the application with QA HOD id and password");
			hod.printapprovalrejecttab();
			LoggerUtil.logInfo("clicked on Print Approval tab and opened the record");
			hod.reject();
			LoggerUtil.logInfo("clicked on reject");
			hod.comments(getrejectedcomments());
			LoggerUtil.logInfo("validated comments and entered comments");
			hod.reject();
			LoggerUtil.logInfo("clicked on reject");
			hod.submitactivity2(getpassword());
			LoggerUtil.logInfo("Entered password and submitted the record");
			}
			catch (AssertionError e) {
				LoggerUtil.logError("BMR Print Approval Rejection Test is failed", e);
		            // Log the failure to ExtentReports
		            extenttest.fail("Test failed: " + e.getMessage());
		            // Optionally, you can log the stack trace if needed
		            extenttest.fail(e);
		        	throw e;		
			}
				
		}
	  
	  public void printApproval() throws InterruptedException, IOException {
			
			as = new  Assignmenu(driver);
			hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
			
			try {
			as.userlogin(getQAHOD(), getpassword());
			LoggerUtil.logInfo("Login to the application with QA HOD id and password");
			hod.printapprovalrejecttab();
			LoggerUtil.logInfo("clicked on Print Approval tab and opened the record");
			hod.submit();
			LoggerUtil.logInfo("clicked on submit");
			//hod.comments(getapprovalcomments());
			hod.comments1(getapprovalcomments());
			LoggerUtil.logInfo("validated comments and entered comments");
			hod.submit();
			LoggerUtil.logInfo("clicked on submit");
			hod.submitactivity(getpassword());
			LoggerUtil.logInfo("Entered password and submitted the record");
			}
			catch (AssertionError e) {
				LoggerUtil.logError("BMR Print Approval Test is failed", e);
		            // Log the failure to ExtentReports
		            extenttest.fail("Test failed: " + e.getMessage());
		            // Optionally, you can log the stack trace if needed
		            extenttest.fail(e);
		        	throw e;		
			}
				
		}

}
