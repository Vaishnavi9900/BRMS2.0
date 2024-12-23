package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAHODorInChargePageObjects.BMRBPRClosureApproval;

public class BMRbatchClosureApproval extends ConfigurationReader{
	public Assignmenu as;
	public BMRBPRClosureApproval app;
	
	@Test
	public void batchclosureReturn() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRClosureApproval(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		app.batchClosureReturn();
		app.returnbutton();
		app.comments(getreturncomments());
		app.returnbutton();
		app.returnactivity(getpassword());
		
	}
	@Test
    public void batchclosureApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRClosureApproval(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		app.batchClosureApproval();
		app.submit();
		app.comments(getapprovalcomments());
		app.submit();
		app.submitactivity(getpassword());
		
	}
}
