package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;

public class BMRDraftInitiation extends ConfigurationReader {
	public Assignmenu as;
	public com.InitiatorPageObjects.BMRDraftInitiation df;
	
	@Test
	public void draftinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		//as.userlogin(getinitiator(), getpassword());
		as.userlogin(getinitiator(), getpassword());
		df.bmrmasterdraftinitiationtab();
		df.wordtemplates();
		//df.finalapproval();
		df.cftreview();
		df.draftsubmit(getdepartment(), getrole(),getdepartment1(), getrole1(), getinitiatorcomments());
		df.submitactivity(getpassword());
	}
	@Test
	public void draftinitiation1() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		//as.userlogin(getinitiator(), getpassword());
		as.userlogin(getinitiator(), getpassword());
		df.bmrmasterdraftinitiationtab();
		df.wordtemplates();
		//df.finalapproval();
		df.cftreview();
		df.draftsubmit1(getdepartment(), getrole(), getinitiatorcomments());
		df.submitactivity(getpassword());
	}
	@Test
	public void draftReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		//as.userlogin(getinitiator(), getpassword());
		as.userlogin(getinitiator(), getpassword());
		df.draftReinitiation();
		//df.finalapproval();
		df.reinitiationdraftsubmit(getdepartment(), getrole2(), getinitiatorcomments());
		df.submitactivity(getpassword());
	}
	@Test
	public void draftinitiationwithoutcft() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		as.userlogin(getinitiator(), getpassword());
		df.bmrmasterdraftinitiationtab();
		df.wordtemplates();
		df.finalapproval();
		df.draftsubmit(getdepartment(), getrole(),getdepartment1(), getrole1(), getinitiatorcomments());
		df.submitactivity(getpassword());
	}


}
