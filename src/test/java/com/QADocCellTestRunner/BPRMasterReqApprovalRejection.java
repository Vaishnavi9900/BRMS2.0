package com.QADocCellTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QADocCellPageObjects.BMRMasterPreparationapprovals;

public class BPRMasterReqApprovalRejection extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRMasterPreparationapprovals mp;
	
	@Test
	public void bprmasterreqrejection() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparationapprovals(driver);
		
		as.userlogin(getQADoccell(), getpassword());
		mp.bprmasterprerejection(getrejectedcomments());
		mp.submitactivity2(getpassword());
	}
	@Test
	public void bprmasterreqapproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparationapprovals(driver);
		
		as.userlogin(getQADoccell(), getpassword());
		mp.bprmasterpreapproval(getapprovalcomments());
		mp.submitactivity(getpassword());
	}

}
