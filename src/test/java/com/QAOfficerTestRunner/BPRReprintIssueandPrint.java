package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAOfficerPageObjects.BPRReprintIssuanceandPrint;


public class BPRReprintIssueandPrint extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRReprintIssuanceandPrint issue;
	
	@Test
	public void RePrintPrint() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issue = new BPRReprintIssuanceandPrint(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		issue.reprinttab();
		issue.additionalprint();
		issue.additionalcomments(getprintcomments());
		issue.additionalprint();
		issue.additionalprintactivity(getpassword());
	}
	@Test
	public void ReprintIssue() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issue = new BPRReprintIssuanceandPrint(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		issue.reprintissuancetab();
		issue.additionalissue();
		issue.additionalcomments(getissuedcomments());
		issue.additionalissue();
		issue.additionalissueactivity(getpassword());
		
	}


}
