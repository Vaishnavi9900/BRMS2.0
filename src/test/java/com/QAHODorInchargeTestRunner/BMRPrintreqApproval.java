package com.QAHODorInchargeTestRunner;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAHODorInChargePageObjects.BMRBPRQAHODAfterPrintApprovalorReject;

@Test
public class BMRPrintreqApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRQAHODAfterPrintApprovalorReject hod;
	
	public void printReturntoExe() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
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
		LoggerUtil.logInfo("Select the return to Production Exe");
		LoggerUtil.logInfo("Enter password and submit the record");
		hod.returntoexeactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Print Approval Return to Production Exe Test is failed", e);
		}
	}
	
	public void printReturntoProductionIncharge() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with QA HOD id and password");
		as.userlogin(getQAHOD(), getpassword());
		LoggerUtil.logInfo("click on Print Approval tab and open the record");
		hod.printapprovalrejecttab();
		LoggerUtil.logInfo("click on return");
		hod.returnbutton();
		//hod.comments(getreturncomments());
		//hod.close();
		//hod.returnbutton();
		LoggerUtil.logInfo("Select the return to Production Incharge");
		LoggerUtil.logInfo("Enter password and submit the record");
		hod.returntoinchargeactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Print Approval Return to Production Incharge Test is failed", e);
			Assert.fail();
		}
	}
	
	public void printReturntoValidationIncharge() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
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
		LoggerUtil.logInfo("Select the return to Validation Incharge");
		LoggerUtil.logInfo("Enter password and submit the record");
		hod.returntovalidationactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BMR Print Approval Return to Validation Incharge Test is failed", e);
			Assert.fail();
		}
	}
	  public void printReject() throws InterruptedException, IOException {
			
			as = new  Assignmenu(driver);
			hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
			
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
				LoggerUtil.logError("BMR Print Approval Rejection Test is failed", e);
				Assert.fail();
			}
		}
	  
	  public void printApproval() throws InterruptedException, IOException {
			
			as = new  Assignmenu(driver);
			hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
			
			try {
			LoggerUtil.logInfo("Login to the application with QA HOD id and password");
			as.userlogin(getQAHOD(), getpassword());
			LoggerUtil.logInfo("click on Print Approval tab and open the record");
			hod.printapprovalrejecttab();
			LoggerUtil.logInfo("click on submit");
			hod.submit();
			//hod.comments(getapprovalcomments());
			LoggerUtil.logInfo("validate comments and enter comments");
			hod.comments1(getapprovalcomments());
			LoggerUtil.logInfo("click on submit");
			hod.submit();
			LoggerUtil.logInfo("Enter password and submit the record");
			hod.submitactivity(getpassword());
			}
			catch (Exception e) {
				LoggerUtil.logError("BMR Print Approval Test is failed", e);
				Assert.fail();
			}
		}

}
