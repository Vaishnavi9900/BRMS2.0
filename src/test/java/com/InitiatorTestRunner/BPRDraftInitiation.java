package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;

public class BPRDraftInitiation extends ConfigurationReader {
	
	public Assignmenu as;
	public com.InitiatorPageObjects.BMRDraftInitiation df;
	
	@Test
	public void bprdraftinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("BPR Draft Initiation");
		df.bprmasterdraftinitiationtab();
		LoggerUtil.logInfo("saving the word templated");
		df.bprwordtemplates();
		LoggerUtil.logInfo("selection of cft radio button");
		//df.finalapproval();
		df.cftreview();
		LoggerUtil.logInfo("selecting the required cft's ");
		df.draftsubmit(getdepartment(), getrole(), getdepartment1(), getrole1(),getcomments());
		LoggerUtil.logInfo("Enter the password and submit the record");
		df.submitactivity(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("BPR Draft Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void bprdraftReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("BPR Draft Reinitiation");
		df.bprdraftReinitiation();
		LoggerUtil.logInfo("verify validations and enter the comments");
		//df.finalapproval();
		df.comments(getinitiatorcomments());
		LoggerUtil.logInfo("click on submit");
		df.submit();
		LoggerUtil.logInfo("Enter the password and submit the record");
		df.submitactivity(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("BPRDraft ReInitiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void bprdraftinitiationwithoutcft() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("BPR Draft Initiation");
		df.bprmasterdraftinitiationtab();
		LoggerUtil.logInfo("saving the word templates");
		df.bprwordtemplates();
		LoggerUtil.logInfo("select the final approval radio button");
		df.finalapproval();
		LoggerUtil.logInfo("Validate the comments and enter the comments");
		df.draftsubmit(getdepartment(), getrole(),getdepartment1(), getrole1(), getcomments());
		LoggerUtil.logInfo("Enter the password and submit the record");
		df.submitactivity(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("BPR Draft Initiation without cft Test is failed", e);
			Assert.fail();
		}
	}


}
