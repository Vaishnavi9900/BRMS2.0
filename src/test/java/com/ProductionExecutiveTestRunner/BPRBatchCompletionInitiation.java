package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionExecutivePageObjects.BMRBPRBatchCompletionInitiation;

public class BPRBatchCompletionInitiation extends ConfigurationReader {


	public Assignmenu as;
	public BMRBPRBatchCompletionInitiation batch;
	
	@Test
	public void bprbatchinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchCompletionInitiation(driver);
		
		as.userlogin(getprodexe(), getpassword());
		batch.bprbatchcompletiontab();
		batch.submit();
		batch.comments();
		batch.submit();
		batch.submitactivity(getpassword());
	}
	@Test
    public void bprbatchReinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchCompletionInitiation(driver);
		
		as.userlogin(getprodexe(), getpassword());
		batch.bprreinitiation();
		batch.submit();
		batch.comments();
		batch.dateformats("12-10-2024", "12-10-2025");
		batch.submit();
		batch.submitactivity(getpassword());
	}
}
