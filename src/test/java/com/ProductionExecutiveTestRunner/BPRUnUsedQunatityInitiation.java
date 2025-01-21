package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BPRUnusedQuantityInitiation;

public class BPRUnUsedQunatityInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRUnusedQuantityInitiation qty;
	
	@Test
	public void unusedqtyInitiation() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		qty = new BPRUnusedQuantityInitiation(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("click on Unused Qty Initiation tab");
		qty.unusedqtyInitiation();
		LoggerUtil.logInfo("click on submit");
		qty.submit();
		LoggerUtil.logInfo("validate unused alerts and enter the details");
		qty.unusedqtydetails();
		LoggerUtil.logInfo("validate comments and enter comments");
		qty.comments();
		LoggerUtil.logInfo("click on submit");
		qty.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		qty.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Unused Qty Initiation Test is failed", e);
			Assert.fail();
		}
	}
	

}
