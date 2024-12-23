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
	public void bmrMasterpreparation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new BMRMasterPreparation(driver);
		
		as.userlogin(getinitiator(), getpassword());
		mp.masterprepreq();
		mp.bmrmasterreqinitation1(getinitiatorcomments());
		mp.submitactivity2(getpassword());
	}
	
	
	
	
	

}
