package com.ProductionHODTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;
import com.ProductionHODPageObjects.BMRBPRProductionHODTechTransferRAQAIncharge;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;

public class MasterApprovalByProductionHOD extends ConfigurationReader{

	public Assignmenu as;
	public BMRBPRProductionHODTechTransferRAQAIncharge hod;
	public BMRBPRMasterApprovalInitiation app;
	public BMRBPRProductionInchargeReview review;
	
	@Test
	public void productionhodapproval() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		try {
		as.userlogin(getproductionhod(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution HOD id and password");
		hod.masterapprovaltab();
		LoggerUtil.logInfo("Clicked on Master Approval tab and opened the record");
		app.submit();
		LoggerUtil.logInfo("Clicked on submit");
		hod.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		app.submit();
		LoggerUtil.logInfo("Clicked on submit");
		app.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Master Approval by Production HOD Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
    public void productionhodreturn() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		try {
		as.userlogin(getproductionhod(), getpassword());
		LoggerUtil.logInfo("Login to the application with Prodution HOD id and password");
		hod.masterapprovaltab();
		LoggerUtil.logInfo("Clicked on Master Approval tab and opened the record");
		review.returnbutton();
		LoggerUtil.logInfo("Clicked on return");
		hod.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		review.returnbutton();
		LoggerUtil.logInfo("Clicked on return");
		app.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Master Approval return by Production HOD Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
		
	}
}
