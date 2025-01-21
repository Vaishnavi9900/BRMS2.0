package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BMRQAOfficerIssuanceandPrint;

public class BMRReprintIssueandPrint extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRQAOfficerIssuanceandPrint issue;
	
	@Test
	public void RePrintPrint() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issue = new BMRQAOfficerIssuanceandPrint(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on RePrint Issuance tab");
		LoggerUtil.logInfo("click on RePrint Issuance Issued tab and open the record");
		issue.reprintissuancetab();
		LoggerUtil.logInfo("click on Print");
		issue.additionalprint();
		LoggerUtil.logInfo("validate comments and enter comments");
		issue.additionalcomments(getprintcomments());
		LoggerUtil.logInfo("click on Print");
		issue.additionalprint();
		LoggerUtil.logInfo("Enter password and submit the record");
		issue.additionalprintactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR RePrint Issuance print Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void ReprintIssue() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issue = new BMRQAOfficerIssuanceandPrint(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on RePrint Issuance tab");
		LoggerUtil.logInfo("click on RePrint Approved Issued tab and open the record");
		issue.reprinttab();
		LoggerUtil.logInfo("click on Issue");
		issue.additionalissue();
		LoggerUtil.logInfo("validate comments and enter comments");
		issue.additionalcomments(getissuedcomments());
		LoggerUtil.logInfo("click on Issue");
		issue.additionalissue();
		LoggerUtil.logInfo("Enter password and submit the record");
		issue.additionalissueactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR RePrint Issuance Issue Test is failed", e);
			Assert.fail();
		}
	}

}
