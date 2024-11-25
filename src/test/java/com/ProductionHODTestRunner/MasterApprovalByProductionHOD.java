package com.ProductionHODTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BMRMasterApprovalInitiation;
import com.ProductionHODPageObjects.BMRProductionHODTechTransferRAQAIncharge;
import com.ProductionInchargePageObjects.BMRProductionInchargeReview;

public class MasterApprovalByProductionHOD extends ConfigurationReader{

	public Assignmenu as;
	public BMRProductionHODTechTransferRAQAIncharge hod;
	public BMRMasterApprovalInitiation app;
	public BMRProductionInchargeReview review;
	
	@Test
	public void productionhodapproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRProductionHODTechTransferRAQAIncharge(driver);
		app = new BMRMasterApprovalInitiation(driver);
		
		as.userlogin(getproductionhod(), getpassword());
		hod.masterapprovaltab();
		app.submit();
		hod.comments(getapprovalcomments());
		app.submit();
		app.submitactivity2(getpassword());
	}
	@Test
    public void productionhodreturn() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRProductionHODTechTransferRAQAIncharge(driver);
		app = new BMRMasterApprovalInitiation(driver);
		review = new BMRProductionInchargeReview(driver);
		
		as.userlogin(getproductionhod(), getpassword());
		hod.masterapprovaltab();
		review.returnbutton();
		hod.comments(getreturncomments());
		review.returnbutton();
		app.submitactivity(getpassword());
	}
}
