package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAHODorInChargePageObjects.BMRBPRClosureApproval;

public class BPRBatchClosureApproval extends ConfigurationReader{
	public Assignmenu as;
	public BMRBPRClosureApproval app;
	
	@Test
	public void bprbatchclosureReturn() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRClosureApproval(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		app.bprbatchClosureReturn();
		app.returnbutton();
		app.bprcomments(getreturncomments());
		app.returnbutton();
		app.returnactivity(getpassword());
		
	}
	@Test
    public void bprbatchclosureApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BMRBPRClosureApproval(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		app.bprbatchClosureApproval();
		app.submit();
		app.bprcomments(getapprovalcomments());
		app.submit();
		app.submitactivity(getpassword());
		
	}
	

}
