package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BMRProductDetails;
import com.QAHODorInChargePageObjects.HODBMRBPRProductDetails;

public class BMRProductDetailsApprovalorReturn extends ConfigurationReader {
	public Assignmenu as;
	public BMRProductDetails bmr;
	public HODBMRBPRProductDetails hod;
	
	@Test
	public void hodApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		hod = new HODBMRBPRProductDetails(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		//bmr.createrecord();
		hod.commentsvalidate();
		hod.priority();
		hod.HODSubmit(getapprovalcomments());
		hod.submitactivity(getpassword());	
	}
	@Test
	public void hodReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		hod = new HODBMRBPRProductDetails(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		//bmr.createrecord();
		hod.commentsvalidate();
		hod.priority();
		hod.HODReturn(getreturncomments());
		hod.submitactivity2(getpassword());	
	}
	@Test
	public void bprhodApproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		hod = new HODBMRBPRProductDetails(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		//bmr.createrecord();
		hod.bprcomments();
		hod.priority();
		hod.bprHODApproval(getapprovalcomments());
		hod.submitactivity2(getpassword());	
	}
	@Test
	public void bprhodReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		hod = new HODBMRBPRProductDetails(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		//bmr.createrecord();
		hod.bprcomments();
		hod.priority();
		hod.bprHODReturn(getreturncomments());
		hod.submitactivity2(getpassword());	
	}
	

}
