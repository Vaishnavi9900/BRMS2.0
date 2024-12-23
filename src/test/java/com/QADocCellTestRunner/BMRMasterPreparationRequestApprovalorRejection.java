package com.QADocCellTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QADocCellPageObjects.BMRMasterPreparationapprovals;

public class BMRMasterPreparationRequestApprovalorRejection extends ConfigurationReader {
	public Assignmenu as;
	public BMRMasterPreparationapprovals mp;
	
	@Test
	public void bmrmasterreqrejection() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparationapprovals(driver);
		
		as.userlogin(getQADoccell(), getpassword());
		mp.masterprepapprovaltab();
		mp.masterprerejection(getrejectedcomments());
		mp.submitactivity2(getpassword());
	}
	@Test
	public void bmrmasterreqapproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparationapprovals(driver);
		
		as.userlogin(getQADoccell(), getpassword());
		mp.masterprepapprovaltab();
		mp.masterpreapproval(getapprovalcomments());
		mp.submitactivity2(getpassword());
	}

}
