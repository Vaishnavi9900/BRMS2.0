package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;

public class BMRDraftInitiation extends ConfigurationReader {
	public Assignmenu as;
	public com.InitiatorPageObjects.BMRDraftInitiation df;
	
	@Test
	public void draftinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		//as.userlogin(getinitiator(), getpassword());
		try {
		LoggerUtil.logInfo("Login to the application with initiator and password details");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("click on bmr master draft initiation tab");
		df.bmrmasterdraftinitiationtab();
		LoggerUtil.logInfo("saving the word templates");
		df.wordtemplates();
		LoggerUtil.logInfo("selecting the cft radio button");
		//df.finalapproval();
		df.cftreview();
		LoggerUtil.logInfo("");
		LoggerUtil.logInfo("selecting the req. cft's");
		df.draftsubmit(getdepartment(), getrole(),getdepartment1(), getrole1(), getinitiatorcomments());
		LoggerUtil.logInfo("submit the draft initiation record with password");
		df.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Draft Initiation Test failed", e);
			Assert.fail();
		}
	}
	@Test
	public void draftinitiation1() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		//as.userlogin(getinitiator(), getpassword());
		try {
		LoggerUtil.logInfo("Login to the application with initiator and password details");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("click on bmr master draft initiation tab");
		df.bmrmasterdraftinitiationtab();
		LoggerUtil.logInfo("saving the word templates");
		df.wordtemplates();
		//df.finalapproval();
		LoggerUtil.logInfo("selecting the cft radio button");
		df.cftreview();
		LoggerUtil.logInfo("selecting the req. cft's");
		df.draftsubmit1(getdepartment(), getrole(), getinitiatorcomments());
		LoggerUtil.logInfo("submit the draft initiation record with password");
		df.submitactivity(getpassword());
		}
		catch(Exception e) {
			LoggerUtil.logError("BMR Draft Initiation Test failed", e);
			Assert.fail();
		}
	}
	@Test
	public void draftReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		try {
		//as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiator and password details");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("click on bmr master draft initiation tab and returned status tab");
		df.draftReinitiation();
		//df.finalapproval();
		LoggerUtil.logInfo("selct the required cft's ");
		df.reinitiationdraftsubmit(getdepartment(), getrole2(), getinitiatorcomments());
		LoggerUtil.logInfo("submit the draft Reinitiation record with password");
		df.submitactivity(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("BMR Draft Reinitiation Test failed", e);
			Assert.fail();
		}
	}
	@Test
	public void draftinitiationwithoutcft() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		try {
		LoggerUtil.logInfo("Login to the application with initiator and password details");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("click on bmr master draft initiation tab");
		df.bmrmasterdraftinitiationtab();
		LoggerUtil.logInfo("saving the word templates");
		df.wordtemplates();
		LoggerUtil.logInfo("select the final approval radio button");
		df.finalapproval();
		LoggerUtil.logInfo("submit the draft initiation record with password");
		df.draftsubmit(getdepartment(), getrole(),getdepartment1(), getrole1(), getinitiatorcomments());
		df.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR draftInitiation without cft test is failed", e);
			Assert.fail();
		}
	}


}
