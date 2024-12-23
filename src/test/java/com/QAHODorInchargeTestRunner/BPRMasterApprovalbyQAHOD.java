package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;
import com.QAHODorInChargePageObjects.BMRBPRQAHODMasterauthorization;

public class BPRMasterApprovalbyQAHOD extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRQAHODMasterauthorization auth;
	public BMRBPRProductionInchargeReview review;
	
	@Test
	public void bprmasterApprovalReturnbyQAHOD() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		auth = new BMRBPRQAHODMasterauthorization(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		auth.bprmasterauthorizationtab();
		review.returnbutton();
		review.comments(getreturncomments());
		review.returnbutton();
		review.returnactivity2(getpassword());
		
	}
	@Test
    public void bprqaHODMasterApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		auth = new BMRBPRQAHODMasterauthorization(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		auth.bprmasterauthorizationtab();
		auth.authorize();
		review.comments(getapprovalcomments());
		auth.authorize();
		auth.authorizationactivity2(getpassword());
		
	}


}
