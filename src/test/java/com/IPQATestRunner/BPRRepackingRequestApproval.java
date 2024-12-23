package com.IPQATestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.IPQAPageObjects.BPRRepackingApproval;

public class BPRRepackingRequestApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRRepackingApproval app;
	
	@Test
	public void repackingReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BPRRepackingApproval(driver);
		
		as.userlogin(getIPQA(), getpassword());
		app.repackingapproval();
		app.returnbutton();
		app.batchseldetails();
		app.comments(getreturncomments());
		app.returnbutton();
		app.returnactivity(getpassword());
		
	}
	
	@Test
	public void repackingApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BPRRepackingApproval(driver);
		
		as.userlogin(getIPQA(), getpassword());
		app.repackingapproval();
		app.submit();
		app.batchseldetails();
		app.comments(getapprovalcomments());
		app.submit();
		app.submitactivity(getpassword());
	}

}
