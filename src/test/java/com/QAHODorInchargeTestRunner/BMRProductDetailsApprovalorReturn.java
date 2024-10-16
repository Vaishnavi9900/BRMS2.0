package com.QAHODorInchargeTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.InitiatorPageObjects.BMRProductDetails;
import com.QAHODorInChargePageObjects.HODBMRProductDetails;

public class BMRProductDetailsApprovalorReturn extends ConfigurationReader {
	public Assignmenu as;
	public BMRProductDetails bmr;
	public HODBMRProductDetails hod;
	
	@Test
	public void HODapproval() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		hod = new HODBMRProductDetails(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		//bmr.createrecord();
		hod.commentsvalidate();
		hod.priority();
		hod.HODSubmit(getapprovalcomments());
		hod.submitactivity();	
	}
	@Test
	public void HODReturn() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		hod = new HODBMRProductDetails(driver);
		
		as.userlogin(getQAHOD(), getpassword());
		//bmr.createrecord();
		hod.commentsvalidate();
		hod.priority();
		hod.HODReturn(getreturncomments());
		hod.submitactivity2();	
	}
	

}
