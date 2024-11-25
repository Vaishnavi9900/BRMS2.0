package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BMRMasterApprovalInitiation;

public class BMRMasterApproval extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRMasterApprovalInitiation app;
	
	@Test
	public void masterApprovalInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRMasterApprovalInitiation(driver);
		
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
		app = new BMRMasterApprovalInitiation(driver);
		
		as.userlogin(getinitiator(), getpassword());
		app.masterreinitiation();
		app.submit();
		app.comments();
		app.submit();
		app.submitactivity2(getpassword());
		
	}

}
