package com.InitiatorTestRunner;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import static org.testng.Assert.fail;

import java.io.IOException;


import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BMRProductDetails;

public class BMRProductDetailsInitiation extends ConfigurationReader {
	
	public Assignmenu as;
	public BMRProductDetails bmr;
	
	@Test
	public void pelletsinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
	
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		bmr.pelletsproductdetailsalertsvalidate();
		LoggerUtil.logInfo("validated the pellets validation alerts");
	    bmr.pelletsinitiation();
		LoggerUtil.logInfo("selected the pellets details");
	    bmr.submitactivity2(getpassword());	
	    LoggerUtil.logInfo("Entered the password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Pellets Initiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	
	@Test
	public void blendinitiationwithoutpellets() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		bmr.blendproductdetailsalertsvalidate();
		LoggerUtil.logInfo("verified the validations");
		bmr.blendinitiationwithoutpellets();
		LoggerUtil.logInfo("selected the blend details and  initiation without pellets");
		bmr.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Blend Initiation without pellets Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	@Test
	public void blendinitiationwithpellets() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		bmr.blendproductdetailsalertsvalidate();
		LoggerUtil.logInfo("verified the validations");
		bmr.blendinitiationwithpellets();
		LoggerUtil.logInfo("selected the blend details and  initiation with pellets");
		bmr.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Blend Initiation with pellets Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	@Test
	public void standalonebulkinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		bmr.bulkproductdetailsalertsvalidate();
		LoggerUtil.logInfo("verified the validations");
		bmr.bulkproductinitiation();
		LoggerUtil.logInfo("selected the bulk standalonealone details and  initiation with selection of approved blend");
		bmr.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Bulk Standalone Initiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	@Test
	public void commonbulkinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		bmr.bulkproductdetailsalertsvalidate();
		LoggerUtil.logInfo("verified the validations");
		bmr.bulkproductinitiationcommon();
		LoggerUtil.logInfo("selected the Bulk common details and  initiation with selection of approved blend");
		bmr.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Bulk Common Initiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	@Test
	public void bulkbilayerinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		bmr.bulkproductdetailsalertsvalidate();
		LoggerUtil.logInfo("verified the validations");
		bmr.bulkbilayerproductinitiation();
		LoggerUtil.logInfo("Selected the Bulk Bilayer details and initiation with selection of approved blend");
		bmr.submitactivity2(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Bulk BiLayer Initiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	@Test
	public void pelletsReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		bmr.pelletsReinitiation();
		LoggerUtil.logInfo("Modified the required pellets details");
		bmr.resubmitactivity2(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Pellets  ReInitiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
		
	}
	@Test
	public void blendReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		bmr.blendReinitiation();
		LoggerUtil.logInfo("Modified the required blend details and Reinitiate the blend record");
		bmr.resubmitactivity2(getpassword());
		LoggerUtil.logInfo("Entered the password and resubmitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Blend ReInitiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	@Test
	public void bulkReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		bmr.bulkReinitiation();
		LoggerUtil.logInfo("Modified the required details and Reinitiated the bulk record");
		bmr.resubmitactivity2(getpassword());
		LoggerUtil.logInfo("Entered the password and resubmitted the record");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("Bulk ReInitiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}

}
