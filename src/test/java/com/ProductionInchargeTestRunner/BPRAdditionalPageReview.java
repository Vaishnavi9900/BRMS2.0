package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionInchargePageObjects.BMRBPRAdditionalPrintReview;

public class BPRAdditionalPageReview extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRAdditionalPrintReview review;
	
	@Test
	public void bpradditionalPageReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAdditionalPrintReview(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		review.bpradditionalPageReturn();
		review.returnbutton();
		review.comments(getreturncomments());
		review.returnbutton();
		review.returnactivity(getpassword());
	}
	@Test
	public void bpradditionalPageReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAdditionalPrintReview(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		review.bpradditionalPageReturn();
		review.submit();
		review.comments(getapprovalcomments());
		review.submit();
		review.submitactivity(getpassword());
	}
	@Test
	public void bpradditionalPageReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAdditionalPrintReview(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		review.bpradditionalPageReturn();
		review.reject();
		review.comments(getrejectedcomments());
		review.reject();
		review.rejectactivity(getpassword());
	}


}
