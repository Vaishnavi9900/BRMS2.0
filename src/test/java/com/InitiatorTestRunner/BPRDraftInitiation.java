package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;

public class BPRDraftInitiation extends ConfigurationReader {
	
	public Assignmenu as;
	public com.InitiatorPageObjects.BMRDraftInitiation df;
	
	@Test
	public void bprdraftinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		as.userlogin(getinitiator(), getpassword());
		df.bprmasterdraftinitiationtab();
		df.bprwordtemplates();
		//df.finalapproval();
		df.cftreview();
		df.draftsubmit(getdepartment(), getrole(), getdepartment1(), getrole1(),getcomments());
		df.submitactivity(getpassword());
	}
	@Test
	public void bprdraftReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		as.userlogin(getinitiator(), getpassword());
		df.bprdraftReinitiation();
		//df.finalapproval();
		df.comments(getinitiatorcomments());
		df.submit();
		df.submitactivity(getpassword());
	}
	@Test
	public void bprdraftinitiationwithoutcft() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		df = new com.InitiatorPageObjects.BMRDraftInitiation(driver);
		
		as.userlogin(getinitiator(), getpassword());
		df.bprmasterdraftinitiationtab();
		df.bprwordtemplates();
		df.finalapproval();
		df.draftsubmit(getdepartment(), getrole(),getdepartment1(), getrole1(), getcomments());
		df.submitactivity(getpassword());
	}


}
