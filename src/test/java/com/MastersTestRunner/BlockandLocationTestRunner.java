package com.MastersTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.BRMSCommonMethods;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.MasterPageObjects.BlockandLocation;

public class BlockandLocationTestRunner extends ConfigurationReader {
	
	public Assignmenu as;
	public BlockandLocation bc;
	
	@Test
	public void blocklocationcreation() throws InterruptedException {
		as = new Assignmenu(driver);
		bc = new BlockandLocation(driver);
		
		
		try {
			LoggerUtil.logInfo("Login to the application with Initiator id and password");
			as.userlogin(getinitiator(), getpassword());	
			LoggerUtil.logInfo("create the block location with req. data");
			bc.blocklocationcreate();
			LoggerUtil.logInfo("Enter password and create the record");
			bc.createactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("Block Location creation Test is failed", e);
			Assert.fail();
		}
		
	}
	
	@Test()
	public void existedblocklocationcreation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bc = new BlockandLocation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());	
		LoggerUtil.logInfo("validate the existed block location record with same details");
		bc.existedblockloactioncreation();
		}
		catch (Exception e) {
			LoggerUtil.logError("Existed Block Location creation Test is failed", e);
			Assert.fail();
		}
		
	}
	@Test
	public void existedblocklocationcreation1() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bc = new BlockandLocation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("validate the existed block location record with some same details");
		bc.existedconditionforblockcreation();
		}
		catch (Exception e) {
			LoggerUtil.logError("Existed Block Location creation Test is failed", e);
			Assert.fail();
		}
		
	}
	
	@Test
	public void blocklocationedit() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bc = new BlockandLocation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Update the block location record with req. changes and comments");
		bc.blocklocationedit(getcomments());
		LoggerUtil.logInfo("Enter password and update the record");
		bc.updateactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("Update Block Location Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void addblocklocationinedit() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bc = new BlockandLocation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Update the block location record with addition of record and comments");
		bc.addanotherblockinedit(getcomments());
		LoggerUtil.logInfo("Enter password and update the record");
		bc.updateactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("Update Block Location with additional data Test is failed", e);
			Assert.fail();
		}
	}
	
	
	@Test
	public void blocklocationdisableenable() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		bc = new BlockandLocation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Initiator id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Disable/Enable the block location record with comments");
		bc.blocklocationdisableenable(getcomments());
		LoggerUtil.logInfo("Enter password and update the record");
		bc.updateactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("Disale/Enable the Block Location Test is failed", e);
			Assert.fail();
		}
	}

}
