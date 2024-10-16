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
		as.userlogin("110006", "123");
		df.masterapprovaltab();
		df.wordtemplates();
		//df.finalapproval();
		df.cftreview();
		df.draftsubmit(getdepartment(), getrole(), getcomments());
		df.submitactivity();
	}


}
