package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BMRMasterPreparation;
import com.InitiatorPageObjects.BMRProductDetails;

public class BMRMasterPreparationRequest extends ConfigurationReader {
	public Assignmenu as;
	public BMRMasterPreparation mp;
	
	@Test
	public void BMRMasterpreparation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparation(driver);
		
		as.userlogin(getinitiator(), getpassword());
		mp.masterprepreq();
		mp.bmrmasterreqinitation(getapprovalcomments());
		mp.submitactivity();
	}
	
	
	
	
	

}
