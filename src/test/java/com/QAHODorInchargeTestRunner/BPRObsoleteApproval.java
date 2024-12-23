package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAHODorInChargePageObjects.BMRBPRObsoleteApproval;

public class BPRObsoleteApproval extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRObsoleteApproval app;

	@Test
	public void obsoleteReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRObsoleteApproval(driver);

		as.userlogin(getQAHOD(), getpassword());
		app.bprobsoleteApproval();
		app.returnbutton();
		app.comments(getreturncomments());
		app.returnbutton();
		app.returnactivity(getpassword());
	}
	@Test
	public void obsoleteApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRObsoleteApproval(driver);

		as.userlogin(getQAHOD(), getpassword());
		app.bprobsoleteApproval();
		app.submit();
		app.comments(getapprovalcomments());
		app.submit();
		app.submitactivity(getpassword());
	}
	@Test
	public void obsoleteReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRObsoleteApproval(driver);

		as.userlogin(getQAHOD(), getpassword());
		app.bprobsoleteApproval();
		app.reject();
		app.comments(getrejectedcomments());
		app.reject();
		app.rejectactivity(getpassword());
	}

}
