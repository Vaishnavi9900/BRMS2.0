package com.MastersTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.MasterPageObjects.Strength;

public class StrengthTestRunner extends ConfigurationReader {
	public Assignmenu as;
	public Strength st;
	
	@Test
	public void strengthcreatewithspace() throws InterruptedException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Strenth creation with space and validate");
		st.strengthcreatewithspace();
		}
		catch (Exception e) {
			LoggerUtil.logError("Strength Cration with space Test is failed", e);
			Assert.fail();
		}
		
	}
	@Test
	public void strengthcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Strength creation");
		st.strengthcreate();
		LoggerUtil.logInfo("Enter the password and create the record");
		st.createactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("Strength creation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void existedstrengthcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Existed Strength creation and validate");
		st.existedstrengthcreate();
		}
		catch (Exception e) {
			LoggerUtil.logError("Existed Strength Creation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void strengthupdatewithspace() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Strength update with space");
		st.strengthupdatewithspace();
		}
		catch (Exception e) {
			LoggerUtil.logError("Update Strength with space Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void strengthupdate() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Update the strength record with req. data and comments validate");
		st.strengthupdate(getcomments());
		LoggerUtil.logInfo("Enter the password and create the record");
		st.updateactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("Update the Strength record Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void strengthdisableenable() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		st = new Strength(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Disable/Enable the strength record and validate comments");
		st.stregnthdisableenable(getcomments());
		LoggerUtil.logInfo("Enter the password and create the record");
		st.updateactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("Disable/Enable the Strength record Test is failed", e);
			Assert.fail();
		}
	}

}
