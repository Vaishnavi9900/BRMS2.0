package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRQAHODRePrintApproval;

public class BPRRePrintApproval extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRQAHODRePrintApproval app;
	
	@Test
	public void rePrintReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODRePrintApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on RePrint Approval tab and open the record");
		app.bprreprintapprovaltab();
		LoggerUtil.logInfo("click on return");
		app.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		app.comments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		app.returnbutton();
		LoggerUtil.logInfo("Enter password and submit the record");
		app.returnactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR RePrint Return Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void rePrintApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODRePrintApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on RePrint Approval tab and open the record");
		app.bprreprintapprovaltab();
		LoggerUtil.logInfo("click on submit");
		app.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		app.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		app.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		app.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR RePrint Approval Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void rePrintReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODRePrintApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on RePrint Approval tab and open the record");
		app.bprreprintapprovaltab();
		LoggerUtil.logInfo("click on reject");
		app.reject();
		LoggerUtil.logInfo("validate comments and enter comments");
		app.comments(getrejectedcomments());
		LoggerUtil.logInfo("click on reject");
		app.reject();
		LoggerUtil.logInfo("Enter password and submit the record");
		app.rejectnactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR RePrint Reject Test is failed", e);
			Assert.fail();
		}
	}

}
