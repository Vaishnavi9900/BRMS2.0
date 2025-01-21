package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BPRBatchCorrectionApproval;

public class BMRBatchCorrectionApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRBatchCorrectionApproval batch;
	
	@Test
	public void BatchCorrectionReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		batch = new BPRBatchCorrectionApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Batch Correction Approval tab and open the record");
		batch.batchCorrectionApproval();
		LoggerUtil.logInfo("click on return");
		batch.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		batch.comments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		batch.returnbutton();
		LoggerUtil.logInfo("Enter password and submit the record");
		batch.returnactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Batch Correction Return Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void BatchCorrectionApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		batch = new BPRBatchCorrectionApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Batch Correction Approval tab and open the record");
		batch.batchCorrectionApproval();
		LoggerUtil.logInfo("click on submit");
		batch.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		batch.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		batch.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		batch.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Batch Correction Approval Test is failed", e);
			Assert.fail();
		}
	}


}
