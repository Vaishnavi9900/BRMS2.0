package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRQAHODAfterPrintApprovalorReject;

public class BPRAfterPrintCancelApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRQAHODAfterPrintApprovalorReject app;
	
	@Test
	public void afterPrintcancelReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on After Print Cancel Approval tab and open the record");
		app.bprafterprintapprovaltab();
		LoggerUtil.logInfo("click on return");
		app.afterprintreturn();
		LoggerUtil.logInfo("validate comments and enter comments");
		app.afterprintcomments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		app.afterprintreturn();
		LoggerUtil.logInfo("Enter password and submit the record");
		app.afterprintreturnactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR After Print Cancel Return Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void afterPrintcancelApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on After Print Cancel Approval tab and open the record");
		app.bprafterprintapprovaltab();
		LoggerUtil.logInfo("click on submit");
		app.afterprintsubmit();
		LoggerUtil.logInfo("validate comments and enter comments");
		app.afterprintcomments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		app.afterprintsubmit();
		LoggerUtil.logInfo("Enter password and submit the record");
		app.afterprintsubmitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR After Print Cancel Approval Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void afterPrintcancelReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on After Print Cancel Approval tab and open the record");
		app.bprafterprintapprovaltab();
		LoggerUtil.logInfo("click on reject");
		app.afterprintreject();
		LoggerUtil.logInfo("validate comments and enter comments");
		app.afterprintcomments(getrejectedcomments());
		LoggerUtil.logInfo("click on reject");
		app.afterprintreject();
		LoggerUtil.logInfo("Enter password and submit the record");
		app.afterprintrejectactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR After Print Cancel Reject Test is failed", e);
			Assert.fail();
		}
	}

}
