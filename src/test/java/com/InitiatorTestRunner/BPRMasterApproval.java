package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;

public class BPRMasterApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRMasterApprovalInitiation app;
	
	@Test
	public void bprmasterApprovalInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		as.userlogin(getinitiator(), getpassword());
		app.bprmasterinitiationtab();
		app.submit();
		app.comments();
		app.submit();
		app.submitactivity2(getpassword());
		
	}
	@Test
    public void bprmasterApprovalReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		as.userlogin(getinitiator(), getpassword());
		app.bprmasterreinitiation();
//		app.resubmit();
		app.reinitiationcomments();
		app.resubmit();
		app.resubmitactivity2(getpassword());
		
	}

}
