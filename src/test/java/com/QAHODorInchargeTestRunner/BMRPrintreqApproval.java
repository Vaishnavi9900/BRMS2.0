package com.QAHODorInchargeTestRunner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAHODorInChargePageObjects.BMRBPRQAHODAfterPrintApprovalorReject;

@Test
public class BMRPrintreqApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRBPRQAHODAfterPrintApprovalorReject hod;
	
	public void printReturntoExe() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		hod.printapprovalrejecttab();
		hod.returnbutton();
		//hod.comments(getreturncomments());
		//hod.close();
		hod.returnbutton();
		hod.returntoexeactivity(getpassword());
	}
	
	public void printReturntoProductionIncharge() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		hod.printapprovalrejecttab();
		hod.returnbutton();
		//hod.comments(getreturncomments());
		//hod.close();
		//hod.returnbutton();
		hod.returntoinchargeactivity(getpassword());
	}
	
	public void printReturntoValidationIncharge() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		hod.printapprovalrejecttab();
		//hod.returnbutton();
		hod.comments(getreturncomments());
		hod.returnbutton();
		hod.close();
		hod.returnbutton();
		hod.returntovalidationactivity(getpassword());
	}
	  public void printReject() throws InterruptedException, IOException {
			
			as = new  Assignmenu(driver);
			hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
			
			as.userlogin(getQAHOD(), getpassword());
			hod.printapprovalrejecttab();
			hod.reject();
			hod.comments(getrejectedcomments());
			hod.reject();
			hod.submitactivity2(getpassword());
		}
	  
	  public void printApproval() throws InterruptedException, IOException {
			
			as = new  Assignmenu(driver);
			hod = new BMRBPRQAHODAfterPrintApprovalorReject(driver);
			
			as.userlogin(getQAHOD(), getpassword());
			hod.printapprovalrejecttab();
			hod.submit();
			//hod.comments(getapprovalcomments());
			hod.comments1(getapprovalcomments());
			hod.submit();
			hod.submitactivity(getpassword());
		}

}
