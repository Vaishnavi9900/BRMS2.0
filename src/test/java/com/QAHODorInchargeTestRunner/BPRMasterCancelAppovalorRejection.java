package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAHODorInChargePageObjects.BMRBPRMasterCancelApproval;

public class BPRMasterCancelAppovalorRejection extends ConfigurationReader{
	public Assignmenu as;
	public BMRBPRMasterCancelApproval cancel;
	
	@Test
	public void bprmasterCancelApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancelApproval(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		cancel.bprmastercancelapprovaltab();
		cancel.submit();
		cancel.comments(getapprovalcomments());
		cancel.submit();
		cancel.bprsubmitactivity(getpassword());
		
	}
	@Test
    public void bprmasterCancelRejection() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancelApproval(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		cancel.bprmastercancelapprovaltab();
		cancel.reject();
		cancel.comments(getrejectedcomments());
		cancel.reject();
		cancel.bprrejectactivity(getpassword());
		
	}


}
