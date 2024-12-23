package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAHODorInChargePageObjects.BMRBPRQAHODAfterPrintApprovalorReject;

public class BMRAfterPrintCancelApprovalRejection  extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRQAHODAfterPrintApprovalorReject app;
	
	@Test
	public void afterPrintcancelReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		app.afterprintapprovaltab();
		app.afterprintreturn();
		app.afterprintcomments(getreturncomments());
		app.afterprintreturn();
		app.afterprintreturnactivity(getpassword());
		
	}
	@Test
	public void afterPrintcancelApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		app.afterprintapprovaltab();
		app.afterprintsubmit();
		app.afterprintcomments(getapprovalcomments());
		app.afterprintsubmit();
		app.afterprintsubmitactivity(getpassword());
		
	}
	@Test
	public void afterPrintcancelReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		app = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		app.afterprintapprovaltab();
		app.afterprintreject();
		app.afterprintcomments(getrejectedcomments());
		app.afterprintreject();
		app.afterprintrejectactivity(getpassword());
		
	}



}
