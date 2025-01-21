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
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("validate the pellets validation alerts");
		bmr.pelletsproductdetailsalertsvalidate();
		LoggerUtil.logInfo("initiate the pellets details");
	    bmr.pelletsinitiation();
	    LoggerUtil.logInfo("Enter the password and submit the record");
	    bmr.submitactivity2(getpassword());	
		}
		catch (Exception e) {
			
			LoggerUtil.logError("pellets initiation test is failed", e);
			Assert.fail();
		}
	}
	
	@Test
	public void blendinitiationwithoutpellets() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("verify the validations");
		bmr.blendproductdetailsalertsvalidate();
		LoggerUtil.logInfo("blend initiation without pellets");
		bmr.blendinitiationwithoutpellets();
		LoggerUtil.logInfo("Enter the password and submit the record");
		bmr.submitactivity2(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("Blend initiation without pellets Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void blendinitiationwithpellets() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("verify the validations");
		bmr.blendproductdetailsalertsvalidate();
		LoggerUtil.logInfo("blend initiation with selection of pellets");
		bmr.blendinitiationwithpellets();
		LoggerUtil.logInfo("Enter the password and submit the record");
		bmr.submitactivity2(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("Blend initiation with pellets Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void standardbulkinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("verify the validations");
		bmr.bulkproductdetailsalertsvalidate();
		LoggerUtil.logInfo("bulk standard initiation with selection of approved blend");
		bmr.bulkproductinitiation();
		LoggerUtil.logInfo("Enter the password and submit the record");
		bmr.submitactivity2(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("Standard Bulk Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void commonbulkinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("verify the validations");
		bmr.bulkproductdetailsalertsvalidate();
		LoggerUtil.logInfo("Bulk common initiation with selection of approved blend");
		bmr.bulkproductinitiationcommon();
		LoggerUtil.logInfo("Enter the password and submit the record");
		bmr.submitactivity2(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("Common Bulk Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void bulkbilayerinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("verify the validations");
		bmr.bulkproductdetailsalertsvalidate();
		LoggerUtil.logInfo("Bulk Bilayer initiation with selection of approved blend");
		bmr.bulkbilayerproductinitiation();
		LoggerUtil.logInfo("Enter the password and submit the record");
		bmr.submitactivity2(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("Bulk Bilayer Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void pelletsReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		bmr.pelletsReinitiation();
		LoggerUtil.logInfo("Enter the password and submit the record");
		bmr.resubmitactivity2(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("Pellets ReInitiation Test is failed", e);
			Assert.fail();
		}
		
	}
	@Test
	public void blendReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Reinitiate the blend record");
		bmr.blendReinitiation();
		LoggerUtil.logInfo("Enter the password and resubmit the record");
		bmr.resubmitactivity2(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("Blend ReInitiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void bulkReinitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bmr = new BMRProductDetails(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Reinitiate the bulk record");
		bmr.bulkReinitiation();
		LoggerUtil.logInfo("Enter the password and resubmit the record");
		bmr.resubmitactivity2(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("Bulk ReInitiation Test is failed", e);
			Assert.fail();
		}
	}

}
