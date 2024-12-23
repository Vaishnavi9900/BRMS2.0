package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionInchargePageObjects.BMRBPRAdditionalPrintReview;


public class BMRAdditionalPageReview extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRAdditionalPrintReview review;
	
	@Test
	public void additionalPageReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAdditionalPrintReview(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		review.additionalPageReturn();
		review.returnbutton();
		review.comments(getreturncomments());
		review.returnbutton();
		review.returnactivity(getpassword());
	}
	@Test
	public void additionalPageReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAdditionalPrintReview(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		review.additionalPageReturn();
		review.submit();
		review.comments(getapprovalcomments());
		review.submit();
		review.submitactivity(getpassword());
	}
	@Test
	public void additionalPageReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAdditionalPrintReview(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		review.additionalPageReturn();
		review.reject();
		review.comments(getrejectedcomments());
		review.reject();
		review.rejectactivity(getpassword());
	}

}
