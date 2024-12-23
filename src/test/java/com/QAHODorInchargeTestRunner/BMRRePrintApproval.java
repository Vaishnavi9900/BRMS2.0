package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAHODorInChargePageObjects.BMRBPRQAHODRePrintApproval;

public class BMRRePrintApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRQAHODRePrintApproval app;
	
	@Test
	public void rePrintReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODRePrintApproval(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		app.reprintapprovaltab();
		app.returnbutton();
		app.comments(getreturncomments());
		app.returnbutton();
		app.returnactivity(getpassword());
	}
	@Test
	public void rePrintApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODRePrintApproval(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		app.reprintapprovaltab();
		app.submit();
		app.comments(getapprovalcomments());
		app.submit();
		app.submitactivity(getpassword());
	}
	@Test
	public void rePrintReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODRePrintApproval(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		app.reprintapprovaltab();
		app.reject();
		app.comments(getrejectedcomments());
		app.reject();
		app.rejectnactivity(getpassword());
	}
}
