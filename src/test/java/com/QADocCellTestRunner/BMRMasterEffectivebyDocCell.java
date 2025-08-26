package com.QADocCellTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;
import com.QADocCellPageObjects.BMRBPRQADoccellMasterEffective;
import com.aventstack.extentreports.Status;


public class BMRMasterEffectivebyDocCell extends ConfigurationReader {

	public Assignmenu as;
	public BMRBPRQADoccellMasterEffective ef;
	public BMRBPRProductionInchargeReview review;

	@Test
	public void masterApprovalEffectivebyQADocCell() throws InterruptedException, IOException {
		

		as = new Assignmenu(driver);
		ef = new BMRBPRQADoccellMasterEffective(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		try {
		as.userlogin(getQADoccell(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Doccell id and password");
		extenttest.log(Status.PASS, "Login to the application with QA Doccell id" +getQADoccell()+" and password as "+getpassword()+ " ");
		ef.mastereffectivetab();
		LoggerUtil.logInfo("clicked on Master Effective tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Master Effective tab and opened the record");
		ef.effective();
		LoggerUtil.logInfo("clicked on effective");
		extenttest.log(Status.PASS, "clicked on effective");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		ef.effective();
		LoggerUtil.logInfo("clicked on effective");
		extenttest.log(Status.PASS, "clicked on effective");
		ef.effectiveactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and effective the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and effective the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Master Approval Effective Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	
}
