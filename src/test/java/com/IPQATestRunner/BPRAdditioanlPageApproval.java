package com.IPQATestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.IPQAPageObjects.BMRBPRAdditionalPagePrintApproval;

public class BPRAdditioanlPageApproval extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRAdditionalPagePrintApproval app;
	
	@Test
	public void bpradditionalPageReturnbyIPQA() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRAdditionalPagePrintApproval(driver);
		
		as.userlogin(getIPQA(), getpassword());
		app.bpradditionalPageReturn();
		app.returnbutton();
		app.comments(getreturncomments());
		app.returnbutton();
		app.returnactivity(getpassword());
	}
	@Test
	public void bpradditionalPageApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRAdditionalPagePrintApproval(driver);
		
		as.userlogin(getIPQA(), getpassword());
		app.bpradditionalPageReturn();
		app.submit();
		app.comments(getapprovalcomments());
		app.submit();
		app.submitactivity(getpassword());
	}
	public void bpradditionalPageRejection() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRAdditionalPagePrintApproval(driver);
		
		as.userlogin(getIPQA(), getpassword());
		app.bpradditionalPageReturn();
		app.reject();
		app.comments(getrejectedcomments());
		app.reject();
		app.rejectactivity(getpassword());
	}

}
