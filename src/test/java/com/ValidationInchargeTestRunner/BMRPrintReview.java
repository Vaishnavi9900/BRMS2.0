package com.ValidationInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ValidationInchargePageObjects.BMRBPRValidationInchargePrintReview;

public class BMRPrintReview extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRValidationInchargePrintReview val;
	
	@Test
	public void printReturntoExecutive() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		val = new BMRBPRValidationInchargePrintReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Validation Incharge id and password");
		as.userlogin(getvalidationincharge(), getpassword());
		LoggerUtil.logInfo("Click on Print Request Review tab and open the record");
		val.printreqreviewtab();
		LoggerUtil.logInfo("click on return");
		val.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		val.comments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		val.returnbutton();
		LoggerUtil.logInfo("select return as Production executive");
		LoggerUtil.logInfo("Enter password and submit the record");
		val.returntoexeactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Print Request Return by Validation Incharge Test is failed", e);
			Assert.fail();
		}
	}
	
	@Test
	public void printReturntoIncharge() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		val = new BMRBPRValidationInchargePrintReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Validation incharge id and password");
		as.userlogin(getvalidationincharge(), getpassword());
		LoggerUtil.logInfo("Click on Print Request Review tab and open the record");
		val.printreqreviewtab();
		LoggerUtil.logInfo("click on return");
		val.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		val.comments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		val.returnbutton();
		LoggerUtil.logInfo("select return as Production Incharge");
		LoggerUtil.logInfo("Enter password and submit the record");
		val.returntoinchargeactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Print Request Return by Validation Incharge Test is failed", e);
			Assert.fail();
		}
	}
	
	@Test
	public void printReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		val = new BMRBPRValidationInchargePrintReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Validation incharge id and password");
		as.userlogin(getvalidationincharge(), getpassword());
		LoggerUtil.logInfo("Click on Print Request Review tab and open the record");
		val.printreqreviewtab();
		LoggerUtil.logInfo("click on submit");
		val.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		val.commentsbatchtype(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		val.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		val.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Print Request Review by Validation Incharge Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void printReReview() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		val = new BMRBPRValidationInchargePrintReview(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Validation incharge id and password");
		as.userlogin(getvalidationincharge(), getpassword());
		LoggerUtil.logInfo("Click on Print Request Review tab");
		LoggerUtil.logInfo("Click on Returned status tab and open the record");
		val.reReview();
		LoggerUtil.logInfo("click on submit");
		val.submit();
		LoggerUtil.logInfo("validate comments and enter comments");
		val.commentsbatchtype(getapprovalcomments());
		LoggerUtil.logInfo("click on submit");
		val.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		val.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Print Request Re Review by Validation Incharge Test is failed", e);
			Assert.fail();
		}
	}


}
