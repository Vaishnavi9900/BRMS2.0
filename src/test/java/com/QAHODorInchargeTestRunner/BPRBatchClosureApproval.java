package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRClosureApproval;

public class BPRBatchClosureApproval extends ConfigurationReader{
	public Assignmenu as;
	public BMRBPRClosureApproval app;
	
	@Test
	public void bprbatchclosureReturn() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRClosureApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Batch Closure Approval tab and open the record");
		app.bprbatchClosureReturn();
		LoggerUtil.logInfo("click on return");
		app.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		app.bprcomments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		app.returnbutton();
		LoggerUtil.logInfo("Enter password and submit the record");
		app.returnactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Batch Closure Return Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void bprbatchclosureApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRClosureApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Batch Closure Approval tab and open the record");
		app.bprbatchClosureApproval();
		LoggerUtil.logInfo("click on submit");
		app.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		app.bprcomments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		app.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		app.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Batch Closure Approval Test is failed", e);
			Assert.fail();
		}
	}
	

}
