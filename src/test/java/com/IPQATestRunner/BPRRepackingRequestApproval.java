package com.IPQATestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.IPQAPageObjects.BPRRepackingApproval;

public class BPRRepackingRequestApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRRepackingApproval app;
	
	@Test
	public void repackingReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BPRRepackingApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("click on BPR Repacking request approval tab and open the record");
		app.repackingapproval();
		LoggerUtil.logInfo("click on return");
		app.returnbutton();
		LoggerUtil.logInfo("validate alerts and select the required batch details");
		app.batchseldetails();
		LoggerUtil.logInfo("Validate the comments and enter the comments");
		app.comments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		app.returnbutton();
		LoggerUtil.logInfo("Enter the passowrd and return the record");
		app.returnactivity(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("BPR Repacking Return by IPQA Test is failed", e);
			Assert.fail();
		}
		
	}
	
	@Test
	public void repackingApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BPRRepackingApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("click on BPR Repacking request approval tab and open the record");
		app.repackingapproval();
		LoggerUtil.logInfo("click on submit");
		app.submit();
		LoggerUtil.logInfo("validate alerts");
		app.batchseldetails();
		LoggerUtil.logInfo("Validate the comments and enter the comments");
		app.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		app.submit();
		LoggerUtil.logInfo("Enter the passowrd and approve the record");
		app.submitactivity(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("BPR Repacking approve by IPQA Test is failed", e);
			Assert.fail();
		}
	}

}
