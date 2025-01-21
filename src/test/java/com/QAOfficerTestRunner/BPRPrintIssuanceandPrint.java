package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BPRIssueandPrint;


public class BPRPrintIssuanceandPrint extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRIssueandPrint issuance;
	
	@Test
	public void issue() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issuance = new BPRIssueandPrint(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on Print Issuance tab");
		LoggerUtil.logInfo("click on Print Issuance Approved tab and open the record");
		issuance.printissuancetab();
		LoggerUtil.logInfo("click on Issue");
		issuance.issue();
		LoggerUtil.logInfo("select the print copy details");
		issuance.printcopydetails();
		LoggerUtil.logInfo("validate comments and enter comments");
		issuance.comments(getissuedcomments());
		LoggerUtil.logInfo("click on Issue");
		issuance.issue();
		LoggerUtil.logInfo("Enter password and submit the record");
		issuance.issueactivity2(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Print Issuance Issue Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void print() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issuance = new BPRIssueandPrint(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("click on Print Issuance tab");
		LoggerUtil.logInfo("click on Print Issuance Approved tab and open the record");
		issuance.printissuancetab();
		LoggerUtil.logInfo("click on Print");
		issuance.print();
		LoggerUtil.logInfo("validate comments and enter comments");
		issuance.comments(getprintcomments());
		LoggerUtil.logInfo("click on Print");
		issuance.print();
		LoggerUtil.logInfo("Enter password and submit the record");
		issuance.printactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Print Issuance Print Test is failed", e);
			Assert.fail();
		}
	}

}
