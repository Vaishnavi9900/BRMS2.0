package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BMRQAOfficerIssuanceandPrint;

public class BMRAdditionalPagePrintIssueandPrint extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRQAOfficerIssuanceandPrint issue;
	
	@Test
	public void additionalPagePrint() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issue = new BMRQAOfficerIssuanceandPrint(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on Additional Page PrintIssuance tab");
		LoggerUtil.logInfo("click on Additional Page Issued tab and open the record");
		issue.additionalpageprintissuancetab();
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
			LoggerUtil.logError("BMR Additional Page Print Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void additionalPageIssue() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issue = new BMRQAOfficerIssuanceandPrint(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		LoggerUtil.logInfo("click on Additional Page PrintIssuance tab");
		LoggerUtil.logInfo("click on Additional Page Approved tab and open the record");
		as.userlogin(getQAOfficer(), getpassword());
		issue.additionalpageprintissuancetab();
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
			LoggerUtil.logError("BMR Additional Page Print Issue Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void additionalPagePrintReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issue = new BMRQAOfficerIssuanceandPrint(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on Additional Page PrintIssuance tab and open the record");
		issue.additionalpageprintissuancetab();
		LoggerUtil.logInfo("validate comments and enter comments");
		issue.additionalcomments(getrejectedcomments());
		LoggerUtil.logInfo("click on reject");
		issue.reject();
		LoggerUtil.logInfo("Enter password and submit the record");
		issue.rejectactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Additional Page Print Reject Test is failed", e);
			Assert.fail();
		}
	}

}
