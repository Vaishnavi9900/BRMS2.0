package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRQAHODAfterPrintApprovalorReject;

public class BMRBeforePrintCancelApprovalorRejection extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRQAHODAfterPrintApprovalorReject hod;
	
	
	@Test
	public void beforePrintCancelReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Before Print Cancel Approval tab and open the record");
		hod.beforeprintapprovalrejecttab();
		LoggerUtil.logInfo("click on return");
		hod.beforeprintreturn();
		LoggerUtil.logInfo("validate comments and enter comments");
		hod.beforeprintcomments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		hod.beforeprintreturn();
		LoggerUtil.logInfo("Enter password and submit the record");
		hod.beforeprintreturnactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Before Print Cancel Return Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void beforePrintCancelApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Before Print Cancel Approval tab and open the record");
		hod.beforeprintapprovalrejecttab();
		LoggerUtil.logInfo("click on submit");
		hod.beforeprintsubmit();
		LoggerUtil.logInfo("validate comments and enter comments");
		hod.beforeprintcomments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		hod.beforeprintsubmit();
		LoggerUtil.logInfo("Enter password and submit the record");
		hod.beforeprintsubmitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Before Print Cancel Approval Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void beforePrintCancelRejection() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Before Print Cancel Approval tab and open the record");
		hod.beforeprintapprovalrejecttab();
		LoggerUtil.logInfo("click on reject");
		hod.beforeprintreject();
		LoggerUtil.logInfo("validate comments and enter comments");
		hod.beforeprintcomments(getrejectedcomments());
		LoggerUtil.logInfo("click on reject");
		hod.beforeprintreject();
		LoggerUtil.logInfo("Enter password and submit the record");
		hod.beforeprintrejectactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Before Print Cancel Rejection Test is failed", e);
			Assert.fail();
		}
	}
	

}
