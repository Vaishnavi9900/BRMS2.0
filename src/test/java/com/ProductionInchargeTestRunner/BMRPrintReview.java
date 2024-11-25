package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.ProductionInchargePageObjects.BMRProductionInchargePrintReviewOrCancel;

public class BMRPrintReview extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRProductionInchargePrintReviewOrCancel incharge;
	
	@Test
	public void printReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		incharge = new BMRProductionInchargePrintReviewOrCancel(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		incharge.printreqreviewtab();
		//incharge.reReview();
		incharge.submit();
		incharge.comments(getapprovalcomments());
		incharge.submit();
		incharge.submitactivity(getpassword());	
	}
	@Test
	public void printReReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		incharge = new BMRProductionInchargePrintReviewOrCancel(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		incharge.reReview();
		incharge.submit();
		incharge.comments(getapprovalcomments());
		incharge.submit();
		incharge.submitactivity(getpassword());	
	}
	@Test
	public void printReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		incharge = new BMRProductionInchargePrintReviewOrCancel(driver);
		
		as.userlogin(getproductionincharge(), getpassword());
		incharge.printreqreviewtab();
		incharge.returnbutton();
		incharge.comments(getreturncomments());
		incharge.returnbutton();
		incharge.returnactivity(getpassword());	
	}
	

}
