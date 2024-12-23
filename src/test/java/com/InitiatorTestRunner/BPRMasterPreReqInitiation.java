package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BPRMasterPreparation;

public class BPRMasterPreReqInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRMasterPreparation bpr;
	
	@Test
	public void bprmasterreqinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		bpr = new BPRMasterPreparation(driver);
		
		as.userlogin(getinitiator(), getpassword());
		bpr.bprMasterPrereqInitiation(getinitiatorcomments());
		bpr.submitactivity(getpassword());
	}

}
