package com.InitiatorTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.InitiatorPageObjects.BPRProductDetails;
import com.aventstack.extentreports.Status;

public class BPRProductDetailsInitiation extends ConfigurationReader{

	public Assignmenu as;
	
	public BPRProductDetails bpr;
	
	@Test
	public void bottleproductInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		bpr = new BPRProductDetails(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		extenttest.log(Status.PASS, "Login to the application with initiator id" +getinitiator()+" and password as "+getpassword()+ " ");
		bpr.validatealerts();
		LoggerUtil.logInfo("Validated the alerts");
		extenttest.log(Status.PASS, "Validated the alerts");
		bpr.bottlepackinginitiation();
		LoggerUtil.logInfo("clicked on bottle pack & selected the req. details");
		extenttest.log(Status.PASS, "clicked on bottle pack & selected the req. details");
		bpr.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		bpr.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		extenttest.log(Status.PASS, "Entered the password: "+getpassword()+" and clicked on submit");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Bottle Pack Product Details Initiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
		 
	}
	@Test
    public void blisterproductInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		bpr = new BPRProductDetails(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		extenttest.log(Status.PASS, "Login to the application with initiator id" +getinitiator()+" and password as "+getpassword()+ " ");
		bpr.validatealerts1();
		LoggerUtil.logInfo("validated the alerts and entered the comments");
		extenttest.log(Status.PASS, "validated the alerts and entered the comments");
		bpr.blisterpackinginitiation();
		LoggerUtil.logInfo("Clicked on Blister packing tab & selected the req. details");
		extenttest.log(Status.PASS, "Clicked on Blister packing tab & selected the req. details");
		bpr.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		bpr.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and submitted the record");
		extenttest.log(Status.PASS, "Entered the password: "+getpassword()+" and clicked on submit");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Blister Pack Product Details Initiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
 
   @Test
   public void pouchproductInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		bpr = new BPRProductDetails(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		extenttest.log(Status.PASS, "Login to the application with initiator id" +getinitiator()+" and password as "+getpassword()+ " ");
		bpr.validatealerts2();
		LoggerUtil.logInfo("validated the alerts and entered the comments");
		extenttest.log(Status.PASS, "validated the alerts and entered the comments");
		bpr.blisterpackinginitiation();
		LoggerUtil.logInfo("Clicked on Pouch packing tab & selected the details");
		extenttest.log(Status.PASS, "Clicked on Pouch packing tab & selected the details");
		bpr.submit();
		LoggerUtil.logInfo("clicked on submit");
		extenttest.log(Status.PASS, "clicked on submit");
		bpr.submitactivity(getpassword());
		LoggerUtil.logInfo("Entered the password and clicked on submit");
		extenttest.log(Status.PASS, "Entered the password: "+getpassword()+" and clicked on submit");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Pouch Pack Product Details Initiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
	@Test
	public void bottleproductReInitiation() throws InterruptedException, IOException {
			
			as = new Assignmenu(driver);
			bpr = new BPRProductDetails(driver);
			
			try {
			as.userlogin(getinitiator(), getpassword());
			LoggerUtil.logInfo("Login to the application with initiatior id and password");
			extenttest.log(Status.PASS, "Login to the application with initiator id" +getinitiator()+" and password as "+getpassword()+ " ");
			bpr.bottlepackingReinitiation();
			LoggerUtil.logInfo("Opened the Bottle packing Reinitiation record and Modified the required details");
			extenttest.log(Status.PASS, "Opened the Bottle packing Reinitiation record and Modified the required details");
			//bpr.comments(getinitiatorcomments());
			bpr.resubmitactivity(getpassword());
			LoggerUtil.logInfo("Entered comments, password and resubmitted the record");
			extenttest.log(Status.PASS, "Entered comments, password: "+getpassword()+"  and resubmitted the record");
			as.logout();
			LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
			extenttest.log(Status.PASS, "Logout from the application");
			}
			catch (AssertionError e) {
				LoggerUtil.logError("BPR Bottle Pack Product ReInitiation Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	            throw e;
			}
		}
	@Test
	public void blisterproductReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		bpr = new BPRProductDetails(driver);
		
		try {
		as.userlogin(getinitiator(), getpassword());
		LoggerUtil.logInfo("Login to the application with initiatior id and password");
		extenttest.log(Status.PASS, "Login to the application with initiator id" +getinitiator()+" and password as "+getpassword()+ " ");
		bpr.blisterpackingReinitiation();
		LoggerUtil.logInfo("Opened the Blister packing Reinitiation record and Modified the  required details");
		extenttest.log(Status.PASS, "Opened the Blister packing Reinitiation record and Modified the  required details");
//		bpr.resubmit();
//		bpr.comments(getinitiatorcomments());
		bpr.resubmitactivity(getpassword());
		LoggerUtil.logInfo("Entered comments, password and resubmitted the record");
		extenttest.log(Status.PASS, "Entered comments, password: "+getpassword()+" and resubmitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BPR Blister Pack Product ReInitiation Test is failed", e);
            // Log the failure to ExtentReports
            extenttest.fail("Test failed: " + e.getMessage());
            // Optionally, you can log the stack trace if needed
            extenttest.fail(e);
            throw e;
		}
	}
}
