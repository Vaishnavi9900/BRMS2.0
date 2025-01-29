package com.MastersTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.MasterPageObjects.ModeofPacking;

public class ModeofPackingTestRunner extends ConfigurationReader {
	
	public Assignmenu as;
	public ModeofPacking mp;
	
	@Test
	public void mopcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new ModeofPacking(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Market Creation");
		mp.mopcreate();
		LoggerUtil.logInfo("Enter Password and create the record");
		mp.createactivity(getpassword());
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Mode of Packing creation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void existedmopcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new ModeofPacking(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Existed Mode of Packing Creation and validate");
		mp.existedmopcreation();
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Existed Mode of Packing creation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void existedmopcreation1() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new ModeofPacking(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Existed Mode of Packing Creation and validate");
		mp.existedconditionformopcreation();
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Existed Mode of Packing creation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void mopupdate() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new ModeofPacking(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Update Mode of Packing and validate");
		mp.mopupdate(getcomments());
		LoggerUtil.logInfo("Enter the password and update the record");
		mp.updateactivity(getpassword());
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Update Mode of Packing Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void addmopinedit() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new ModeofPacking(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("adding another mop record in update");
		mp.addanothermopinedit(getcomments());
		LoggerUtil.logInfo("Enter the password and update the record");
		mp.updateactivity(getpassword());
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Adding another Mode of Packing in update Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}
	@Test
	public void mopdisableenable() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mp = new ModeofPacking(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Disable/Enable the Mode Of Packing record and validate");
		mp.mopdisableenableZ(getcomments());
		LoggerUtil.logInfo("Enter the password and update the record");
		mp.updateactivity(getpassword());
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Disable/Enable the Mode of Packing record Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
			
	}

}
