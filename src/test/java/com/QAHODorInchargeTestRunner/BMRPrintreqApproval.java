package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.QAHODorInChargePageObjects.BMRQAHODPrintApprovalorReject;

public class BMRPrintreqApproval extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRQAHODPrintApprovalorReject hod;
	
	@Test
	public void printReturntoExe() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BMRQAHODPrintApprovalorReject(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		hod.printapprovalrejecttab();
		hod.returnbutton();
		//hod.comments(getreturncomments());
		//hod.close();
		hod.returnbutton();
		hod.returntoexeactivity(getpassword());
	}
	
	@Test
   public void printReturntoProductionIncharge() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BMRQAHODPrintApprovalorReject(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		hod.printapprovalrejecttab();
		hod.returnbutton();
		//hod.comments(getreturncomments());
		//hod.close();
		//hod.returnbutton();
		hod.returntoinchargeactivity(getpassword());
	}
	
	@Test
   public void printReturntoValidationIncharge() throws InterruptedException, IOException {
		
		as = new  Assignmenu(driver);
		hod = new BMRQAHODPrintApprovalorReject(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		hod.printapprovalrejecttab();
		hod.returnbutton();
		//hod.comments(getreturncomments());
		//hod.close();
		//hod.returnbutton();
		hod.returntovalidationactivity(getpassword());
	}
	  @Test
	  public void printReject() throws InterruptedException, IOException {
			
			as = new  Assignmenu(driver);
			hod = new BMRQAHODPrintApprovalorReject(driver);
			
			as.userlogin(getQAHOD(), getpassword());
			hod.printapprovalrejecttab();
			hod.reject();
			//hod.comments(getreturncomments());
			hod.submitactivity2(getpassword());
		}
	  
	  @Test
	  public void printApproval() throws InterruptedException, IOException {
			
			as = new  Assignmenu(driver);
			hod = new BMRQAHODPrintApprovalorReject(driver);
			
			as.userlogin(getQAHOD(), getpassword());
			hod.printapprovalrejecttab();
			//hod.comments(getapprovalcomments());
			hod.comments1(getapprovalcomments());
			hod.submit();
			hod.submitactivity2(getpassword());
		}

}
