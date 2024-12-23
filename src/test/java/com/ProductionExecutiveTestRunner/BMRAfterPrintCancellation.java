package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionExecutivePageObjects.BMRBPRAfterPrintCancelInitiation;

public class BMRAfterPrintCancellation extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRAfterPrintCancelInitiation cancel;
	
	@Test
	public void afterPrintCancelInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cancel = new BMRBPRAfterPrintCancelInitiation(driver);
		
		as.userlogin(getprodexe(), getpassword());
		cancel.afterPrintcanelinitiation();
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
		cancel.afterPrintcanelReinitiation();
		cancel.resubmit();
		cancel.reinitiationcomments();
		cancel.resubmit();
		cancel.resubmitactivity(getpassword());
	}

}
