package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionExecutivePageObjects.BMRBPRAfterPrintCancelInitiation;

public class BPRAfterPrintCancellation extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRAfterPrintCancelInitiation cancel;
	
	@Test
	public void afterPrintCancelInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cancel = new BMRBPRAfterPrintCancelInitiation(driver);
		
		as.userlogin(getprodexe(), getpassword());
		cancel.bprafterPrintcanelinitiation();
		cancel.submit();
		cancel.comments();
		cancel.submit();
		cancel.submitactivity(getpassword());
	}
	@Test
	public void afterPrintCancelReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cancel = new BMRBPRAfterPrintCancelInitiation(driver);
		
		as.userlogin(getprodexe(), getpassword());
		cancel.bprafterPrintcanelReinitiation();
		cancel.resubmit();
		cancel.reinitiationcomments();
		cancel.resubmit();
		cancel.resubmitactivity(getpassword());
	}

}
