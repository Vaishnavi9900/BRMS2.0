package com.ProductionInchargeTestRunner;

import java.io.IOException;
import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.BRMSCommonMethods;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;


public class ProductionInchargeMasterApprovalReview extends ConfigurationReader{
	public Assignmenu as;
	public BMRBPRProductionInchargeReview review;
	public BMRBPRMasterApprovalInitiation app;
	
	@Test
	public void masterApprovalReturn() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		review.masterreviewtab();
		review.returnbutton();
		review.comments(getreturncomments());
		review.returnbutton();
		review.returnactivity2(getpassword());
		
	}
	
	@Test
     public void masterApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		review.masterreviewtab();
		review.submit();
		review.comments(getapprovalcomments());
		review.submit();
		app.submitactivity2(getpassword());
		
	}

}
