package com.QAHODorInchargeTestRunner;

import java.io.IOException;
import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionInchargePageObjects.BMRProductionInchargeReview;
import com.QAHODorInChargePageObjects.BMRQAHODMasterauthorization;

public class MasterApprovalByQAHOD extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRQAHODMasterauthorization auth;
	public BMRProductionInchargeReview review;
	
	@Test
	public void masterApprovalReturnbyQAHOD() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		auth = new BMRQAHODMasterauthorization(driver);
		review = new BMRProductionInchargeReview(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		auth.masterauthorizationtab();
		review.returnbutton();
		review.comments(getreturncomments());
		review.returnbutton();
		review.returnactivity2(getpassword());
		
	}
	@Test
    public void qaHODMasterApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		auth = new BMRQAHODMasterauthorization(driver);
		review = new BMRProductionInchargeReview(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		auth.masterauthorizationtab();
		auth.authorize();
		review.comments(getapprovalcomments());
		auth.authorize();
		auth.authorizationactivity2(getpassword());
		
	}


}
