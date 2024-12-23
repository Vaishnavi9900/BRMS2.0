package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAHODorInChargePageObjects.CFTActivity;

public class CFTRevieworReturn extends ConfigurationReader {
	public Assignmenu as;
	public CFTActivity cft;
	
	@Test
	public void cftReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		as.userlogin(getQAIncharge(), getpassword());
		cft.CFTreview(getapprovalcomments());
		cft.submitactivity(getpassword());
	}
	@Test
	public void cftReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		as.userlogin(getQAIncharge(), getpassword());
		cft.CFTreturn(getreturncomments());
		cft.returnactivity(getpassword());
	}
	@Test
	public void hodcftReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		cft.CFTreview(getapprovalcomments());
		cft.submitactivity(getpassword());
	}
	@Test
	public void hodcftReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		cft.CFTreturn(getreturncomments());
		cft.returnactivity(getpassword());
	}
	@Test
	public void bprcftReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		as.userlogin(getQAIncharge(), getpassword());
		cft.bprCFTreview(getapprovalcomments());
		cft.submitactivity(getpassword());
	}
	@Test
	public void bprcftReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		as.userlogin(getQAIncharge(), getpassword());
		cft.bprCFTreturn(getreturncomments());
		cft.returnactivity(getpassword());
	}

}
