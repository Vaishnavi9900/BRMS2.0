package com.IPQATestRunner;

import java.io.IOException;
import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.IPQAPageObjects.BMRBPRAdditionalPagePrintApproval;

public class BMRAdditionalPageApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRAdditionalPagePrintApproval app;
	
	@Test
	public void additionalPageReturnbyIPQA() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRAdditionalPagePrintApproval(driver);
		
		as.userlogin(getIPQA(), getpassword());
		app.additionalPageReturn();
		app.returnbutton();
		app.comments(getreturncomments());
		app.returnbutton();
		app.returnactivity(getpassword());
	}
	@Test
	public void additionalPageApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRAdditionalPagePrintApproval(driver);
		
		as.userlogin(getIPQA(), getpassword());
		app.additionalPageReturn();
		app.submit();
		app.comments(getapprovalcomments());
		app.submit();
		app.submitactivity(getpassword());
	}
	public void additionalPageRejection() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRAdditionalPagePrintApproval(driver);
		
		as.userlogin(getIPQA(), getpassword());
		app.additionalPageReturn();
		app.reject();
		app.comments(getrejectedcomments());
		app.reject();
		app.rejectactivity(getpassword());
	}

}
