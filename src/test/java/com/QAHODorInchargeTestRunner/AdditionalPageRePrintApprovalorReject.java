package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.AdditionalPageRePrintReview;
import com.aventstack.extentreports.Status;

public class AdditionalPageRePrintApprovalorReject extends ConfigurationReader
	{
		public Assignmenu as;
		public AdditionalPageRePrintReview review;
		
		@Test
		public void AdditionalrePrintApproval() throws InterruptedException, IOException {
			as = new Assignmenu(driver);
			review = new AdditionalPageRePrintReview(driver);
			
			try {
			as.userlogin(getQAHOD(), getpassword());
			LoggerUtil.logInfo("Login to the application with QAHOD id and password");
			extenttest.log(Status.PASS, "Login to the application with QA Officer id" +getQAHOD()+" and password as "+getpassword()+ " ");
			review.addreprintreqapprovaltab();
			LoggerUtil.logInfo("clicked on Additional RePrint Req. Approval tab and opened the record");
			extenttest.log(Status.PASS, "clicked on Additional RePrint Req. Approval tab and opened the record");
			review.submit();
			LoggerUtil.logInfo("clicked on submit");
			extenttest.log(Status.PASS, "clicked on submit");
			review.comments();
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
				LoggerUtil.logError("BMR Additional RePrint Req. Approval Test is failed", e);
		            // Log the failure to ExtentReports
		            extenttest.fail("Test failed: " + e.getMessage());
		            // Optionally, you can log the stack trace if needed
		            extenttest.fail(e);
		        	throw e;	
			}
			}
			@Test
			public void AdditionalrePrintReject() throws InterruptedException, IOException {
				as = new Assignmenu(driver);
				review = new AdditionalPageRePrintReview(driver);
				
				try {
				as.userlogin(getQAHOD(), getpassword());
				LoggerUtil.logInfo("Login to the application with QA HOD id and password");
				extenttest.log(Status.PASS, "Login to the application with QA HOD id" +getQAHOD()+" and password as "+getpassword()+ " ");
				review.addreprintreqapprovaltab();
				LoggerUtil.logInfo("clicked on Additional RePrint Req. Approval tab and opened the record");
				extenttest.log(Status.PASS, "clicked on Additional RePrint Req. Approval tab and opened the record");
				review.reject();
				LoggerUtil.logInfo("clicked on reject");
				extenttest.log(Status.PASS, "clicked on reject");
				review.comments();
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
					LoggerUtil.logError("BMR Additional RePrint Req. Rejected Test is failed", e);
			            // Log the failure to ExtentReports
			            extenttest.fail("Test failed: " + e.getMessage());
			            // Optionally, you can log the stack trace if needed
			            extenttest.fail(e);
			        	throw e;		
				}
			}
	}
