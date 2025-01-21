package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BPRPrintApprovalorReject;

public class BPRPrintReqApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRPrintApprovalorReject hod;
	
	@Test
	public void printReturntoExe() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BPRPrintApprovalorReject(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Print Approval tab and open the record");
		hod.printapprovalrejecttab();
		LoggerUtil.logInfo("click on return");
		hod.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		hod.comments(getreturncomments());
		//hod.close();
		LoggerUtil.logInfo("click on return");
		hod.returnbutton();
		LoggerUtil.logInfo("Enter password and submit the record");
		hod.returntoexeactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Print Req. Return to Production Exe Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void printReturntoProductionIncharge() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BPRPrintApprovalorReject(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Print Approval tab and open the record");
		hod.printapprovalrejecttab();
		LoggerUtil.logInfo("click on return");
		hod.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		hod.comments(getreturncomments());
		//hod.close();
		//hod.returnbutton();
		LoggerUtil.logInfo("Enter password and submit the record");
		hod.returntoinchargeactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Print Req. Return to Production Incharge Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void printReturntoValidationIncharge() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BPRPrintApprovalorReject(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Print Approval tab and open the record");
		hod.printapprovalrejecttab();
		LoggerUtil.logInfo("click on return");
		hod.returnbutton();
		LoggerUtil.logInfo("validate comments and enter comments");
		hod.comments(getreturncomments());
		LoggerUtil.logInfo("click on return");
		hod.returnbutton();
		hod.close();
		LoggerUtil.logInfo("click on return");
		hod.returnbutton();
		LoggerUtil.logInfo("Enter password and submit the record");
		hod.returntovalidationactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Print Req. Return to Validation Incharge Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void printReject() throws InterruptedException, IOException {
			
			as = new  Assignmenu(driver);
			hod = new BPRPrintApprovalorReject(driver);
			
			try {
			LoggerUtil.logInfo("Login to the application with QA HOD id and password");
			as.userlogin(getQAHOD(), getpassword());
			LoggerUtil.logInfo("click on Print Approval tab and open the record");
			hod.printapprovalrejecttab();
			LoggerUtil.logInfo("click on reject");
			hod.reject();
			LoggerUtil.logInfo("validate comments and enter comments");
			hod.comments(getrejectedcomments());
			LoggerUtil.logInfo("click on reject");
			hod.reject();
			LoggerUtil.logInfo("Enter password and submit the record");
			hod.submitactivity2(getpassword());
			}
			catch (Exception e) {
				LoggerUtil.logError("BPR Print Req. Reject Test is failed", e);
				Assert.fail();
			}
		}
	  @Test
	  public void printApproval() throws InterruptedException, IOException {
			
			as = new  Assignmenu(driver);
			hod = new BPRPrintApprovalorReject(driver);
			
			try {
			LoggerUtil.logInfo("Login to the application with QA HOD id and password");
			as.userlogin(getQAHOD(), getpassword());
			LoggerUtil.logInfo("click on Print Approval tab and open the record");
			hod.printapprovalrejecttab();
			LoggerUtil.logInfo("click on submit");
			hod.submit();
			LoggerUtil.logInfo("validate comments and enter comments");
			//hod.comments(getapprovalcomments());
			hod.comments1(getapprovalcomments());
			LoggerUtil.logInfo("click on submit");
			hod.submit();
			LoggerUtil.logInfo("Enter password and submit the record");
			hod.submitactivity(getpassword());
			}
			catch (Exception e) {
				LoggerUtil.logError("BPR Print Req. Approval Test is failed", e);
				Assert.fail();
			}
		}


}
