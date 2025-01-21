package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRProductDetails;
import com.QAHODorInChargePageObjects.HODBMRBPRProductDetails;

public class BMRProductDetailsApprovalorReturn extends ConfigurationReader {
	public Assignmenu as;
	public BMRProductDetails bmr;
	public HODBMRBPRProductDetails hod;
	
	@Test
	public void hodApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		hod = new HODBMRBPRProductDetails(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("validate comments and enter comments");
		//bmr.createrecord();
		hod.commentsvalidate();
		hod.priority();
		LoggerUtil.logInfo("click on submit");
		hod.HODSubmit(getapprovalcomments());
		LoggerUtil.logInfo("Enter password and submit the record");
		hod.submitactivity(getpassword());	
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR HOD Approval Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void hodReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		hod = new HODBMRBPRProductDetails(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		//bmr.createrecord();
		LoggerUtil.logInfo("validate comments and enter comments");
		hod.commentsvalidate();
		hod.priority();
		LoggerUtil.logInfo("click on return");
		hod.HODReturn(getreturncomments());
		LoggerUtil.logInfo("Enter password and submit the record");
		hod.submitactivity2(getpassword());	
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR HOD Return Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void bprhodApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		hod = new HODBMRBPRProductDetails(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		//bmr.createrecord();
		LoggerUtil.logInfo("validate comments and enter comments");
		hod.bprcomments();
		hod.priority();
		LoggerUtil.logInfo("click on submit");
		hod.bprHODApproval(getapprovalcomments());
		LoggerUtil.logInfo("Enter password and submit the record");
		hod.submitactivity2(getpassword());	
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR HOD Approval Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void bprhodReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		hod = new HODBMRBPRProductDetails(driver);
		
		try {
		 LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		//bmr.createrecord();
		LoggerUtil.logInfo("validate comments and enter comments");
		hod.bprcomments();
		hod.priority();
		LoggerUtil.logInfo("click on return");
		hod.bprHODReturn(getreturncomments());
		LoggerUtil.logInfo("Enter password and submit the record");
		hod.submitactivity2(getpassword());	
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR HOD Return Test is failed", e);
			Assert.fail();
		}
	}
	

}
