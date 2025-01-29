package com.RATestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;
import com.ProductionHODPageObjects.BMRBPRProductionHODTechTransferRAQAIncharge;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;

public class BMRMasterApprovalbyRA extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRBPRProductionHODTechTransferRAQAIncharge tech;
	public BMRBPRProductionInchargeReview review;
	public BMRBPRMasterApprovalInitiation app;
	
	@Test
	public void masterApprovalReturnbyRA() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		tech = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		try {
		as.userlogin(getRA(), getpassword());
		LoggerUtil.logInfo("Login to the application with Regulatory Affairs(RA) id and password");
		tech.masterapprovaltab();
		LoggerUtil.logInfo("Clicked on Master Approval tab and opened the record");
		review.returnbutton();
		LoggerUtil.logInfo("Clicked on return");
		review.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		review.returnbutton();
		LoggerUtil.logInfo("Clicked on return");
		review.returnactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Master Approval return by RA Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
    public void rAMasterApproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		tech = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);

		try {
		as.userlogin(getRA(), getpassword());
		LoggerUtil.logInfo("Login to the application with Regulatory Affairs(RA) id and password");
		tech.masterapprovaltab();
		LoggerUtil.logInfo("Clicked on Master Approval tab and opened the record");
		review.submit();
		LoggerUtil.logInfo("Clicked on submit");
		review.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		review.submit();
		LoggerUtil.logInfo("Clicked on submit");
		app.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Master Approval by RA Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
