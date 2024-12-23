package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionInchargePageObjects.BPRPrintRevieworCancel;

public class BPRPrintReview extends ConfigurationReader{

	
	public Assignmenu as;
	public BPRPrintRevieworCancel incharge;
	
	@Test
	public void printReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		incharge = new BPRPrintRevieworCancel(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		incharge.bprprintreqreviewtab();
		//incharge.reReview();
		incharge.submit();
		incharge.comments(getapprovalcomments());
		incharge.submit();
		incharge.printsubmitactivity(getpassword());	
	}
	@Test
	public void printReReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		incharge = new BPRPrintRevieworCancel(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		incharge.reReview();
		incharge.submit();
		incharge.comments(getapprovalcomments());
		incharge.submit();
		incharge.submitactivity(getpassword());	
	}
	@Test
	public void printReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		incharge = new BPRPrintRevieworCancel(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		incharge.bprprintreqreviewtab();
		incharge.returnbutton();
		incharge.comments(getreturncomments());
		incharge.returnbutton();
		incharge.returnactivity(getpassword());	
	}
}
