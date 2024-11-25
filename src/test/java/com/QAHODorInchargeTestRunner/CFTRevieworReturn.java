package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAHODorInChargePageObjects.CFTActivity;

public class CFTRevieworReturn extends ConfigurationReader {
	public Assignmenu as;
	public CFTActivity cft;
	
	//@Test
	public void CFTreview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		as.userlogin(getQAIncharge(), getpassword());
		cft.CFTreview(getapprovalcomments());
		cft.submitactivity(getpassword());
	}
	@Test
	public void CFTreturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		cft = new CFTActivity(driver);
		
		as.userlogin(getQAIncharge(), getpassword());
		cft.CFTreturn(getreturncomments());
		cft.returnactivity(getpassword());
	}

}
