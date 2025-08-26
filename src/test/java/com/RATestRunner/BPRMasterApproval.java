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
import com.aventstack.extentreports.Status;

public class BPRMasterApproval extends ConfigurationReader {
	

	public Assignmenu as;
	public BMRBPRProductionHODTechTransferRAQAIncharge hod;
	public BMRBPRMasterApprovalInitiation app;
	public BMRBPRProductionInchargeReview review;
	
	@Test
	public void bprmasterApprovalbyRA() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		
		try {
		as.userlogin(getRA(), getpassword());
		LoggerUtil.logInfo("Login to the application with Regulatory Affairs(RA) id and password");
		extenttest.log(Status.PASS, "Login to the application with Regulatory Affairs(RA) id" +getRA()+" and password as "+getpassword()+ " ");
		hod.bprmasterapprovaltab();
		LoggerUtil.logInfo("Clicked on Master Approval tab and opened the record");
		extenttest.log(Status.PASS, "Clicked on Master Approval tab and opened the record");
		app.submit();
		LoggerUtil.logInfo("Clicked on submit");
		extenttest.log(Status.PASS, "Clicked on submit");
		hod.comments(getapprovalcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		app.submit();
		LoggerUtil.logInfo("Clicked on submit");
		extenttest.log(Status.PASS, "Clicked on submit");
		app.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Master Approval by RA Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
    public void bprmasterReturnbyRA() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		hod = new BMRBPRProductionHODTechTransferRAQAIncharge(driver);
		app = new BMRBPRMasterApprovalInitiation(driver);
		review = new BMRBPRProductionInchargeReview(driver);
		
		try {
		as.userlogin(getRA(), getpassword());
		LoggerUtil.logInfo("Login to the application with Regulatory Affairs(RA) id and password");
		extenttest.log(Status.PASS, "Login to the application with Regulatory Affairs(RA) id" +getRA()+" and password as "+getpassword()+ " ");
		hod.bprmasterapprovaltab();
		LoggerUtil.logInfo("Clicked on Master Approval tab and opened the record");
		extenttest.log(Status.PASS, "Clicked on Master Approval tab and opened the record");
		review.returnbutton();
		LoggerUtil.logInfo("Clicked on return");
		extenttest.log(Status.PASS, "Clicked on return");
		hod.comments(getreturncomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		review.returnbutton();
		LoggerUtil.logInfo("Clicked on return");
		extenttest.log(Status.PASS, "Clicked on return");
		app.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Master Approval Return by RA Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}

}
