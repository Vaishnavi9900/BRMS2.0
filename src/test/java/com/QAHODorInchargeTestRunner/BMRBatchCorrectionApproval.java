package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAHODorInChargePageObjects.BPRBatchCorrectionApproval;

public class BMRBatchCorrectionApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRBatchCorrectionApproval batch;
	
	@Test
	public void BatchCorrectionReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		batch = new BPRBatchCorrectionApproval(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		batch.batchCorrectionApproval();
		batch.returnbutton();
		batch.comments(getreturncomments());
		batch.returnbutton();
		batch.returnactivity(getpassword());
	}
	@Test
	public void BatchCorrectionApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		batch = new BPRBatchCorrectionApproval(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		batch.batchCorrectionApproval();
		batch.submit();
		batch.comments(getapprovalcomments());
		batch.submit();
		batch.submitactivity(getpassword());
	}


}
