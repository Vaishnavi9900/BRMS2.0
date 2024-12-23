package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAHODorInChargePageObjects.BMRBPRMasterCancelApproval;

public class BMRMasterCancelApprovalOrRejection extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRMasterCancelApproval cancel;
	
	@Test
	public void masterCancelApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancelApproval(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		cancel.mastercancelapprovaltab();
		cancel.comments(getapprovalcomments());
		cancel.submit();
		cancel.submitactivity(getpassword());
		
	}
	@Test
    public void masterCancelRejection() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancelApproval(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		cancel.mastercancelapprovaltab();
		cancel.comments(getrejectedcomments());
		cancel.reject();
		cancel.rejectactivity(getpassword());
		
	}

}
