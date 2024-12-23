package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionInchargePageObjects.BMRBPRAfterPrintCancelReview;
public class BMRAfterPrintCancellationReview extends ConfigurationReader{
	public Assignmenu as;
	public BMRBPRAfterPrintCancelReview review;
	
	@Test
	public void afterPrintCancelReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAfterPrintCancelReview(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		review.afterPrintcanelReviewtab();
		review.returnbutton();
		review.comments(getreturncomments());
		review.returnbutton();
		review.returnactivity(getpassword());
	}
	@Test
	public void afterPrintCancelReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAfterPrintCancelReview(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		review.afterPrintcanelReviewtab();
		review.submit();
		review.comments(getapprovalcomments());
		review.submit();
		review.submitactivity(getpassword());
	}
	@Test
	public void afterPrintCancelReject() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRAfterPrintCancelReview(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		review.afterPrintcanelReviewtab();
		review.reject();
		review.comments(getrejectedcomments());
		review.reject();
		review.rejectactivity(getpassword());
	}
}
