package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionInchargePageObjects.BPRPrintRevieworCancel;

public class BPRBeforePrintCancellation extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRPrintRevieworCancel cancel;
	
	@Test
	public void beforeprintcancelinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BPRPrintRevieworCancel(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		cancel.cancelprintinitiationtab();
		cancel.cancelsubmit();
		cancel.reinitiationcomments(getinitiatorcomments());
		cancel.cancelsubmit();
		cancel.cancelsubmitactivity(getpassword());
	}
	@Test
    public void beforeprintcancelReinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		cancel = new BPRPrintRevieworCancel(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		cancel.cancelprintReinitiationtab();
		cancel.resubmit();
		cancel.cancelreinitiationcomments(getinitiatorcomments());
		cancel.resubmit();
		cancel.cancelresubmitactivity(getpassword());
	}

}
