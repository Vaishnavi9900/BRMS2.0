package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAOfficerPageObjects.BMRBPRBatchRecordCorrectionInitiation;

public class BPRBatchCorrectionInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRBatchRecordCorrectionInitiation batch;
	
	@Test
	public void bprBatchCorrectionInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchRecordCorrectionInitiation(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		batch.bprbatchCorrectionInitiation();
		batch.submit();
		//batch.fileupload();
		batch.comments();
		batch.submit();
		batch.submitactivity(getpassword());
	}
	@Test
	public void bprBatchCorrectionReInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchRecordCorrectionInitiation(driver);
		
		as.userlogin(getQAOfficer(), getpassword());
		batch.bprbatchCorrectionReInitiation();
		batch.submit();
		batch.comments();
		batch.submit();
		batch.submitactivity(getpassword());
	}

}
