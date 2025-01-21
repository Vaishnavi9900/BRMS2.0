package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BPRProductDetails;

public class BPRProductDetailsInitiation extends ConfigurationReader{

	public Assignmenu as;
	
	public BPRProductDetails bpr;
	
	@Test
	public void bottleproductInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		bpr = new BPRProductDetails(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Validate the alerts");
		bpr.validatealerts1();
		LoggerUtil.logInfo("Bottle packing Initiation by enter/select the details");
		bpr.bottlepackinginitiation();
		LoggerUtil.logInfo("click on submit");
		bpr.submit();
		LoggerUtil.logInfo("Enter the password and submit the record");
		bpr.submitactivity(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("Bottle Product Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void blisterproductInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		bpr = new BPRProductDetails(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("validate the alerts and enter the comments");
		bpr.validatealerts();
		LoggerUtil.logInfo("Blister packing Initiation by enter/select the details");
		bpr.blisterpackinginitiation();
		LoggerUtil.logInfo("click on submit");
		bpr.submit();
		LoggerUtil.logInfo("Enter the password and click on submit");
		bpr.submitactivity(getpassword());
		}
		catch (Exception e) {
		
			LoggerUtil.logError("Blister Product Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
	public void bottleproductReInitiation() throws InterruptedException, IOException {
			
			as = new Assignmenu(driver);
			bpr = new BPRProductDetails(driver);
			
			try {
			LoggerUtil.logInfo("Login to the application with initiatior id and password");
			as.userlogin(getinitiator(), getpassword());
			LoggerUtil.logInfo("Bottle packing Reinitiation with required changes");
			bpr.bottlepackingReinitiation();
			//bpr.comments(getinitiatorcomments());
			LoggerUtil.logInfo("Enter comments, password and resubmit the record");
			bpr.resubmitactivity(getpassword());
			}
			catch (Exception e) {
				
				LoggerUtil.logError("Bottle Product ReInitiation Test is failed", e);
				Assert.fail();
			}
		}
	public void blisterproductReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		bpr = new BPRProductDetails(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Blister packing Reinitiation with required changes");
		bpr.blisterpackingReinitiation();
//		bpr.resubmit();
//		bpr.comments(getinitiatorcomments());
		LoggerUtil.logInfo("Enter comments, password and resubmit the record");
		bpr.resubmitactivity(getpassword());
		}
		catch (Exception e) {
			
			LoggerUtil.logError("Blister Product ReInitiation Test is failed", e);
			Assert.fail();
		}
	}
}
