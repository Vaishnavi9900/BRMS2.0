package com.QAHODorInchargeTestRunner;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.FormatLogApproval;
import com.aventstack.extentreports.Status;

public class FormatLogApprovalTestRunner extends ConfigurationReader
	{

		public Assignmenu as;
		public FormatLogApproval log;
		
		@Test
		public void formatLogApproval() throws InterruptedException, AWTException {
			
			as = new Assignmenu(driver);
			log = new FormatLogApproval(driver);
			
			try {
			as.userlogin(getQAHOD(), getpassword());
			LoggerUtil.logInfo("Login to the application with QA HOD UserId and Password");
			extenttest.log(Status.PASS, "Login to the application with QA HOD id" +getQAHOD()+" and password as "+getpassword()+ " ");
			log.formatlogApproval();
			LoggerUtil.logInfo("Clicked on Format Log Approval and Created Record");
			extenttest.log(Status.PASS, "Clicked on Format Log Approval and Created Record");
			log.submit();
			LoggerUtil.logInfo("Clicked on submit");
			extenttest.log(Status.PASS, "clicked on submit");
			log.comments(getcomments());
			LoggerUtil.logInfo("Entered the comments");
			extenttest.log(Status.PASS, "Entered the comments");
			log.submit();
			LoggerUtil.logInfo("Clicked on submit");
			extenttest.log(Status.PASS, "clicked on submit");
			log.submitactivity(getpassword());
			LoggerUtil.logInfo("Entered the password and submitted the record");
			extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
			as.logout();
			LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
			extenttest.log(Status.PASS, "Logout from the application");
			}
			catch(Exception e) {
				LoggerUtil.logError("Format Log Approval Test is failed ", e );
				extenttest.fail("Test failed" +e.getMessage());
				extenttest.fail(e);
				throw e;
			}
		}
		
		@Test
		public void formatLogReturn() throws Exception {
			as = new Assignmenu(driver);
			log = new FormatLogApproval(driver);
			
			try {
			as.userlogin(getQAHOD(), getpassword());
			LoggerUtil.logInfo("Login to the application with QA HOD UserId and Password");
			extenttest.log(Status.PASS, "Login to the application with QA HOD id" +getQAHOD()+" and password as "+getpassword()+ " ");
			log.formatlogApproval();
			LoggerUtil.logInfo("Clicked on Format Log Approval and Created Record");
			extenttest.log(Status.PASS, "Clicked on Format Log Approval and Created Record");
			log.returnrbutton();
			LoggerUtil.logInfo("Clicked on return");
			extenttest.log(Status.PASS, "clicked on return");
			log.comments(getcomments());
			LoggerUtil.logInfo("Entered the comments");
			extenttest.log(Status.PASS, "Entered the comments");
			log.returnrbutton();
			LoggerUtil.logInfo("Clicked on return");
			extenttest.log(Status.PASS, "clicked on return");
			log.returnactivity(getpassword());
			LoggerUtil.logInfo("Entered the password and submitted the record");
			extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
			as.logout();
			LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
			extenttest.log(Status.PASS, "Logout from the application");
			}
			catch(Exception e) {
				LoggerUtil.logError("Format Log Return Test is failed ", e);
				extenttest.fail("Test failed" +e.getMessage());
				extenttest.fail(e);
				throw e;
			}
		}
	}
