package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;

public class BPRMasterReview extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRProductionInchargeReview review;
	public BMRBPRMasterApprovalInitiation app;
	
	@Test
	public void bprmasterApprovalReturn() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		review.bprmasterreviewtab();
		review.returnbutton();
		review.comments(getreturncomments());
		review.returnbutton();
		review.returnactivity2(getpassword());
		
	}
	
	@Test
     public void bprmasterReview() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		review.bprmasterreviewtab();
		review.submit();
		review.comments(getapprovalcomments());
		review.submit();
		review.bprsubmitactivity2(getpassword());
		
	}

}
