package com.QAOfficerTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.QAOfficerPageObjects.BMRQAOfficerIssuanceandPrint;
import com.aventstack.extentreports.Status;

public class BMRPrintIssuance extends ConfigurationReader{
	
	public Assignmenu as;
	public BMRQAOfficerIssuanceandPrint issuance;
	
	@Test
	public void issue() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issuance = new BMRQAOfficerIssuanceandPrint(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		extenttest.log(Status.PASS, "Login to the application with QA Officer id" +getQAOfficer()+" and password as "+getpassword()+ " ");
		issuance.printissuancetab();
		LoggerUtil.logInfo("clicked on Print Issuance tab");
		extenttest.log(Status.PASS, "clicked on Print Issuance tab");
		LoggerUtil.logInfo("clicked on Print Issuance Approved tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Print Issuance Approved tab and opened the record");
		issuance.formatgroup();
		LoggerUtil.logInfo("selected the Format Group");
		extenttest.log(Status.PASS, "selected the Format Group");
		issuance.issue();
		LoggerUtil.logInfo("clicked on Issue");
		extenttest.log(Status.PASS, "clicked on Issue");
		//issuance.printcopydetails();
		issuance.comments(getissuedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		issuance.issue();
		LoggerUtil.logInfo("clicked on Issue");
		extenttest.log(Status.PASS, "clicked on Issue");
		issuance.issuemaindocument();
		LoggerUtil.logInfo("clicked on the issue main document");
		extenttest.log(Status.PASS, "clicked on the issue main document");
		issuance.issueactivity1(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
//		issuance.screenclick();
//		LoggerUtil.logInfo("clicked on screenclick");
		refresh();
		issuance.search();
		LoggerUtil.logInfo("Entered the required MPR No and clicked on created record");
		extenttest.log(Status.PASS, "Entered the required MPR No and clicked on created record");
		issuance.issue();
		LoggerUtil.logInfo("clicked on Issue");
		extenttest.log(Status.PASS, "clicked on Issue");
		issuance.comments(getissuedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		issuance.issue();
		LoggerUtil.logInfo("clicked on Issue");
		extenttest.log(Status.PASS, "clicked on Issue");
		issuance.issueformatlogdocument();
		LoggerUtil.logInfo("Clicked on issue format log document");
		extenttest.log(Status.PASS, "Clicked on issue format log document");
		issuance.issueactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Print Issuance Issue Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void bulkissue() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issuance = new BMRQAOfficerIssuanceandPrint(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		extenttest.log(Status.PASS, "Login to the application with QA Officer id" +getQAOfficer()+" and password as "+getpassword()+ " ");
		issuance.printissuancetab();
		LoggerUtil.logInfo("clicked on Print Issuance tab");
		extenttest.log(Status.PASS, "clicked on Print Issuance tab");
		LoggerUtil.logInfo("clicked on Print Issuance Approved tab and opened the record");
		extenttest.log(Status.PASS, "clicked on Print Issuance Approved tab and opened the record");
		issuance.bulkformatgroup();
		LoggerUtil.logInfo("selected the Format Group");
		extenttest.log(Status.PASS, "selected the Format Group");
		issuance.issue();
		LoggerUtil.logInfo("clicked on Issue");
		extenttest.log(Status.PASS, "clicked on Issue");
		//issuance.printcopydetails();
		issuance.comments(getissuedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "clicked on submit");
		issuance.issue();
		LoggerUtil.logInfo("clicked on Issue");
		extenttest.log(Status.PASS, "clicked on Issue");
		issuance.issuemaindocument();
		LoggerUtil.logInfo("clicked on the issue main document");
		extenttest.log(Status.PASS, "clicked on the issue main document");
		issuance.issueactivity1(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
//		issuance.screenclick();
//		LoggerUtil.logInfo("clicked on screenclick");
		refresh();
		issuance.search();
		LoggerUtil.logInfo("Entered the required MPR No and clicked on created record");
		extenttest.log(Status.PASS, "Entered the required MPR No and clicked on created record");
		issuance.issue();
		LoggerUtil.logInfo("clicked on Issue");
		extenttest.log(Status.PASS, "clicked on Issue");
		issuance.comments(getissuedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		extenttest.log(Status.PASS, "validated comments and entered comments");
		issuance.issue();
		LoggerUtil.logInfo("clicked on Issue");
		extenttest.log(Status.PASS, "clicked on Issue");
		issuance.issueformatlogdocument();
		LoggerUtil.logInfo("Clicked on issue format log document");
		extenttest.log(Status.PASS, "Clicked on issue format log document");
		issuance.issueactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Print Issuance Issue Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	@Test
	public void print() throws InterruptedException, IOException {
		as = new Assignmenu(driver);
		issuance = new BMRQAOfficerIssuanceandPrint(driver);
		
		try {
		as.userlogin(getQAOfficer(), getpassword());
		LoggerUtil.logInfo("Login to the application with QA Officer id and password");
		extenttest.log(Status.PASS, "Login to the application with QA Officer id" +getQAOfficer()+" and password as "+getpassword()+ " ");
		issuance.printissuancetab();
		LoggerUtil.logInfo("clicked on Print Issuance tab");
		LoggerUtil.logInfo("clicked on Print Issuance Issued tab and opened the record");
		issuance.print();
		LoggerUtil.logInfo("clicked on Print");
		issuance.comments(getprintcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		issuance.print();
		issuance.printer();
		LoggerUtil.logInfo("clicked on Print and selected the Printer");
		issuance.submit();
		LoggerUtil.logInfo("clicked on submit");
		issuance.printmaindocument();
		LoggerUtil.logInfo("clicked on print main document");
		issuance.printactivity1(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
//		issuance.screenclick();
//		LoggerUtil.logInfo("clicked on screenclick");
		refresh();
		issuance.search();
		LoggerUtil.logInfo("Entered the required MPR No and clicked on created record");
		issuance.print();
		LoggerUtil.logInfo("clicked on print");
		issuance.comments(getissuedcomments());
		LoggerUtil.logInfo("validated comments and entered comments");
		issuance.print();
		issuance.printer();
		LoggerUtil.logInfo("clicked on print and selected the printer");
		issuance.submit();
		LoggerUtil.logInfo("clicked on submit");
		issuance.printformatlogdocument();
		LoggerUtil.logInfo("Clicked on print format log document");
		issuance.printactivity2(getpassword());
		LoggerUtil.logInfo("Entered password and submitted the record");
		extenttest.log(Status.PASS, "Entered password: "+getpassword()+" and submitted the record");
		as.logout();
		LoggerUtil.logInfo("Clicked on profile,No and again clicked on Profile and Yes. Showing login page.");
		extenttest.log(Status.PASS, "Logout from the application");
		
		}
		catch (AssertionError e) {
			LoggerUtil.logError("BMR Print Issuance Print Test is failed", e);
	            // Log the failure to ExtentReports
	            extenttest.fail("Test failed: " + e.getMessage());
	            // Optionally, you can log the stack trace if needed
	            extenttest.fail(e);
	        	throw e;		
		}
			
	}
	

}
