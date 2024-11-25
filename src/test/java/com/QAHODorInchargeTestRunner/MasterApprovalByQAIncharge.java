package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BMRMasterApprovalInitiation;
import com.ProductionHODPageObjects.BMRProductionHODTechTransferRAQAIncharge;
import com.ProductionInchargePageObjects.BMRProductionInchargeReview;

public class MasterApprovalByQAIncharge extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRProductionHODTechTransferRAQAIncharge tech;
	public BMRProductionInchargeReview review;
	public BMRMasterApprovalInitiation app;
	
	@Test
	public void masterApprovalReturnbyQAIncharge() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		tech = new BMRProductionHODTechTransferRAQAIncharge(driver);
		review = new BMRProductionInchargeReview(driver);
		
		as.userlogin(getQAIncharge(), getpassword());
		tech.masterapprovaltab();
		review.returnbutton();
		review.comments(getreturncomments());
		review.returnbutton();
		review.returnactivity(getpassword());
		
	}
	@Test
    public void qaInchargeMasterApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		tech = new BMRProductionHODTechTransferRAQAIncharge(driver);
		review = new BMRProductionInchargeReview(driver);
		app = new BMRMasterApprovalInitiation(driver);
		
		as.userlogin(getQAIncharge(), getpassword());
		tech.masterapprovaltab();
		review.submit();
		review.comments(getapprovalcomments());
		review.submit();
		app.submitactivity(getpassword());
		
	}

}
