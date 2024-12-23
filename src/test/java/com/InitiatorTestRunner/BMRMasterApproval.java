package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;

public class BMRMasterApproval extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRMasterApprovalInitiation app;
	
	@Test
	public void masterApprovalInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		as.userlogin(getinitiator(), getpassword());
		app.masterinitiationtab();
		app.submit();
		app.comments();
		app.submit();
		app.submitactivity2(getpassword());
		
	}
	@Test
    public void masterApprovalReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		as.userlogin(getinitiator(), getpassword());
		app.masterreinitiation();
		app.resubmit();
		app.reinitiationcomments();
		app.resubmit();
		app.resubmitactivity2(getpassword());
		
	}

}
