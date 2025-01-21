package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BPRRePackingReqInitiation;

public class BPRRepackingInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRRePackingReqInitiation repack;
	
	@Test
	public void bprRePackingreqInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		repack = new BPRRePackingReqInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("click on Repacking Qty Initiation tab");
		repack.repcakingqtyinitiation();
		LoggerUtil.logInfo("click on submit");
		repack.submit();
		LoggerUtil.logInfo("validate repacking alerts and enter the details");
		repack.repackingdetails();
		LoggerUtil.logInfo("validate comments and enter comments");
		repack.comments(getinitiatorcomments());
		LoggerUtil.logInfo("click on submit");
		repack.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		repack.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Repacking Qty Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
   public void bprRePackingreqReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		repack = new BPRRePackingReqInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("click on Repacking Qty Initiation tab");
		LoggerUtil.logInfo("click on Returned status tab and open the record");
		repack.repcakingqtyReinitiation();
		LoggerUtil.logInfo("click on submit");
		repack.submit();
		LoggerUtil.logInfo("enter the repacking details");
		repack.repackingdetails();
		LoggerUtil.logInfo("validate comments and enter comments");
		repack.comments(getinitiatorcomments());
		LoggerUtil.logInfo("click on submit");
		repack.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		repack.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Repacking Qty ReInitiation Test is failed", e);
			Assert.fail();
		}
	}

}
