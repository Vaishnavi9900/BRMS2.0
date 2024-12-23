package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;
import com.ProductionHODPageObjects.BMRBPRProductionHODTechTransferRAQAIncharge;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;

public class MasterApprovalByQAIncharge extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRProductionHODTechTransferRAQAIncharge tech;
	public BMRBPRProductionInchargeReview review;
	public BMRBPRMasterApprovalInitiation app;
	
	@Test
	public void masterApprovalReturnbyQAIncharge() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		tech = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		as.userlogin(getQAIncharge(), getpassword());
		tech.masterapprovaltab();
		review.returnbutton();
		review.comments(getreturncomments());
		review.returnbutton();
		review.returnactivity2(getpassword());
		
	}
	@Test
    public void qaInchargeMasterApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		tech = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		as.userlogin(getQAIncharge(), getpassword());
		tech.masterapprovaltab();
		review.submit();
		review.comments(getapprovalcomments());
		review.submit();
		app.submitactivity2(getpassword());
		
	}

}
