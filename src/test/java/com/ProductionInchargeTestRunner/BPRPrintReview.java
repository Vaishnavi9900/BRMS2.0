package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionInchargePageObjects.BPRPrintRevieworCancel;

public class BPRPrintReview extends ConfigurationReader{

	
	public Assignmenu as;
	public BPRPrintRevieworCancel incharge;
	
	@Test
	public void printReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		incharge = new BPRPrintRevieworCancel(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Print Req. Review tab and open the record");
		incharge.bprprintreqreviewtab();
		//incharge.reReview();
		LoggerUtil.logInfo("click on submit");
		incharge.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		incharge.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		incharge.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		incharge.printsubmitactivity(getpassword());	
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Print Req. Review by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void printReReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		incharge = new BPRPrintRevieworCancel(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Print Req. Review tab");
		LoggerUtil.logInfo("click on Returned status tab and open the record");
		incharge.reReview();
		LoggerUtil.logInfo("click on submit");
		incharge.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		incharge.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		incharge.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		incharge.submitactivity(getpassword());	
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Print Req.Re Review by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void printReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		incharge = new BPRPrintRevieworCancel(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Print Req. Review tab and open the record");
		incharge.bprprintreqreviewtab();
		LoggerUtil.logInfo("click on return");
		incharge.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		incharge.comments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		incharge.returnbutton();
		LoggerUtil.logInfo("Enter password and submit the record");
		incharge.returnactivity(getpassword());	
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Print Req. Return by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}
}
