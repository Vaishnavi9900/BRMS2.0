package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BMRBPRBatchCompletionInitiation;

public class BMRBatchCompletionInitiationbyExe extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRBatchCompletionInitiation batch;
	
	@Test
	public void batchinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchCompletionInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Click on batch completion initiation tab and open the record");
		batch.batchcompletiontab();
		LoggerUtil.logInfo("click on submit");
		batch.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		batch.comments();
		LoggerUtil.logInfo("Select the dates for batch");
		batch.dateformats("22-10-2024", "12-10-2025");
		//batch.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		batch.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Blend Batch Completion Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
     public void bulkbatchinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchCompletionInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Click on batch completion initiation tab and open the record");
		batch.batchcompletiontab();
		LoggerUtil.logInfo("click on submit");
		batch.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		batch.comments();
		//batch.dateformats("22-10-2024", "12-10-2025");
		LoggerUtil.logInfo("click on submit");
		batch.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		batch.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Bulk Batch Completion Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void batchReinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchCompletionInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("Click on batch completion initiation tab");
		LoggerUtil.logInfo("Click on Returned status tab and open the record");
		batch.reinitiation();
		LoggerUtil.logInfo("click on submit");
		batch.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		batch.comments();
		//batch.dateformats("12-10-2024", "12-10-2025");
		LoggerUtil.logInfo("click on submit");
		batch.submit();
		LoggerUtil.logInfo("Enter password and resubmit the record");
		batch.submitactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Blend Batch Completion ReInitiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	 public void bulkbatchReinitiation() throws InterruptedException, IOException {
			
			as = new Assignmenu(driver);
			batch = new BMRBPRBatchCompletionInitiation(driver);
			
			try {
			LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
			as.userlogin(getprodexe(), getpassword());
			LoggerUtil.logInfo("Click on batch completion initiation tab");
			LoggerUtil.logInfo("Click on Returned status tab and open the record");
			batch.reinitiation();
			LoggerUtil.logInfo("click on submit");
			batch.submit();
			LoggerUtil.logInfo("validate comments and enter comments");
			batch.comments();
			//batch.dateformats("12-10-2024", "12-10-2025");
			LoggerUtil.logInfo("click on submit");
			batch.submit();
			LoggerUtil.logInfo("Enter password and resubmit the record");
			batch.submitactivity2(getpassword());
			}
			catch (Exception e) {
				LoggerUtil.logError("BMR Bulk Batch Completion ReInitiation Test is failed", e);
				Assert.fail();
			}
		}
	

}
