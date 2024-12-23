package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionInchargePageObjects.BMRBPRObsoleteReview;

public class BPRObsoleteReview extends ConfigurationReader{


	public Assignmenu as;
	public BMRBPRObsoleteReview review;

	@Test
	public void obsoleteReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRObsoleteReview(driver);

		as.userlogin(getproductionincharge(), getpassword());
		review.bprobsoleteReview();
		review.returnbutton();
		review.comments(getreturncomments());
		review.returnbutton();
		review.returnactivity(getpassword());
	}
	@Test
	public void obsoleteReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRObsoleteReview(driver);

		as.userlogin(getproductionincharge(), getpassword());
		review.bprobsoleteReview();
		review.submit();
		review.comments(getapprovalcomments());
		review.submit();
		review.submitactivity(getpassword());
	}

}
