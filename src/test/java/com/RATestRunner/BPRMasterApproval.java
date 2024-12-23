package com.RATestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;
import com.ProductionHODPageObjects.BMRBPRProductionHODTechTransferRAQAIncharge;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;

public class BPRMasterApproval extends ConfigurationReader {
	

	public Assignmenu as;
	public BMRBPRProductionHODTechTransferRAQAIncharge hod;
	public BMRBPRMasterApprovalInitiation app;
	public BMRBPRProductionInchargeReview review;
	
	@Test
	public void bprmasterApprovalbyRA() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		as.userlogin(getRA(), getpassword());
		hod.bprmasterapprovaltab();
		app.submit();
		hod.comments(getapprovalcomments());
		app.submit();
		app.submitactivity2(getpassword());
		
	}
	@Test
    public void bprmasterReturnbyRA() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		as.userlogin(getRA(), getpassword());
		hod.bprmasterapprovaltab();
		review.returnbutton();
		hod.comments(getreturncomments());
		review.returnbutton();
		app.submitactivity2(getpassword());
		
	}

}
