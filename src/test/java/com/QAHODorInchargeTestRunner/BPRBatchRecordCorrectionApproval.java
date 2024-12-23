package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAHODorInChargePageObjects.BPRBatchCorrectionApproval;


public class BPRBatchRecordCorrectionApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRBatchCorrectionApproval batch;
	
	@Test
	public void bprBatchCorrectionReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		batch = new BPRBatchCorrectionApproval(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		batch.bprbatchCorrectionApproval();
		batch.returnbutton();
		batch.comments(getreturncomments());
		batch.returnbutton();
		batch.returnactivity(getpassword());
	}
	@Test
	public void bprBatchCorrectionApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		batch = new BPRBatchCorrectionApproval(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		batch.bprbatchCorrectionApproval();
		batch.submit();
		batch.comments(getapprovalcomments());
		batch.submit();
		batch.submitactivity(getpassword());
	}


}
