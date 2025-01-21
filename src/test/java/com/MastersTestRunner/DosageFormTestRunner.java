package com.MastersTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.MasterPageObjects.DosageForm;

public class DosageFormTestRunner extends ConfigurationReader {
	
	public Assignmenu as;
	public DosageForm ds;
	
	@Test
	public void dosagecreatewithspace() throws InterruptedException {
		
		as = new Assignmenu(driver);
		ds = new DosageForm(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("validate dosage form creation with space");
		ds.dosageformcreatewithspace();
		}
		catch (Exception e) {
			LoggerUtil.logError("Dosage form creation with space Test is failed", e);
			Assert.fail();
		}
		
	}
	
	@Test
	public void dosageformcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		ds = new DosageForm(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Dosage form creation with req. data");
		ds.dosageformcreate();
		LoggerUtil.logInfo("Enter password and create the record");
		ds.createactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("Dosage form creation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void existeddosagecreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		ds = new DosageForm(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("validate the existed dosage form record with same details");
		ds.existeddosageform();
		LoggerUtil.logInfo("Enter password and create the record");
		ds.createactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("Existed Dosage form creation Test is failed", e);
			Assert.fail();
		}
	}
	
	@Test
	public void dosageupdatewithspace() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		ds = new DosageForm(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Validate update record with space");
		ds.dosageupdatewithspace();
		}
		catch (Exception e) {
			LoggerUtil.logError("Update Dosage form with space Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void dosageformupdate() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		ds = new DosageForm(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("update the dosage form record with req. data and comments");
		ds.dosageupdate(getcomments());
		LoggerUtil.logInfo("Enter password and update the record");
		ds.updateactivity();
		}
		catch (Exception e) {
			LoggerUtil.logError("Update Dosage form record Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void dosagedisableenable() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		ds = new DosageForm(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Disable/Enable the dosage form record with comments");
		ds.dosageenabledisable(getcomments());
		LoggerUtil.logInfo("Enter password and disable/enable the record");
		ds.updateactivity();
		}
		catch (Exception e) {
			LoggerUtil.logError("Disable/Enable the Dosage form record Test is failed", e);
			Assert.fail();
		}
	}

}
