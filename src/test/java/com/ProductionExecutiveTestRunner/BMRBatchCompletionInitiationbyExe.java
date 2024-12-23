package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionExecutivePageObjects.BMRBPRBatchCompletionInitiation;

public class BMRBatchCompletionInitiationbyExe extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRBatchCompletionInitiation batch;
	
	@Test
	public void batchinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchCompletionInitiation(driver);
		
		as.userlogin(getprodexe(), getpassword());
		batch.batchcompletiontab();
		batch.submit();
		batch.comments();
		batch.dateformats("22-10-2024", "12-10-2025");
		//batch.submit();
		batch.submitactivity2(getpassword());
	}
	@Test
     public void bulkbatchinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchCompletionInitiation(driver);
		
		as.userlogin(getprodexe(), getpassword());
		batch.batchcompletiontab();
		batch.submit();
		batch.comments();
		//batch.dateformats("22-10-2024", "12-10-2025");
		batch.submit();
		batch.submitactivity2(getpassword());
	}
	@Test
    public void batchReinitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		batch = new BMRBPRBatchCompletionInitiation(driver);
		
		as.userlogin(getprodexe(), getpassword());
		batch.reinitiation();
		batch.submit();
		batch.comments();
		//batch.dateformats("12-10-2024", "12-10-2025");
		batch.submit();
		batch.submitactivity2(getpassword());
	}
	@Test
	 public void bulkbatchReinitiation() throws InterruptedException, IOException {
			
			as = new Assignmenu(driver);
			batch = new BMRBPRBatchCompletionInitiation(driver);
			
			as.userlogin(getprodexe(), getpassword());
			batch.reinitiation();
			batch.submit();
			batch.comments();
			//batch.dateformats("12-10-2024", "12-10-2025");
			batch.submit();
			batch.submitactivity2(getpassword());
		}
	

}
