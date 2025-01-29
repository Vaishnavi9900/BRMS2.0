package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRBPRMasterApprovalInitiation;
import com.ProductionHODPageObjects.BMRBPRProductionHODTechTransferRAQAIncharge;
import com.ProductionInchargePageObjects.BMRBPRProductionInchargeReview;

public class BPRMasterApproval extends ConfigurationReader {
	public Assignmenu as;
	public BMRBPRProductionHODTechTransferRAQAIncharge hod;
	public BMRBPRMasterApprovalInitiation app;
	public BMRBPRProductionInchargeReview review;
	
	@Test
	public void bprmasterApprovalbyQAIncharge() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		try {
		as.userlogin(getQAIncharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		hod.bprmasterapprovaltab();
		LoggerUtil.logInfo("clicked on Master Approval tab and opened the record");
		app.submit();
		LoggerUtil.logInfo("clicked on submit");
		hod.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		app.submit();
		LoggerUtil.logInfo("clicked on submit");
		app.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Master Approval Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
    public void bprmasterReturnbyQAIncharge() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		try {
		as.userlogin(getQAIncharge(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		hod.bprmasterapprovaltab();
		LoggerUtil.logInfo("clicked on Master Approval tab and opened the record");
		review.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		hod.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		review.returnbutton();
		LoggerUtil.logInfo("clicked on return");
		app.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Master Approval Return Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
}
