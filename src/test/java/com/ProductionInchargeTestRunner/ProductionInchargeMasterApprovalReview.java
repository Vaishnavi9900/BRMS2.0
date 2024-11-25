package com.ProductionInchargeTestRunner;

import java.io.IOException;
import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.BRMSCommonMethods;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BMRMasterApprovalInitiation;
import com.ProductionInchargePageObjects.BMRProductionInchargeReview;


public class ProductionInchargeMasterApprovalReview extends ConfigurationReader{
	public Assignmenu as;
	public BMRProductionInchargeReview review;
	public BMRMasterApprovalInitiation app;
	
	@Test
	public void masterApprovalReturn() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		review = new BMRProductionInchargeReview(driver);
		
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
		review = new BMRProductionInchargeReview(driver);
		app = new BMRMasterApprovalInitiation(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		review.masterreviewtab();
		review.submit();
		review.comments(getapprovalcomments());
		review.submit();
		app.submitactivity2(getpassword());
		
	}

}
