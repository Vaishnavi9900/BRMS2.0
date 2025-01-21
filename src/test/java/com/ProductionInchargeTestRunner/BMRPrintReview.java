package com.ProductionInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionInchargePageObjects.BMRProductionInchargePrintReviewOrCancel;

public class BMRPrintReview extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRProductionInchargePrintReviewOrCancel incharge;
	
	@Test
	public void printReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		incharge = new BMRProductionInchargePrintReviewOrCancel(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Print Req. Review tab and open the record");
		incharge.printreqreviewtab();
		LoggerUtil.logInfo("click on submit");
		//incharge.reReview();
		incharge.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		incharge.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		incharge.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		incharge.printsubmitactivity(getpassword());	
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Print Req. Review by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void printReReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		incharge = new BMRProductionInchargePrintReviewOrCancel(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Print Req. Review tab and open the record");
		incharge.reReview();
		LoggerUtil.logInfo("click on submit");
		incharge.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		incharge.comments(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		incharge.submit();
		LoggerUtil.logInfo("Enter password and resubmit the record");
		incharge.resubmitactivity(getpassword());	
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Print Req.Re Review by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void printReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		incharge = new BMRProductionInchargePrintReviewOrCancel(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Production Incharge id and password");
		as.userlogin(getproductionincharge(), getpassword());
		LoggerUtil.logInfo("click on Print Req. Review tab");
		LoggerUtil.logInfo("click on Returned status tab and open the record");
		incharge.printreqreviewtab();
		LoggerUtil.logInfo("click on return");
		incharge.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		incharge.comments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		incharge.returnbutton();
		LoggerUtil.logInfo("Enter password and return the record");
		incharge.returnactivity2(getpassword());	
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Print Req. Return by Production Incharge Test is failed", e);
			Assert.fail();
		}
	}
	

}
