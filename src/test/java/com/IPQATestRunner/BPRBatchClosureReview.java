package com.IPQATestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.IPQAPageObjects.BMRBPRIPQABatchCompletionReview;

public class BPRBatchClosureReview extends ConfigurationReader{
	

	public Assignmenu as;
	public BMRBPRIPQABatchCompletionReview review;
	
	@Test
	public void batchCompletionReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRIPQABatchCompletionReview(driver);
		
		as.userlogin(getIPQA(), getpassword());
		review.bprbatchcompletionreviewtab();
		review.returnbutton();
		review.comments(getreturncomments());
		review.returnbutton();
		review.returnactivity(getpassword());
	}
	@Test
	public void batchCompletionReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRIPQABatchCompletionReview(driver);
		
		as.userlogin(getIPQA(), getpassword());
		review.bprbatchcompletionreviewtab();
		review.submit();
		review.comments(getapprovalcomments());
		review.submit();
		review.submitactivity(getpassword());
	}
	@Test
	public void batchCompletionReReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		review = new BMRBPRIPQABatchCompletionReview(driver);
		
		as.userlogin(getIPQA(), getpassword());
		review.bprbatchcompletionRereview();
		review.submit();
		review.comments(getapprovalcomments());
		review.submit();
		review.submitactivity(getpassword());
	}


}
