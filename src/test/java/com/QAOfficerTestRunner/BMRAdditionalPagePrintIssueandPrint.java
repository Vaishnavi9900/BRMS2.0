package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAOfficerPageObjects.BMRQAOfficerIssuanceandPrint;

public class BMRAdditionalPagePrintIssueandPrint extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRQAOfficerIssuanceandPrint issue;
	
	@Test
	public void additionalPagePrint() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issue = new BMRQAOfficerIssuanceandPrint(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		issue.additionalpageprintissuancetab();
		issue.additionalprint();
		issue.additionalcomments(getprintcomments());
		issue.additionalprint();
		issue.additionalprintactivity(getpassword());
	}
	@Test
	public void additionalPageIssue() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issue = new BMRQAOfficerIssuanceandPrint(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		issue.additionalpageprintissuancetab();
		issue.additionalissue();
		issue.additionalcomments(getissuedcomments());
		issue.additionalissue();
		issue.additionalissueactivity(getpassword());
		
	}
	@Test
	public void additionalPagePrintReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issue = new BMRQAOfficerIssuanceandPrint(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		issue.additionalpageprintissuancetab();
		issue.additionalcomments(getrejectedcomments());
		issue.reject();
		issue.rejectactivity(getpassword());
	}

}
