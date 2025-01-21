package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRClosureApproval;

public class BMRbatchClosureApproval extends ConfigurationReader{
	public Assignmenu as;
	public BMRBPRClosureApproval app;
	
	@Test
	public void batchclosureReturn() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRClosureApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Batch Closure Approval tab and open the record");
		app.batchClosureReturn();
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
			LoggerUtil.logError("BMR BatchClosure Return Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void batchclosureApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRClosureApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Batch Closure Approval tab and open the record");
		app.batchClosureApproval();
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
			LoggerUtil.logError("BMR BatchClosure Approval Test is failed", e);
			Assert.fail();
		}
	}
}
