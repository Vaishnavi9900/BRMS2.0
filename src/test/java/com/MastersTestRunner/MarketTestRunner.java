package com.MastersTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.MasterPageObjects.Market;

public class MarketTestRunner extends ConfigurationReader {
	
	public  Assignmenu as;
	public Market mt;
	
	@Test
	public void marketcreatewithspace() throws InterruptedException {
		
		as = new Assignmenu(driver);
		mt = new Market(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("creation of market with space and validate");
		mt.marketcreatewithspace();
		}
		catch (Exception e) {
			LoggerUtil.logError("Market creation with space Test is failed", e);
			Assert.fail();
		}
	}
	
	@Test
	public void marketcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mt = new Market(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("enter the required inputs");
		mt.marketcreate();
		LoggerUtil.logInfo("enter password and create the market");
		mt.createactivity(getpassword());
		}
		catch(Exception e){
			LoggerUtil.logError("Test failed", e);
			logger.debug("debug the errors");
			Assert.fail();
		}
	}
	
	@Test
	public void existedmarketcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mt = new Market(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("validate Existed market creation");
		mt.existedmarketcreation();
		}
		catch (Exception e) {
			LoggerUtil.logError("Existed Market creation Test is failed", e);
			Assert.fail();
		}
	
	}
	@Test
	public void updatemarketwithspace() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mt = new Market(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Update Market with space and validate");
		mt.marketupdatewithspace();
		}
		catch (Exception e) {
			LoggerUtil.logError("Update Market with space Test is failed", e);
			Assert.fail();
		}
	}
	
	@Test
	public void marketupdate() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mt = new Market(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("validate comments and Enter comments ");
		mt.marketupdate(getcomments());
		LoggerUtil.logInfo("Enter Password and update the record");
		mt.updateactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("Update Market Test is failed", e);
			Assert.fail();
		}
	}
	
	@Test
	public void marketdisableenable() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		mt = new Market(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Disable/Enable the record with comments");
		mt.marketdisableenable(getcomments());
		LoggerUtil.logInfo("Enter Password and update the record");
		mt.updateactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("Disable/Enable the Market Test is failed", e);
			Assert.fail();
		}
		
	}

}
