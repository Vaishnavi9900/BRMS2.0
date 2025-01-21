package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BMRBPRBatchRecordCorrectionInitiation;

public class BMRBatchCorrectionInitiation extends ConfigurationReader{

	public Assignmenu as;
	public BMRBPRBatchRecordCorrectionInitiation batch;
	
	@Test
	public void BatchCorrectionInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchRecordCorrectionInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on Batch Correction Initiation tab and open the record");
		batch.batchCorrectionInitiation();
		LoggerUtil.logInfo("click on submit");
		batch.submit();
		batch.fileupload();
		LoggerUtil.logInfo("validate comments and enter comments");
		batch.comments();
		LoggerUtil.logInfo("click on submit");
		batch.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		batch.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Batch Correction Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void BatchCorrectionReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchRecordCorrectionInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on Batch Correction Initiation tab");
		LoggerUtil.logInfo("click on Returned status tab and open the record");
		batch.batchCorrectionReInitiation();
		LoggerUtil.logInfo("click on resubmit");
		batch.resubmit();
		LoggerUtil.logInfo("validate comments and enter comments");
		batch.comments();
		LoggerUtil.logInfo("click on resubmit");
		batch.resubmit();
		LoggerUtil.logInfo("Enter password and submit the record");
		batch.resubmitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Batch Correction ReInitiation Test is failed", e);
			Assert.fail();
		}
	}

}
