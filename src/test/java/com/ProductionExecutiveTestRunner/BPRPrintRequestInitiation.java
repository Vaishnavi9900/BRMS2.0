package com.ProductionExecutiveTestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminPageObjects.Assignmenu;
import com.BasicData.ConfigurationReader;
import com.BasicData.LoggerUtil;
import com.ProductionExecutivePageObjects.BPRPrintIssuanceInitiationReceived;


public class BPRPrintRequestInitiation extends ConfigurationReader{
	
	public Assignmenu as;
	public BPRPrintIssuanceInitiationReceived issuance;
	
	@Test
	public void bprprintRequestInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BPRPrintIssuanceInitiationReceived(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("click on Print Request Initiation tab");
		issuance.bprprintreqinitiationtab();
		LoggerUtil.logInfo("click on submit");
		issuance.submit();
		LoggerUtil.logInfo("select the required dates and format");
		issuance.batchnumberdateformats("DD/MM/YYYY", "15-12-2024", "26-10-2025", "FD");
		LoggerUtil.logInfo("Enter the batch size");
		issuance.batchsize();
		LoggerUtil.logInfo("validate comments and enter comments");
		issuance.comments(getinitiatorcomments());
		LoggerUtil.logInfo("click on submit");
		issuance.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		issuance.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Print Request Initiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void bprprintRequestReInitiation() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BPRPrintIssuanceInitiationReceived(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("click on Print Request Initiation tab");
		LoggerUtil.logInfo("click on Returned status tab and open the record");
		issuance.bprprintreqReinitiation();
		LoggerUtil.logInfo("click on submit");
		issuance.submit();
		LoggerUtil.logInfo("update the batch size");
		issuance.batchsize();
		LoggerUtil.logInfo("validate comments and enter comments");
		issuance.comments(getinitiatorcomments());
		LoggerUtil.logInfo("click on submit");
		issuance.submit();
		LoggerUtil.logInfo("Enter password and submit the record");
		issuance.submitactivity(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Print Request ReInitiation Test is failed", e);
			Assert.fail();
		}
	}
	@Test
    public void bprprintRecievedAcknowledgment() throws InterruptedException, IOException {
		
		as = new Assignmenu(driver);
		issuance = new BPRPrintIssuanceInitiationReceived(driver);
		
		try {
		LoggerUtil.logInfo("Login to the application with Prodution Exe id and password");
		as.userlogin(getprodexe(), getpassword());
		LoggerUtil.logInfo("click on Print Request Initiation tab");
		LoggerUtil.logInfo("click on Issued status tab and open the record");
		issuance.printreceivedtab();
		LoggerUtil.logInfo("click on print received");
		issuance.printreceived();
		LoggerUtil.logInfo("validate comments and enter comments");
		issuance.comments("Print Received successfully.");
		LoggerUtil.logInfo("click on print received");
		issuance.printreceived();
		LoggerUtil.logInfo("Enter password and submit the record");
		issuance.printreceivedsubmit(getpassword());
		}
		catch (Exception e) {
			LoggerUtil.logError("BPR Print Received Acknowledgment Test is failed", e);
			Assert.fail();
		}
	}

}
