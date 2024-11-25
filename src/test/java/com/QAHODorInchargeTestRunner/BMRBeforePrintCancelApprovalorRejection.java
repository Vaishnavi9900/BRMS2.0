package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAHODorInChargePageObjects.BMRQAHODPrintApprovalorReject;

public class BMRBeforePrintCancelApprovalorRejection extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRQAHODPrintApprovalorReject hod;
	
	
	@Test
	public void beforePrintCancelReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		hod = new BMRQAHODPrintApprovalorReject(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		hod.beforeprintapprovalrejecttab();
		hod.beforeprintreturn();
		hod.beforeprintcomments(getreturncomments());
		hod.beforeprintreturn();
		hod.beforeprintreturnactivity(getpassword());
	}
	@Test
	public void beforePrintCancelApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRQAHODPrintApprovalorReject(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		hod.beforeprintapprovalrejecttab();
		hod.beforeprintsubmit();
		hod.beforeprintcomments(getapprovalcomments());
		hod.beforeprintsubmit();
		hod.beforeprintsubmitactivity(getpassword());		
	}
	@Test
	public void beforePrintCancelRejection() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRQAHODPrintApprovalorReject(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		hod.beforeprintapprovalrejecttab();
		hod.beforeprintreject();
		hod.beforeprintcomments(getapprovalcomments());
		hod.beforeprintreject();
		hod.beforeprintsubmitactivity(getpassword());		
	}
	

}
