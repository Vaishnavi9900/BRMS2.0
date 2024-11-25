package com.TechTransferTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BMRMasterApprovalInitiation;
import com.ProductionHODPageObjects.BMRProductionHODTechTransferRAQAIncharge;
import com.ProductionInchargePageObjects.BMRProductionInchargeReview;

public class BMRMasterApprovalByTechTransfer extends ConfigurationReader{

	public Assignmenu as;
	public BMRProductionHODTechTransferRAQAIncharge tech;
	public BMRProductionInchargeReview review;
	public BMRMasterApprovalInitiation app;
	
	@Test
	public void masterApprovalReturnbyTechtransfer() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		tech = new BMRProductionHODTechTransferRAQAIncharge(driver);
		review = new BMRProductionInchargeReview(driver);
		
		as.userlogin(getTechtransfer(), getpassword());
		tech.masterapprovaltab();
		review.returnbutton();
		review.comments(getreturncomments());
		review.submit();
		review.returnactivity2(getpassword());
		
	}
	@Test
    public void masterApprovalnbyTechtransferOrRandD() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		tech = new BMRProductionHODTechTransferRAQAIncharge(driver);
		review = new BMRProductionInchargeReview(driver);
		app = new BMRMasterApprovalInitiation(driver);
		
		as.userlogin(getTechtransfer(), getpassword());
		tech.masterapprovaltab();
		review.submit();
		review.comments(getapprovalcomments());
		review.submit();
		app.submitactivity2(getpassword());
		
	}
}
