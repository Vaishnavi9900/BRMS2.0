package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAHODorInChargePageObjects.BPRPrintApprovalorReject;

public class BPRBeforePrintCancelApprovalorRejection extends ConfigurationReader{
	
	
	public Assignmenu as;
	public BPRPrintApprovalorReject app;
	
	
	@Test
	public void beforePrintCancelReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BPRPrintApprovalorReject(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		app.beforeprintapprovalrejecttab();
		app.beforeprintreturn();
		app.beforeprintcomments(getreturncomments());
		app.beforeprintreturn();
		app.beforeprintreturnactivity(getpassword());
	}
	@Test
	public void beforePrintCancelApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BPRPrintApprovalorReject(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		app.beforeprintapprovalrejecttab();
		app.beforeprintsubmit();
		app.beforeprintcomments(getapprovalcomments());
		app.beforeprintsubmit();
		app.beforeprintsubmitactivity(getpassword());		
	}
	@Test
	public void beforePrintCancelRejection() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		app = new BPRPrintApprovalorReject(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		app.beforeprintapprovalrejecttab();
		app.beforeprintreject();
		app.beforeprintcomments(getrejectedcomments());
		app.beforeprintreject();
		app.beforeprintrejectactivity(getpassword());		
	}
	

}
