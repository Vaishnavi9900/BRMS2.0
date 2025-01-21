package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRObsoleteApproval;

public class BMRObsoleteApprovalNdReject extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRObsoleteApproval app;

	@Test
	public void obsoleteReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRObsoleteApproval(driver);

		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Obsolete Approval tab and open the record");
		app.obsoleteApproval();
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
			LoggerUtil.logError("BMR Obsolete Approval Return Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void obsoleteApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRObsoleteApproval(driver);

		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Obsolete Approval tab and open the record");
		app.obsoleteApproval();
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
			LoggerUtil.logError("BMR Obsolete Approval Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void obsoleteReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRObsoleteApproval(driver);

		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Obsolete Approval tab and open the record");
		app.obsoleteApproval();
		LoggerUtil.logInfo("click on reject");
		app.reject();
		LoggerUtil.logInfo("validate comments and enter comments");
		app.comments(getrejectedcomments());
		LoggerUtil.logInfo("click on reject");
		app.reject();
		LoggerUtil.logInfo("Enter password and submit the record");
		app.rejectactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Obsolete Approval Reject Test is failed", e);
			Assert.fail();
		}
	}

}
