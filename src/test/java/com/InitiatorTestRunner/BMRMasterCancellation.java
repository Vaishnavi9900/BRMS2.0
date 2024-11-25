package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BMRMasterCancellationp;

public class BMRMasterCancellation extends ConfigurationReader{
 
	public Assignmenu as;
	public BMRMasterCancellationp cancel;
	
	@Test
	public void bmrMasterCancelinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cancel = new BMRMasterCancellationp(driver);
		
		as.userlogin(getinitiator(), getpassword());
		cancel.mastercancellationtab();
		cancel.submit();
		cancel.comments();
		cancel.submit();
		cancel.submitactivity(getpassword());
	}
		
}
