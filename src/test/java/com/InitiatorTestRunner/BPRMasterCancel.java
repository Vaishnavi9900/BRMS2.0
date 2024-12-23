package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BMRBPRMasterCancellationp;

public class BPRMasterCancel extends ConfigurationReader{
	public Assignmenu as;
	public BMRBPRMasterCancellationp cancel;
	
	@Test
	public void bprMasterCancelinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cancel = new BMRBPRMasterCancellationp(driver);
		
		as.userlogin(getinitiator(), getpassword());
		cancel.bprmastercancellationtab();
		cancel.submit();
		cancel.comments();
		cancel.submit();
		cancel.bprsubmitactivity(getpassword());
	}

}
