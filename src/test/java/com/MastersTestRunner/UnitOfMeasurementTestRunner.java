package com.MastersTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.MasterPageObjects.UnitOfMeasurement;

public class UnitOfMeasurementTestRunner extends ConfigurationReader {
	
	public Assignmenu as;
	public UnitOfMeasurement uom;
	
	@Test
	public void uomcreationwithspace() throws InterruptedException {
		as = new Assignmenu(driver);
		uom = new UnitOfMeasurement(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("UOM Creation with space");
		uom.uomcreatewithspace();
		}
		catch (AssertionError e) {
			LoggerUtil.logError("UOM Creation with space Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void uomcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		uom = new UnitOfMeasurement(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("UOM Creation");
		uom.uomcreate();
		LoggerUtil.logInfo("Enter password and create the record");
		uom.createactivity();
		}
		catch (AssertionError e) {
			LoggerUtil.logError("UOM Creation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void existeduomcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		uom = new UnitOfMeasurement(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Existed UOM Creation");
		uom.existeduomcreate();
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Existed UOM Creation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void uomupdatewithspace() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		uom = new UnitOfMeasurement(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Update UOM with space");
		uom.uomupdatewithspace();
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Update the UOM with space Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
		
	}
	@Test
	public void uomupdate() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		uom = new UnitOfMeasurement(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Update UOM and comments validate");
		uom.uomupdate(getcomments());
		LoggerUtil.logInfo("Enter password and update the record");
		uom.updateactivity();
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Update the UOM record Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void uomdisableenable() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		uom = new UnitOfMeasurement(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Disable/Enable the UOM record");
		uom.uomdisableenable(getcomments());
		LoggerUtil.logInfo("Enter password and update the record");
		uom.updateactivity();
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Disable/Enable the UOM record Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}

}
