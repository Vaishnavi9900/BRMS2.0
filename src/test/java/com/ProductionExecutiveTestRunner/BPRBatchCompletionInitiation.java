package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BMRBPRBatchCompletionInitiation;

public class BPRBatchCompletionInitiation extends ConfigurationReader {


	public Assignmenu as;
	public BMRBPRBatchCompletionInitiation batch;
	
	@Test
	public void bprbatchinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchCompletionInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("click on Batch Completion Initiation tab");
		batch.bprbatchcompletiontab();
		LoggerUtil.logInfo("click on submit");
		batch.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		batch.comments();
		LoggerUtil.logInfo("click on submit");
		batch.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		batch.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Batch Completion Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void bprbatchReinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchCompletionInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("click on Batch Completion Initiation tab");
		LoggerUtil.logInfo("click on Returned status tab and open the record");
		batch.bprreinitiation();
		LoggerUtil.logInfo("click on submit");
		batch.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		batch.comments();
		LoggerUtil.logInfo("select the dates for batch");
		batch.dateformats("12-10-2024", "12-10-2025");
		LoggerUtil.logInfo("click on submit");
		batch.submit();
		LoggerUtil.logInfo("Enter password and resubmit the record");
		batch.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Batch Completion ReInitiation Test is failed", e);
			Assert.fail();
		}
	}
}
