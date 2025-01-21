package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BPRPrintApprovalorReject;

public class BPRBeforePrintCancelApprovalorRejection extends ConfigurationReader{
	
	
	public Assignmenu as;
	public BPRPrintApprovalorReject app;
	
	
	@Test
	public void beforePrintCancelReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BPRPrintApprovalorReject(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Before Print Cancel Approval tab and open the record");
		app.beforeprintapprovalrejecttab();
		LoggerUtil.logInfo("click on return");
		app.beforeprintreturn();
		LoggerUtil.logInfo("validate comments and enter comments");
		app.beforeprintcomments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		app.beforeprintreturn();
		LoggerUtil.logInfo("Enter password and submit the record");
		app.beforeprintreturnactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Before Print Cancel Return Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void beforePrintCancelApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BPRPrintApprovalorReject(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Before Print Cancel Approval tab and open the record");
		app.beforeprintapprovalrejecttab();
		LoggerUtil.logInfo("click on submit");
		app.beforeprintsubmit();
		LoggerUtil.logInfo("validate comments and enter comments");
		app.beforeprintcomments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		app.beforeprintsubmit();
		LoggerUtil.logInfo("Enter password and submit the record");
		app.beforeprintsubmitactivity(getpassword());	
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Before Print Cancel Approval Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void beforePrintCancelRejection() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BPRPrintApprovalorReject(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Before Print Cancel Approval tab and open the record");
		app.beforeprintapprovalrejecttab();
		LoggerUtil.logInfo("click on reject");
		app.beforeprintreject();
		LoggerUtil.logInfo("validate comments and enter comments");
		app.beforeprintcomments(getrejectedcomments());
		LoggerUtil.logInfo("click on reject");
		app.beforeprintreject();
		LoggerUtil.logInfo("Enter password and submit the record");
		app.beforeprintrejectactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Before Print Cancel Rejection Test is failed", e);
			Assert.fail();
		}
	}
	

}
