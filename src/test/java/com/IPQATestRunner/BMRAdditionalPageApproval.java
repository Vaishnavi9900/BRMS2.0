package com.IPQATestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.IPQAPageObjects.BMRBPRAdditionalPagePrintApproval;

public class BMRAdditionalPageApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRAdditionalPagePrintApproval app;
	
	@Test
	public void additionalPageReturnbyIPQA() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRAdditionalPagePrintApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("click on BMR Additional Page Print req Approval tab and open the record");
		app.additionalPageReturn();
		LoggerUtil.logInfo("click on return");
		app.returnbutton();
		LoggerUtil.logInfo("Validate the comments and enter the comments");
		app.comments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		app.returnbutton();
		LoggerUtil.logInfo("Enter the passowrd and return the record");
		app.returnactivity(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("BMR Additional Page Print Request Return by IPQA Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void additionalPageApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRAdditionalPagePrintApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("click on BMR Additional Page Print req Approval tab and open the record");
		app.additionalPageReturn();
		LoggerUtil.logInfo("click on submit");
		app.submit();
		LoggerUtil.logInfo("Validate the comments and enter the comments");
		app.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		app.submit();
		LoggerUtil.logInfo("Enter the password and approve the record");
		app.submitactivity(getpassword());
		}
        catch (Exception e) {
			
			LoggerUtil.logError("BMR Additional Page Print Request Approval by IPQA Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void additionalPageRejection() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRAdditionalPagePrintApproval(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with IPQA id and password");
		as.userlogin(getIPQA(), getpassword());
		LoggerUtil.logInfo("click on BMR Additional Page Print req Approval tab and open the record");
		app.additionalPageReturn();
		LoggerUtil.logInfo("click on reject");
		app.reject();
		LoggerUtil.logInfo("Validate the comments and enter the comments");
		app.comments(getrejectedcomments());
		LoggerUtil.logInfo("click on reject");
		app.reject();
		LoggerUtil.logInfo("Enter the password and reject the record");
		app.rejectactivity(getpassword());
		}
        catch (Exception e) {
			
			LoggerUtil.logError("BMR Additional Page Print Request Rejection by IPQA Test is failed", e);
			Assert.fail();
		}
	}

}
